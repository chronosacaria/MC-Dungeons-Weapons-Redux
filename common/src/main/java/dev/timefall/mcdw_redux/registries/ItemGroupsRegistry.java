package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.CreativeTabRegistry;
import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.ItemStack;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.text.Text;

public class ItemGroupsRegistry {
    public static final DeferredRegister<ItemGroup> CREATIVE_TABS =
            DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM_GROUP);

    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_MELEE = mcdw_redux$registerItemGroup("melee", WeaponsID.HEARTSTEALER);
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_RANGED = mcdw_redux$registerItemGroup("ranged", WeaponsID.LONGBOW);
    public static final RegistrySupplier<ItemGroup> MCDW_REDUX_SHIELDS = mcdw_redux$registerItemGroup("shields", WeaponsID.ROYAL_GUARD_SHIELD);

    private static RegistrySupplier<ItemGroup> mcdw_redux$registerItemGroup(String id, WeaponsID weaponsID) {
            return CREATIVE_TABS.register(
                    id,
                    () -> CreativeTabRegistry.create(
                            Text.translatable("itemGroup." + McdwRedux.MOD_ID + "." + id),
                            () -> new ItemStack(ItemsRegistry.ITEM_DEFERRED_REGISTER.getRegistrar().get(McdwRedux.ID(weaponsID.getId())))
                    )
            );
    }
}
