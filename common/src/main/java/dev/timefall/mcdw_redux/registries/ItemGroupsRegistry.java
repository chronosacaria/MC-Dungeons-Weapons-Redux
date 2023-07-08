package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ItemGroupsRegistry {
    public static final DeferredRegister<ItemGroup> CREATIVE_TABS =
            DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_MELEE = CREATIVE_TABS.register(
            "melee",
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.mcdw_redux.melee"),
                    () -> new ItemStack(ItemsRegistry.HEARTSTEALER.get())
            )
    );
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_RANGED = CREATIVE_TABS.register(
            "ranged",
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.mcdw_redux.ranged"),
                    () -> new ItemStack(ItemsRegistry.LONGBOW.get())
            )
    );
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_SHIELDS = CREATIVE_TABS.register(
            "shields",
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.mcdw_redux.shields"),
                    () -> new ItemStack(ItemsRegistry.ROYAL_GUARD_SHIELD.get())
            )
    );

    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_ENCHANTMENTS = CREATIVE_TABS.register(
            "enchantments",
            () -> CreativeTabRegistry.create(
                    Text.translatable("itemGroup.mcdw_redux.enchantments"),
                    () -> new ItemStack(Items.ENCHANTED_BOOK)
            )
    );
}
