package com.google.android.gms.ads.query;

import com.google.android.gms.common.annotation.KeepForSdk;

@KeepForSdk
public abstract class QueryInfoGenerationCallback {
    @KeepForSdk
    public void onFailure(String str) {
    }

    @KeepForSdk
    public void onSuccess(QueryInfo queryInfo) {
    }
}
