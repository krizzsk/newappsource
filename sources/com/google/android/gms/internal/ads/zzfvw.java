package com.google.android.gms.internal.ads;

final class zzfvw extends zzfvi {
    public final /* synthetic */ zzfvy zza;
    private final zzfug zzb;

    public zzfvw(zzfvy zzfvy, zzfug zzfug) {
        this.zza = zzfvy;
        zzfug.getClass();
        this.zzb = zzfug;
    }

    public final /* bridge */ /* synthetic */ Object zza() throws Exception {
        zzfvj zza2 = this.zzb.zza();
        zzfos.zzd(zza2, "AsyncCallable.call returned null instead of a Future. Did you mean to return immediateFuture(null)? %s", this.zzb);
        return zza2;
    }

    public final String zzb() {
        return this.zzb.toString();
    }

    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    public final /* synthetic */ void zze(Object obj) {
        this.zza.zzt((zzfvj) obj);
    }

    public final boolean zzg() {
        return this.zza.isDone();
    }
}
