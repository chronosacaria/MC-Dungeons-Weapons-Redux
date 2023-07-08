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

    public static final RegistrySupplier<EntityAttribute> REACH = ENTITY_ATTRIBUTE_DEFERRED_REGISTER.register(McdwRedux.ID("reach"),
            () -> createAttribute("reach", 0.0, 0.0, 1024.0));
    public static final RegistrySupplier<EntityAttribute> ATTACK_RANGE = ENTITY_ATTRIBUTE_DEFERRED_REGISTER.register(McdwRedux.ID("attack_range"),
            () -> createAttribute("reach", 0.0, 0.0, 1024.0));

    @SuppressWarnings("SameParameterValue")
    private static EntityAttribute createAttribute(String name, double fallback, double min, double max) {
        return new ClampedEntityAttribute("attribute.name.generic." + McdwRedux.MOD_ID + '.' + name, fallback, min, max).setTracked(true);
    }
}
