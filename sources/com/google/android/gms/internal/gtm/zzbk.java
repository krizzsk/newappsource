package com.google.android.gms.internal.gtm;

final class zzbk implements Runnable {
    public final /* synthetic */ String zza;
    public final /* synthetic */ Runnable zzb;
    public final /* synthetic */ zzbq zzc;

    public zzbk(zzbq zzbq, String str, Runnable runnable) {
        this.zzc = zzbq;
        this.zza = str;
        this.zzb = runnable;
    }

    public final void run() {
        this.zzc.zza.zzn(this.zza);
        this.zzb.run();
    }
}
