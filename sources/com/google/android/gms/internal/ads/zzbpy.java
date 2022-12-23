package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbpy extends zzaqv {
    public zzbpy(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.httpcache.IHttpAssetsCacheService");
    }

    public final void zze(zzbps zzbps, zzbpx zzbpx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbps);
        zzaqx.zzg(zza, zzbpx);
        zzbm(2, zza);
    }
}
