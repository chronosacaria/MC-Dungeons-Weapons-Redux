package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ToolMaterial;

/**
 * ShieldBaseItem is a replica of ShieldItem except that Minecraft is dumb and this is the only way to add shields.
 */

public class ShieldBaseItem extends ShieldItem {
    WeaponsID weaponsID;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")

    public ShieldBaseItem(WeaponsID weaponsID, ToolMaterial material, String[] repairIngredient) {
        super(new Item.Settings()
                .rarity(RegistrationHelper.mcdw_redux$fromToolMaterial(material))
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_SHIELDS));
        this.weaponsID = weaponsID;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }
}
