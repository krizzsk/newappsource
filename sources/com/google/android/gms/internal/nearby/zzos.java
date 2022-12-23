package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.places.Place;

public final class zzos extends zza {
    public zzos(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.uwb.internal.INearbyUwbService");
    }

    public final void zzd(zznz zznz) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zznz);
        zzv(Place.TYPE_INTERSECTION, zza);
    }

    public final void zze(zzob zzob) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzob);
        zzv(1007, zza);
    }

    public final void zzf(zzof zzof) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzof);
        zzv(1004, zza);
    }

    public final void zzg(zzoj zzoj) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzoj);
        zzv(Place.TYPE_ADMINISTRATIVE_AREA_LEVEL_3, zza);
    }

    public final void zzh(zzon zzon) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzon);
        zzv(1002, zza);
    }

    public final void zzi(zzpk zzpk) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzpk);
        zzv(1001, zza);
    }

    public final void zzj(zzqe zzqe) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqe);
        zzv(Place.TYPE_LOCALITY, zza);
    }

    public final void zzk(zzqi zzqi) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqi);
        zzv(1005, zza);
    }

    public final void zzl(zzqm zzqm) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzqm);
        zzv(Place.TYPE_FLOOR, zza);
    }
}
