package com.google.android.gms.internal.ads;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzcdk implements ThreadFactory {
    private final AtomicInteger zza = new AtomicInteger(1);

    public zzcdk(zzcdn zzcdn) {
    }

    public final Thread newThread(Runnable runnable) {
        return new Thread(runnable, C16759e.m42349e("AdWorker(SCION_TASK_EXECUTOR) #", this.zza.getAndIncrement()));
    }
}
