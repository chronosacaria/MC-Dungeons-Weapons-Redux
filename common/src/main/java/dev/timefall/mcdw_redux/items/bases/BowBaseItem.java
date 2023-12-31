package dev.timefall.mcdw_redux.items.bases;

import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RangedAttackHelper;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.items.stats.RangedStats;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BowItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;
import net.projectile_damage.api.IProjectileWeapon;

import java.util.List;
import java.util.Map;

/**
 * BowBaseItem is a replica of BowItem except that it also has the functionality bestowed by this mod.
 * This functionality includes variable projectile damage, draw speed, range and allowing for innate enchantments.
 * This allows for variance amongst Longbows, Shortbows and regular bows.
 */

public class BowBaseItem extends BowItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    public final double projectileDamage;
    public final float drawSpeed;
    public float maxBowRange;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public BowBaseItem(WeaponsID weaponsID, ToolMaterial material, double projectileDamage, float drawSpeed, float maxBowRange, String[] repairIngredient) {
        super(new Item.Settings()
                .rarity(RegistrationHelper.mcdw_redux$fromToolMaterial(material))
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_RANGED));
        this.weaponsID = weaponsID;
        this.maxBowRange = maxBowRange;
        if (Platform.isModLoaded("projectile_damage")) {
            this.projectileDamage = projectileDamage;
            ((IProjectileWeapon)this).setProjectileDamage(this.projectileDamage);
            ((IProjectileWeapon)this).setCustomLaunchVelocity((this.maxBowRange / 15.0f) * 3.0);
        } else {
            this.projectileDamage = 0;
        }
        this.drawSpeed = drawSpeed;
        this.repairIngredient = repairIngredient;
    }
    public float getDrawSpeed() {
        return Math.max(0, drawSpeed);
    }

    public static float getBowArrowVelocity(ItemStack stack, int charge) {
        float bowChargeTime = RangedAttackHelper.mcdw_redux$getVanillaBowChargeTime(stack);
        if (bowChargeTime <= 0){
            bowChargeTime = 1;
        }

        float arrowVelocity = (float) charge / 30;
        arrowVelocity = (arrowVelocity * arrowVelocity + arrowVelocity * 2.0F) / 3.0F;
        if (arrowVelocity > 1.0F) {
            arrowVelocity = 1.0F;
        }

        return arrowVelocity;
    }

    @Override
    public int getRange() {
        return (int) maxBowRange;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public ItemStack getDefaultStack() {
        return mcdw_redux$getInnateEnchantedStack(this);
    }

    public double getProjectileDamage() {
        if (Platform.isModLoaded("projectile_damage")) {
            return projectileDamage;
        } else {
            return 0;
        }
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

    public static BowBaseItem makeBow(WeaponsID wepEnum) {
        RangedStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.BOW_BASE_STATS.get(wepEnum);
        return new BowBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.getProjectileDamage(),
                stats.getDrawSpeed(), stats.getRange(), stats.getRepairIngredients());
    }
}
