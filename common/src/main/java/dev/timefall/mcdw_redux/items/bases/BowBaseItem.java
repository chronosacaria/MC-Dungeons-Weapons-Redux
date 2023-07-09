package dev.timefall.mcdw_redux.items.bases;

import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.helpers.RangedAttackHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.BowItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;
import java.util.function.Predicate;

/**
 * BowBaseItem is a replica of BowItem except that it also has the functionality bestowed by this mod.
 * This functionality includes variable projectile damage, draw speed, range and allowing for innate enchantments.
 * This allows for variance amongst Longbows, Shortbows and regular bows.
 */

public class BowBaseItem extends BowItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    public final ToolMaterial material;
    public final double projectileDamage;
    public final float drawSpeed;
    public float maxBowRange;
    String[] repairIngredient;

    public BowBaseItem(WeaponsID weaponsID, ToolMaterial material, double projectileDamage, float drawSpeed, float maxBowRange, String[] repairIngredient) {
        super(BasesHelper.mcdw_redux$createRangedWeaponSettings(material));
        this.weaponsID = weaponsID;
        this.material = material;
        if (Platform.isModLoaded("projectile_damage")) {
            this.projectileDamage = projectileDamage;
        } else {
            this.projectileDamage = 0;
        }
        this.drawSpeed = drawSpeed;
        this.repairIngredient = repairIngredient;
        this.maxBowRange = maxBowRange;
    }
    public float getDrawSpeed() {
        return Math.max(0, drawSpeed);
    }

    public static float getBowArrowVelocity(ItemStack stack, int charge) {
        float bowChargeTime = RangedAttackHelper.getVanillaBowChargeTime(stack);
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
    public UseAction getUseAction(ItemStack stack) {
        return UseAction.BOW;
    }

    @Override
    public Predicate<ItemStack> getProjectiles() {
        return BOW_PROJECTILES;
    }

    @Override
    public int getRange() {
        return (int) maxBowRange;
    }

    @Override
    public int getEnchantability() {
        return material.getEnchantability();
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public ItemStack getDefaultStack() {
        return getInnateEnchantedStack(this);
    }

    @Override
    public Map<Enchantment, Integer> getInnateEnchantments() {
        return null;
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        BasesHelper.mcdw_redux$appendTooltip(this.weaponsID, tooltip);
    }
}
