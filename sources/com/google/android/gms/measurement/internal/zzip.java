package com.google.android.gms.measurement.internal;

final class zzip implements Runnable {
    public final /* synthetic */ long zza;
    public final /* synthetic */ zzis zzb;

    public zzip(zzis zzis, long j) {
        this.zzb = zzis;
        this.zza = j;
    }

    public final void run() {
        this.zzb.zzs.zzd().zzf(this.zza);
        this.zzb.zza = null;
    }
}
