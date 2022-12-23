package com.google.android.gms.internal.gtm;

final class zzfl implements zzcz {
    public final /* synthetic */ Runnable zza;
    public final /* synthetic */ zzfn zzb;

    public zzfl(zzfn zzfn, Runnable runnable) {
        this.zzb = zzfn;
        this.zza = runnable;
    }

    public final void zza(Throwable th) {
        this.zzb.zzb.post(this.zza);
    }
}
