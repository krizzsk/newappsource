package com.google.android.gms.internal.location;

import android.app.PendingIntent;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.location.GeofencingRequest;

final class zzac extends zzae {
    public final /* synthetic */ GeofencingRequest zza;
    public final /* synthetic */ PendingIntent zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzac(zzaf zzaf, GoogleApiClient googleApiClient, GeofencingRequest geofencingRequest, PendingIntent pendingIntent) {
        super(googleApiClient);
        this.zza = geofencingRequest;
        this.zzb = pendingIntent;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbe) anyClient).zzq(this.zza, this.zzb, this);
    }
}
