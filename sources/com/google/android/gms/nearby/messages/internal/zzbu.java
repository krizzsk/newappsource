package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.common.annotation.KeepForSdk;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BaseImplementation;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.Nearby;

abstract class zzbu extends BaseImplementation.ApiMethodImpl {
    private final ListenerHolder zza;

    public zzbu(GoogleApiClient googleApiClient) {
        super((Api<?>) Nearby.MESSAGES_API, googleApiClient);
        this.zza = googleApiClient.registerListener(this);
    }

    public final /* bridge */ /* synthetic */ Result createFailedResult(Status status) {
        return status;
    }

    @KeepForSdk
    public final /* bridge */ /* synthetic */ void setResult(Object obj) {
        super.setResult((Result) obj);
    }

    public final ListenerHolder zza() {
        return this.zza;
    }
}
