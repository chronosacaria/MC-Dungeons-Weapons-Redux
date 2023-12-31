package dev.timefall.mcdw_redux;

import dev.timefall.mcdw_redux.configs.McdwReduxConfig;
import dev.timefall.mcdw_redux.registries.EntityAttributesRegistry;
import dev.timefall.mcdw_redux.registries.ItemGroupsRegistry;
import dev.timefall.mcdw_redux.registries.ItemsRegistry;
import me.shedaniel.autoconfig.AutoConfig;
import net.minecraft.util.Identifier;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

public class McdwRedux {
	public static final String MOD_ID = "mcdw_redux";
	@SuppressWarnings("unused")
	public static final Logger LOGGER = LogManager.getLogger();
	public static Identifier ID(String path) {
		return new Identifier(MOD_ID, path);
	}
	public static McdwReduxConfig CONFIG;

	public static void init() {
		EntityAttributesRegistry.ENTITY_ATTRIBUTE_DEFERRED_REGISTER.register();
		McdwReduxConfig.register();
		CONFIG = AutoConfig.getConfigHolder(McdwReduxConfig.class).getConfig();
		ItemGroupsRegistry.CREATIVE_TABS.register();
		ItemsRegistry.ITEM_DEFERRED_REGISTER.register();
	}
}