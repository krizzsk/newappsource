package com.google.android.gms.internal.ads;

final class zzexj implements zzemr {
    public final /* synthetic */ zzexk zza;

    public zzexj(zzexk zzexk) {
        this.zza = zzexk;
    }

    public final void zza() {
        synchronized (this.zza) {
            this.zza.zza = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        zzcvn zzcvn = (zzcvn) obj;
        synchronized (this.zza) {
            zzcvn zzcvn2 = this.zza.zza;
            if (zzcvn2 != null) {
                zzcvn2.zzV();
            }
            zzexk zzexk = this.zza;
            zzexk.zza = zzcvn;
            zzcvn.zzc(zzexk);
            zzexk zzexk2 = this.zza;
            zzexk2.zzg.zzl(new zzcvo(zzcvn, zzexk2, zzexk2.zzg));
            zzcvn.zzW();
        }
    }
}
