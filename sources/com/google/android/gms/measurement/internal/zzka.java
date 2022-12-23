package com.google.android.gms.measurement.internal;

final class zzka implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzki zzb;

    public zzka(zzki zzki, long j) {
        this.zzb = zzki;
        this.zza = j;
    }

    public final void run() {
        zzki.zzl(this.zzb, this.zza);
    }
}
