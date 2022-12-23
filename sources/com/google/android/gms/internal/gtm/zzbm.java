package com.google.android.gms.internal.gtm;

final class zzbm implements Runnable {
    public final /* synthetic */ zzex zza;
    public final /* synthetic */ zzbq zzb;

    public zzbm(zzbq zzbq, zzex zzex) {
        this.zzb = zzbq;
        this.zza = zzex;
    }

    public final void run() {
        this.zzb.zza.zzj(this.zza);
    }
}
