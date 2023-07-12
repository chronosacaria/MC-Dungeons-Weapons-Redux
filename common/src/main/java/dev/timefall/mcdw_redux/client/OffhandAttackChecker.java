package dev.timefall.mcdw_redux.client;

import dev.timefall.mcdw_redux.configs.CompatibilityFlags;
import dev.timefall.mcdw_redux.networking.OffhandAttackPacket;
import net.minecraft.client.MinecraftClient;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.util.hit.EntityHitResult;

public class OffhandAttackChecker {
    public static void mcdw_redux$checkForOffhandAttack() {
        if (CompatibilityFlags.noOffhandConflicts) {
            MinecraftClient mc = MinecraftClient.getInstance();
            PlayerEntity player = mc.player;
            if (mc.world != null
                    && mc.currentScreen == null
                    && !mc.isPaused()
                    && player != null
                    && !player.isBlocking()) {

                if (mc.interactionManager != null && mc.getNetworkHandler() != null) {
                    mc.getNetworkHandler().sendPacket(mc.crosshairTarget instanceof EntityHitResult entityHitResult
                            ? OffhandAttackPacket.mcdw_redux$offhandAttackPacket(entityHitResult.getEntity())
                            : OffhandAttackPacket.mcdw_redux$offhandMissPacket());
                }
            }
        }
    }
}
