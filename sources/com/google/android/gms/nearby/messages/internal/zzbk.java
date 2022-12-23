package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;
import com.google.android.gms.nearby.messages.PublishOptions;

final class zzbk extends zzbu {
    public final /* synthetic */ Message zza;
    public final /* synthetic */ zzbt zzb;
    public final /* synthetic */ PublishOptions zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbk(zzbx zzbx, GoogleApiClient googleApiClient, Message message, zzbt zzbt, PublishOptions publishOptions) {
        super(googleApiClient);
        this.zza = message;
        this.zzb = zzbt;
        this.zzc = publishOptions;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzr(zza(), zzae.zza(this.zza), this.zzb, this.zzc);
    }
}
