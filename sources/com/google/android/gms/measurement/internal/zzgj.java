package com.google.android.gms.measurement.internal;

final class zzgj implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgj(zzgq zzgq, zzaw zzaw, zzq zzq) {
        this.zzc = zzgq;
        this.zza = zzaw;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zzv(this.zzc.zzb(this.zza, this.zzb), this.zzb);
    }
}
