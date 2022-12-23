package com.google.android.gms.internal.ads;

final class zzfbb implements zzemr {
    public final /* synthetic */ zzfbd zza;

    public zzfbb(zzfbd zzfbd) {
        this.zza = zzfbd;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzd = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdss zzdss = (zzdss) obj;
        synchronized (this.zza) {
            this.zza.zzd = zzdss;
            this.zza.zzd.zzW();
        }
    }
}
