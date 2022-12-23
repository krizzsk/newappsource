package com.google.android.gms.internal.ads;

final class zzeli implements zzemr {
    public final /* synthetic */ zzelj zza;

    public zzeli(zzelj zzelj) {
        this.zza = zzelj;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvu zzcvu = (zzcvu) obj;
        synchronized (this.zza) {
            zzelj zzelj = this.zza;
            if (zzelj.zzh != null) {
                zzelj.zzh.zzV();
            }
            this.zza.zzh = zzcvu;
            this.zza.zzh.zzW();
        }
    }
}
