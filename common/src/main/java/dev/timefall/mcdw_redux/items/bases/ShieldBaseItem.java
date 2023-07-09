package dev.timefall.mcdw_redux.items.bases;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.helpers.BasesHelper;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.BlockItem;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ShieldItem;
import net.minecraft.item.ToolMaterial;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.util.UseAction;
import net.minecraft.world.World;

/**
 * ShieldBaseItem is a replica of ShieldItem except that Minecraft is dumb and this is the only way to add shields.
 */

public class ShieldBaseItem extends ShieldItem {
    WeaponsID weaponsID;
    public final ToolMaterial material;
    String[] repairIngredient;

    public ShieldBaseItem(WeaponsID weaponsID, ToolMaterial material, String[] repairIngredient) {
        super(BasesHelper.mcdw_redux$createMeleeWeaponSettings(material, ItemGroupsRegistry.MCDW_REDUX_SHIELDS.get()));

        this.weaponsID = weaponsID;
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
        return BasesHelper.mcdw_redux$canRepairCheck(repairIngredient, ingredient);
    }
}
