package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzji implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzac zzc;
    public final /* synthetic */ zzac zzd;
    public final /* synthetic */ zzjs zze;

    public zzji(zzjs zzjs, boolean z, zzq zzq, boolean z2, zzac zzac, zzac zzac2) {
        this.zze = zzjs;
        this.zza = zzq;
        this.zzb = z2;
        this.zzc = zzac;
        this.zzd = zzac2;
    }

    public final void run() {
        zzac zzac;
        zzjs zzjs = this.zze;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Discarding data. Failed to send conditional user property to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjs zzjs2 = this.zze;
        if (this.zzb) {
            zzac = null;
        } else {
            zzac = this.zzc;
        }
        zzjs2.zzD(zzh, zzac, this.zza);
        this.zze.zzQ();
    }
}
