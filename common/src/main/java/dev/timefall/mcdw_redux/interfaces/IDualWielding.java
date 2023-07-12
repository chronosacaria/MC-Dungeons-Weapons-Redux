package dev.timefall.mcdw_redux.interfaces;

public interface IDualWielding {
    float mcdw_redux$getOffhandAttackCooldownProgressPerTick();

    float mcdw_redux$getOffhandAttackCooldownProgress(float baseTime);

    void mcdw_redux$resetLastAttackedOffhandTicks();

    int mcdw_redux$getOffhandAttackedTicks();

    void mcdw_redux$setOffhandAttackedTicks(int lastAttackedOffhandTicks);
}
