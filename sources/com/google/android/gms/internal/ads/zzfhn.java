package com.google.android.gms.internal.ads;

final class zzfhn implements zzfuw {
    public final /* synthetic */ zzfhq zza;
    public final /* synthetic */ zzfhg zzb;

    public zzfhn(zzfhq zzfhq, zzfhg zzfhg, boolean z) {
        this.zza = zzfhq;
        this.zzb = zzfhg;
    }

    public final void zza(Throwable th) {
        zzfhg zzfhg = this.zzb;
        if (zzfhg.zzh()) {
            zzfhq zzfhq = this.zza;
            zzfhg.zze(false);
            zzfhq.zza(zzfhg);
        }
    }

    public final void zzb(Object obj) {
        zzfhq zzfhq = this.zza;
        zzfhg zzfhg = this.zzb;
        zzfhg.zze(true);
        zzfhq.zza(zzfhg);
    }
}
