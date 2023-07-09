package dev.timefall.mcdw_redux.helpers;

import com.google.common.collect.ImmutableMultimap;
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
import net.minecraft.registry.tag.ItemTags;
import net.minecraft.text.Text;
import net.minecraft.util.Formatting;
import net.minecraft.util.Rarity;

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

    private static Rarity mcdw_redux$fromToolMaterial(ToolMaterial material){
        return
                material == ToolMaterials.NETHERITE ? Rarity.EPIC :
                material == ToolMaterials.DIAMOND ? Rarity.RARE :
                material == ToolMaterials.GOLD || material == ToolMaterials.IRON
                        ? Rarity.UNCOMMON : Rarity.COMMON;
    }

    public static void mcdw_redux$putRangeAttributes(
            ImmutableMultimap.Builder<EntityAttribute, EntityAttributeModifier> builder, double extraReach) {
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

    public static boolean mcdw_redux$canRepairCheck(String[] repairIngredient, ItemStack ingredient) {
        boolean isWood = false;
        boolean isStone = false;
        List<String> repairableList = Arrays.stream(repairIngredient).toList();
        if (repairableList.contains("minecraft:planks"))
            isWood = true;
        if (repairableList.contains("minecraft:stone_crafting_materials"))
            isStone = true;

        return repairableList.contains(ingredient.getItem().toString())
                || (isWood && ingredient.isIn(ItemTags.PLANKS)
                || (isStone && ingredient.isIn(ItemTags.STONE_CRAFTING_MATERIALS)));
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
}
