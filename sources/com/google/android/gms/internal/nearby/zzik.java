package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzik extends zzjh {
    public final /* synthetic */ long zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzik(zzji zzji, GoogleApiClient googleApiClient, long j) {
        super(googleApiClient, (zzjg) null);
        this.zza = j;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzr(this, this.zza);
    }
}
