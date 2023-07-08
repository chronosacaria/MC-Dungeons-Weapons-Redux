package dev.timefall.mcdw_redux.forge;

import dev.architectury.platform.forge.EventBuses;
import dev.timefall.mcdw_redux.McdwRedux;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.javafmlmod.FMLJavaModLoadingContext;

@Mod(McdwRedux.MOD_ID)
public class McdwReduxForge {
    public McdwReduxForge() {
		// Submit our event bus to let architectury register our content on the right time
        EventBuses.registerModEventBus(McdwRedux.MOD_ID, FMLJavaModLoadingContext.get().getModEventBus());
            McdwRedux.init();
    }
}