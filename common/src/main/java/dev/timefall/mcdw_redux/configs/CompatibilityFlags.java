package dev.timefall.mcdw_redux.configs;

import dev.architectury.platform.Platform;

public class CompatibilityFlags {
    public static boolean noOffhandConflicts = true;
    public static boolean isReachExtensionEnabled = true;

    public static void init() {
        if(Platform.isModLoaded("dualwielding") || Platform.isModLoaded("bettercombat")) {
            noOffhandConflicts = false;
        }
        if(Platform.isModLoaded("bettercombat")) {
            isReachExtensionEnabled = false;
        }
    }
}
