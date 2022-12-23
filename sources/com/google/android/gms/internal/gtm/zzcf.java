package com.google.android.gms.internal.gtm;

import com.google.android.gms.common.util.VisibleForTesting;

@VisibleForTesting
public final class zzcf extends zzbs {
    private final zzav zza = new zzav();

    public zzcf(zzbv zzbv) {
        super(zzbv);
    }

    public final zzav zza() {
        zzW();
        return this.zza;
    }

    public final void zzd() {
        zzq().zzc().zzc(this.zza);
        zzft zzB = zzB();
        zzB.zzW();
        String str = zzB.zzb;
        if (str != null) {
            this.zza.zzk(str);
        }
        zzB.zzW();
        String str2 = zzB.zza;
        if (str2 != null) {
            this.zza.zzl(str2);
        }
    }
}
