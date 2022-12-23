package com.google.android.gms.nearby.messages.internal;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.SubscribeOptions;

final class zzbn extends zzbu {
    public final /* synthetic */ PendingIntent zza;
    public final /* synthetic */ zzbw zzb;
    public final /* synthetic */ SubscribeOptions zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbn(zzbx zzbx, GoogleApiClient googleApiClient, PendingIntent pendingIntent, zzbw zzbw, SubscribeOptions subscribeOptions) {
        super(googleApiClient);
        this.zza = pendingIntent;
        this.zzb = zzbw;
        this.zzc = subscribeOptions;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzu(zza(), this.zza, this.zzb, this.zzc);
    }
}
