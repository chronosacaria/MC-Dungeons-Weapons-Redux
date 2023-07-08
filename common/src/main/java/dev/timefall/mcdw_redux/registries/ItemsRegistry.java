package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.items.BeeStingerItem;
import dev.timefall.mcdw_redux.items.bases.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;

public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM);
    
    // Axes
    public static final RegistrySupplier<AxeBaseItem> ANCHOR = ITEM_DEFERRED_REGISTER.register("anchor", () ->
            new AxeBaseItem(ToolMaterials.IRON, 8, -3.4f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<AxeBaseItem> AXE = ITEM_DEFERRED_REGISTER.register("axe", () ->
            new AxeBaseItem(ToolMaterials.IRON, 6, -3.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<AxeBaseItem> ENCRUSTED_ANCHOR = ITEM_DEFERRED_REGISTER.register("encrusted_anchor", () ->
            new AxeBaseItem(ToolMaterials.DIAMOND, 8, -3.4f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<AxeBaseItem> FIREBRAND = ITEM_DEFERRED_REGISTER.register("firebrand", () ->
            new AxeBaseItem(ToolMaterials.DIAMOND, 4, -2.9f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<AxeBaseItem> HIGHLAND_AXE = ITEM_DEFERRED_REGISTER.register("highland_axe", () ->
            new AxeBaseItem(ToolMaterials.IRON, 4, -2.9f, new String[]{"minecraft:iron_ingot"}));
    
    // Double Axes
    public static final RegistrySupplier<AxeBaseItem> CURSED_AXE = ITEM_DEFERRED_REGISTER.register("cursed_axe", () ->
            new AxeBaseItem(ToolMaterials.IRON,7, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<AxeBaseItem> DOUBLE_AXE = ITEM_DEFERRED_REGISTER.register("double_axe", () ->
            new AxeBaseItem(ToolMaterials.IRON,6, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<AxeBaseItem> WHIRLWIND = ITEM_DEFERRED_REGISTER.register("whirlwind", () ->
            new AxeBaseItem(ToolMaterials.IRON,6, -2.9f, new String[]{"minecraft:iron_ingot"}));
    
    // Bows
    public static final RegistrySupplier<BowBaseItem> ANCIENT_BOW = ITEM_DEFERRED_REGISTER.register("ancient_bow", () ->
            new BowBaseItem(ToolMaterials.NETHERITE, 7, 14, 18f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<BowBaseItem> BONE_BOW = ITEM_DEFERRED_REGISTER.register("bone_bow", () ->
            new BowBaseItem(ToolMaterials.STONE,     5, 16, 12f, new String[]{"minecraft:bone"}));
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BOW = ITEM_DEFERRED_REGISTER.register("bubble_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      5, 15, 12f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BURSTER = ITEM_DEFERRED_REGISTER.register("bubble_burster", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 15, 13f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> BURST_GALE_BOW = ITEM_DEFERRED_REGISTER.register("burst_gale_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 12, 16f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> CALL_OF_THE_VOID = ITEM_DEFERRED_REGISTER.register("call_of_the_void", () ->
            new BowBaseItem(ToolMaterials.NETHERITE, 6, 15, 16f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<BowBaseItem> ECHO_OF_THE_VALLEY = ITEM_DEFERRED_REGISTER.register("echo_of_the_valley", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 11, 16f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> ELITE_POWER_BOW = ITEM_DEFERRED_REGISTER.register("elite_power_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 20, 15f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> GREEN_MENACE = ITEM_DEFERRED_REGISTER.register("green_menace", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 17, 13f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> HAUNTED_BOW = ITEM_DEFERRED_REGISTER.register("haunted_bow", () ->
            new BowBaseItem(ToolMaterials.NETHERITE, 6, 18, 16f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<BowBaseItem> HUNTERS_PROMISE = ITEM_DEFERRED_REGISTER.register("hunters_promise", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 15, 16f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> HUNTING_BOW = ITEM_DEFERRED_REGISTER.register("hunting_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 16, 15f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> BOW_OF_LOST_SOULS = ITEM_DEFERRED_REGISTER.register("bow_of_lost_souls", () ->
            new BowBaseItem(ToolMaterials.NETHERITE, 6, 12, 17f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<BowBaseItem> MASTERS_BOW = ITEM_DEFERRED_REGISTER.register("masters_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 17, 16f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> NOCTURNAL_BOW = ITEM_DEFERRED_REGISTER.register("nocturnal_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 17, 14f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> PHANTOM_BOW = ITEM_DEFERRED_REGISTER.register("phantom_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 20, 14f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> PINK_SCOUNDREL = ITEM_DEFERRED_REGISTER.register("pink_scoundrel", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 17, 13f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> POWER_BOW = ITEM_DEFERRED_REGISTER.register("power_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 20, 14f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> SABREWING = ITEM_DEFERRED_REGISTER.register("sabrewing", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 10, 13f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> SHIVERING_BOW = ITEM_DEFERRED_REGISTER.register("shivering_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 14, 15f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> SNOW_BOW = ITEM_DEFERRED_REGISTER.register("snow_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      5, 16, 13f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> SOUL_BOW = ITEM_DEFERRED_REGISTER.register("soul_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      6, 14, 15f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> TRICK_BOW = ITEM_DEFERRED_REGISTER.register("trick_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 12, 12f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> TWIN_BOW = ITEM_DEFERRED_REGISTER.register("twin_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 12, 12f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> TWISTING_VINE_BOW = ITEM_DEFERRED_REGISTER.register("twisting_vine_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      5, 15, 13f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> VOID_BOW = ITEM_DEFERRED_REGISTER.register("void_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 15, 16f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> WEB_BOW = ITEM_DEFERRED_REGISTER.register("web_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   5, 15, 12f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> WEEPING_VINE_BOW = ITEM_DEFERRED_REGISTER.register("weeping_vine_bow", () ->
            new BowBaseItem(ToolMaterials.IRON,      5, 15, 13f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> WIND_BOW = ITEM_DEFERRED_REGISTER.register("wind_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 11, 15f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> WINTERS_TOUCH = ITEM_DEFERRED_REGISTER.register("winters_touch", () ->
            new BowBaseItem(ToolMaterials.DIAMOND,   6, 15, 14f, new String[]{"minecraft:diamond"}));
    
    // Longbows
    public static final RegistrySupplier<BowBaseItem> GUARDIAN_BOW = ITEM_DEFERRED_REGISTER.register("guardian_bow", () ->
            new BowBaseItem(ToolMaterials.DIAMOND, 8, 30, 19f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BowBaseItem> LONGBOW = ITEM_DEFERRED_REGISTER.register("longbow", () ->
            new BowBaseItem(ToolMaterials.IRON,    7, 25, 17f, new String[]{"minecraft:planks"}));
    public static final RegistrySupplier<BowBaseItem> RED_SNAKE = ITEM_DEFERRED_REGISTER.register("red_snake", () ->
            new BowBaseItem(ToolMaterials.DIAMOND, 7, 30, 18f, new String[]{"minecraft:diamond"}));
    
    // Shortbows
    public static final RegistrySupplier<BowBaseItem> LOVE_SPELL_BOW = ITEM_DEFERRED_REGISTER.register("love_spell_bow", () ->
            new BowBaseItem(ToolMaterials.IRON, 3, 9, 8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> MECHANICAL_SHORTBOW = ITEM_DEFERRED_REGISTER.register("mechanical_shortbow", () ->
            new BowBaseItem(ToolMaterials.IRON, 4, 9, 9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> PURPLE_STORM = ITEM_DEFERRED_REGISTER.register("purple_storm", () ->
            new BowBaseItem(ToolMaterials.IRON, 3, 9, 8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BowBaseItem> SHORTBOW = ITEM_DEFERRED_REGISTER.register("shortbow", () ->
            new BowBaseItem(ToolMaterials.IRON, 3, 9, 8f, new String[]{"minecraft:planks"}));
    
    // Crossbows

    public static final RegistrySupplier<CrossbowBaseItem> AUTO_CROSSBOW = ITEM_DEFERRED_REGISTER.register("auto_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> AZURE_SEEKER = ITEM_DEFERRED_REGISTER.register("azure_seeker", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 8.4f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> BABY_CROSSBOW = ITEM_DEFERRED_REGISTER.register("baby_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      8,  23, 7.2f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> BURST_CROSSBOW = ITEM_DEFERRED_REGISTER.register("burst_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> BUTTERFLY_CROSSBOW = ITEM_DEFERRED_REGISTER.register("butterfly_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 8.9f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> COG_CROSSBOW = ITEM_DEFERRED_REGISTER.register("cog_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 8.4f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> CORRUPTED_CROSSBOW = ITEM_DEFERRED_REGISTER.register("corrupted_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.NETHERITE, 16, 22, 14.0f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<CrossbowBaseItem> DOOM_CROSSBOW = ITEM_DEFERRED_REGISTER.register("doom_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.NETHERITE, 9,  26, 8.0f,  new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<CrossbowBaseItem> DUAL_CROSSBOW = ITEM_DEFERRED_REGISTER.register("dual_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      8,  24, 7.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> EXPLODING_CROSSBOW = ITEM_DEFERRED_REGISTER.register("exploding_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> FERAL_SOUL_CROSSBOW = ITEM_DEFERRED_REGISTER.register("feral_soul_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 9.2f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> FIREBOLT_THROWER = ITEM_DEFERRED_REGISTER.register("firebolt_thrower", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 7.9f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> HARPOON_CROSSBOW = ITEM_DEFERRED_REGISTER.register("harpoon_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      12, 28, 11.0f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> HARP_CROSSBOW = ITEM_DEFERRED_REGISTER.register("harp_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 8.6f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> HEAVY_CROSSBOW = ITEM_DEFERRED_REGISTER.register("heavy_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> IMPLODING_CROSSBOW = ITEM_DEFERRED_REGISTER.register("imploding_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> LIGHTNING_HARP_CROSSBOW = ITEM_DEFERRED_REGISTER.register("lightning_harp_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   16, 28, 14.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> NAUTICAL_CROSSBOW = ITEM_DEFERRED_REGISTER.register("nautical_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   16, 24, 14.0f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> PRIDE_OF_THE_PIGLINS = ITEM_DEFERRED_REGISTER.register("pride_of_the_piglins", () ->
            new CrossbowBaseItem(ToolMaterials.NETHERITE, 15, 20, 13.0f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<CrossbowBaseItem> RAPID_CROSSBOW = ITEM_DEFERRED_REGISTER.register("rapid_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  20, 8.2f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> SCATTER_CROSSBOW = ITEM_DEFERRED_REGISTER.register("scatter_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> SHADOW_CROSSBOW = ITEM_DEFERRED_REGISTER.register("shadow_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   14, 25, 12.0f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> SLAYER_CROSSBOW = ITEM_DEFERRED_REGISTER.register("slayer_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   10, 26, 8.8f,  new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_CROSSBOW = ITEM_DEFERRED_REGISTER.register("soul_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      9,  28, 8.0f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_HUNTER_CROSSBOW = ITEM_DEFERRED_REGISTER.register("soul_hunter_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   12, 28, 11.0f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> SPELLBOUND_CROSSBOW = ITEM_DEFERRED_REGISTER.register("spellbound_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      10, 28, 8.9f,  new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> THE_SLICER = ITEM_DEFERRED_REGISTER.register("the_slicer", () ->
            new CrossbowBaseItem(ToolMaterials.IRON,      12, 28, 10.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<CrossbowBaseItem> VEILED_CROSSBOW = ITEM_DEFERRED_REGISTER.register("veiled_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   16, 22, 14.5f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<CrossbowBaseItem> VOID_CALLER_CROSSBOW = ITEM_DEFERRED_REGISTER.register("void_caller_crossbow", () ->
            new CrossbowBaseItem(ToolMaterials.DIAMOND,   14, 26, 12.5f, new String[]{"minecraft:diamond"}));
    
    // Daggers
    public static final RegistrySupplier<DualBaseItem> BACKSTABBER = ITEM_DEFERRED_REGISTER.register("backstabber", () ->
            new DualBaseItem(ToolMaterials.DIAMOND,1, -1.7f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<DualBaseItem> CHILL_GALE_KNIFE = ITEM_DEFERRED_REGISTER.register("chill_gale_knife", () ->
            new DualBaseItem(ToolMaterials.DIAMOND,2, -2.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<DualBaseItem> DAGGER = ITEM_DEFERRED_REGISTER.register("dagger", () ->
            new DualBaseItem(ToolMaterials.IRON,1, -1.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> FANGS_OF_FROST = ITEM_DEFERRED_REGISTER.register("fangs_of_frost", () ->
            new DualBaseItem(ToolMaterials.IRON,1, -1.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> MOON_DAGGER = ITEM_DEFERRED_REGISTER.register("moon_dagger", () ->
            new DualBaseItem(ToolMaterials.IRON,1, -1.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> RESOLUTE_TEMPEST_KNIFE = ITEM_DEFERRED_REGISTER.register("resolute_tempest_knife", () ->
            new DualBaseItem(ToolMaterials.IRON,2, -2.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> SHEAR_DAGGER = ITEM_DEFERRED_REGISTER.register("shear_dagger", () ->
            new DualBaseItem(ToolMaterials.IRON,0, -1.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> SWIFT_STRIKER = ITEM_DEFERRED_REGISTER.register("swift_striker", () ->
            new DualBaseItem(ToolMaterials.NETHERITE,1, -1.7f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<DualBaseItem> TEMPEST_KNIFE = ITEM_DEFERRED_REGISTER.register("tempest_knife", () ->
            new DualBaseItem(ToolMaterials.IRON,2, -2.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> THE_BEGINNING = ITEM_DEFERRED_REGISTER.register("the_beginning", () ->
            new DualBaseItem(ToolMaterials.NETHERITE,1, -1.8f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<DualBaseItem> THE_END = ITEM_DEFERRED_REGISTER.register("the_end", () ->
            new DualBaseItem(ToolMaterials.NETHERITE,1, -1.8f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<DualBaseItem> VOID_TOUCHED_BLADE = ITEM_DEFERRED_REGISTER.register("void_touched_blade", () ->
            new DualBaseItem(ToolMaterials.DIAMOND,1, -1.8f, new String[]{"minecraft:diamond"}));
    
    // Gauntlets
    public static final RegistrySupplier<DualBaseItem> GAUNTLET = ITEM_DEFERRED_REGISTER.register("gauntlet", () ->
            new DualBaseItem(ToolMaterials.IRON,0, -1.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> MAULER = ITEM_DEFERRED_REGISTER.register("mauler", () ->
            new DualBaseItem(ToolMaterials.DIAMOND,1, -1.5f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<DualBaseItem> SOUL_FIST = ITEM_DEFERRED_REGISTER.register("soul_fist", () ->
            new DualBaseItem(ToolMaterials.NETHERITE,0, -1.5f, new String[]{"minecraft:netherite_scrap"}));
    
    // Glaives
    public static final RegistrySupplier<PolearmBaseItem> CACKLING_BROOM = ITEM_DEFERRED_REGISTER.register("cackling_broom", () ->
            new PolearmBaseItem(ToolMaterials.IRON,5, -3f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PolearmBaseItem> GLAIVE = ITEM_DEFERRED_REGISTER.register("glaive", () ->
            new PolearmBaseItem(ToolMaterials.IRON,5, -3f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PolearmBaseItem> GRAVE_BANE = ITEM_DEFERRED_REGISTER.register("grave_bane", () ->
            new PolearmBaseItem(ToolMaterials.IRON,6, -3f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PolearmBaseItem> VENOM_GLAIVE = ITEM_DEFERRED_REGISTER.register("venom_glaive", () ->
            new PolearmBaseItem(ToolMaterials.IRON,6, -3f, new String[]{"minecraft:iron_ingot"}));
    
    // Hammers
    public static final RegistrySupplier<BluntBaseItem> BONECLUB = ITEM_DEFERRED_REGISTER.register("boneclub", () ->
            new BluntBaseItem(ToolMaterials.IRON,7, -3.2f, new String[]{"minecraft:bone_block"}));
    public static final RegistrySupplier<BluntBaseItem> BONE_CUDGEL = ITEM_DEFERRED_REGISTER.register("bone_cudgel", () ->
            new BluntBaseItem(ToolMaterials.NETHERITE,7, -3.2f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<BluntBaseItem> FLAIL = ITEM_DEFERRED_REGISTER.register("flail", () ->
            new BluntBaseItem(ToolMaterials.IRON,5, -2.8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BluntBaseItem> GRAVITY_HAMMER = ITEM_DEFERRED_REGISTER.register("gravity_hammer", () ->
            new BluntBaseItem(ToolMaterials.DIAMOND,6, -3.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BluntBaseItem> GREAT_HAMMER = ITEM_DEFERRED_REGISTER.register("great_hammer", () ->
            new BluntBaseItem(ToolMaterials.IRON,6, -3.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BluntBaseItem> MACE = ITEM_DEFERRED_REGISTER.register("mace", () ->
            new BluntBaseItem(ToolMaterials.IRON,5, -2.8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<BluntBaseItem> STORMLANDER = ITEM_DEFERRED_REGISTER.register("stormlander", () ->
            new BluntBaseItem(ToolMaterials.DIAMOND,7, -3.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<BluntBaseItem> SUNS_GRACE = ITEM_DEFERRED_REGISTER.register("suns_grace", () ->
            new BluntBaseItem(ToolMaterials.DIAMOND,4, -2.8f, new String[]{"minecraft:diamond"}));
    // Pickaxes
    public static final RegistrySupplier<PickaxeBaseItem> DIAMOND_PICKAXE = ITEM_DEFERRED_REGISTER.register("diamond_pickaxe", () ->
            new PickaxeBaseItem(ToolMaterials.DIAMOND,1, -2.8f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<PickaxeBaseItem> HAILING_PINNACLE = ITEM_DEFERRED_REGISTER.register("hailing_pinnacle", () ->
            new PickaxeBaseItem(ToolMaterials.DIAMOND,1, -2.8f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<PickaxeBaseItem> HOWLING_PICK = ITEM_DEFERRED_REGISTER.register("howling_pick", () ->
            new PickaxeBaseItem(ToolMaterials.IRON,1, -2.8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PickaxeBaseItem> MOUNTAINEER_PICK = ITEM_DEFERRED_REGISTER.register("mountaineer_pick", () ->
            new PickaxeBaseItem(ToolMaterials.IRON,1, -2.8f, new String[]{"minecraft:iron_ingot"}));
    // Scythes
    public static final RegistrySupplier<ScytheBaseItem> FROST_SCYTHE = ITEM_DEFERRED_REGISTER.register("frost_scythe", () ->
            new ScytheBaseItem(ToolMaterials.DIAMOND,4, -2.9f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<ScytheBaseItem> JAILORS_SCYTHE = ITEM_DEFERRED_REGISTER.register("jailors_scythe", () ->
            new ScytheBaseItem(ToolMaterials.IRON,4, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<ScytheBaseItem> SKULL_SCYTHE = ITEM_DEFERRED_REGISTER.register("skull_scythe", () ->
            new ScytheBaseItem(ToolMaterials.DIAMOND,4, -2.9f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<ScytheBaseItem> SOUL_SCYTHE = ITEM_DEFERRED_REGISTER.register("soul_scythe", () ->
            new ScytheBaseItem(ToolMaterials.DIAMOND,3, -2.9f, new String[]{"minecraft:diamond"}));
    
    // Shields
    public static final RegistrySupplier<ShieldBaseItem> ROYAL_GUARD_SHIELD = ITEM_DEFERRED_REGISTER.register("royal_guard_shield", () ->
            new ShieldBaseItem(ToolMaterials.DIAMOND, new String[]{"minecraft:iron_ingot", "minecraft:gold_ingot"}));
    public static final RegistrySupplier<ShieldBaseItem> TOWER_GUARD_SHIELD = ITEM_DEFERRED_REGISTER.register("tower_guard_shield", () ->
            new ShieldBaseItem(ToolMaterials.DIAMOND, new String[]{"minecraft:iron_ingot", "minecraft:gold_ingot", "minecraft:copper_ingot"}));
    public static final RegistrySupplier<ShieldBaseItem> VANGUARD_SHIELD = ITEM_DEFERRED_REGISTER.register("vanguard_shield", () ->
            new ShieldBaseItem(ToolMaterials.DIAMOND, new String[]{"minecraft:planks", "minecraft:iron_ingot"}));

    // Sickles
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_GOLD = ITEM_DEFERRED_REGISTER.register("", () ->
            new DualBaseItem(ToolMaterials.IRON,2, -2.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_SILVER = ITEM_DEFERRED_REGISTER.register("", () ->
            new DualBaseItem(ToolMaterials.IRON,2, -2.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> NIGHTMARES_BITE = ITEM_DEFERRED_REGISTER.register("", () ->
            new DualBaseItem(ToolMaterials.IRON,2, -2.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<DualBaseItem> SICKLE = ITEM_DEFERRED_REGISTER.register("", () ->
            new DualBaseItem(ToolMaterials.IRON,1, -2.1f, new String[]{"minecraft:iron_ingot"}));
    
    // Soul Daggers
    public static final RegistrySupplier<SoulDaggerBaseItem> ETERNAL_KNIFE = ITEM_DEFERRED_REGISTER.register("eternal_knife", () ->
            new SoulDaggerBaseItem(ToolMaterials.NETHERITE,4, -2.8f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<SoulDaggerBaseItem> SOUL_KNIFE = ITEM_DEFERRED_REGISTER.register("soul_knife", () ->
            new SoulDaggerBaseItem(ToolMaterials.IRON,4, -2.8f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SoulDaggerBaseItem> TRUTHSEEKER = ITEM_DEFERRED_REGISTER.register("truthseeker", () ->
            new SoulDaggerBaseItem(ToolMaterials.NETHERITE,3, -2.8f, new String[]{"minecraft:netherite_scrap"}));
    
    // Spears
    public static final RegistrySupplier<PolearmBaseItem> SPEAR = ITEM_DEFERRED_REGISTER.register("spear", () ->
            new PolearmBaseItem(ToolMaterials.IRON,4, -2.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PolearmBaseItem> WHISPERING_SPEAR = ITEM_DEFERRED_REGISTER.register("whispering_spear", () ->
            new PolearmBaseItem(ToolMaterials.IRON,5, -2.5f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<PolearmBaseItem> FORTUNE_SPEAR = ITEM_DEFERRED_REGISTER.register("fortune_spear", () ->
            new PolearmBaseItem(ToolMaterials.IRON,5, -2.5f, new String[]{"minecraft:iron_ingot"}));
    
    // Staves
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF = ITEM_DEFERRED_REGISTER.register("battlestaff", () ->
            new StaffBaseItem(ToolMaterials.WOOD, 2, -2.6f, new String[]{"minecraft:planks"}));
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF_OF_TERROR = ITEM_DEFERRED_REGISTER.register("battlestaff_of_terror", () ->
            new StaffBaseItem(ToolMaterials.IRON, 5, -2.6f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<StaffBaseItem> GROWING_STAFF = ITEM_DEFERRED_REGISTER.register("growing_staff", () ->
            new StaffBaseItem(ToolMaterials.IRON, 5, -2.6f, new String[]{"minecraft:iron_ingot"}));
    
    // Swords
    public static final RegistrySupplier<SwordBaseItem> BEESTINGER = ITEM_DEFERRED_REGISTER.register("beestinger", () ->
            new SwordBaseItem(ToolMaterials.IRON, 0, -1.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> BROADSWORD = ITEM_DEFERRED_REGISTER.register("broadsword", () ->
            new SwordBaseItem(ToolMaterials.IRON, 5, -3.0f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> BROKEN_SAWBLADE = ITEM_DEFERRED_REGISTER.register("broken_sawblade", () ->
            new SwordBaseItem(ToolMaterials.IRON,3, -2.4f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> CLAYMORE = ITEM_DEFERRED_REGISTER.register("claymore", () ->
            new SwordBaseItem(ToolMaterials.IRON, 7, -3.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> CORAL_BLADE = ITEM_DEFERRED_REGISTER.register("coral_blade", () ->
            new SwordBaseItem(ToolMaterials.IRON,3, -2.4f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> CUTLASS = ITEM_DEFERRED_REGISTER.register("cutlass", () ->
            new SwordBaseItem(ToolMaterials.IRON,2, -2.3f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> DANCERS_SWORD = ITEM_DEFERRED_REGISTER.register("dancers_sword", () ->
            new SwordBaseItem(ToolMaterials.IRON,3, -2.0f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> DARK_KATANA = ITEM_DEFERRED_REGISTER.register("dark_katana", () ->
            new SwordBaseItem(ToolMaterials.NETHERITE,4, -2.9f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<SwordBaseItem> DIAMOND_SWORD = ITEM_DEFERRED_REGISTER.register("diamond_sword", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND,3, -2.4f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<SwordBaseItem> FREEZING_FOIL = ITEM_DEFERRED_REGISTER.register("freezing_foil", () ->
            new SwordBaseItem(ToolMaterials.IRON,1, -1.1f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> FROST_SLAYER = ITEM_DEFERRED_REGISTER.register("frost_slayer", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND, 6, -3.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<SwordBaseItem> GREAT_AXEBLADE = ITEM_DEFERRED_REGISTER.register("great_axeblade", () ->
            new SwordBaseItem(ToolMaterials.IRON, 7, -3.2f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> HAWKBRAND = ITEM_DEFERRED_REGISTER.register("hawkbrand", () ->
            new SwordBaseItem(ToolMaterials.IRON,6, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> HEARTSTEALER = ITEM_DEFERRED_REGISTER.register("heartstealer", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND, 6, -3.2f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<SwordBaseItem> IRON_SWORD = ITEM_DEFERRED_REGISTER.register("iron_sword", () ->
            new SwordBaseItem(ToolMaterials.IRON,3, -2.4f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> KATANA = ITEM_DEFERRED_REGISTER.register("katana", () ->
            new SwordBaseItem(ToolMaterials.IRON,4, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> MASTERS_KATANA = ITEM_DEFERRED_REGISTER.register("masters_katana", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND,4, -2.9f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<SwordBaseItem> MECHANIZED_SAWBLADE = ITEM_DEFERRED_REGISTER.register("mechanized_sawblade", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND,3, -2.4f, new String[]{"minecraft:blaze_rod"}));
    public static final RegistrySupplier<SwordBaseItem> NAMELESS_BLADE = ITEM_DEFERRED_REGISTER.register("nameless_blade", () ->
            new SwordBaseItem(ToolMaterials.IRON,4, -2.3f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> OBSIDIAN_CLAYMORE = ITEM_DEFERRED_REGISTER.register("obsidian_claymore", () ->
            new SwordBaseItem(ToolMaterials.NETHERITE, 6, -3.3f, new String[]{"minecraft:netherite_scrap"}));
    public static final RegistrySupplier<SwordBaseItem> RAPIER = ITEM_DEFERRED_REGISTER.register("rapier", () ->
            new SwordBaseItem(ToolMaterials.IRON,0, -1.14f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> SINISTER_SWORD = ITEM_DEFERRED_REGISTER.register("sinster_sword", () ->
            new SwordBaseItem(ToolMaterials.IRON,6, -2.9f, new String[]{"minecraft:iron_ingot"}));
    public static final RegistrySupplier<SwordBaseItem> SPONGE_STRIKER = ITEM_DEFERRED_REGISTER.register("sponge_striker", () ->
            new SwordBaseItem(ToolMaterials.DIAMOND,3, -2.4f, new String[]{"minecraft:diamond"}));
    public static final RegistrySupplier<SwordBaseItem> THE_STARLESS_NIGHT = ITEM_DEFERRED_REGISTER.register("the_starless_night", () ->
            new SwordBaseItem(ToolMaterials.NETHERITE, 6, -3.3f, new String[]{"minecraft:netherite_scrap"}));
    
    // Whips
    public static final RegistrySupplier<WhipBaseItem> VINE_WHIP = ITEM_DEFERRED_REGISTER.register("vine_whip", () ->
            new WhipBaseItem(ToolMaterials.IRON, 5, -3.1f, new String[]{"minecraft:vine"}));
    public static final RegistrySupplier<WhipBaseItem> WHIP = ITEM_DEFERRED_REGISTER.register("whip", () ->
            new WhipBaseItem(ToolMaterials.IRON, 3, -3.1f, new String[]{"minecraft:string"}));

    // Bee Stinger
    @SuppressWarnings("UnstableApiUsage")
    public static final RegistrySupplier<BeeStingerItem> BEE_STINGER = ITEM_DEFERRED_REGISTER.register("bee_stinger", () ->
            new BeeStingerItem(new Item.Settings()
                    .maxCount(64)
                    .arch$tab(ItemGroups.NATURAL)
            ));
}
