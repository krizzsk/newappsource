package com.google.android.gms.internal.ads;

import java.util.concurrent.AbstractExecutorService;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.RunnableFuture;

public abstract class zzftu extends AbstractExecutorService implements zzfvk {
    public final RunnableFuture newTaskFor(Runnable runnable, Object obj) {
        return zzfvy.zzf(runnable, obj);
    }

    public final /* synthetic */ Future submit(Runnable runnable) {
        return (zzfvj) super.submit(runnable);
    }

    public final zzfvj zza(Runnable runnable) {
        return (zzfvj) super.submit(runnable);
    }

    public final zzfvj zzb(Callable callable) {
        return (zzfvj) super.submit(callable);
    }

    public final RunnableFuture newTaskFor(Callable callable) {
        return new zzfvy(callable);
    }

    public final /* synthetic */ Future submit(Runnable runnable, Object obj) {
        return (zzfvj) super.submit(runnable, obj);
    }

    public final /* synthetic */ Future submit(Callable callable) {
        return (zzfvj) super.submit(callable);
    }
}
