package com.google.android.gms.measurement.internal;

final class zzjx implements Runnable {
    public final /* synthetic */ zzkz zza;
    public final /* synthetic */ Runnable zzb;

    public zzjx(zzjz zzjz, zzkz zzkz, Runnable runnable) {
        this.zza = zzkz;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzA();
        this.zza.zzz(this.zzb);
        this.zza.zzX();
    }
}
