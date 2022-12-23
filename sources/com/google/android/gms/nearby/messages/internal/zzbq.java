package com.google.android.gms.nearby.messages.internal;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.internal.nearby.zzno;

final class zzbq extends zzbu {
    public zzbq(zzbx zzbx, GoogleApiClient googleApiClient) {
        super(googleApiClient);
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzs) ((zzai) anyClient).getService()).zzd(new zzh(1, new zzno(zza()), (String) null, (ClientAppContext) null));
    }
}
