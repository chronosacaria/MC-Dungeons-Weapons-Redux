package dev.timefall.mcdw_redux.configs;

import me.shedaniel.autoconfig.ConfigData;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.cloth.clothconfig.shadowed.blue.endless.jankson.Comment;

@Config(name = "mcdw_redux_stats_config")
public class McdwReduxStatsConfig implements ConfigData {
    @Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    public final double extraAttackReachOfPolearms = 1.0D;
    @Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    public final double extraAttackReachOfSpears = 1.0D;
    @Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    public final double extraAttackReachOfStaves = 1.0D;
    @Comment("This value is ignored if Better Combat is installed! Default: 1.0")
    public final double extraAttackReachOfWhips = 1.0D;
}
