package com.google.android.gms.internal.ads;

final class zzfto extends zzftq {
    public zzfto(zzfvj zzfvj, Class cls, zzfuh zzfuh) {
        super(zzfvj, cls, zzfuh);
    }

    public final /* bridge */ /* synthetic */ Object zzf(Object obj, Throwable th) throws Exception {
        zzfuh zzfuh = (zzfuh) obj;
        zzfvj zza = zzfuh.zza(th);
        zzfos.zzd(zza, "AsyncFunction.apply returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", zzfuh);
        return zza;
    }

    public final /* synthetic */ void zzg(Object obj) {
        zzt((zzfvj) obj);
    }
}
