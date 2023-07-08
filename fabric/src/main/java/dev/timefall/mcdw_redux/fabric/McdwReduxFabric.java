package dev.timefall.mcdw_redux.fabric;

import dev.timefall.mcdw_redux.McdwRedux;
import net.fabricmc.api.ModInitializer;

public class McdwReduxFabric implements ModInitializer {
    @Override
    public void onInitialize() {
        McdwRedux.init();
    }
}