package dev.timefall.mcdw_redux.helpers;

import com.google.common.collect.ImmutableMultimap;
import com.google.common.collect.LinkedListMultimap;
import com.google.common.collect.Multimap;
import com.jamieswhiteshirt.reachentityattributes.ReachEntityAttributes;
import dev.architectury.platform.Platform;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.configs.CompatibilityFlags;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.registries.EntityAttributesRegistry;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import net.minecraft.client.resource.language.I18n;
import net.minecraft.entity.attribute.EntityAttribute;
import net.minecraft.entity.attribute.EntityAttributeModifier;
import net.minecraft.item.*;
import net.minecraft.recipe.Ingredient;
import net.minecraft.registry.Registries;
import net.minecraft.registry.RegistryKeys;
import net.minecraft.registry.tag.TagKey;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Identifier;
import net.minecraft.util.Rarity;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BasesHelper {

    @SuppressWarnings("UnstableApiUsage")
    public static Item.Settings mcdw_redux$createMeleeWeaponSettings(ToolMaterial material, ItemGroup itemGroup) {
        return new Item.Settings()
                .rarity(mcdw_redux$fromToolMaterial(material))
                .arch$tab(itemGroup);
    }

    @SuppressWarnings("UnstableApiUsage")
    public static Item.Settings mcdw_redux$createRangedWeaponSettings(ToolMaterial material) {
        return new Item.Settings()
                        .maxCount(1)
                        .maxDamage(100 + material.getDurability())
                        .arch$tab(ItemGroupsRegistry.MCDW_REDUX_RANGED);
    }

    public static Rarity mcdw_redux$fromToolMaterial(ToolMaterial material){
        return
                material == ToolMaterials.NETHERITE ? Rarity.EPIC :
                material == ToolMaterials.DIAMOND ? Rarity.RARE :
                material == ToolMaterials.GOLD || material == ToolMaterials.IRON
                        ? Rarity.UNCOMMON : Rarity.COMMON;
    }

    public static void mcdw_redux$putRangeAttributes(ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder, double extraReach) {
        if (Platform.isFabric() && Platform.isModLoaded("reach-entity-attributes") && CompatibilityFlags.isReachExtensionEnabled) {
            builder.put(ReachEntityAttributes.REACH, new EntityAttributeModifier("reach",
                    extraReach, EntityAttributeModifier.Operation.ADDITION));
            builder.put(ReachEntityAttributes.ATTACK_RANGE, new EntityAttributeModifier("attack_range",
                    extraReach, EntityAttributeModifier.Operation.ADDITION));
        } else if (CompatibilityFlags.isReachExtensionEnabled) {
            builder.put(EntityAttributesRegistry.ATTACK_RANGE.get(), new EntityAttributeModifier("attack_range",
                    extraReach, EntityAttributeModifier.Operation.ADDITION));
        }
    }

    public static boolean mcdw_redux$canRepairCheck(String[] repairIngredientString, ItemStack repairIngredientItemStack) {
        List<String> repairItemsList = new ArrayList<>();
        List<String> repairableList = Arrays.stream(repairIngredientString).toList();
        boolean bl = false;
        for (String repairIngredientIterator : repairableList) {
            if (repairIngredientIterator.startsWith("#")) {
                TagKey<Item> tagKey = TagKey.of(RegistryKeys.ITEM, new Identifier(repairIngredientIterator.substring(1)));
                bl = bl || repairIngredientItemStack.isIn(tagKey);
            } else {
                repairItemsList.add(repairIngredientIterator);
            }
        }
        Ingredient stringToIngredient = Ingredient.ofStacks(repairItemsList.stream().map((str)
                -> new ItemStack(Registries.ITEM.get(Identifier.tryParse(str))))
        );
        return bl || stringToIngredient.test(repairIngredientItemStack);
    }

    @SafeVarargs
    public static Multimap<EntityAttribute, EntityAttributeModifier> unionMaps(Multimap<EntityAttribute, EntityAttributeModifier>... multimaps) {
        LinkedListMultimap<EntityAttribute, EntityAttributeModifier> combinedMultiMap = LinkedListMultimap.create();
        for (Multimap<EntityAttribute, EntityAttributeModifier> map : multimaps) {
            combinedMultiMap.putAll(map);
        }
        return combinedMultiMap;
    }

    public static void mcdw_redux$appendTooltip(WeaponsID weaponsID, List<Text> tooltip) {
        int i = 1;
        String translationKey = String.format("tooltip_info_item." + McdwRedux.MOD_ID + ".%s_", weaponsID.getId());
        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.ITALIC));
            i++;
        }
        i = 1;
        translationKey = String.format("tooltip_spec_info_item." + McdwRedux.MOD_ID + ".%s_", weaponsID.getId());
        while (I18n.hasTranslation(translationKey + i)) {
            tooltip.add(Text.translatable(translationKey + i).formatted(Formatting.GRAY));
            i++;
        }
    }

    public static ToolMaterial mcdw_redux$stringToMaterial(String material) {
        return switch (material) {
            case "wood" -> ToolMaterials.WOOD;
            case "stone" -> ToolMaterials.STONE;
            case "gold" -> ToolMaterials.GOLD;
            case "diamond" -> ToolMaterials.DIAMOND;
            case "netherite" -> ToolMaterials.NETHERITE;
            default -> ToolMaterials.IRON;
        };
    }
}
