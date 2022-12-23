package com.google.android.gms.internal.ads;

final class zzfef implements zzfuw {
    public final /* synthetic */ zzfei zza;
    public final /* synthetic */ zzfej zzb;

    public zzfef(zzfej zzfej, zzfei zzfei) {
        this.zzb = zzfej;
        this.zza = zzfei;
    }

    public final void zza(Throwable th) {
        synchronized (this.zzb) {
            this.zzb.zze = null;
        }
    }

    public final /* bridge */ /* synthetic */ void zzb(Object obj) {
        Void voidR = (Void) obj;
        synchronized (this.zzb) {
            this.zzb.zze = null;
            this.zzb.zzd.addFirst(this.zza);
            zzfej zzfej = this.zzb;
            if (zzfej.zzf == 1) {
                zzfej.zzh();
            }
        }
    }
}
