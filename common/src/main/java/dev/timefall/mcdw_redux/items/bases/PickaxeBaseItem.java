package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import dev.timefall.mcdw_redux.registries.ItemsRegistry;
import net.minecraft.client.item.TooltipContext;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.PickaxeItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.world.World;

import java.util.List;

public class PickaxeBaseItem extends PickaxeItem {
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public PickaxeBaseItem(ToolMaterial material, int attackDamage, float attackSpeed, String[] repairIngredient) {
        super(material, attackDamage, attackSpeed,
                new Item.Settings()
                        .rarity(RarityHelper.fromToolMaterial(material))
                        .arch$tab(ItemGroupsRegistry.MCDW_REDUX_MELEE));
        this.repairIngredient = repairIngredient;
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return CleanlinessHelper.canRepairCheck(repairIngredient, ingredient);
    }

    @Override
    public void appendTooltip(ItemStack stack, World world, List<Text> tooltip, TooltipContext tooltipContext) {
        super.appendTooltip(stack, world, tooltip, tooltipContext);
        if (stack.getItem() == ItemsRegistry.DIAMOND_PICKAXE.get()) {
            tooltip.add(Text.translatable("tooltip_info_item.mcdw.diamond_pickaxe_1").formatted(Formatting.ITALIC));
            tooltip.add(Text.translatable("tooltip_info_item.mcdw.diamond_pickaxe_2").formatted(Formatting.ITALIC));
            tooltip.add(Text.translatable("tooltip_info_item.mcdw.diamond_pickaxe_3").formatted(Formatting.ITALIC));
        }
    }
}