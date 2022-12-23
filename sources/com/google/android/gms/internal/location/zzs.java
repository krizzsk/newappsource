package com.google.android.gms.internal.location;

import android.os.Looper;
import android.os.RemoteException;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApiClient;
import com.google.android.gms.common.api.internal.ListenerHolders;
import com.google.android.gms.location.LocationListener;
import com.google.android.gms.location.LocationRequest;

final class zzs extends zzw {
    public final /* synthetic */ LocationRequest zza;
    public final /* synthetic */ LocationListener zzb;
    public final /* synthetic */ Looper zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzs(zzz zzz, GoogleApiClient googleApiClient, LocationRequest locationRequest, LocationListener locationListener, Looper looper) {
        super(googleApiClient);
        this.zza = locationRequest;
        this.zzb = locationListener;
        this.zzc = looper;
    }

    public final /* bridge */ /* synthetic */ void doExecute(Api.AnyClient anyClient) throws RemoteException {
        ((zzbe) anyClient).zzC(zzbf.zzc((String) null, this.zza), ListenerHolders.createListenerHolder(this.zzb, zzbn.zza(this.zzc), "LocationListener"), new zzx(this));
    }
}
