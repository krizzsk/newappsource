package com.google.android.gms.internal.gtm;

final class zzbo implements Runnable {
    public final /* synthetic */ zzcz zza;
    public final /* synthetic */ zzbq zzb;

    public zzbo(zzbq zzbq, zzcz zzcz) {
        this.zzb = zzbq;
        this.zza = zzcz;
    }

    public final void run() {
        this.zzb.zza.zzf(this.zza);
    }
}
