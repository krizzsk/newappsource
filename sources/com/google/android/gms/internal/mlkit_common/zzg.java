package com.google.android.gms.internal.mlkit_common;

import android.content.Context;

public final class zzg {
    public static final zzg zza;
    public static final zzg zzb;
    /* access modifiers changed from: private */
    public final boolean zzc;
    /* access modifiers changed from: private */
    public final boolean zzd = false;
    private final zzam zze;

    static {
        zze zze2 = new zze((zzd) null);
        zze2.zza();
        zza = zze2.zzc();
        zze zze3 = new zze((zzd) null);
        zze3.zzb();
        zzb = zze3.zzc();
    }

    public /* synthetic */ zzg(boolean z, boolean z2, zzam zzam, zzf zzf) {
        this.zzc = z;
        this.zze = zzam;
    }

    public static /* bridge */ /* synthetic */ int zzc(zzg zzg, Context context, zzp zzp) {
        zzam zzam = zzg.zze;
        int size = zzam.size();
        int i = 0;
        while (i < size) {
            int zza2 = ((zzq) zzam.get(i)).zza();
            int i2 = zza2 - 1;
            if (zza2 != 0) {
                i++;
                if (i2 == 0) {
                    return 1;
                }
                if (i2 == 1) {
                    return 2;
                }
            } else {
                throw null;
            }
        }
        return 3;
    }
}
