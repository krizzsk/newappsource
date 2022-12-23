package com.android.billingclient.api;

import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.android.billingclient.api.o */
public final class C1959o implements ThreadFactory {

    /* renamed from: b */
    public final ThreadFactory f6782b = Executors.defaultThreadFactory();

    /* renamed from: c */
    public final AtomicInteger f6783c = new AtomicInteger(1);

    public final Thread newThread(Runnable runnable) {
        Thread newThread = this.f6782b.newThread(runnable);
        int andIncrement = this.f6783c.getAndIncrement();
        StringBuilder sb = new StringBuilder(30);
        sb.append("PlayBillingLibrary-");
        sb.append(andIncrement);
        newThread.setName(sb.toString());
        return newThread;
    }
}
