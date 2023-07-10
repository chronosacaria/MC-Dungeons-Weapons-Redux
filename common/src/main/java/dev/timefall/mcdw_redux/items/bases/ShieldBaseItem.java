package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ToolMaterial;

/**
 * ShieldBaseItem is a replica of ShieldItem except that Minecraft is dumb and this is the only way to add shields.
 */

public class ShieldBaseItem extends ShieldItem {
    WeaponsID weaponsID;
    String[] repairIngredient;

    public ShieldBaseItem(WeaponsID weaponsID, ToolMaterial material, String[] repairIngredient) {
        super(BasesHelper.mcdw_redux$createMeleeWeaponSettings(material, ItemGroupsRegistry.MCDW_REDUX_SHIELDS.get()));
        this.weaponsID = weaponsID;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }
}
