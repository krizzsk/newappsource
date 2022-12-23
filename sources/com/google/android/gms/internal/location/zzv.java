package com.google.android.gms.internal.location;

import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;

final class zzv extends zzw {
    public final /* synthetic */ LocationListener zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzv(zzz zzz, GoogleApiClient googleApiClient, LocationListener locationListener) {
        super(googleApiClient);
        this.zza = locationListener;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbe) anyClient).zzz(ListenerHolders.createListenerKey(this.zza, "LocationListener"), new zzx(this));
    }
}
