package dev.timefall.mcdw_redux.interfaces;

import java.util.List;

public interface IExclusiveAOECloud {
    @SuppressWarnings("unused")
    List<Boolean> getExclusions();
    void setExclusions (boolean owner, boolean allies, boolean enemy);
}