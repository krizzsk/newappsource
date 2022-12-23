package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.nearby.Nearby;

abstract class zzjc extends BaseImplementation.ApiMethodImpl {
    public zzjc(GoogleApiClient googleApiClient) {
        super((Api<?>) Nearby.CONNECTIONS_API, googleApiClient);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
