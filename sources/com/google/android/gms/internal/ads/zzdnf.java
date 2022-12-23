package com.google.android.gms.internal.ads;

import android.os.RemoteException;
import com.google.android.gms.ads.internal.client.zzdj;
import com.google.android.gms.ads.internal.client.zzdk;
import com.google.android.gms.ads.internal.client.zzdn;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzdnf extends zzdj {
    private final Object zza = new Object();
    private final zzdk zzb;
    private final zzbuo zzc;

    public zzdnf(zzdk zzdk, zzbuo zzbuo) {
        this.zzb = zzdk;
        this.zzc = zzbuo;
    }

    public final float zze() throws RemoteException {
        throw new RemoteException();
    }

    public final float zzf() throws RemoteException {
        zzbuo zzbuo = this.zzc;
        return zzbuo != null ? zzbuo.zzg() : BitmapDescriptorFactory.HUE_RED;
    }

    public final float zzg() throws RemoteException {
        zzbuo zzbuo = this.zzc;
        return zzbuo != null ? zzbuo.zzh() : BitmapDescriptorFactory.HUE_RED;
    }

    public final int zzh() throws RemoteException {
        throw new RemoteException();
    }

    public final zzdn zzi() throws RemoteException {
        synchronized (this.zza) {
            zzdk zzdk = this.zzb;
            if (zzdk == null) {
                return null;
            }
            zzdn zzi = zzdk.zzi();
            return zzi;
        }
    }

    public final void zzj(boolean z) throws RemoteException {
        throw new RemoteException();
    }

    public final void zzk() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzl() throws RemoteException {
        throw new RemoteException();
    }

    public final void zzm(zzdn zzdn) throws RemoteException {
        synchronized (this.zza) {
            zzdk zzdk = this.zzb;
            if (zzdk != null) {
                zzdk.zzm(zzdn);
            }
        }
    }

    public final void zzn() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzo() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzp() throws RemoteException {
        throw new RemoteException();
    }

    public final boolean zzq() throws RemoteException {
        throw new RemoteException();
    }
}
