package dev.timefall.mcdw_redux.items.stats;

import net.minecraft.item.ToolMaterials;

public class MeleeStats {

    String toolMaterial;
    int attackDamage;
    float attackSpeed;
    String[] repairIngredients;
    public MeleeStats meleeStats (String toolMaterial,int attackDamage, float attackSpeed, String...repairIngredients){
        this.toolMaterial = toolMaterial;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.repairIngredients = repairIngredients;
        return this;
    }

    public ToolMaterials getToolMaterial () {
        try {
            return ToolMaterials.valueOf(this.toolMaterial);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return ToolMaterials.GOLD;
    }

    public int getAttackDamage () {
        return attackDamage;
    }

    public float getAttackSpeed () {
        return attackSpeed;
    }

    public String[] getRepairIngredients () {
        return repairIngredients;
    }
}

