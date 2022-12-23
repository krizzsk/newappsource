package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

final class zzful extends zzfum {
    public final /* synthetic */ zzfun zza;
    private final Callable zzc;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzful(zzfun zzfun, Callable callable, Executor executor) {
        super(zzfun, executor);
        this.zza = zzfun;
        callable.getClass();
        this.zzc = callable;
    }

    public final Object zza() throws Exception {
        return this.zzc.call();
    }

    public final String zzb() {
        return this.zzc.toString();
    }

    public final void zzc(Object obj) {
        this.zza.zzd(obj);
    }
}
