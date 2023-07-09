package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.items.BeeStingerItem;
import dev.timefall.mcdw_redux.items.bases.*;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.item.ToolMaterials;
import net.minecraft.registry.RegistryKeys;

@SuppressWarnings("unused")
public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM);
    
    // Axes
    public static final RegistrySupplier<AxeBaseItem> ANCHOR =                          mcdw_redux$registerAxe(WeaponsID.ANCHOR, ToolMaterials.IRON, 8, -3.4f, "minecraft:iron_ingot");
    public static final RegistrySupplier<AxeBaseItem> AXE =                             mcdw_redux$registerAxe(WeaponsID.AXE, ToolMaterials.IRON, 6, -3.1f, "minecraft:iron_ingot");
    public static final RegistrySupplier<AxeBaseItem> ENCRUSTED_ANCHOR =                mcdw_redux$registerAxe(WeaponsID.ENCRUSTED_ANCHOR, ToolMaterials.DIAMOND, 8, -3.4f, "minecraft:diamond");
    public static final RegistrySupplier<AxeBaseItem> FIREBRAND =                       mcdw_redux$registerAxe(WeaponsID.FIREBRAND, ToolMaterials.DIAMOND, 4, -2.9f, "minecraft:diamond");
    public static final RegistrySupplier<AxeBaseItem> HIGHLAND_AXE =                    mcdw_redux$registerAxe(WeaponsID.HIGHLAND_AXE, ToolMaterials.IRON, 4, -2.9f, "minecraft:iron_ingot");
    public static final RegistrySupplier<AxeBaseItem> MECHANIZED_SAWBLADE =             mcdw_redux$registerAxe(WeaponsID.MECHANIZED_SAWBLADE, ToolMaterials.DIAMOND,3, -2.4f, "minecraft:blaze_rod");

    // Double Axes
    public static final RegistrySupplier<AxeBaseItem> CURSED_AXE =                      mcdw_redux$registerAxe(WeaponsID.CURSED_AXE, ToolMaterials.IRON, 7, -2.9f, "minecraft:iron_ingot");
    public static final RegistrySupplier<AxeBaseItem> DOUBLE_AXE =                      mcdw_redux$registerAxe(WeaponsID.DOUBLE_AXE, ToolMaterials.IRON, 6, -2.9f, "minecraft:iron_ingot");
    public static final RegistrySupplier<AxeBaseItem> WHIRLWIND =                       mcdw_redux$registerAxe(WeaponsID.WHIRLWIND, ToolMaterials.IRON, 6, -2.9f, "minecraft:iron_ingot");

    // Bows
    public static final RegistrySupplier<BowBaseItem> ANCIENT_BOW =                     mcdw_redux$registerBow(WeaponsID.ANCIENT_BOW, ToolMaterials.NETHERITE, 7, 14, 18f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<BowBaseItem> BONE_BOW =                        mcdw_redux$registerBow(WeaponsID.BONE_BOW, ToolMaterials.STONE, 5, 16, 12f, "minecraft:bone");
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BOW =                      mcdw_redux$registerBow(WeaponsID.BUBBLE_BOW, ToolMaterials.IRON, 5, 15, 12f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BURSTER =                  mcdw_redux$registerBow(WeaponsID.BUBBLE_BURSTER, ToolMaterials.DIAMOND, 5, 15, 13f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> BURST_GALE_BOW =                  mcdw_redux$registerBow(WeaponsID.BURST_GALE_BOW, ToolMaterials.DIAMOND, 6, 12, 16f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> CALL_OF_THE_VOID =                mcdw_redux$registerBow(WeaponsID.CALL_OF_THE_VOID, ToolMaterials.NETHERITE, 6, 15, 16f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<BowBaseItem> ECHO_OF_THE_VALLEY =              mcdw_redux$registerBow(WeaponsID.ECHO_OF_THE_VALLEY, ToolMaterials.DIAMOND, 6, 11, 16f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> ELITE_POWER_BOW =                 mcdw_redux$registerBow(WeaponsID.ELITE_POWER_BOW, ToolMaterials.IRON, 6, 20, 15f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> GREEN_MENACE =                    mcdw_redux$registerBow(WeaponsID.GREEN_MENACE, ToolMaterials.DIAMOND, 5, 17, 13f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> HAUNTED_BOW =                     mcdw_redux$registerBow(WeaponsID.HAUNTED_BOW, ToolMaterials.NETHERITE, 6, 18, 16f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<BowBaseItem> HUNTERS_PROMISE =                 mcdw_redux$registerBow(WeaponsID.HUNTERS_PROMISE, ToolMaterials.IRON, 6, 15, 16f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> HUNTING_BOW =                     mcdw_redux$registerBow(WeaponsID.HUNTING_BOW, ToolMaterials.IRON, 6, 16, 15f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> BOW_OF_LOST_SOULS =               mcdw_redux$registerBow(WeaponsID.BOW_OF_LOST_SOULS, ToolMaterials.NETHERITE, 6, 12, 17f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<BowBaseItem> MASTERS_BOW =                     mcdw_redux$registerBow(WeaponsID.MASTERS_BOW, ToolMaterials.IRON, 6, 17, 16f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> NOCTURNAL_BOW =                   mcdw_redux$registerBow(WeaponsID.NOCTURNAL_BOW, ToolMaterials.DIAMOND, 6, 17, 14f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> PHANTOM_BOW =                     mcdw_redux$registerBow(WeaponsID.PHANTOM_BOW, ToolMaterials.DIAMOND, 6, 20, 14f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> PINK_SCOUNDREL =                  mcdw_redux$registerBow(WeaponsID.PINK_SCOUNDREL, ToolMaterials.DIAMOND, 5, 17, 13f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> POWER_BOW =                       mcdw_redux$registerBow(WeaponsID.POWER_BOW, ToolMaterials.IRON, 6, 20, 14f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> SABREWING =                       mcdw_redux$registerBow(WeaponsID.SABREWING, ToolMaterials.DIAMOND, 5, 10, 13f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> SHIVERING_BOW =                   mcdw_redux$registerBow(WeaponsID.SHIVERING_BOW, ToolMaterials.DIAMOND, 6, 14, 15f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> SNOW_BOW =                        mcdw_redux$registerBow(WeaponsID.SNOW_BOW, ToolMaterials.IRON, 5, 16, 13f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> SOUL_BOW =                        mcdw_redux$registerBow(WeaponsID.SOUL_BOW, ToolMaterials.IRON, 6, 14, 15f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> TRICK_BOW =                       mcdw_redux$registerBow(WeaponsID.TRICK_BOW, ToolMaterials.DIAMOND, 5, 12, 12f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> TWIN_BOW =                        mcdw_redux$registerBow(WeaponsID.TWIN_BOW, ToolMaterials.DIAMOND, 5, 12, 12f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> TWISTING_VINE_BOW =               mcdw_redux$registerBow(WeaponsID.TWISTING_VINE_BOW, ToolMaterials.IRON, 5, 15, 13f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> VOID_BOW =                        mcdw_redux$registerBow(WeaponsID.VOID_BOW, ToolMaterials.DIAMOND, 6, 15, 16f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> WEB_BOW =                         mcdw_redux$registerBow(WeaponsID.WEB_BOW, ToolMaterials.DIAMOND, 5, 15, 12f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> WEEPING_VINE_BOW =                mcdw_redux$registerBow(WeaponsID.WEEPING_VINE_BOW, ToolMaterials.IRON, 5, 15, 13f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> WIND_BOW =                        mcdw_redux$registerBow(WeaponsID.WIND_BOW, ToolMaterials.DIAMOND, 6, 11, 15f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> WINTERS_TOUCH =                   mcdw_redux$registerBow(WeaponsID.WINTERS_TOUCH, ToolMaterials.DIAMOND, 6, 15, 14f, "minecraft:diamond");

    // Longbows
    public static final RegistrySupplier<BowBaseItem> GUARDIAN_BOW =                    mcdw_redux$registerBow(WeaponsID.GUARDIAN_BOW, ToolMaterials.DIAMOND, 8, 30, 19f, "minecraft:diamond");
    public static final RegistrySupplier<BowBaseItem> LONGBOW =                         mcdw_redux$registerBow(WeaponsID.LONGBOW, ToolMaterials.IRON, 7, 25, 17f, "minecraft:planks");
    public static final RegistrySupplier<BowBaseItem> RED_SNAKE =                       mcdw_redux$registerBow(WeaponsID.RED_SNAKE, ToolMaterials.DIAMOND, 7, 30, 18f, "minecraft:diamond");

    // Shortbows
    public static final RegistrySupplier<BowBaseItem> LOVE_SPELL_BOW =                  mcdw_redux$registerBow(WeaponsID.LOVE_SPELL_BOW, ToolMaterials.IRON, 3, 9, 8f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> MECHANICAL_SHORTBOW =             mcdw_redux$registerBow(WeaponsID.MECHANICAL_SHORTBOW, ToolMaterials.IRON, 4, 9, 9f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> PURPLE_STORM =                    mcdw_redux$registerBow(WeaponsID.PURPLE_STORM, ToolMaterials.IRON, 3, 9, 8f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BowBaseItem> SHORTBOW =                        mcdw_redux$registerBow(WeaponsID.SHORTBOW, ToolMaterials.IRON, 3, 9, 8f, "minecraft:planks");
    
    // Crossbows
    public static final RegistrySupplier<CrossbowBaseItem> AUTO_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.AUTO_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> AZURE_SEEKER =               mcdw_redux$registerCrossbow(WeaponsID.AZURE_SEEKER, ToolMaterials.IRON,      10, 28, 8.4f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> BABY_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.BABY_CROSSBOW, ToolMaterials.IRON,      8,  23, 7.2f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> BURST_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.BURST_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> BUTTERFLY_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.BUTTERFLY_CROSSBOW, ToolMaterials.IRON,      10, 28, 8.9f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> COG_CROSSBOW =               mcdw_redux$registerCrossbow(WeaponsID.COG_CROSSBOW, ToolMaterials.IRON,      10, 28, 8.4f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> CORRUPTED_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.CORRUPTED_CROSSBOW, ToolMaterials.NETHERITE, 16, 22, 14.0f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<CrossbowBaseItem> DOOM_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.DOOM_CROSSBOW, ToolMaterials.NETHERITE, 9,  26, 8.0f,  "minecraft:netherite_scrap");
    public static final RegistrySupplier<CrossbowBaseItem> DUAL_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.DUAL_CROSSBOW, ToolMaterials.IRON,      8,  24, 7.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> EXPLODING_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.EXPLODING_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> FERAL_SOUL_CROSSBOW =        mcdw_redux$registerCrossbow(WeaponsID.FERAL_SOUL_CROSSBOW, ToolMaterials.IRON,      10, 28, 9.2f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> FIREBOLT_THROWER =           mcdw_redux$registerCrossbow(WeaponsID.FIREBOLT_THROWER, ToolMaterials.IRON,      9,  28, 7.9f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> HARPOON_CROSSBOW =           mcdw_redux$registerCrossbow(WeaponsID.HARPOON_CROSSBOW, ToolMaterials.IRON,      12, 28, 11.0f, "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> HARP_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.HARP_CROSSBOW, ToolMaterials.IRON,      10, 28, 8.6f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> HEAVY_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.HEAVY_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> IMPLODING_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.IMPLODING_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> LIGHTNING_HARP_CROSSBOW =    mcdw_redux$registerCrossbow(WeaponsID.LIGHTNING_HARP_CROSSBOW, ToolMaterials.DIAMOND,   16, 28, 14.2f, "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> NAUTICAL_CROSSBOW =          mcdw_redux$registerCrossbow(WeaponsID.NAUTICAL_CROSSBOW, ToolMaterials.DIAMOND,   16, 24, 14.0f, "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> PRIDE_OF_THE_PIGLINS =       mcdw_redux$registerCrossbow(WeaponsID.PRIDE_OF_THE_PIGLINS, ToolMaterials.NETHERITE, 15, 20, 13.0f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<CrossbowBaseItem> RAPID_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.RAPID_CROSSBOW, ToolMaterials.IRON,      9,  20, 8.2f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> SCATTER_CROSSBOW =           mcdw_redux$registerCrossbow(WeaponsID.SCATTER_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> SHADOW_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.SHADOW_CROSSBOW, ToolMaterials.DIAMOND,   14, 25, 12.0f, "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> SLAYER_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.SLAYER_CROSSBOW, ToolMaterials.DIAMOND,   10, 26, 8.8f,  "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.SOUL_CROSSBOW, ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_HUNTER_CROSSBOW =       mcdw_redux$registerCrossbow(WeaponsID.SOUL_HUNTER_CROSSBOW, ToolMaterials.DIAMOND,   12, 28, 11.0f, "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> SPELLBOUND_CROSSBOW =        mcdw_redux$registerCrossbow(WeaponsID.SPELLBOUND_CROSSBOW, ToolMaterials.IRON,      10, 28, 8.9f,  "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> THE_SLICER =                 mcdw_redux$registerCrossbow(WeaponsID.THE_SLICER, ToolMaterials.IRON,      12, 28, 10.2f, "minecraft:iron_ingot");
    public static final RegistrySupplier<CrossbowBaseItem> VEILED_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.VEILED_CROSSBOW, ToolMaterials.DIAMOND,   16, 22, 14.5f, "minecraft:diamond");
    public static final RegistrySupplier<CrossbowBaseItem> VOID_CALLER_CROSSBOW =       mcdw_redux$registerCrossbow(WeaponsID.VOID_CALLER_CROSSBOW, ToolMaterials.DIAMOND,   14, 26, 12.5f, "minecraft:diamond");
    
    // Daggers
    public static final RegistrySupplier<DualBaseItem> BACKSTABBER =                    mcdw_redux$registerDual(WeaponsID.BACKSTABBER, ToolMaterials.DIAMOND,1, -1.7f, "minecraft:diamond");
    public static final RegistrySupplier<DualBaseItem> CHILL_GALE_KNIFE =               mcdw_redux$registerDual(WeaponsID.CHILL_GALE_KNIFE, ToolMaterials.DIAMOND,2, -2.2f, "minecraft:diamond");
    public static final RegistrySupplier<DualBaseItem> DAGGER =                         mcdw_redux$registerDual(WeaponsID.DAGGER, ToolMaterials.IRON,1, -1.5f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> FANGS_OF_FROST =                 mcdw_redux$registerDual(WeaponsID.FANGS_OF_FROST, ToolMaterials.IRON,1, -1.5f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> MOON_DAGGER =                    mcdw_redux$registerDual(WeaponsID.MOON_DAGGER, ToolMaterials.IRON,1, -1.5f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> RESOLUTE_TEMPEST_KNIFE =         mcdw_redux$registerDual(WeaponsID.RESOLUTE_TEMPEST_KNIFE, ToolMaterials.IRON,2, -2.2f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> SHEAR_DAGGER =                   mcdw_redux$registerDual(WeaponsID.SHEAR_DAGGER, ToolMaterials.IRON,0, -1.5f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> SWIFT_STRIKER =                  mcdw_redux$registerDual(WeaponsID.SWIFT_STRIKER, ToolMaterials.NETHERITE,1, -1.7f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<DualBaseItem> TEMPEST_KNIFE =                  mcdw_redux$registerDual(WeaponsID.TEMPEST_KNIFE, ToolMaterials.IRON,2, -2.2f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> THE_BEGINNING =                  mcdw_redux$registerDual(WeaponsID.THE_BEGINNING, ToolMaterials.NETHERITE,1, -1.8f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<DualBaseItem> THE_END =                        mcdw_redux$registerDual(WeaponsID.THE_END, ToolMaterials.NETHERITE,1, -1.8f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<DualBaseItem> VOID_TOUCHED_BLADE =             mcdw_redux$registerDual(WeaponsID.VOID_TOUCHED_BLADE, ToolMaterials.DIAMOND,1, -1.8f, "minecraft:diamond");
    
    // Gauntlets
    public static final RegistrySupplier<DualBaseItem> GAUNTLET =                       mcdw_redux$registerDual(WeaponsID.GAUNTLET, ToolMaterials.IRON,0, -1.5f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> MAULER =                         mcdw_redux$registerDual(WeaponsID.MAULER, ToolMaterials.DIAMOND,1, -1.5f, "minecraft:diamond");
    public static final RegistrySupplier<DualBaseItem> SOUL_FIST =                      mcdw_redux$registerDual(WeaponsID.SOUL_FIST, ToolMaterials.NETHERITE,0, -1.5f, "minecraft:netherite_scrap");
    
    // Glaives
    public static final RegistrySupplier<RangedMeleeBaseItem> CACKLING_BROOM =          mcdw_redux$registerRangedMeleeItem(WeaponsID.CACKLING_BROOM, ToolMaterials.IRON,5, -3f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfPolearms, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> GLAIVE =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.GLAIVE, ToolMaterials.IRON,5, -3f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfPolearms, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> GRAVE_BANE =              mcdw_redux$registerRangedMeleeItem(WeaponsID.GRAVE_BANE, ToolMaterials.IRON,6, -3f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfPolearms, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> VENOM_GLAIVE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.VENOM_GLAIVE, ToolMaterials.IRON,6, -3f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfPolearms, "minecraft:iron_ingot");
    
    // Blunts
    public static final RegistrySupplier<BluntBaseItem> BONECLUB =                      mcdw_redux$registerBlunt(WeaponsID.BONECLUB, ToolMaterials.IRON,7, -3.2f, "minecraft:bone_block");
    public static final RegistrySupplier<BluntBaseItem> BONE_CUDGEL =                   mcdw_redux$registerBlunt(WeaponsID.BONE_CUDGEL, ToolMaterials.NETHERITE,7, -3.2f, "minecraft:netherite_scrap");
    public static final RegistrySupplier<BluntBaseItem> FLAIL =                         mcdw_redux$registerBlunt(WeaponsID.FLAIL, ToolMaterials.IRON,5, -2.8f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BluntBaseItem> GRAVITY_HAMMER =                mcdw_redux$registerBlunt(WeaponsID.GRAVITY_HAMMER, ToolMaterials.DIAMOND,6, -3.2f, "minecraft:diamond");
    public static final RegistrySupplier<BluntBaseItem> GREAT_HAMMER =                  mcdw_redux$registerBlunt(WeaponsID.GREAT_HAMMER, ToolMaterials.IRON,6, -3.2f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BluntBaseItem> MACE =                          mcdw_redux$registerBlunt(WeaponsID.MACE, ToolMaterials.IRON,5, -2.8f, "minecraft:iron_ingot");
    public static final RegistrySupplier<BluntBaseItem> STORMLANDER =                   mcdw_redux$registerBlunt(WeaponsID.STORMLANDER, ToolMaterials.DIAMOND,7, -3.2f, "minecraft:diamond");
    public static final RegistrySupplier<BluntBaseItem> SUNS_GRACE =                    mcdw_redux$registerBlunt(WeaponsID.SUNS_GRACE, ToolMaterials.DIAMOND,4, -2.8f, "minecraft:diamond");

    // Pickaxes
    public static final RegistrySupplier<PickaxeBaseItem> DIAMOND_PICKAXE =             mcdw_redux$registerPickaxe(WeaponsID.DIAMOND_PICKAXE, ToolMaterials.DIAMOND,1, -2.8f, "minecraft:diamond");
    public static final RegistrySupplier<PickaxeBaseItem> HAILING_PINNACLE =            mcdw_redux$registerPickaxe(WeaponsID.HAILING_PINNACLE, ToolMaterials.DIAMOND,1, -2.8f, "minecraft:diamond");
    public static final RegistrySupplier<PickaxeBaseItem> HOWLING_PICK =                mcdw_redux$registerPickaxe(WeaponsID.HOWLING_PICK, ToolMaterials.IRON,1, -2.8f, "minecraft:iron_ingot");
    public static final RegistrySupplier<PickaxeBaseItem> MOUNTAINEER_PICK =            mcdw_redux$registerPickaxe(WeaponsID.MOUNTAINEER_PICK, ToolMaterials.IRON,1, -2.8f, "minecraft:iron_ingot");

    // Scythes
    public static final RegistrySupplier<RangedMeleeBaseItem> FROST_SCYTHE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.FROST_SCYTHE, ToolMaterials.DIAMOND,4, -2.9f, 0.5, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> JAILORS_SCYTHE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.JAILORS_SCYTHE, ToolMaterials.IRON,4, -2.9f, 0.5, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> SKULL_SCYTHE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.SKULL_SCYTHE, ToolMaterials.DIAMOND,4, -2.9f, 0.5, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> SOUL_SCYTHE =             mcdw_redux$registerRangedMeleeItem(WeaponsID.SOUL_SCYTHE, ToolMaterials.DIAMOND,3, -2.9f, 0.5, "minecraft:diamond");
    
    // Shields
    public static final RegistrySupplier<ShieldBaseItem> ROYAL_GUARD_SHIELD =           mcdw_redux$registerShield(WeaponsID.ROYAL_GUARD_SHIELD, ToolMaterials.DIAMOND, "minecraft:gold_ingot");
    public static final RegistrySupplier<ShieldBaseItem> TOWER_GUARD_SHIELD =           mcdw_redux$registerShield(WeaponsID.TOWER_GUARD_SHIELD, ToolMaterials.DIAMOND, "minecraft:copper_ingot");
    public static final RegistrySupplier<ShieldBaseItem> VANGUARD_SHIELD =              mcdw_redux$registerShield(WeaponsID.VANGUARD_SHIELD, ToolMaterials.DIAMOND, "minecraft:iron_ingot");

    // Sickles
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_GOLD =                mcdw_redux$registerDual(WeaponsID.LAST_LAUGH_GOLD, ToolMaterials.IRON,2, -2.1f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_SILVER =              mcdw_redux$registerDual(WeaponsID.LAST_LAUGH_SILVER, ToolMaterials.IRON,2, -2.1f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> NIGHTMARES_BITE =                mcdw_redux$registerDual(WeaponsID.NIGHTMARES_BITE, ToolMaterials.IRON,2, -2.1f, "minecraft:iron_ingot");
    public static final RegistrySupplier<DualBaseItem> SICKLE =                         mcdw_redux$registerDual(WeaponsID.SICKLE, ToolMaterials.IRON,1, -2.1f, "minecraft:iron_ingot");
    
    // Soul Daggers
    public static final RegistrySupplier<RangedMeleeBaseItem> ETERNAL_KNIFE =           mcdw_redux$registerRangedMeleeItem(WeaponsID.ETERNAL_KNIFE, ToolMaterials.NETHERITE,4, -2.8f, 0, "minecraft:netherite_scrap");
    public static final RegistrySupplier<RangedMeleeBaseItem> SOUL_KNIFE =              mcdw_redux$registerRangedMeleeItem(WeaponsID.SOUL_KNIFE, ToolMaterials.IRON,4, -2.8f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> TRUTHSEEKER =             mcdw_redux$registerRangedMeleeItem(WeaponsID.TRUTHSEEKER, ToolMaterials.NETHERITE,3, -2.8f, 0, "minecraft:netherite_scrap");
    
    // Spears
    public static final RegistrySupplier<RangedMeleeBaseItem> SPEAR =                   mcdw_redux$registerRangedMeleeItem(WeaponsID.SPEAR, ToolMaterials.IRON,4, -2.5f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfSpears, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> WHISPERING_SPEAR =        mcdw_redux$registerRangedMeleeItem(WeaponsID.WHISPERING_SPEAR, ToolMaterials.IRON,5, -2.5f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfSpears, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> FORTUNE_SPEAR =           mcdw_redux$registerRangedMeleeItem(WeaponsID.FORTUNE_SPEAR, ToolMaterials.IRON,5, -2.5f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfSpears,"minecraft:iron_ingot");
    
    // Staves
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF =                   mcdw_redux$registerStaff(WeaponsID.BATTLESTAFF, ToolMaterials.WOOD, 2, -2.6f, "minecraft:planks");
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF_OF_TERROR =         mcdw_redux$registerStaff(WeaponsID.BATTLESTAFF_OF_TERROR, ToolMaterials.IRON, 5, -2.6f, "minecraft:iron_ingot");
    public static final RegistrySupplier<StaffBaseItem> GROWING_STAFF =                 mcdw_redux$registerStaff(WeaponsID.GROWING_STAFF, ToolMaterials.IRON, 5, -2.6f, "minecraft:iron_ingot");
    
    // Swords
    public static final RegistrySupplier<RangedMeleeBaseItem> BEESTINGER =              mcdw_redux$registerRangedMeleeItem(WeaponsID.BEESTINGER, ToolMaterials.IRON, 0, -1.1f, 0,"minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> BROADSWORD =              mcdw_redux$registerRangedMeleeItem(WeaponsID.BROADSWORD, ToolMaterials.IRON, 5, -3.0f, 0.5,"minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> BROKEN_SAWBLADE =         mcdw_redux$registerRangedMeleeItem(WeaponsID.BROKEN_SAWBLADE, ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> CLAYMORE =                mcdw_redux$registerRangedMeleeItem(WeaponsID.CLAYMORE, ToolMaterials.IRON, 7, -3.2f, 0.5, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> CORAL_BLADE =             mcdw_redux$registerRangedMeleeItem(WeaponsID.CORAL_BLADE, ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> CUTLASS =                 mcdw_redux$registerRangedMeleeItem(WeaponsID.CUTLASS, ToolMaterials.IRON,2, -2.3f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> DANCERS_SWORD =           mcdw_redux$registerRangedMeleeItem(WeaponsID.DANCERS_SWORD, ToolMaterials.IRON,3, -2.0f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> DARK_KATANA =             mcdw_redux$registerRangedMeleeItem(WeaponsID.DARK_KATANA, ToolMaterials.NETHERITE,4, -2.9f, 0, "minecraft:netherite_scrap");
    public static final RegistrySupplier<RangedMeleeBaseItem> DIAMOND_SWORD =           mcdw_redux$registerRangedMeleeItem(WeaponsID.DIAMOND_SWORD, ToolMaterials.DIAMOND,3, -2.4f, 0, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> FREEZING_FOIL =           mcdw_redux$registerRangedMeleeItem(WeaponsID.FREEZING_FOIL, ToolMaterials.IRON,1, -1.1f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> FROST_SLAYER =            mcdw_redux$registerRangedMeleeItem(WeaponsID.FROST_SLAYER, ToolMaterials.DIAMOND, 6, -3.2f, 0.5, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> GREAT_AXEBLADE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.GREAT_AXEBLADE, ToolMaterials.IRON, 7, -3.2f, 0.5, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> HAWKBRAND =               mcdw_redux$registerRangedMeleeItem(WeaponsID.HAWKBRAND, ToolMaterials.IRON,6, -2.9f, 0.5, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> HEARTSTEALER =            mcdw_redux$registerRangedMeleeItem(WeaponsID.HEARTSTEALER, ToolMaterials.DIAMOND, 6, -3.2f, 0.5, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> IRON_SWORD =              mcdw_redux$registerRangedMeleeItem(WeaponsID.IRON_SWORD, ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> KATANA =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.KATANA, ToolMaterials.IRON,4, -2.9f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> MASTERS_KATANA =          mcdw_redux$registerRangedMeleeItem(WeaponsID.MASTERS_KATANA, ToolMaterials.DIAMOND,4, -2.9f, 0, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> NAMELESS_BLADE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.NAMELESS_BLADE, ToolMaterials.IRON,4, -2.3f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> OBSIDIAN_CLAYMORE =       mcdw_redux$registerRangedMeleeItem(WeaponsID.OBSIDIAN_CLAYMORE, ToolMaterials.NETHERITE, 6, -3.3f, 0.5, "minecraft:netherite_scrap");
    public static final RegistrySupplier<RangedMeleeBaseItem> RAPIER =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.RAPIER, ToolMaterials.IRON,0, -1.14f, 0, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> SINISTER_SWORD =          mcdw_redux$registerRangedMeleeItem(WeaponsID.SINISTER_SWORD, ToolMaterials.IRON,6, -2.9f, 0.5, "minecraft:iron_ingot");
    public static final RegistrySupplier<RangedMeleeBaseItem> SPONGE_STRIKER =          mcdw_redux$registerRangedMeleeItem(WeaponsID.SPONGE_STRIKER, ToolMaterials.DIAMOND, 3, -2.4f, 0, "minecraft:diamond");
    public static final RegistrySupplier<RangedMeleeBaseItem> THE_STARLESS_NIGHT =      mcdw_redux$registerRangedMeleeItem(WeaponsID.THE_STARLESS_NIGHT, ToolMaterials.NETHERITE, 6, -3.3f, 0.5, "minecraft:netherite_scrap");
    
    // Whips
    public static final RegistrySupplier<RangedMeleeBaseItem> VINE_WHIP =               mcdw_redux$registerRangedMeleeItem(WeaponsID.VINE_WHIP, ToolMaterials.IRON, 5, -3.1f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfWhips, "minecraft:vine");
    public static final RegistrySupplier<RangedMeleeBaseItem> WHIP =                    mcdw_redux$registerRangedMeleeItem(WeaponsID.WHIP, ToolMaterials.IRON, 3, -3.1f, McdwRedux.CONFIG.mcdwReduxStatsConfig.extraAttackReachOfWhips, "minecraft:string");

    // Bee Stinger
    @SuppressWarnings("UnstableApiUsage")
    public static final RegistrySupplier<BeeStingerItem> BEE_STINGER = ITEM_DEFERRED_REGISTER.register("bee_stinger", () ->
            new BeeStingerItem(new Item.Settings()
                    .maxCount(64)
                    .arch$tab(ItemGroups.NATURAL)
            ));

    private static RegistrySupplier<AxeBaseItem> mcdw_redux$registerAxe(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                        float attackSpeed, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new AxeBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, repairIngredients));
    }

    private static RegistrySupplier<BluntBaseItem> mcdw_redux$registerBlunt(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                            float attackSpeed, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new BluntBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, repairIngredients));
    }

    private static RegistrySupplier<BowBaseItem> mcdw_redux$registerBow(WeaponsID wepEnum, ToolMaterials toolMaterial, int projectileDamage,
                                                                        int drawSpeed, float range, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new BowBaseItem(wepEnum, toolMaterial, projectileDamage, drawSpeed, range, repairIngredients));
    }

    private static RegistrySupplier<CrossbowBaseItem> mcdw_redux$registerCrossbow(WeaponsID wepEnum, ToolMaterials toolMaterial, int projectileDamage,
                                                                                  int drawSpeed, float range, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new CrossbowBaseItem(wepEnum, toolMaterial, projectileDamage, drawSpeed, range, repairIngredients));
    }

    private static RegistrySupplier<DualBaseItem> mcdw_redux$registerDual(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                          float attackSpeed, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new DualBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, repairIngredients));
    }

    private static RegistrySupplier<PickaxeBaseItem> mcdw_redux$registerPickaxe(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                                float attackSpeed, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new PickaxeBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, repairIngredients));
    }

    private static RegistrySupplier<ShieldBaseItem> mcdw_redux$registerShield(WeaponsID wepEnum, ToolMaterials toolMaterial, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new ShieldBaseItem(wepEnum, toolMaterial, repairIngredients));
    }

    private static RegistrySupplier<StaffBaseItem> mcdw_redux$registerStaff(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                            float attackSpeed, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new StaffBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, repairIngredients));
    }

    private static RegistrySupplier<RangedMeleeBaseItem> mcdw_redux$registerRangedMeleeItem(WeaponsID wepEnum, ToolMaterials toolMaterial, int attackDamage,
                                                                                            float attackSpeed, double attackRange, String... repairIngredients) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new RangedMeleeBaseItem(wepEnum, toolMaterial, attackDamage, attackSpeed, attackRange, repairIngredients));
    }
}
