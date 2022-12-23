package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;

final class zzjh implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ boolean zzb;
    public final /* synthetic */ zzaw zzc;
    public final /* synthetic */ String zzd;
    public final /* synthetic */ zzjs zze;

    public zzjh(zzjs zzjs, boolean z, zzq zzq, boolean z2, zzaw zzaw, String str) {
        this.zze = zzjs;
        this.zza = zzq;
        this.zzb = z2;
        this.zzc = zzaw;
        this.zzd = str;
    }

    public final void run() {
        zzaw zzaw;
        zzjs zzjs = this.zze;
        zzee zzh = zzjs.zzb;
        if (zzh == null) {
            C16530d.m42018k(zzjs.zzs, "Discarding data. Failed to send event to service");
            return;
        }
        Preconditions.checkNotNull(this.zza);
        zzjs zzjs2 = this.zze;
        if (this.zzb) {
            zzaw = null;
        } else {
            zzaw = this.zzc;
        }
        zzjs2.zzD(zzh, zzaw, this.zza);
        this.zze.zzQ();
    }
}
