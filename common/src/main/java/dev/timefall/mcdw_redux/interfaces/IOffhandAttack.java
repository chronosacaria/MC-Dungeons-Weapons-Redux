package dev.timefall.mcdw_redux.interfaces;

import dev.timefall.mcdw_redux.client.OffhandAttackChecker;
import dev.timefall.mcdw_redux.configs.CompatibilityFlags;
import dev.timefall.mcdw_redux.registries.ItemsRegistry;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.TypedActionResult;
import net.minecraft.world.World;

public interface IOffhandAttack {
    default TypedActionResult<ItemStack> useOffhand(World world, PlayerEntity player, Hand hand) {
        if (CompatibilityFlags.noOffhandConflicts) {
            if (hand == Hand.OFF_HAND
                    && world.isClient
                    && (player.getOffHandStack().getItem() instanceof IOffhandAttack
                    && (player.getOffHandStack().isOf(player.getMainHandStack().getItem())
                    || (player.getMainHandStack().isOf(ItemsRegistry.THE_BEGINNING.get()) && player.getOffHandStack().isOf(ItemsRegistry.THE_END.get()))
                    || (player.getMainHandStack().isOf(ItemsRegistry.THE_END.get()) && player.getOffHandStack().isOf(ItemsRegistry.THE_BEGINNING.get()))
                    || (player.getMainHandStack().isOf(ItemsRegistry.LAST_LAUGH_GOLD.get()) && player.getOffHandStack().isOf(ItemsRegistry.LAST_LAUGH_SILVER.get()))
                    || (player.getMainHandStack().isOf(ItemsRegistry.LAST_LAUGH_SILVER.get()) && player.getOffHandStack().isOf(ItemsRegistry.LAST_LAUGH_GOLD.get()))))) {
                OffhandAttackChecker.checkForOffhandAttack();
                ItemStack offhand = player.getStackInHand(hand);
                return new TypedActionResult<>(ActionResult.SUCCESS, offhand);
            }
        }
        return new TypedActionResult<>(ActionResult.PASS, player.getStackInHand(hand));
    }
}
