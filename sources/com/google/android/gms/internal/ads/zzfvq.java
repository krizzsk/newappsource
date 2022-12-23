package com.google.android.gms.internal.ads;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;

public final class zzfvq {
    public static zzfvk zza(ExecutorService executorService) {
        zzfvk zzfvk;
        if (executorService instanceof zzfvk) {
            return (zzfvk) executorService;
        }
        if (executorService instanceof ScheduledExecutorService) {
            zzfvk = new zzfvp((ScheduledExecutorService) executorService);
        } else {
            zzfvk = new zzfvm(executorService);
        }
        return zzfvk;
    }

    public static Executor zzb() {
        return zzfuo.INSTANCE;
    }

    public static Executor zzc(Executor executor, zzftr zzftr) {
        executor.getClass();
        if (executor == zzfuo.INSTANCE) {
            return executor;
        }
        return new zzfvl(executor, zzftr);
    }
}
