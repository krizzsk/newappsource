package com.google.android.gms.internal.ads;

import android.os.RemoteException;

public final /* synthetic */ class zzdyc implements Runnable {
    public final /* synthetic */ zzdyi zza;
    public final /* synthetic */ zzbqm zzb;

    public /* synthetic */ zzdyc(zzdyi zzdyi, zzbqm zzbqm) {
        this.zza = zzdyi;
        this.zzb = zzbqm;
    }

    public final void run() {
        zzdyi zzdyi = this.zza;
        try {
            this.zzb.zzb(zzdyi.zzg());
        } catch (RemoteException e) {
            zzcfi.zzh("", e);
        }
    }
}
