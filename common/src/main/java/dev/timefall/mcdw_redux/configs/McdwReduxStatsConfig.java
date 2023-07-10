package dev.timefall.mcdw_redux.configs;

import dev.timefall.mcdw_redux.enums.WeaponsID;
import dev.timefall.mcdw_redux.items.stats.MeleeStats;
import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import net.minecraft.item.ToolMaterials;

import java.util.LinkedHashMap;

@Config(name = "mcdw_redux_stats_config")
public class McdwReduxStatsConfig implements ConfigData {
    //@Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    //public final double extraAttackReachOfPolearms = 1.0D;
    //@Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    //public final double extraAttackReachOfSpears = 1.0D;
    //@Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    //public final double extraAttackReachOfStaves = 1.0D;
    //@Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    //public final double extraAttackReachOfWhips = 1.5D;

    public final LinkedHashMap<WeaponsID, MeleeStats> AXE_BASE_STATS = new LinkedHashMap<>();

    public McdwReduxStatsConfig() {
        AXE_BASE_STATS.put(WeaponsID.ANCHOR, new MeleeStats().meleeStats(ToolMaterials.IRON.name(), 8, -3.4f, "minecraft:iron_ingot"));
        AXE_BASE_STATS.put(WeaponsID.AXE, new MeleeStats().meleeStats(ToolMaterials.IRON.name(), 6, -3.1f, "minecraft:iron_ingot"));
    }

}
