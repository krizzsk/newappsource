package com.google.android.gms.analytics;

import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

final class zzp implements ThreadFactory {
    private static final AtomicInteger zza = new AtomicInteger();

    private zzp() {
    }

    public /* synthetic */ zzp(zzo zzo) {
    }

    public final Thread newThread(Runnable runnable) {
        return new zzq(runnable, C13715c.m34241g(23, "measurement-", zza.incrementAndGet()));
    }
}
