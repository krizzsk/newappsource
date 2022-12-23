package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzja extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ ListenerHolder zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzja(zzji zzji, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzq(this, this.zza, this.zzb);
    }
}
