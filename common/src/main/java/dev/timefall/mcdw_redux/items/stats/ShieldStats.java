package dev.timefall.mcdw_redux.items.stats;

import net.minecraft.item.ToolMaterials;

public class ShieldStats {
    String toolMaterial;
    String[] repairIngredients;

    public ShieldStats mcdw_redux$shieldStats(String toolMaterial, String... repairIngredients) {
        this.toolMaterial = toolMaterial;
        this.repairIngredients = repairIngredients;
        return this;
    }

    public ToolMaterials mcdw_redux$getToolMaterial() {
        try {
            return ToolMaterials.valueOf(this.toolMaterial);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ToolMaterials.GOLD;
    }

    public String[] mcdw_redux$getRepairIngredients() {
        return repairIngredients;
    }

}
