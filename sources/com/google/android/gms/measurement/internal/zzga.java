package com.google.android.gms.measurement.internal;

final class zzga implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzga(zzgq zzgq, zzac zzac, zzq zzq) {
        this.zzc = zzgq;
        this.zza = zzac;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzc.zza.zzO(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzU(this.zza, this.zzb);
        }
    }
}
