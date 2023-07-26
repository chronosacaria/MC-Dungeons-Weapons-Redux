package dev.timefall.mcdw_redux.registries;

import dev.architectury.registry.registries.DeferredRegister;
import dev.architectury.registry.registries.RegistrySupplier;
import dev.timefall.mcdw_redux.McdwRedux;
import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.items.BeeStingerItem;
import dev.timefall.mcdw_redux.items.bases.*;
import dev.timefall.mcdw_redux.items.stats.RangedMeleeStats;
import dev.timefall.mcdw_redux.items.stats.ShieldStats;
import dev.timefall.mcdw_redux.items.stats.TrueMeleeStats;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroups;
import net.minecraft.registry.RegistryKeys;

@SuppressWarnings("unused")
public class ItemsRegistry {
    public static final DeferredRegister<Item> ITEM_DEFERRED_REGISTER = DeferredRegister.create(McdwRedux.MOD_ID, RegistryKeys.ITEM);
    
    // Axes
    public static final RegistrySupplier<AxeBaseItem> ANCHOR =                          mcdw_redux$registerAxe(WeaponsID.ANCHOR);
    public static final RegistrySupplier<AxeBaseItem> AXE =                             mcdw_redux$registerAxe(WeaponsID.AXE);
    public static final RegistrySupplier<AxeBaseItem> ENCRUSTED_ANCHOR =                mcdw_redux$registerAxe(WeaponsID.ENCRUSTED_ANCHOR);
    public static final RegistrySupplier<AxeBaseItem> FIREBRAND =                       mcdw_redux$registerAxe(WeaponsID.FIREBRAND);
    public static final RegistrySupplier<AxeBaseItem> HIGHLAND_AXE =                    mcdw_redux$registerAxe(WeaponsID.HIGHLAND_AXE);
    public static final RegistrySupplier<AxeBaseItem> MECHANIZED_SAWBLADE =             mcdw_redux$registerAxe(WeaponsID.MECHANIZED_SAWBLADE);

    // Double Axes
    public static final RegistrySupplier<AxeBaseItem> CURSED_AXE =                      mcdw_redux$registerAxe(WeaponsID.CURSED_AXE);
    public static final RegistrySupplier<AxeBaseItem> DOUBLE_AXE =                      mcdw_redux$registerAxe(WeaponsID.DOUBLE_AXE);
    public static final RegistrySupplier<AxeBaseItem> WHIRLWIND =                       mcdw_redux$registerAxe(WeaponsID.WHIRLWIND);

    public static final RegistrySupplier<BowBaseItem> ANCIENT_BOW =                     mcdw_redux$registerBow(WeaponsID.ANCIENT_BOW);
    public static final RegistrySupplier<BowBaseItem> BONEBOW =                         mcdw_redux$registerBow(WeaponsID.BONEBOW);
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BOW =                      mcdw_redux$registerBow(WeaponsID.BUBBLE_BOW);
    public static final RegistrySupplier<BowBaseItem> BUBBLE_BURSTER =                  mcdw_redux$registerBow(WeaponsID.BUBBLE_BURSTER);
    public static final RegistrySupplier<BowBaseItem> BURST_GALE_BOW =                  mcdw_redux$registerBow(WeaponsID.BURST_GALE_BOW);
    public static final RegistrySupplier<BowBaseItem> CALL_OF_THE_VOID =                mcdw_redux$registerBow(WeaponsID.CALL_OF_THE_VOID);
    public static final RegistrySupplier<BowBaseItem> ECHO_OF_THE_VALLEY =              mcdw_redux$registerBow(WeaponsID.ECHO_OF_THE_VALLEY);
    public static final RegistrySupplier<BowBaseItem> ELITE_POWER_BOW =                 mcdw_redux$registerBow(WeaponsID.ELITE_POWER_BOW);
    public static final RegistrySupplier<BowBaseItem> GREEN_MENACE =                    mcdw_redux$registerBow(WeaponsID.GREEN_MENACE);
    public static final RegistrySupplier<BowBaseItem> HAUNTED_BOW =                     mcdw_redux$registerBow(WeaponsID.HAUNTED_BOW);
    public static final RegistrySupplier<BowBaseItem> HUNTERS_PROMISE =                 mcdw_redux$registerBow(WeaponsID.HUNTERS_PROMISE);
    public static final RegistrySupplier<BowBaseItem> HUNTING_BOW =                     mcdw_redux$registerBow(WeaponsID.HUNTING_BOW);
    public static final RegistrySupplier<BowBaseItem> BOW_OF_LOST_SOULS =               mcdw_redux$registerBow(WeaponsID.BOW_OF_LOST_SOULS);
    public static final RegistrySupplier<BowBaseItem> MASTERS_BOW =                     mcdw_redux$registerBow(WeaponsID.MASTERS_BOW);
    public static final RegistrySupplier<BowBaseItem> NOCTURNAL_BOW =                   mcdw_redux$registerBow(WeaponsID.NOCTURNAL_BOW);
    public static final RegistrySupplier<BowBaseItem> PHANTOM_BOW =                     mcdw_redux$registerBow(WeaponsID.PHANTOM_BOW);
    public static final RegistrySupplier<BowBaseItem> PINK_SCOUNDREL =                  mcdw_redux$registerBow(WeaponsID.PINK_SCOUNDREL);
    public static final RegistrySupplier<BowBaseItem> POWER_BOW =                       mcdw_redux$registerBow(WeaponsID.POWER_BOW);
    public static final RegistrySupplier<BowBaseItem> SABREWING =                       mcdw_redux$registerBow(WeaponsID.SABREWING);
    public static final RegistrySupplier<BowBaseItem> SHIVERING_BOW =                   mcdw_redux$registerBow(WeaponsID.SHIVERING_BOW);
    public static final RegistrySupplier<BowBaseItem> SNOW_BOW =                        mcdw_redux$registerBow(WeaponsID.SNOW_BOW);
    public static final RegistrySupplier<BowBaseItem> SOUL_BOW =                        mcdw_redux$registerBow(WeaponsID.SOUL_BOW);
    public static final RegistrySupplier<BowBaseItem> TRICK_BOW =                       mcdw_redux$registerBow(WeaponsID.TRICK_BOW);
    public static final RegistrySupplier<BowBaseItem> TWIN_BOW =                        mcdw_redux$registerBow(WeaponsID.TWIN_BOW);
    public static final RegistrySupplier<BowBaseItem> TWISTING_VINE_BOW =               mcdw_redux$registerBow(WeaponsID.TWISTING_VINE_BOW);
    public static final RegistrySupplier<BowBaseItem> VOID_BOW =                        mcdw_redux$registerBow(WeaponsID.VOID_BOW);
    public static final RegistrySupplier<BowBaseItem> WEB_BOW =                         mcdw_redux$registerBow(WeaponsID.WEB_BOW);
    public static final RegistrySupplier<BowBaseItem> WEEPING_VINE_BOW =                mcdw_redux$registerBow(WeaponsID.WEEPING_VINE_BOW);
    public static final RegistrySupplier<BowBaseItem> WIND_BOW =                        mcdw_redux$registerBow(WeaponsID.WIND_BOW);
    public static final RegistrySupplier<BowBaseItem> WINTERS_TOUCH =                   mcdw_redux$registerBow(WeaponsID.WINTERS_TOUCH);

    // Longbows
    public static final RegistrySupplier<BowBaseItem> GUARDIAN_BOW =                    mcdw_redux$registerBow(WeaponsID.GUARDIAN_BOW);
    public static final RegistrySupplier<BowBaseItem> LONGBOW =                         mcdw_redux$registerBow(WeaponsID.LONGBOW);
    public static final RegistrySupplier<BowBaseItem> RED_SNAKE =                       mcdw_redux$registerBow(WeaponsID.RED_SNAKE);

    // Shortbows
    public static final RegistrySupplier<BowBaseItem> LOVE_SPELL_BOW =                  mcdw_redux$registerBow(WeaponsID.LOVE_SPELL_BOW);
    public static final RegistrySupplier<BowBaseItem> MECHANICAL_SHORTBOW =             mcdw_redux$registerBow(WeaponsID.MECHANICAL_SHORTBOW);
    public static final RegistrySupplier<BowBaseItem> PURPLE_STORM =                    mcdw_redux$registerBow(WeaponsID.PURPLE_STORM);
    public static final RegistrySupplier<BowBaseItem> SHORTBOW =                        mcdw_redux$registerBow(WeaponsID.SHORTBOW);
    
    // Crossbows
    public static final RegistrySupplier<CrossbowBaseItem> AUTO_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.AUTO_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> AZURE_SEEKER =               mcdw_redux$registerCrossbow(WeaponsID.AZURE_SEEKER);
    public static final RegistrySupplier<CrossbowBaseItem> BABY_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.BABY_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> BURST_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.BURST_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> BUTTERFLY_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.BUTTERFLY_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> COG_CROSSBOW =               mcdw_redux$registerCrossbow(WeaponsID.COG_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> CORRUPTED_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.CORRUPTED_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> DOOM_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.DOOM_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> DUAL_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.DUAL_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> EXPLODING_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.EXPLODING_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> FERAL_SOUL_CROSSBOW =        mcdw_redux$registerCrossbow(WeaponsID.FERAL_SOUL_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> FIREBOLT_THROWER =           mcdw_redux$registerCrossbow(WeaponsID.FIREBOLT_THROWER);
    public static final RegistrySupplier<CrossbowBaseItem> HARPOON_CROSSBOW =           mcdw_redux$registerCrossbow(WeaponsID.HARPOON_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> HARP_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.HARP_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> HEAVY_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.HEAVY_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> IMPLODING_CROSSBOW =         mcdw_redux$registerCrossbow(WeaponsID.IMPLODING_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> LIGHTNING_HARP_CROSSBOW =    mcdw_redux$registerCrossbow(WeaponsID.LIGHTNING_HARP_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> NAUTICAL_CROSSBOW =          mcdw_redux$registerCrossbow(WeaponsID.NAUTICAL_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> PRIDE_OF_THE_PIGLINS =       mcdw_redux$registerCrossbow(WeaponsID.PRIDE_OF_THE_PIGLINS);
    public static final RegistrySupplier<CrossbowBaseItem> RAPID_CROSSBOW =             mcdw_redux$registerCrossbow(WeaponsID.RAPID_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SCATTER_CROSSBOW =           mcdw_redux$registerCrossbow(WeaponsID.SCATTER_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SHADOW_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.SHADOW_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SLAYER_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.SLAYER_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_CROSSBOW =              mcdw_redux$registerCrossbow(WeaponsID.SOUL_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SOUL_HUNTER_CROSSBOW =       mcdw_redux$registerCrossbow(WeaponsID.SOUL_HUNTER_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> SPELLBOUND_CROSSBOW =        mcdw_redux$registerCrossbow(WeaponsID.SPELLBOUND_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> THE_SLICER =                 mcdw_redux$registerCrossbow(WeaponsID.THE_SLICER);
    public static final RegistrySupplier<CrossbowBaseItem> VEILED_CROSSBOW =            mcdw_redux$registerCrossbow(WeaponsID.VEILED_CROSSBOW);
    public static final RegistrySupplier<CrossbowBaseItem> VOID_CALLER_CROSSBOW =       mcdw_redux$registerCrossbow(WeaponsID.VOIDCALLER_CROSSBOW);
    
    // Daggers
    public static final RegistrySupplier<DualBaseItem> BACKSTABBER =                    mcdw_redux$registerDual(WeaponsID.BACKSTABBER);
    public static final RegistrySupplier<DualBaseItem> CHILL_GALE_KNIFE =               mcdw_redux$registerDual(WeaponsID.CHILL_GALE_KNIFE);
    public static final RegistrySupplier<DualBaseItem> DAGGER =                         mcdw_redux$registerDual(WeaponsID.DAGGER);
    public static final RegistrySupplier<DualBaseItem> FANGS_OF_FROST =                 mcdw_redux$registerDual(WeaponsID.FANGS_OF_FROST);
    public static final RegistrySupplier<DualBaseItem> MOON_DAGGER =                    mcdw_redux$registerDual(WeaponsID.MOON_DAGGER);
    public static final RegistrySupplier<DualBaseItem> RESOLUTE_TEMPEST_KNIFE =         mcdw_redux$registerDual(WeaponsID.RESOLUTE_TEMPEST_KNIFE);
    public static final RegistrySupplier<DualBaseItem> SHEAR_DAGGER =                   mcdw_redux$registerDual(WeaponsID.SHEAR_DAGGER);
    public static final RegistrySupplier<DualBaseItem> SWIFT_STRIKER =                  mcdw_redux$registerDual(WeaponsID.SWIFT_STRIKER);
    public static final RegistrySupplier<DualBaseItem> TEMPEST_KNIFE =                  mcdw_redux$registerDual(WeaponsID.TEMPEST_KNIFE);
    public static final RegistrySupplier<DualBaseItem> THE_BEGINNING =                  mcdw_redux$registerDual(WeaponsID.THE_BEGINNING);
    public static final RegistrySupplier<DualBaseItem> THE_END =                        mcdw_redux$registerDual(WeaponsID.THE_END);
    public static final RegistrySupplier<DualBaseItem> VOID_TOUCHED_BLADE =             mcdw_redux$registerDual(WeaponsID.VOID_TOUCHED_BLADE);
    
    // Gauntlets
    public static final RegistrySupplier<DualBaseItem> GAUNTLET =                       mcdw_redux$registerDual(WeaponsID.GAUNTLET);
    public static final RegistrySupplier<DualBaseItem> MAULER =                         mcdw_redux$registerDual(WeaponsID.MAULER);
    public static final RegistrySupplier<DualBaseItem> SOUL_FIST =                      mcdw_redux$registerDual(WeaponsID.SOUL_FIST);
    
    // Glaives
    public static final RegistrySupplier<RangedMeleeBaseItem> CACKLING_BROOM =          mcdw_redux$registerRangedMeleeItem(WeaponsID.CACKLING_BROOM);
    public static final RegistrySupplier<RangedMeleeBaseItem> GLAIVE =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.GLAIVE);
    public static final RegistrySupplier<RangedMeleeBaseItem> GRAVE_BANE =              mcdw_redux$registerRangedMeleeItem(WeaponsID.GRAVE_BANE);
    public static final RegistrySupplier<RangedMeleeBaseItem> VENOM_GLAIVE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.VENOM_GLAIVE);
    
    // Blunts
    public static final RegistrySupplier<BluntBaseItem> BONECLUB =                      mcdw_redux$registerBlunt(WeaponsID.BONECLUB);
    public static final RegistrySupplier<BluntBaseItem> BONE_CUDGEL =                   mcdw_redux$registerBlunt(WeaponsID.BONE_CUDGEL);
    public static final RegistrySupplier<BluntBaseItem> FLAIL =                         mcdw_redux$registerBlunt(WeaponsID.FLAIL);
    public static final RegistrySupplier<BluntBaseItem> GRAVITY_HAMMER =                mcdw_redux$registerBlunt(WeaponsID.GRAVITY_HAMMER);
    public static final RegistrySupplier<BluntBaseItem> GREAT_HAMMER =                  mcdw_redux$registerBlunt(WeaponsID.GREAT_HAMMER);
    public static final RegistrySupplier<BluntBaseItem> MACE =                          mcdw_redux$registerBlunt(WeaponsID.MACE);
    public static final RegistrySupplier<BluntBaseItem> STORMLANDER =                   mcdw_redux$registerBlunt(WeaponsID.STORMLANDER);
    public static final RegistrySupplier<BluntBaseItem> SUNS_GRACE =                    mcdw_redux$registerBlunt(WeaponsID.SUNS_GRACE);

    // Pickaxes
    public static final RegistrySupplier<PickaxeBaseItem> DIAMOND_PICKAXE =             mcdw_redux$registerPickaxe(WeaponsID.DIAMOND_PICKAXE);
    public static final RegistrySupplier<PickaxeBaseItem> HAILING_PINNACLE =            mcdw_redux$registerPickaxe(WeaponsID.HAILING_PINNACLE);
    public static final RegistrySupplier<PickaxeBaseItem> HOWLING_PICK =                mcdw_redux$registerPickaxe(WeaponsID.HOWLING_PICK);
    public static final RegistrySupplier<PickaxeBaseItem> MOUNTAINEER_PICK =            mcdw_redux$registerPickaxe(WeaponsID.MOUNTAINEER_PICK);

    // Scythes
    public static final RegistrySupplier<RangedMeleeBaseItem> FROST_SCYTHE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.FROST_SCYTHE);
    public static final RegistrySupplier<RangedMeleeBaseItem> JAILORS_SCYTHE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.JAILORS_SCYTHE);
    public static final RegistrySupplier<RangedMeleeBaseItem> SKULL_SCYTHE =            mcdw_redux$registerRangedMeleeItem(WeaponsID.SKULL_SCYTHE);
    public static final RegistrySupplier<RangedMeleeBaseItem> SOUL_SCYTHE =             mcdw_redux$registerRangedMeleeItem(WeaponsID.SOUL_SCYTHE);
    
    // Shields
    public static final RegistrySupplier<ShieldBaseItem> ROYAL_GUARD_SHIELD =           mcdw_redux$registerShield(WeaponsID.ROYAL_GUARD_SHIELD);
    public static final RegistrySupplier<ShieldBaseItem> TOWER_GUARD_SHIELD =           mcdw_redux$registerShield(WeaponsID.TOWER_GUARD_SHIELD);
    public static final RegistrySupplier<ShieldBaseItem> VANGUARD_SHIELD =              mcdw_redux$registerShield(WeaponsID.VANGUARD_SHIELD);

    // Sickles
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_GOLD =                mcdw_redux$registerDual(WeaponsID.LAST_LAUGH_GOLD);
    public static final RegistrySupplier<DualBaseItem> LAST_LAUGH_SILVER =              mcdw_redux$registerDual(WeaponsID.LAST_LAUGH_SILVER);
    public static final RegistrySupplier<DualBaseItem> NIGHTMARES_BITE =                mcdw_redux$registerDual(WeaponsID.NIGHTMARES_BITE);
    public static final RegistrySupplier<DualBaseItem> SICKLE =                         mcdw_redux$registerDual(WeaponsID.SICKLE);
    
    // Soul Daggers
    public static final RegistrySupplier<RangedMeleeBaseItem> ETERNAL_KNIFE =           mcdw_redux$registerRangedMeleeItem(WeaponsID.ETERNAL_KNIFE);
    public static final RegistrySupplier<RangedMeleeBaseItem> SOUL_KNIFE =              mcdw_redux$registerRangedMeleeItem(WeaponsID.SOUL_KNIFE);
    public static final RegistrySupplier<RangedMeleeBaseItem> TRUTHSEEKER =             mcdw_redux$registerRangedMeleeItem(WeaponsID.TRUTHSEEKER);

    // Spears
    public static final RegistrySupplier<RangedMeleeBaseItem> SPEAR =                   mcdw_redux$registerRangedMeleeItem(WeaponsID.SPEAR);
    public static final RegistrySupplier<RangedMeleeBaseItem> WHISPERING_SPEAR =        mcdw_redux$registerRangedMeleeItem(WeaponsID.WHISPERING_SPEAR);
    public static final RegistrySupplier<RangedMeleeBaseItem> FORTUNE_SPEAR =           mcdw_redux$registerRangedMeleeItem(WeaponsID.FORTUNE_SPEAR);
    
    // Staves
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF =                   mcdw_redux$registerStaff(WeaponsID.BATTLESTAFF);
    public static final RegistrySupplier<StaffBaseItem> BATTLESTAFF_OF_TERROR =         mcdw_redux$registerStaff(WeaponsID.BATTLESTAFF_OF_TERROR);
    public static final RegistrySupplier<StaffBaseItem> GROWING_STAFF =                 mcdw_redux$registerStaff(WeaponsID.GROWING_STAFF);
    
    // Swords
    public static final RegistrySupplier<RangedMeleeBaseItem> BEESTINGER =              mcdw_redux$registerRangedMeleeItem(WeaponsID.BEESTINGER);
    public static final RegistrySupplier<RangedMeleeBaseItem> BROADSWORD =              mcdw_redux$registerRangedMeleeItem(WeaponsID.BROADSWORD);
    public static final RegistrySupplier<RangedMeleeBaseItem> BROKEN_SAWBLADE =         mcdw_redux$registerRangedMeleeItem(WeaponsID.BROKEN_SAWBLADE);
    public static final RegistrySupplier<RangedMeleeBaseItem> CLAYMORE =                mcdw_redux$registerRangedMeleeItem(WeaponsID.CLAYMORE);
    public static final RegistrySupplier<RangedMeleeBaseItem> CORAL_BLADE =             mcdw_redux$registerRangedMeleeItem(WeaponsID.CORAL_BLADE);
    public static final RegistrySupplier<RangedMeleeBaseItem> CUTLASS =                 mcdw_redux$registerRangedMeleeItem(WeaponsID.CUTLASS);
    public static final RegistrySupplier<RangedMeleeBaseItem> DANCERS_SWORD =           mcdw_redux$registerRangedMeleeItem(WeaponsID.DANCERS_SWORD);
    public static final RegistrySupplier<RangedMeleeBaseItem> DARK_KATANA =             mcdw_redux$registerRangedMeleeItem(WeaponsID.DARK_KATANA);
    public static final RegistrySupplier<RangedMeleeBaseItem> DIAMOND_SWORD =           mcdw_redux$registerRangedMeleeItem(WeaponsID.DIAMOND_SWORD);
    public static final RegistrySupplier<RangedMeleeBaseItem> FREEZING_FOIL =           mcdw_redux$registerRangedMeleeItem(WeaponsID.FREEZING_FOIL);
    public static final RegistrySupplier<RangedMeleeBaseItem> FROST_SLAYER =            mcdw_redux$registerRangedMeleeItem(WeaponsID.FROST_SLAYER);
    public static final RegistrySupplier<RangedMeleeBaseItem> GREAT_AXEBLADE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.GREAT_AXEBLADE);
    public static final RegistrySupplier<RangedMeleeBaseItem> HAWKBRAND =               mcdw_redux$registerRangedMeleeItem(WeaponsID.HAWKBRAND);
    public static final RegistrySupplier<RangedMeleeBaseItem> HEARTSTEALER =            mcdw_redux$registerRangedMeleeItem(WeaponsID.HEARTSTEALER);
    public static final RegistrySupplier<RangedMeleeBaseItem> IRON_SWORD =              mcdw_redux$registerRangedMeleeItem(WeaponsID.IRON_SWORD);
    public static final RegistrySupplier<RangedMeleeBaseItem> KATANA =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.KATANA);
    public static final RegistrySupplier<RangedMeleeBaseItem> MASTERS_KATANA =          mcdw_redux$registerRangedMeleeItem(WeaponsID.MASTERS_KATANA);
    public static final RegistrySupplier<RangedMeleeBaseItem> NAMELESS_BLADE =          mcdw_redux$registerRangedMeleeItem(WeaponsID.NAMELESS_BLADE);
    public static final RegistrySupplier<RangedMeleeBaseItem> OBSIDIAN_CLAYMORE =       mcdw_redux$registerRangedMeleeItem(WeaponsID.OBSIDIAN_CLAYMORE);
    public static final RegistrySupplier<RangedMeleeBaseItem> RAPIER =                  mcdw_redux$registerRangedMeleeItem(WeaponsID.RAPIER);
    public static final RegistrySupplier<RangedMeleeBaseItem> SINISTER_SWORD =          mcdw_redux$registerRangedMeleeItem(WeaponsID.SINISTER_SWORD);
    public static final RegistrySupplier<RangedMeleeBaseItem> SPONGE_STRIKER =          mcdw_redux$registerRangedMeleeItem(WeaponsID.SPONGE_STRIKER);
    public static final RegistrySupplier<RangedMeleeBaseItem> THE_STARLESS_NIGHT =      mcdw_redux$registerRangedMeleeItem(WeaponsID.THE_STARLESS_NIGHT);
    
    // Whips
    public static final RegistrySupplier<RangedMeleeBaseItem> VINE_WHIP =               mcdw_redux$registerRangedMeleeItem(WeaponsID.VINE_WHIP);
    public static final RegistrySupplier<RangedMeleeBaseItem> WHIP =                    mcdw_redux$registerRangedMeleeItem(WeaponsID.WHIP);

    // Bee Stinger
    @SuppressWarnings("UnstableApiUsage")
    public static final RegistrySupplier<BeeStingerItem> BEE_STINGER = ITEM_DEFERRED_REGISTER.register("bee_stinger", () ->
            new BeeStingerItem(new Item.Settings()
                    .maxCount(64)
                    .arch$tab(ItemGroups.NATURAL)
            ));

    private static RegistrySupplier<AxeBaseItem> mcdw_redux$registerAxe(WeaponsID wepEnum) {
        TrueMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.AXE_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new AxeBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<BluntBaseItem> mcdw_redux$registerBlunt(WeaponsID wepEnum) {
        TrueMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.BLUNT_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new BluntBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<BowBaseItem> mcdw_redux$registerBow(WeaponsID wepEnum) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () -> BowBaseItem.makeBow(wepEnum));
    }

    private static RegistrySupplier<CrossbowBaseItem> mcdw_redux$registerCrossbow(WeaponsID wepEnum) {
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () -> CrossbowBaseItem.makeCrossbow(wepEnum));
    }

    private static RegistrySupplier<DualBaseItem> mcdw_redux$registerDual(WeaponsID wepEnum) {
        TrueMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.DUAL_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new DualBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<PickaxeBaseItem> mcdw_redux$registerPickaxe(WeaponsID wepEnum) {
        TrueMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.PICKAXE_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new PickaxeBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<ShieldBaseItem> mcdw_redux$registerShield(WeaponsID wepEnum) {
        ShieldStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.SHIELD_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new ShieldBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<StaffBaseItem> mcdw_redux$registerStaff(WeaponsID wepEnum) {
        RangedMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.STAFF_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new StaffBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getAttackRange(), stats.mcdw_redux$getRepairIngredients()));
    }

    private static RegistrySupplier<RangedMeleeBaseItem> mcdw_redux$registerRangedMeleeItem(WeaponsID wepEnum) {
        RangedMeleeStats stats = McdwRedux.CONFIG.mcdwReduxStatsConfig.RANGED_MELEE_BASE_STATS.get(wepEnum);
        return ITEM_DEFERRED_REGISTER.register(wepEnum.getId(), () ->
                new RangedMeleeBaseItem(wepEnum, stats.mcdw_redux$getToolMaterial(), stats.mcdw_redux$getAttackDamage(), stats.mcdw_redux$getAttackSpeed(), stats.mcdw_redux$getAttackRange(), stats.mcdw_redux$getRepairIngredients()));
    }
}
