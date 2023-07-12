package dev.timefall.mcdw_redux.items.stats;

import net.minecraft.item.ToolMaterials;

public class RangedStats {

    String toolMaterial;
    int projectileDamage;
    int drawSpeed;
    float range;
    String[] repairIngredients;


    public RangedStats mcdw_redux$rangedStats(String toolMaterial, int projectileDamage,
                        int drawSpeed, float range, String... repairIngredients) {
        this.toolMaterial = toolMaterial;
        this.projectileDamage = projectileDamage;
        this.drawSpeed = drawSpeed;
        this.range = range;
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

    public int getProjectileDamage() {
        return projectileDamage;
    }

    public int getDrawSpeed() {
        return drawSpeed;
    }

    public float getRange() {
        return range;
    }

    public String[] getRepairIngredients() {
        return repairIngredients;
    }
}
