package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.messages.SubscribeOptions;

final class zzbm extends zzbu {
    public final /* synthetic */ ListenerHolder zza;
    public final /* synthetic */ zzbw zzb;
    public final /* synthetic */ SubscribeOptions zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbm(zzbx zzbx, GoogleApiClient googleApiClient, ListenerHolder listenerHolder, zzbw zzbw, SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = listenerHolder;
        this.zzb = zzbw;
        this.zzc = subscribeOptions;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzw(zza(), this.zza, this.zzb, this.zzc, (byte[]) null);
    }
}
