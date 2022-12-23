package com.google.android.gms.internal.gtm;

final class zzbl implements Runnable {
    public final /* synthetic */ int zza;
    public final /* synthetic */ zzbq zzb;

    public zzbl(zzbq zzbq, int i) {
        this.zzb = zzbq;
        this.zza = i;
    }

    public final void run() {
        this.zzb.zza.zzZ(((long) this.zza) * 1000);
    }
}
