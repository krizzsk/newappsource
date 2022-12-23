package com.google.android.gms.measurement.internal;

final class zzgb implements Runnable {
    public final /* synthetic */ zzac zza;
    public final /* synthetic */ zzgq zzb;

    public zzgb(zzgq zzgq, zzac zzac) {
        this.zzb = zzgq;
        this.zza = zzac;
    }

    public final void run() {
        this.zzb.zza.zzA();
        if (this.zza.zzc.zza() == null) {
            this.zzb.zza.zzN(this.zza);
        } else {
            this.zzb.zza.zzT(this.zza);
        }
    }
}
