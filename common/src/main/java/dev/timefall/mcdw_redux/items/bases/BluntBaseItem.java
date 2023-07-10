package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import net.minecraft.block.BlockState;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemUsageContext;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.ActionResult;

/**
 * Exact copy of AxeBaseItem except it cannot strip, wax, or mine wood. Still an axe so can disable shields.
 */
public class BluntBaseItem extends AxeBaseItem implements IInnateEnchantment {

    public BluntBaseItem(WeaponsID weaponsID, ToolMaterial material, float attackDamage, float attackSpeed, String[] repairIngredient) {
        super(weaponsID, material, attackDamage, attackSpeed, repairIngredient);
    }

    @Override
    public ActionResult useOnBlock(ItemUsageContext context) {
        return ActionResult.PASS;
    }

    @Override
    public float getMiningSpeedMultiplier(ItemStack stack, BlockState state) {
        // Doesn't mine anything faster (not really a tool)
        return 1.0f;
    }

    @Override
    public boolean isSuitableFor(BlockState state) {
        return false;
    }

}