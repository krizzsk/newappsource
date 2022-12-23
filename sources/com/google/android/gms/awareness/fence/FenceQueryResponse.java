package com.google.android.gms.awareness.fence;

import com.google.android.gms.common.api.Response;
import com.google.android.gms.common.internal.Preconditions;

public class FenceQueryResponse extends Response<FenceQueryResult> {
    public FenceStateMap getFenceStateMap() {
        return (FenceStateMap) Preconditions.checkNotNull(((FenceQueryResult) getResult()).getFenceStateMap());
    }
}
