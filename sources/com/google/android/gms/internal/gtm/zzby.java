package com.google.android.gms.internal.gtm;

import com.google.android.gms.analytics.zzr;

final class zzby extends zzcw {
    public final /* synthetic */ zzcc zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzby(zzcc zzcc, zzbv zzbv) {
        super(zzbv);
        this.zza = zzcc;
    }

    public final void zza() {
        zzcc zzcc = this.zza;
        zzr.zzh();
        if (zzcc.zzg()) {
            zzcc.zzO("Inactivity, disconnecting from device AnalyticsService");
            zzcc.zzc();
        }
    }
}
