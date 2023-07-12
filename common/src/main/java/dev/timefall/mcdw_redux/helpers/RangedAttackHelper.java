package dev.timefall.mcdw_redux.helpers;

import dev.timefall.mcdw_redux.items.bases.BowBaseItem;
import dev.timefall.mcdw_redux.items.bases.CrossbowBaseItem;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.enchantment.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;

import static net.minecraft.item.CrossbowItem.hasProjectile;

public class RangedAttackHelper {
    public static float mcdw_redux$getVanillaArrowVelocity(ItemStack stack, int charge){
        float bowChargeTime = mcdw_redux$getVanillaBowChargeTime(stack);
        if (bowChargeTime <= 0){
            bowChargeTime = 1;
        }
        float arrowVelocity = (float) charge / bowChargeTime;
        arrowVelocity = (arrowVelocity * arrowVelocity + arrowVelocity * 2.0F) / 3.0F;
        return Math.min(arrowVelocity, 1.0F);
    }

    public static float mcdw_redux$getVanillaBowChargeTime(ItemStack stack){
        int quickChargeLevel = EnchantmentHelper.getLevel(Enchantments.QUICK_CHARGE, stack);
        //int accelerateLevel = EnchantmentHelper.getLevel(EnchantsRegistry.ACCELERATE, stack);

        float bowChargeTime = 30 * (Math.max(20.0F - 5 * quickChargeLevel, 0));
        long lastFiredtime = (long)(BowBaseItem.getPullProgress(22) * (Math.max(20.0F - 5 * quickChargeLevel, 0)));

        if (/*accelerateLevel > 0 &&*/ lastFiredtime > 0){
            return Math.max(bowChargeTime - 5 * quickChargeLevel, 0);
        } else {
            return Math.max(20.0F - 5 * quickChargeLevel, 0);
        }
    }

    public static float mcdw_redux$getVanillaOrModdedCrossbowArrowVelocity(ItemStack stack){
        float arrowVelocity;
        if (stack.getItem() instanceof CrossbowBaseItem crossbowBaseItem){
            arrowVelocity = crossbowBaseItem.getProjectileVelocity(stack);
        } else {
            arrowVelocity = hasProjectile(stack, Items.FIREWORK_ROCKET) ? 1.6F : 3.15F;
        }
        return arrowVelocity;
    }

    public static float mcdw_redux$getVanillaOrModdedBowArrowVelocity(ItemStack stack, int charge){
        float arrowVelocity;
        if (stack.getItem() instanceof BowBaseItem){
            arrowVelocity = BowBaseItem.getBowArrowVelocity(stack, charge);
        } else {
            arrowVelocity = mcdw_redux$getVanillaArrowVelocity(stack, charge);
        }
        return arrowVelocity;
    }
}
