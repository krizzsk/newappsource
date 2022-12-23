package com.google.android.gms.measurement.internal;

final class zzgm implements Runnable {
    public final /* synthetic */ zzlc zza;
    public final /* synthetic */ zzq zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgm(zzgq zzgq, zzlc zzlc, zzq zzq) {
        this.zzc = zzgq;
        this.zza = zzlc;
        this.zzb = zzq;
    }

    public final void run() {
        this.zzc.zza.zzA();
        if (this.zza.zza() == null) {
            this.zzc.zza.zzP(this.zza, this.zzb);
        } else {
            this.zzc.zza.zzW(this.zza, this.zzb);
        }
    }
}
