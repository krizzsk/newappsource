package com.google.android.gms.internal.ads;

import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

public final class zzfuz {
    private final boolean zza;
    private final zzfrh zzb;

    public /* synthetic */ zzfuz(boolean z, zzfrh zzfrh, zzfux zzfux) {
        this.zza = z;
        this.zzb = zzfrh;
    }

    public final zzfvj zza(Callable callable, Executor executor) {
        return new zzfun(this.zzb, this.zza, executor, callable);
    }
}
