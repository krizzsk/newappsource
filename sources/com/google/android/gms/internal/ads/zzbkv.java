package com.google.android.gms.internal.ads;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.dynamic.IObjectWrapper;

public final class zzbkv extends zzaqv implements zzbkx {
    public zzbkv(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.internal.formats.client.IMediaContent");
    }

    public final float zze() throws RemoteException {
        Parcel zzbk = zzbk(2, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzf() throws RemoteException {
        Parcel zzbk = zzbk(6, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final float zzg() throws RemoteException {
        Parcel zzbk = zzbk(5, zza());
        float readFloat = zzbk.readFloat();
        zzbk.recycle();
        return readFloat;
    }

    public final zzdk zzh() throws RemoteException {
        Parcel zzbk = zzbk(7, zza());
        zzdk zzb = zzdj.zzb(zzbk.readStrongBinder());
        zzbk.recycle();
        return zzb;
    }

    public final IObjectWrapper zzi() throws RemoteException {
        return C25541a.m63873c(zzbk(4, zza()));
    }

    public final void zzj(IObjectWrapper iObjectWrapper) throws RemoteException {
        Parcel zza = zza();
        zzaqx.zzg(zza, iObjectWrapper);
        zzbl(3, zza);
    }

    public final boolean zzk() throws RemoteException {
        Parcel zzbk = zzbk(8, zza());
        boolean zzh = zzaqx.zzh(zzbk);
        zzbk.recycle();
        return zzh;
    }

    public final void zzl(zzbmi zzbmi) throws RemoteException {
        throw null;
    }
}
