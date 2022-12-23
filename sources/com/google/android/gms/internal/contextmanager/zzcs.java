package com.google.android.gms.internal.contextmanager;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

public final class zzcs extends zza {
    public zzcs(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.contextmanager.internal.IContextManagerService");
    }

    public final void zzc(zzcr zzcr, String str, String str2, String str3, zzao zzao) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzcr);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc.zzb(zza, zzao);
        zzb(15, zza);
    }

    public final void zzd(zzcr zzcr, String str, String str2, String str3, zzbm zzbm) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzcr);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc.zzb(zza, zzbm);
        zzb(16, zza);
    }

    public final void zze(zzcr zzcr, String str, String str2, String str3, zzbs zzbs) throws RemoteException {
        Parcel zza = zza();
        zzc.zzc(zza, zzcr);
        zza.writeString(str);
        zza.writeString(str2);
        zza.writeString(str3);
        zzc.zzb(zza, zzbs);
        zzb(13, zza);
    }
}
