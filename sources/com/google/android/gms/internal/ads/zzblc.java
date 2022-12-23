package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzblc extends zzaqv implements zzble {
    public zzblc(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.INativeAdViewDelegate");
    }

    public final IObjectWrapper zzb(String str) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        return C25541a.m63873c(zzbk(2, zza));
    }

    public final void zzbA(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    public final void zzbw(String str, IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zza.writeString(str);
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(1, zza);
    }

    public final void zzbx(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(6, zza);
    }

    public final void zzby(zzbkx zzbkx) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, zzbkx);
        zzbl(8, zza);
    }

    public final void zzbz(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(9, zza);
    }

    public final void zzc() throws RemoteException {
        zzbl(4, zza());
    }

    public final void zzd(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(7, zza);
    }

    public final void zze(IObjectWrapper iObjectWrapper, int i) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zza.writeInt(i);
        zzbl(5, zza);
    }
}
