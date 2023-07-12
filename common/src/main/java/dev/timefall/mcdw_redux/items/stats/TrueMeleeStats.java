package dev.timefall.mcdw_redux.items.stats;

import net.minecraft.item.ToolMaterials;

public class TrueMeleeStats {
    String toolMaterial;
    int attackDamage;
    float attackSpeed;
    String[] repairIngredients;

    public TrueMeleeStats mcdw_redux$trueMeleeStats(String toolMaterial, int attackDamage, float attackSpeed, String...repairIngredients){
        this.toolMaterial = toolMaterial;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
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

    public int mcdw_redux$getAttackDamage() {
        return attackDamage;
    }

    public float mcdw_redux$getAttackSpeed() {
        return attackSpeed;
    }

    public String[] mcdw_redux$getRepairIngredients() {
        return repairIngredients;
    }
}

