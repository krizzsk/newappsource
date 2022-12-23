package com.google.android.gms.measurement.internal;

final class zzgg implements Runnable {
    public final /* synthetic */ zzq zza;
    public final /* synthetic */ zzgq zzb;

    public zzgg(zzgq zzgq, zzq zzq) {
        this.zzb = zzgq;
        this.zza = zzq;
    }

    public final void run() {
        this.zzb.zza.zzA();
        this.zzb.zza.zzQ(this.zza);
    }
}
