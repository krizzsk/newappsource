package com.google.android.gms.measurement.internal;

final class zzkp implements Runnable {
    public final /* synthetic */ zzla zza;
    public final /* synthetic */ zzkz zzb;

    public zzkp(zzkz zzkz, zzla zzla) {
        this.zzb = zzkz;
        this.zza = zzla;
    }

    public final void run() {
        zzkz.zzy(this.zzb, this.zza);
        this.zzb.zzS();
    }
}
