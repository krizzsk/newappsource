package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;

final class zzbr extends zzbu {
    public final /* synthetic */ ListenerHolder zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbr(zzbx zzbx, GoogleApiClient googleApiClient, ListenerHolder listenerHolder) {
        super(googleApiClient);
        this.zza = listenerHolder;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzt(zza(), this.zza);
    }
}
