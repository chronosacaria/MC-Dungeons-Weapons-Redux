package dev.timefall.mcdw_redux.interfaces;

import java.util.List;

public interface IExclusiveAOECloud {
    @SuppressWarnings("unused")
    List<Boolean> mcdw_redux$getExclusions();
    void mcdw_redux$setExclusions(boolean owner, boolean allies, boolean enemy);
}