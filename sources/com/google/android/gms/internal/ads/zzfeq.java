package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzfeq implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, C16759e.m42349e("AdWorker(NG) #", this.zza.getAndIncrement()));
    }
}
