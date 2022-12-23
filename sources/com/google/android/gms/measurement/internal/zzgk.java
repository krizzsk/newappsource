package com.google.android.gms.measurement.internal;

final class zzgk implements Runnable {
    public final /* synthetic */ zzaw zza;
    public final /* synthetic */ String zzb;
    public final /* synthetic */ zzgq zzc;

    public zzgk(zzgq zzgq, zzaw zzaw, String str) {
        this.zzc = zzgq;
        this.zza = zzaw;
        this.zzb = str;
    }

    public final void run() {
        this.zzc.zza.zzA();
        this.zzc.zza.zzF(this.zza, this.zzb);
    }
}
