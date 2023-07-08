package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.*;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

public class ShieldBaseItem extends ShieldItem {
    public final ToolMaterial material;
    String[] repairIngredient;

    @SuppressWarnings("UnstableApiUsage")
    public ShieldBaseItem(ToolMaterial material, String[] repairIngredient) {
        super(new Item.Settings()
                .rarity(RarityHelper.fromToolMaterial(material))
                .maxCount(1)
                .maxDamage(250 + material.getDurability())
                .arch$tab(ItemGroupsRegistry.MCDW_REDUX_SHIELDS)
        );
        this.material = material;
        this.repairIngredient = repairIngredient;
    }

    @Override
    public String getTranslationKey (ItemStack itemStack){
        return BlockItem.getBlockEntityNbt(itemStack) != null ?
                this.getTranslationKey() + '.' + getColor(itemStack).getName() : super.getTranslationKey(itemStack);
    }

    @Override
    public UseAction getUseAction(ItemStack itemStack){
        return UseAction.BLOCK;
    }

    @Override
    public int getMaxUseTime(ItemStack itemStack){
        return 72000;
    }

    @Override
    public TypedActionResult<ItemStack> use (World world, PlayerEntity user, Hand hand){
        ItemStack itemStack = user.getStackInHand(hand);
        user.setCurrentHand(hand);
        return TypedActionResult.consume(itemStack);
    }

    @Override
    public boolean canRepair(ItemStack stack, ItemStack ingredient) {
        return CleanlinessHelper.canRepairCheck(repairIngredient, ingredient);
    }
}
