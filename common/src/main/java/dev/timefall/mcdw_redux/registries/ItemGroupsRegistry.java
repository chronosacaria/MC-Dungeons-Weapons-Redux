package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ItemGroupsRegistry {
    public static final DeferredRegister<ItemGroup> CREATIVE_TABS =
            DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_MELEE = registerItemGroup("melee", WeaponsID.HEARTSTEALER);
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_RANGED = registerItemGroup("ranged", WeaponsID.LONGBOW);
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_SHIELDS = registerItemGroup("shields", WeaponsID.ROYAL_GUARD_SHIELD);
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_ENCHANTMENTS = registerItemGroup("enchantments", Items.ENCHANTED_BOOK);

    private static RegistrySupplier<ItemGroup> registerItemGroup(String id, WeaponsID weaponsID) {
            return CREATIVE_TABS.register(
                    id,
                    () -> CreativeTabRegistry.create(
                            Text.translatable("itemGroup." + McdwRedux.MOD_ID + "." + id),
                            () -> new ItemStack(ItemsRegistry.ITEM_DEFERRED_REGISTER.getRegistrar().get(McdwRedux.ID(weaponsID.getId())))
                    )
            );
    }
    private static RegistrySupplier<ItemGroup> registerItemGroup(String id, Item item) {
        return CREATIVE_TABS.register(
                id,
                () -> CreativeTabRegistry.create(
                        Text.translatable("itemGroup." + McdwRedux.MOD_ID + "." + id),
                        () -> new ItemStack(item)
                )
        );
    }
}
