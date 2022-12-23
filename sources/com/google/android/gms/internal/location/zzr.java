package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class zzr extends zzw {
    public final /* synthetic */ LocationRequest zza;
    public final /* synthetic */ LocationListener zzb;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzr(zzz zzz, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = locationListener;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbe) anyClient).zzC(zzbf.zzc((String) null, this.zza), ListenerHolders.createListenerHolder(this.zzb, zzbn.zzb(), "LocationListener"), new zzx(this));
    }
}
