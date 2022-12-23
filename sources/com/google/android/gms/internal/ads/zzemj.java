package com.google.android.gms.internal.ads;

final class zzemj implements zzemr {
    public final /* synthetic */ zzemk zza;

    public zzemj(zzemk zzemk) {
        this.zza = zzemk;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zzh = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzdjy zzdjy = (zzdjy) obj;
        synchronized (this.zza) {
            this.zza.zzh = zzdjy;
            this.zza.zzh.zzW();
        }
    }
}
