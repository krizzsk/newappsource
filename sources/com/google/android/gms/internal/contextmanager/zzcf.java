package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.fence.FenceQueryResult;
import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;

public abstract class zzcf extends BaseImplementation.ApiMethodImpl<FenceQueryResult, zzcj> {
    public zzcf(GoogleApiClient googleApiClient) {
        super((Api<?>) zzay.zzd, googleApiClient);
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return new zzce(this, status);
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }
}
