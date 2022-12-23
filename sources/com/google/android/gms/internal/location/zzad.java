package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.location.zzbx;

final class zzad extends zzae {
    public final /* synthetic */ zzbx zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzad(zzaf zzaf, GoogleApiClient googleApiClient, zzbx zzbx) {
        super(googleApiClient);
        this.zza = zzbx;
    }

    public final /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        zzbx zzbx = this.zza;
        Preconditions.checkNotNull(zzbx, "removeGeofencingRequest can't be null.");
        Preconditions.checkNotNull(this, "ResultHolder not provided.");
        ((zzam) ((zzbe) anyClient).getService()).zzm(zzbx, new zzba(this));
    }
}
