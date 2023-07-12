package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.RegistrationHelper;
import dev.timefall.mcdw_redux.interfaces.IInnateEnchantment;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.enchantment.Enchantment;
import net.minecraft.item.AxeItem;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.world.World;

import java.util.List;
import java.util.Map;

/**
 * AxeBaseItem is a replica of AxeItem except that it also has the functionality bestowed by this mod.
 * In addition to being able to disarm shields, strip, wax, and mine wood efficiently, it can also be innately
 * enchanted.
 */

public class AxeBaseItem extends AxeItem implements IInnateEnchantment {
    WeaponsID weaponsID;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public AxeBaseItem(WeaponsID weaponsID, ToolMaterial material, float attackDamage, float attackSpeed, String[] repairIngredient){
        super(material, attackDamage, attackSpeed, new Item.Settings()
                .rarity(RegistrationHelper.mcdw_redux$fromToolMaterial(material))
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_MELEE));
        this.weaponsID = weaponsID;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return RegistrationHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
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
}
