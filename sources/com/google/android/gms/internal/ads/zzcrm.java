package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzcrm implements Runnable {
    public final /* synthetic */ zzcro zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcrm(zzcro zzcro, Runnable runnable) {
        this.zza = zzcro;
        this.zzb = runnable;
    }

    public final void run() {
        zzcfv.zze.execute(new zzcrn(this.zza, this.zzb));
    }
}
