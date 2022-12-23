package com.google.android.gms.nearby.messages.internal;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.nearby.zza;
import com.google.android.gms.internal.nearby.zzc;

public final class zzs extends zza {
    public zzs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.messages.internal.INearbyMessagesService");
    }

    public final void zzd(zzh zzh) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzh);
        zzv(7, zza);
    }

    public final void zze(zzj zzj) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzj);
        zzv(9, zza);
    }

    public final void zzf(zzbz zzbz) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzbz);
        zzv(1, zza);
    }

    public final void zzg(zzcb zzcb) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzcb);
        zzv(8, zza);
    }

    public final void zzh(SubscribeRequest subscribeRequest) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, subscribeRequest);
        zzv(3, zza);
    }

    public final void zzi(zzce zzce) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzce);
        zzv(2, zza);
    }

    public final void zzj(zzcg zzcg) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzcg);
        zzv(4, zza);
    }
}
