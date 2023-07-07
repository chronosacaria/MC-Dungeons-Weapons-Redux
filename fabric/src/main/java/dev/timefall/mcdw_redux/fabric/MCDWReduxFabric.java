package dev.timefall.mcdw_redux.fabric;

import dev.timefall.mcdw_redux.MCDWRedux;
import net.fabricmc.api.ModInitializer;

public class MCDWReduxFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        MCDWRedux.init();
    }
}