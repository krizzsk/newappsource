package com.google.android.gms.internal.ads;

public final /* synthetic */ class zzcrn implements Runnable {
    public final /* synthetic */ zzcro zza;
    public final /* synthetic */ Runnable zzb;

    public /* synthetic */ zzcrn(zzcro zzcro, Runnable runnable) {
        this.zza = zzcro;
        this.zzb = runnable;
    }

    public final void run() {
        this.zza.zzc(this.zzb);
    }
}
