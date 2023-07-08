package dev.timefall.mcdw_redux.configs;

import dev.timefall.mcdw_redux.McdwRedux;
import me.shedaniel.autoconfig.AutoConfig;
import me.shedaniel.autoconfig.annotation.Config;
import me.shedaniel.autoconfig.annotation.ConfigEntry;
import me.shedaniel.autoconfig.serializer.JanksonConfigSerializer;
import me.shedaniel.autoconfig.serializer.PartitioningSerializer;

@Config(name = McdwRedux.MOD_ID)
public class McdwReduxConfig extends PartitioningSerializer.GlobalData {
    @ConfigEntry.Category("mcdw_redux_intems_registry")
    public McdwReduxEnableItemsConfig mcdwReduxEnableItemsConfig = new McdwReduxEnableItemsConfig();
    @ConfigEntry.Category("mcdw_redux_enchantment_settings_config")
    public McdwReduxEnchantmentSettingsConfig mcdwReduxEnchantmentSettingsConfig = new McdwReduxEnchantmentSettingsConfig();
    @ConfigEntry.Category("mcdw_redux_enchantments_config")
    public McdwReduxEnchantmentsConfig mcdwReduxEnchantmentsConfig = new McdwReduxEnchantmentsConfig();
    @ConfigEntry.Category("mcdw_redux_stats_config")
    public McdwReduxStatsConfig mcdwReduxStatsConfig = new McdwReduxStatsConfig();
    @ConfigEntry.Category("mcdw_redux_loot_config")
    public McdwReduxLootConfig mcdwReduxlootConfig = new McdwReduxLootConfig();

    public static void register() {
        AutoConfig.register(McdwReduxConfig.class,
                PartitioningSerializer.wrap(JanksonConfigSerializer::new)
        );
    }
}
