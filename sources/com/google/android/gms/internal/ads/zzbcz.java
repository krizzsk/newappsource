package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzbcz extends zzaqv {
    public zzbcz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.cache.ICacheService");
    }

    public final long zze(zzbcx zzbcx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcx);
        Parcel zzbk = zzbk(3, zza);
        long readLong = zzbk.readLong();
        zzbk.recycle();
        return readLong;
    }

    public final zzbcu zzf(zzbcx zzbcx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcx);
        Parcel zzbk = zzbk(1, zza);
        zzbcu zzbcu = (zzbcu) zzaqx.zza(zzbk, zzbcu.CREATOR);
        zzbk.recycle();
        return zzbcu;
    }

    public final zzbcu zzg(zzbcx zzbcx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zze(zza, zzbcx);
        Parcel zzbk = zzbk(2, zza);
        zzbcu zzbcu = (zzbcu) zzaqx.zza(zzbk, zzbcu.CREATOR);
        zzbk.recycle();
        return zzbcu;
    }
}
