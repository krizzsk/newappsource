package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

final class zzix extends zzjh {
    public final /* synthetic */ String zza;
    public final /* synthetic */ ListenerHolder zzb;
    public final /* synthetic */ DiscoveryOptions zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzix(zzji zzji, GoogleApiClient googleApiClient, String str, ListenerHolder listenerHolder, DiscoveryOptions discoveryOptions) {
        super(googleApiClient, (zzjg) null);
        this.zza = str;
        this.zzb = listenerHolder;
        this.zzc = discoveryOptions;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzB(this, this.zza, this.zzb, this.zzc);
    }
}
