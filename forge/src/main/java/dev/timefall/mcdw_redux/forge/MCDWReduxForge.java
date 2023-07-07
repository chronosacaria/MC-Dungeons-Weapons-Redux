package dev.timefall.mcdw_redux.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.timefall.mcdw_redux.MCDWRedux;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(MCDWRedux.MOD_ID)
public class MCDWReduxForge {
    public MCDWReduxForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(MCDWRedux.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            MCDWRedux.init();
    }
}