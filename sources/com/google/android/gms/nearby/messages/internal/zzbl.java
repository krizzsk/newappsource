package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.nearby.messages.Message;

final class zzbl extends zzbu {
    public final /* synthetic */ Message zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzbl(zzbx zzbx, GoogleApiClient googleApiClient, Message message) {
        super(googleApiClient);
        this.zza = message;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzai) anyClient).zzy(zza(), zzae.zza(this.zza));
    }
}
