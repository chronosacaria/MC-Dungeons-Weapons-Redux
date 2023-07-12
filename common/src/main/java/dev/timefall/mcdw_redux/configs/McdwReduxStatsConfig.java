package dev.timefall.mcdw_redux.configs;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.items.stats.RangedMeleeStats;
import dev.timefall.mcdw_redux.items.stats.RangedStats;
import dev.timefall.mcdw_redux.items.stats.ShieldStats;
import dev.timefall.mcdw_redux.items.stats.TrueMeleeStats;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;
import net.minecraft.item.ToolMaterials;

import java.util.LinkedHashMap;

@Config(name = "mcdw_redux_stats_config")
public class McdwReduxStatsConfig implements ConfigData {

    @Comment("""
            
            Notes on Stats Configuration
            
            toolMaterial: This is the foundation of the stats for the tool. This controls durability and the base of the
            attackDamage stat. The bases for toolMaterial are as follows:
                     ____________________________________________________________________________
                    | Tool Material | Durability | Mining Speed | Attack Damage | Enchantability |
                    |---------------|------------|--------------|---------------|----------------|
                    |    WOOD       |       59   |       2      |       0       |       15       |
                    |---------------|------------|--------------|---------------|----------------|
                    |    STONE      |      131   |       4      |       1       |        5       |
                    |---------------|------------|--------------|---------------|----------------|
                    |    IRON       |      250   |       6      |       2       |       14       |
                    |---------------|------------|--------------|---------------|----------------|
                    |    DIAMOND    |     1561   |       8      |       3       |       10       |
                    |---------------|------------|--------------|---------------|----------------|
                    |    GOLD       |       32   |       8      |       3       |       10       |
                    |---------------|------------|--------------|---------------|----------------|
                    |    NETHERITE  |     2031   |       9      |       4       |       15       |
                    |_______________|____________|______________|_______________|________________|
            
            attackDamage: Remember, when adjusting damage values in the config, you must consider the +1 added by your
            innate attack attribute from your fist. Therefore, if you want an IRON weapon to do 8 damage, you need to
            consider that IRON adds 2, your fist adds 1, so 8 - 3 = 5. So, you need to set the attackDamage in the
            config to be 5. This value is an Integer and cannot include a decimal point but can be negative.
            
            attackSpeed: This value is subtracted from 4 in order to arrive at the value for attack speed. Therefore,
            this value should ALWAYS be negative. As an example: if you want an attackSpeed of 1.8, you need to set the
            attackSpeed value to -2.2 because -2.2 + 4 = 1.8. (Blame Mojang...). This value is a Float and can include
            a decimal point but can be negative.
            
            attackRange: This value is ADDED to your default range. Therefore, as the default range of a non-Creative
            player is 3. If you don't want any additional attackRange, you would set the value to 0. If you want a melee
            weapon to have a range of 4, you would set attackRange to 1. If you want the attackRange of a weapon to be
            2, you would set attackRange to -1. This value is an Integer and cannot include a decimal point but can be
            negative.
            
            projectileDamage: This value indicates the average damage done before crit damage is applied (before the bow
            is completely drawn or before a crossbow crits). This value is a Double and can include a decimal point but
            can be negative.
            
            drawSpeed: This is the speed at which the bow or crossbow can be drawn upon using it. The higher the number,
            the slower the bow or crossbow is drawn. Therefore, a drawSpeed of 30 is slower than a drawSpeed of 8. This
            value is an Integer and cannot include a decimal point. Whilst negative numbers are technically possible,
            doing so will likely break the weapon.
            
            range: This value indicates how far a bow or crossbow can fire its projectile. The higher the number, the
            farther the projectile can go. This value is a Float and can include decimal points. Whilst negative numbers
            are technically possible, doing so will likely break the weapon.
            
            repairIngredients: These are the items that can be used to repair an item. This is a list of items that must
            include the namespace of the mod that the item is from. Therefore, if you want to repair something using a
            vanilla Minecraft item, it must be referenced as "minecraft:name_of_item". If you want to use an item from a
            a mod, such as BetterEnd, you must reference the item as "betterend:name_of_item". This list can also take
            a tag value as indicated with a pound or hashtag (#) before the namespace. This means that if you want
            something to use planks of wood to be repaired, you would put "#minecraft:planks". Finally, you can also
            add multiple items to the repairIngredients. An example of this would be as follows:
                ...,
                "repairIngredients": [
                    "minecraft:diamond",
                    "create:andesite_alloy",
                    "#minecraft:planks"
                ]...
            In doing something like the example above, the item would be able to be repaired using Diamonds from vanilla
            Minecraft, Andesite Alloy from Create and any item which uses the planks tag, whether that is from Minecraft
            or another mod.
            """
    )
    public final LinkedHashMap<WeaponsID, TrueMeleeStats> AXE_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, TrueMeleeStats> BLUNT_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, TrueMeleeStats> DUAL_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, TrueMeleeStats> PICKAXE_BASE_STATS = new LinkedHashMap<>();

    public final LinkedHashMap<WeaponsID, RangedMeleeStats> STAFF_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, RangedMeleeStats> RANGED_MELEE_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, RangedStats> BOW_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, RangedStats> CROSSBOW_BASE_STATS = new LinkedHashMap<>();
    public final LinkedHashMap<WeaponsID, ShieldStats> SHIELD_BASE_STATS = new LinkedHashMap<>();

    public McdwReduxStatsConfig() {
        // AXES
        putTrueMelee(AXE_BASE_STATS, WeaponsID.ANCHOR,                            ToolMaterials.IRON, 7, -3.4f, "minecraft:iron_ingot");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.AXE,                               ToolMaterials.IRON, 5, -3.1f, "minecraft:iron_ingot");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.ENCRUSTED_ANCHOR,                  ToolMaterials.DIAMOND, 7, -3.1f, "minecraft:diamond");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.FIREBRAND,                         ToolMaterials.DIAMOND, 3, -3.1f, "minecraft:diamond");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.HIGHLAND_AXE,                      ToolMaterials.IRON, 3, -3.1f, "minecraft:iron_ingot");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.MECHANIZED_SAWBLADE,               ToolMaterials.DIAMOND, 2, -3.1f, "minecraft:blaze_rod");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.CURSED_AXE,                        ToolMaterials.IRON, 7, -2.9f, "minecraft:iron_ingot");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.DOUBLE_AXE,                        ToolMaterials.IRON, 6, -2.9f, "minecraft:iron_ingot");
        putTrueMelee(AXE_BASE_STATS, WeaponsID.WHIRLWIND,                         ToolMaterials.IRON, 6, -2.9f, "minecraft:iron_ingot");

        // BLUNTS
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.BONECLUB,                        ToolMaterials.IRON,6, -3.2f, "minecraft:bone_block");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.BONE_CUDGEL,                     ToolMaterials.NETHERITE,6, -3.2f, "minecraft:netherite_scrap");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.FLAIL,                           ToolMaterials.IRON,4, -2.8f, "minecraft:iron_ingot");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.GRAVITY_HAMMER,                  ToolMaterials.DIAMOND,5, -3.2f, "minecraft:diamond");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.GREAT_HAMMER,                    ToolMaterials.IRON,5, -3.2f, "minecraft:iron_ingot");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.MACE,                            ToolMaterials.IRON,4, -2.8f, "minecraft:iron_ingot");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.STORMLANDER,                     ToolMaterials.DIAMOND,6, -3.2f, "minecraft:diamond");
        putTrueMelee(BLUNT_BASE_STATS, WeaponsID.SUNS_GRACE,                      ToolMaterials.DIAMOND,3, -2.8f, "minecraft:diamond");

        // DUALS
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.BACKSTABBER,                      ToolMaterials.DIAMOND,0, -1.7f, "minecraft:diamond");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.CHILL_GALE_KNIFE,                 ToolMaterials.DIAMOND,1, -2.2f, "minecraft:diamond");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.DAGGER,                           ToolMaterials.IRON,0, -1.5f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.FANGS_OF_FROST,                   ToolMaterials.IRON,0, -1.5f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.MOON_DAGGER,                      ToolMaterials.IRON,0, -1.5f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.RESOLUTE_TEMPEST_KNIFE,           ToolMaterials.IRON,1, -2.2f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.SHEAR_DAGGER,                     ToolMaterials.IRON,-1, -1.5f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.SWIFT_STRIKER,                    ToolMaterials.NETHERITE,0, -1.7f, "minecraft:netherite_scrap");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.TEMPEST_KNIFE,                    ToolMaterials.IRON,1, -2.2f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.THE_BEGINNING,                    ToolMaterials.NETHERITE,0, -1.8f, "minecraft:netherite_scrap");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.THE_END,                          ToolMaterials.NETHERITE,0, -1.8f, "minecraft:netherite_scrap");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.VOID_TOUCHED_BLADE,               ToolMaterials.DIAMOND,0, -1.8f, "minecraft:diamond");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.GAUNTLET,                         ToolMaterials.IRON, -1, -1.5f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.MAULER,                           ToolMaterials.DIAMOND, 0, -1.5f, "minecraft:diamond");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.SOUL_FIST,                        ToolMaterials.NETHERITE, -1, -1.5f, "minecraft:netherite_scrap");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.LAST_LAUGH_GOLD,                  ToolMaterials.IRON, 1, -2.1f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.LAST_LAUGH_SILVER,                ToolMaterials.IRON, 1, -2.1f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.NIGHTMARES_BITE,                  ToolMaterials.IRON, 1, -2.1f, "minecraft:iron_ingot");
        putTrueMelee(DUAL_BASE_STATS, WeaponsID.SICKLE,                           ToolMaterials.IRON, 0, -2.1f, "minecraft:iron_ingot");

        // PICKAXES
        putTrueMelee(PICKAXE_BASE_STATS, WeaponsID.DIAMOND_PICKAXE,               ToolMaterials.DIAMOND,0, -2.8f, "minecraft:diamond");
        putTrueMelee(PICKAXE_BASE_STATS, WeaponsID.HAILING_PINNACLE,              ToolMaterials.DIAMOND,0, -2.8f, "minecraft:diamond");
        putTrueMelee(PICKAXE_BASE_STATS, WeaponsID.HOWLING_PICK,                  ToolMaterials.IRON,0, -2.8f, "minecraft:iron_ingot");
        putTrueMelee(PICKAXE_BASE_STATS, WeaponsID.MOUNTAINEER_PICK,              ToolMaterials.IRON,0, -2.8f, "minecraft:iron_ingot");

        // STAVES
        putRangedMelee(STAFF_BASE_STATS, WeaponsID.BATTLESTAFF,                   ToolMaterials.WOOD, 2, -2.6f, 1, "minecraft:planks");
        putRangedMelee(STAFF_BASE_STATS, WeaponsID.BATTLESTAFF_OF_TERROR,         ToolMaterials.IRON, 5, -2.6f, 1, "minecraft:iron_ingot");
        putRangedMelee(STAFF_BASE_STATS, WeaponsID.GROWING_STAFF,                 ToolMaterials.IRON, 5, -2.6f, 1, "minecraft:iron_ingot");

        // RANGED MELEES
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.CACKLING_BROOM,         ToolMaterials.IRON,5, -3f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.GLAIVE,                 ToolMaterials.IRON,5, -3f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.GRAVE_BANE,             ToolMaterials.IRON,6, -3f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.VENOM_GLAIVE,           ToolMaterials.IRON,6, -3f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SPEAR,                  ToolMaterials.IRON,4, -2.5f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.WHISPERING_SPEAR,       ToolMaterials.IRON,5, -2.5f, 1, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.FORTUNE_SPEAR,          ToolMaterials.IRON,5, -2.5f, 1,"minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.FROST_SCYTHE,           ToolMaterials.DIAMOND,4, -2.9f, 0.5, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.JAILORS_SCYTHE,         ToolMaterials.IRON,4, -2.9f, 0.5, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SKULL_SCYTHE,           ToolMaterials.DIAMOND,4, -2.9f, 0.5, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SOUL_SCYTHE,            ToolMaterials.DIAMOND,3, -2.9f, 0.5, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.ETERNAL_KNIFE,          ToolMaterials.NETHERITE,4, -2.8f, 0, "minecraft:netherite_scrap");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SOUL_KNIFE,             ToolMaterials.IRON,4, -2.8f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.TRUTHSEEKER,            ToolMaterials.NETHERITE,3, -2.8f, 0, "minecraft:netherite_scrap");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.BEESTINGER,             ToolMaterials.IRON, 0, -1.1f, 0,"minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.BROADSWORD,             ToolMaterials.IRON, 5, -3.0f, 0.5,"minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.BROKEN_SAWBLADE,        ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.CLAYMORE,               ToolMaterials.IRON, 7, -3.2f, 0.5, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.CORAL_BLADE,            ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.CUTLASS,                ToolMaterials.IRON,2, -2.3f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.DANCERS_SWORD,          ToolMaterials.IRON,3, -2.0f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.DARK_KATANA,            ToolMaterials.NETHERITE,4, -2.9f, 0, "minecraft:netherite_scrap");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.DIAMOND_SWORD,          ToolMaterials.DIAMOND,3, -2.4f, 0, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.FREEZING_FOIL,          ToolMaterials.IRON,1, -1.1f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.FROST_SLAYER,           ToolMaterials.DIAMOND, 6, -3.2f, 0.5, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.GREAT_AXEBLADE,         ToolMaterials.IRON, 7, -3.2f, 0.5, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.HAWKBRAND,              ToolMaterials.IRON,6, -2.9f, 0.5, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.HEARTSTEALER,           ToolMaterials.DIAMOND, 6, -3.2f, 0.5, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.IRON_SWORD,             ToolMaterials.IRON,3, -2.4f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.KATANA,                 ToolMaterials.IRON,4, -2.9f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.MASTERS_KATANA,         ToolMaterials.DIAMOND,4, -2.9f, 0, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.NAMELESS_BLADE,         ToolMaterials.IRON,4, -2.3f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.OBSIDIAN_CLAYMORE,      ToolMaterials.NETHERITE, 6, -3.3f, 0.5, "minecraft:netherite_scrap");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.RAPIER,                 ToolMaterials.IRON,0, -1.14f, 0, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SINISTER_SWORD,         ToolMaterials.IRON,6, -2.9f, 0.5, "minecraft:iron_ingot");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.SPONGE_STRIKER,         ToolMaterials.DIAMOND, 3, -2.4f, 0, "minecraft:diamond");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.THE_STARLESS_NIGHT,     ToolMaterials.NETHERITE, 6, -3.3f, 0.5, "minecraft:netherite_scrap");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.VINE_WHIP,              ToolMaterials.IRON, 5, -3.1f, 1.5, "minecraft:vine");
        putRangedMelee(RANGED_MELEE_BASE_STATS, WeaponsID.WHIP,                   ToolMaterials.IRON, 3, -3.1f, 1.5, "minecraft:string");

        // BOWS
        putRanged(BOW_BASE_STATS, WeaponsID.ANCIENT_BOW,                          ToolMaterials.NETHERITE, 7, 14, 18f, "minecraft:netherite_scrap");
        putRanged(BOW_BASE_STATS, WeaponsID.BONEBOW,                              ToolMaterials.STONE, 5, 16, 12f, "minecraft:bone");
        putRanged(BOW_BASE_STATS, WeaponsID.BUBBLE_BOW,                           ToolMaterials.IRON, 5, 15, 12f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.BUBBLE_BURSTER,                       ToolMaterials.DIAMOND, 5, 15, 13f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.BURST_GALE_BOW,                       ToolMaterials.DIAMOND, 6, 12, 16f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.CALL_OF_THE_VOID,                     ToolMaterials.NETHERITE, 6, 15, 16f, "minecraft:netherite_scrap");
        putRanged(BOW_BASE_STATS, WeaponsID.ECHO_OF_THE_VALLEY,                   ToolMaterials.DIAMOND, 6, 11, 16f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.ELITE_POWER_BOW,                      ToolMaterials.IRON, 6, 20, 15f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.GREEN_MENACE,                         ToolMaterials.DIAMOND, 5, 17, 13f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.HAUNTED_BOW,                          ToolMaterials.NETHERITE, 6, 18, 16f, "minecraft:netherite_scrap");
        putRanged(BOW_BASE_STATS, WeaponsID.HUNTERS_PROMISE,                      ToolMaterials.IRON, 6, 15, 16f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.HUNTING_BOW,                          ToolMaterials.IRON, 6, 16, 15f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.BOW_OF_LOST_SOULS,                    ToolMaterials.NETHERITE, 6, 12, 17f, "minecraft:netherite_scrap");
        putRanged(BOW_BASE_STATS, WeaponsID.MASTERS_BOW,                          ToolMaterials.IRON, 6, 17, 16f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.NOCTURNAL_BOW,                        ToolMaterials.DIAMOND, 6, 17, 14f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.PHANTOM_BOW,                          ToolMaterials.DIAMOND, 6, 20, 14f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.PINK_SCOUNDREL,                       ToolMaterials.DIAMOND, 5, 17, 13f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.POWER_BOW,                            ToolMaterials.IRON, 6, 20, 14f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.SABREWING,                            ToolMaterials.DIAMOND, 5, 10, 13f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.SHIVERING_BOW,                        ToolMaterials.DIAMOND, 6, 14, 15f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.SNOW_BOW,                             ToolMaterials.IRON, 5, 16, 13f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.SOUL_BOW,                             ToolMaterials.IRON, 6, 14, 15f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.TRICK_BOW,                            ToolMaterials.DIAMOND, 5, 12, 12f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.TWIN_BOW,                             ToolMaterials.DIAMOND, 5, 12, 12f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.TWISTING_VINE_BOW,                    ToolMaterials.IRON, 5, 15, 13f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.VOID_BOW,                             ToolMaterials.DIAMOND, 6, 15, 16f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.WEB_BOW,                              ToolMaterials.DIAMOND, 5, 15, 12f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.WEEPING_VINE_BOW,                     ToolMaterials.IRON, 5, 15, 13f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.WIND_BOW,                             ToolMaterials.DIAMOND, 6, 11, 15f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.WINTERS_TOUCH,                        ToolMaterials.DIAMOND, 6, 15, 14f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.GUARDIAN_BOW,                         ToolMaterials.DIAMOND, 8, 30, 19f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.LONGBOW,                              ToolMaterials.IRON, 7, 25, 17f, "#minecraft:planks");
        putRanged(BOW_BASE_STATS, WeaponsID.RED_SNAKE,                            ToolMaterials.DIAMOND, 7, 30, 18f, "minecraft:diamond");
        putRanged(BOW_BASE_STATS, WeaponsID.LOVE_SPELL_BOW,                       ToolMaterials.IRON, 3, 9, 8f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.MECHANICAL_SHORTBOW,                  ToolMaterials.IRON, 4, 9, 9f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.PURPLE_STORM,                         ToolMaterials.IRON, 3, 9, 8f, "minecraft:iron_ingot");
        putRanged(BOW_BASE_STATS, WeaponsID.SHORTBOW,                             ToolMaterials.IRON, 3, 9, 8f, "#minecraft:planks");

        //CROSSBOWS
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.AUTO_CROSSBOW,                   ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.AZURE_SEEKER,                    ToolMaterials.IRON,      10, 28, 8.4f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.BABY_CROSSBOW,                   ToolMaterials.IRON,      8,  23, 7.2f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.BURST_CROSSBOW,                  ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.BUTTERFLY_CROSSBOW,              ToolMaterials.IRON,      10, 28, 8.9f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.COG_CROSSBOW,                    ToolMaterials.IRON,      10, 28, 8.4f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.CORRUPTED_CROSSBOW,              ToolMaterials.NETHERITE, 16, 22, 14.0f, "minecraft:netherite_scrap");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.DOOM_CROSSBOW,                   ToolMaterials.NETHERITE, 9,  26, 8.0f,  "minecraft:netherite_scrap");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.DUAL_CROSSBOW,                   ToolMaterials.IRON,      8,  24, 7.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.EXPLODING_CROSSBOW,              ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.FERAL_SOUL_CROSSBOW,             ToolMaterials.IRON,      10, 28, 9.2f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.FIREBOLT_THROWER,                ToolMaterials.IRON,      9,  28, 7.9f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.HARPOON_CROSSBOW,                ToolMaterials.IRON,      12, 28, 11.0f, "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.HARP_CROSSBOW,                   ToolMaterials.IRON,      10, 28, 8.6f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.HEAVY_CROSSBOW,                  ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.IMPLODING_CROSSBOW,              ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.LIGHTNING_HARP_CROSSBOW,         ToolMaterials.DIAMOND,   16, 28, 14.2f, "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.NAUTICAL_CROSSBOW,               ToolMaterials.DIAMOND,   16, 24, 14.0f, "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.PRIDE_OF_THE_PIGLINS,            ToolMaterials.NETHERITE, 15, 20, 13.0f, "minecraft:netherite_scrap");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.RAPID_CROSSBOW,                  ToolMaterials.IRON,      9,  20, 8.2f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SCATTER_CROSSBOW,                ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SHADOW_CROSSBOW,                 ToolMaterials.DIAMOND,   14, 25, 12.0f, "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SLAYER_CROSSBOW,                 ToolMaterials.DIAMOND,   10, 26, 8.8f,  "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SOUL_CROSSBOW,                   ToolMaterials.IRON,      9,  28, 8.0f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SOUL_HUNTER_CROSSBOW,            ToolMaterials.DIAMOND,   12, 28, 11.0f, "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.SPELLBOUND_CROSSBOW,             ToolMaterials.IRON,      10, 28, 8.9f,  "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.THE_SLICER,                      ToolMaterials.IRON,      12, 28, 10.2f, "minecraft:iron_ingot");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.VEILED_CROSSBOW,                 ToolMaterials.DIAMOND,   16, 22, 14.5f, "minecraft:diamond");
        putRanged(CROSSBOW_BASE_STATS, WeaponsID.VOIDCALLER_CROSSBOW,             ToolMaterials.DIAMOND,   14, 26, 12.5f, "minecraft:diamond");

        // SHIELDS
        putShield(SHIELD_BASE_STATS, WeaponsID.ROYAL_GUARD_SHIELD,                ToolMaterials.DIAMOND, "minecraft:gold_ingot");
        putShield(SHIELD_BASE_STATS, WeaponsID.TOWER_GUARD_SHIELD,                ToolMaterials.DIAMOND, "minecraft:copper_ingot");
        putShield(SHIELD_BASE_STATS, WeaponsID.VANGUARD_SHIELD,                   ToolMaterials.DIAMOND, "minecraft:iron_ingot");
    }

    private static void putTrueMelee(LinkedHashMap<WeaponsID, TrueMeleeStats> map, WeaponsID weaponsID, ToolMaterials material, int attackDamage, float attackSpeed, String... repairIngredients) {
        map.put(weaponsID, new TrueMeleeStats().mcdw_redux$trueMeleeStats(material.name(), attackDamage, attackSpeed, repairIngredients));
    }

    private static void putRangedMelee(LinkedHashMap<WeaponsID, RangedMeleeStats> map, WeaponsID weaponsID, ToolMaterials material, int attackDamage, float attackSpeed, double attackRange, String... repairIngredients) {
        map.put(weaponsID, new RangedMeleeStats().mcdw_redux$rangedMeleeStats(material.name(), attackDamage, attackSpeed, attackRange, repairIngredients));
    }

    private static void putRanged(LinkedHashMap<WeaponsID, RangedStats> map, WeaponsID weaponsID, ToolMaterials material, int projectileDamage, int drawSpeed, float range, String... repairIngredients) {
        map.put(weaponsID, new RangedStats().mcdw_redux$rangedStats(material.name(), projectileDamage, drawSpeed, range, repairIngredients));
    }

    private static void putShield(LinkedHashMap<WeaponsID, ShieldStats> map, WeaponsID weaponsID, ToolMaterials material, String... repairIngredients) {
        map.put(weaponsID, new ShieldStats().mcdw_redux$shieldStats(material.name(), repairIngredients));
    }
}
