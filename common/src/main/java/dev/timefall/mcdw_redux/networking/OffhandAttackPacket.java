package dev.timefall.mcdw_redux.networking;

import dev.architectury.networking.NetworkManager;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.interfaces.IDualWielding;
import io.netty.buffer.Unpooled;
import net.minecraft.entity.Entity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.network.PacketByteBuf;
import net.minecraft.network.listener.ServerPlayPacketListener;
import net.minecraft.network.packet.Packet;
import net.minecraft.network.packet.c2s.play.CustomPayloadC2SPacket;
import net.minecraft.server.network.ServerPlayerEntity;
import net.minecraft.server.world.ServerWorld;
import net.minecraft.util.Identifier;

public class OffhandAttackPacket {
    public static final Identifier OFFHAND_ATTACK_PACKET = new Identifier(McdwRedux.MOD_ID, "offhand_attack_entity");
    public static final Identifier OFFHAND_MISS_PACKET = new Identifier(McdwRedux.MOD_ID, "offhand_miss_entity");

    public static Packet<ServerPlayPacketListener> offhandAttackPacket(Entity entity) {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        buf.writeInt(entity.getId());
        return new CustomPayloadC2SPacket(OFFHAND_ATTACK_PACKET, buf);
    }

    public static Packet<?> offhandMissPacket() {
        PacketByteBuf buf = new PacketByteBuf(Unpooled.buffer());
        return new CustomPayloadC2SPacket(OFFHAND_MISS_PACKET, buf);
    }

    public static void registerPackets() {
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, OFFHAND_ATTACK_PACKET, (buf, context) -> {
            if (context.getPlayer().getServer() != null) {
                context.getPlayer().getServer().execute(() -> {
                    int offhandAttackedEntityId = buf.readInt();
                    Entity entity = ((ServerWorld) context.getPlayer().getEntityWorld()).getDragonPart(offhandAttackedEntityId);
                    PlayerEntity playerEntity = context.getPlayer();
                    ((ServerPlayerEntity) playerEntity).updateLastActionTime();
                    if (entity != null) {
                        // Perform Offhand Attack
                    }

                });
            }
        });
        NetworkManager.registerReceiver(NetworkManager.Side.C2S, OFFHAND_MISS_PACKET, (buf, context) -> {
            if (context.getPlayer().getServer() != null)
                context.getPlayer().getServer().execute(() -> ((IDualWielding) context.getPlayer()).resetLastAttackedOffhandTicks());
        });
    }
}
