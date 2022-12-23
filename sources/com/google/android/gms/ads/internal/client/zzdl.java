package com.google.android.gms.ads.internal.client;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.internal.ads.zzaqv;
import com.google.android.gms.internal.ads.zzaqx;

public final class zzdl extends zzaqv implements zzdn {
    public zzdl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.client.IVideoLifecycleCallbacks");
    }

    public final void zze() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzf(boolean z) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzd(zza, z);
        zzbl(5, zza);
    }

    public final void zzg() throws RemoteException {
        zzbl(3, zza());
    }

    public final void zzh() throws RemoteException {
        zzbl(2, zza());
    }

    public final void zzi() throws RemoteException {
        zzbl(1, zza());
    }
}
