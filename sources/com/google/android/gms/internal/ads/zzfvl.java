package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;

final class zzfvl implements Executor {
    public final /* synthetic */ Executor zza;
    public final /* synthetic */ zzftr zzb;

    public zzfvl(Executor executor, zzftr zzftr) {
        this.zza = executor;
        this.zzb = zzftr;
    }

    public final void execute(Runnable runnable) {
        try {
            this.zza.execute(runnable);
        } catch (RejectedExecutionException e) {
            this.zzb.zze(e);
        }
    }
}
