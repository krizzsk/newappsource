package com.google.android.gms.internal.ads;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

abstract class zzfum extends zzfvi {
    private final Executor zza;
    public final /* synthetic */ zzfun zzb;

    public zzfum(zzfun zzfun, Executor executor) {
        this.zzb = zzfun;
        executor.getClass();
        this.zza = executor;
    }

    public abstract void zzc(Object obj);

    public final void zzd(Throwable th) {
        zzfum unused = this.zzb.zza = null;
        if (th instanceof ExecutionException) {
            this.zzb.zze(((ExecutionException) th).getCause());
        } else if (th instanceof CancellationException) {
            this.zzb.cancel(false);
        } else {
            this.zzb.zze(th);
        }
    }

    public final void zze(Object obj) {
        zzfum unused = this.zzb.zza = null;
        zzc(obj);
    }

    public final void zzf() {
        try {
            this.zza.execute(this);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }

    public final boolean zzg() {
        return this.zzb.isDone();
    }
}
