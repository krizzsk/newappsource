package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.client.zzay;
import com.google.android.gms.ads.internal.client.zze;
import com.google.android.gms.ads.internal.util.zzg;

public final class zzedp implements zzddg, zzdbv {
    private static final Object zza = new Object();
    private static int zzb;
    private final zzg zzc;
    private final zzedy zzd;

    public zzedp(zzedy zzedy, zzg zzg) {
        this.zzd = zzedy;
        this.zzc = zzg;
    }

    private final void zzb(boolean z) {
        int i;
        int intValue;
        if (((Boolean) zzay.zzc().zzb(zzbhy.zzff)).booleanValue() && !this.zzc.zzP()) {
            Object obj = zza;
            synchronized (obj) {
                i = zzb;
                intValue = ((Integer) zzay.zzc().zzb(zzbhy.zzfg)).intValue();
            }
            if (i < intValue) {
                this.zzd.zze(z);
                synchronized (obj) {
                    zzb++;
                }
            }
        }
    }

    public final void zza(zze zze) {
        zzb(false);
    }

    public final void zzn() {
        zzb(true);
    }
}
