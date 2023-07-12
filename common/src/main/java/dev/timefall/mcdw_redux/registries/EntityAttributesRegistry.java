package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import net.minecraft.entity.attribute.ClampedEntityAttribute;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.registry.RegistryKeys;

public class EntityAttributesRegistry {
    public static final DeferredRegister<EntityAttribute> ENTITY_ATTRIBUTE_DEFERRED_REGISTER =
            DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ATTRIBUTE);

    public static final RegistrySupplier<EntityAttribute> REACH = mcdw_redux$registerAttribute("reach");
    public static final RegistrySupplier<EntityAttribute> ATTACK_RANGE = mcdw_redux$registerAttribute("attack_range");

    private static RegistrySupplier<EntityAttribute> mcdw_redux$registerAttribute(String id) {
        return mcdw_redux$registerAttribute(id, 0);
    }

    @SuppressWarnings("SameParameterValue")
    private static RegistrySupplier<EntityAttribute> mcdw_redux$registerAttribute(String id, double fallback) {
        return ENTITY_ATTRIBUTE_DEFERRED_REGISTER.register(McdwRedux.ID(id),
                () -> mcdw_redux$createAttribute(id, fallback, 0.0, 1024.0));
    }

    @SuppressWarnings("SameParameterValue")
    private static EntityAttribute mcdw_redux$createAttribute(String name, double fallback, double min, double max) {
        return new ClampedEntityAttribute("attribute.name.generic." + McdwRedux.MOD_ID + '.' + name, fallback, min, max).setTracked(true);
    }
}
