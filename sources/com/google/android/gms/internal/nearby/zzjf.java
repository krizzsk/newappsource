package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;

abstract class zzjf extends zzjc {
    public /* synthetic */ zzjf(GoogleApiClient googleApiClient, zzje zzje) {
        super(googleApiClient);
    }

    public final /* synthetic */ Result createFailedResult(Status status) {
        return new zzjd(this, status);
    }
}
