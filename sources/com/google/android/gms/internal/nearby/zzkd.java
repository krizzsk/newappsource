package com.google.android.gms.internal.nearby;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.facebook.ads.AdError;

public final class zzkd extends zza {
    public zzkd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.nearby.internal.connection.INearbyConnectionService");
    }

    public final void zzd(zzfj zzfj) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzfj);
        zzu(AdError.INTERNAL_ERROR_2006, zza);
    }

    public final void zze(zzfn zzfn) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzfn);
        zzu(2012, zza);
    }

    public final void zzf(zzfp zzfp) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzfp);
        zzu(2011, zza);
    }

    public final void zzg(zzjl zzjl) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzjl);
        zzu(AdError.INTERSTITIAL_AD_TIMEOUT, zza);
    }

    public final void zzh(zzmg zzmg) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmg);
        zzu(2007, zza);
    }

    public final void zzi(zzmk zzmk) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmk);
        zzu(2005, zza);
    }

    public final void zzj(zzmo zzmo) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmo);
        zzu(AdError.REMOTE_ADS_SERVICE_ERROR, zza);
    }

    public final void zzk(zzms zzms) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzms);
        zzu(AdError.INTERNAL_ERROR_CODE, zza);
    }

    public final void zzl(zzmw zzmw) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmw);
        zzu(AdError.INTERNAL_ERROR_2003, zza);
    }

    public final void zzm(zzmy zzmy) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzmy);
        zzu(AdError.CACHE_ERROR_CODE, zza);
    }

    public final void zzn(zzna zzna) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zzna);
        zzu(2010, zza);
    }

    public final void zzo(zznc zznc) throws RemoteException {
        Parcel zza = zza();
        zzc.zze(zza, zznc);
        zzu(AdError.INTERNAL_ERROR_2004, zza);
    }
}
