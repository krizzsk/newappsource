package com.google.android.gms.internal.nearby;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolder;
import com.google.android.gms.nearby.connection.AdvertisingOptions;

final class zziv extends zzjf {
    public final /* synthetic */ String zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ ListenerHolder zzc;
    public final /* synthetic */ AdvertisingOptions zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zziv(zzji zzji, GoogleApiClient googleApiClient, String str, String str2, ListenerHolder listenerHolder, AdvertisingOptions advertisingOptions) {
        super(googleApiClient, (zzje) null);
        this.zza = str;
        this.zzb = str2;
        this.zzc = listenerHolder;
        this.zzd = advertisingOptions;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzgy) anyClient).zzz(this, this.zza, this.zzb, this.zzc, this.zzd);
    }
}
