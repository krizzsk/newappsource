package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;

final class zzjb extends zzjh {
    public final /* synthetic */ String zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzjb(zzji zzji, GoogleApiClient googleApiClient, String str) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzt(this, this.zza);
    }
}
