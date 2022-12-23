package com.google.android.gms.measurement.internal;

final class zzkb implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzki zzb;

    public zzkb(zzki zzki, long j) {
        this.zzb = zzki;
        this.zza = j;
    }

    public final void run() {
        zzki.zzj(this.zzb, this.zza);
    }
}
