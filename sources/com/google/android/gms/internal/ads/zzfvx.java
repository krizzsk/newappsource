package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;

final class zzfvx extends zzfvi {
    public final /* synthetic */ zzfvy zza;
    private final Callable zzb;

    public zzfvx(zzfvy zzfvy, Callable callable) {
        this.zza = zzfvy;
        callable.getClass();
        this.zzb = callable;
    }

    public final Object zza() throws Exception {
        return this.zzb.call();
    }

    public final String zzb() {
        return this.zzb.toString();
    }

    public final void zzd(Throwable th) {
        this.zza.zze(th);
    }

    public final void zze(Object obj) {
        this.zza.zzd(obj);
    }

    public final boolean zzg() {
        return this.zza.isDone();
    }
}
