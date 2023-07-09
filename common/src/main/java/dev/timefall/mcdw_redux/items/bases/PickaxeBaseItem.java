package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;

/**
 * PickaxeBaseItem is a replica of PickaxeItem except that it could have extra functionality bestowed by this mod.
 * Whilst not implemented, it would be possible to add innate enchantments.
 */

public class PickaxeBaseItem extends PickaxeItem {
    WeaponsID weaponsID;
    String[] repairIngredient;

    public PickaxeBaseItem(WeaponsID weaponsID, ToolMaterial material, int attackDamage, float attackSpeed, String[] repairIngredient) {
        super(material, attackDamage, attackSpeed, BasesHelper.mcdw_redux$createMeleeWeaponSettings(material, ItemGroupsRegistry.MCDW_REDUX_MELEE.get()));
        this.weaponsID = weaponsID;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        BasesHelper.mcdw_redux$appendTooltip(this.weaponsID, tooltip);
    }
}