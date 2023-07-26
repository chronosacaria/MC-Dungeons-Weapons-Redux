package dev.timefall.mcdw_redux.items.bases;

import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.items.stats.RangedStats;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.*;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.projectile_damage.api.IProjectileWeapon;

import java.util.List;
import java.util.Map;

/**
 * CrossbowBaseItem is a replica of CrossbowItem except that it also has the functionality bestowed by this mod.
 * This functionality includes variable projectile damage, draw speed, range and allowing for innate enchantments.
 */

public class CrossbowBaseItem extends CrossbowItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    public final double projectileDamage;
    public final int drawSpeed;
    public final float range;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public CrossbowBaseItem(WeaponsID weaponsID, ToolMaterial material, double projectileDamage, int drawSpeed, float range, String[] repairIngredient) {
        super(new Item.Settings()
                .rarity(RegistrationHelper.mcdw_redux$fromToolMaterial(material))
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_RANGED));
        this.weaponsID = weaponsID;
        this.range = range;
        if (Platform.isModLoaded("projectile_damage")) {
            this.projectileDamage = projectileDamage;
            ((IProjectileWeapon)this).setProjectileDamage(this.projectileDamage);
            ((IProjectileWeapon)this).setCustomLaunchVelocity((this.range / 8.0f) * 3.15);
        } else {
            this.projectileDamage = 0;
        }
        this.drawSpeed = drawSpeed;
        this.repairIngredient = repairIngredient;
    }

    public float getProjectileVelocity(ItemStack stack) {
        return hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.6F : 3.2F;
    }

    @Override
    public int getRange() {
        return (int) range;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }

    public int getDrawSpeed() {
        return this.drawSpeed;
    }

    @Override
    public ItemStack getDefaultStack() {
        return mcdw_redux$getInnateEnchantedStack(this);
    }

    @Override
    public Map<Enchantment, Integer> mcdw_redux$getInnateEnchantments() {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        RegistrationHelper.mcdw_redux$appendTooltip(this.weaponsID, tooltip);
    }

    public static CrossbowBaseItem makeCrossbow(WeaponsID wepEnum) {
        RangedStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.CROSSBOW_BASE_STATS.get(wepEnum);
        return new CrossbowBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.getProjectileDamage(),
                stats.getDrawSpeed(), stats.getRange(), stats.getRepairIngredients());
    }
}
