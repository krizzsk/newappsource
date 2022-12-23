package com.google.android.gms.internal.ads;

final class zzfaw implements zzemr {
    public final /* synthetic */ zzfax zza;

    public zzfaw(zzfax zzfax) {
        this.zza = zzfax;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzg = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdss = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzg = zzdss;
            this.zza.zzg.zzW();
        }
    }
}
