package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;

public final class zzdgn implements zzden {
    private int zza = ((Integer) zzay.zzc().zzb(zzbhy.zzba)).intValue();

    public final synchronized void zzb(zzfbs zzfbs) {
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzbb)).booleanValue()) {
            try {
                this.zza = zzfbs.zzb.zzb.zzc;
            } catch (NullPointerException unused) {
            }
        }
    }

    public final void zzbE(zzbzu zzbzu) {
    }

    public final synchronized int zzc() {
        return this.zza;
    }
}
