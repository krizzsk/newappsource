package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zziu implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzlc zzc;
    public final /* synthetic */ zzjs zzd;

    public zziu(zzjs zzjs, zzq zzq, boolean z, zzlc zzlc) {
        this.zzd = zzjs;
        this.zza = zzq;
        this.zzb = z;
        this.zzc = zzlc;
    }

    public final void run() {
        zzlc zzlc;
        zzjs zzjs = this.zzd;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Discarding data. Failed to set user property");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjs zzjs2 = this.zzd;
        if (this.zzb) {
            zzlc = null;
        } else {
            zzlc = this.zzc;
        }
        zzjs2.zzD(zzh, zzlc, this.zza);
        this.zzd.zzQ();
    }
}
