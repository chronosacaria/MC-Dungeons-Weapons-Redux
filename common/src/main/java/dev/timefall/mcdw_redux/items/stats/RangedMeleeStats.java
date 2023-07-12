package dev.timefall.mcdw_redux.items.stats;

public class RangedMeleeStats extends TrueMeleeStats {
    String toolMaterial;
    int attackDamage;
    float attackSpeed;
    double attackRange;
    String[] repairIngredients;

    public RangedMeleeStats mcdw_redux$rangedMeleeStats(String toolMaterial, int attackDamage, float attackSpeed, double attackRange, String...repairIngredients) {
        this.toolMaterial = toolMaterial;
        this.attackDamage = attackDamage;
        this.attackSpeed = attackSpeed;
        this.attackRange = attackRange;
        this.repairIngredients = repairIngredients;
        return this;
    }

    @Override
    public int mcdw_redux$getAttackDamage() {
        return attackDamage;
    }

    @Override
    public float mcdw_redux$getAttackSpeed() {
        return attackSpeed;
    }

    public double mcdw_redux$getAttackRange() {
        return attackRange;
    }
}

