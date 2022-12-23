package com.veriff.sdk.internal;

import hd0.C23441a;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.veriff.sdk.internal.fb */
public class C21621fb implements C21636fm {

    /* renamed from: a */
    private final ScheduledExecutorService f54624a;

    public C21621fb(ScheduledExecutorService scheduledExecutorService) {
        this.f54624a = scheduledExecutorService;
    }

    /* renamed from: a */
    public static C21621fb m52485a(String str, int i) {
        return new C21621fb(Executors.newScheduledThreadPool(i, new C23441a(str, i, new AtomicInteger(0))));
    }

    /* renamed from: b */
    public void mo54895b(Runnable runnable) {
        throw new UnsupportedOperationException("ExecutorScheduler does not support removing runnables");
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static /* synthetic */ Thread m52486a(String str, int i, AtomicInteger atomicInteger, Runnable runnable) {
        String str2;
        StringBuilder k = C13555b.m33972k(str);
        if (i == 1) {
            str2 = "";
        } else {
            StringBuilder k2 = C13555b.m33972k("-");
            k2.append(atomicInteger.incrementAndGet());
            str2 = k2.toString();
        }
        k.append(str2);
        return new Thread(runnable, k.toString());
    }

    /* renamed from: a */
    public void mo54894a(Runnable runnable) {
        this.f54624a.execute(runnable);
    }

    /* renamed from: a */
    public void mo54893a(long j, Runnable runnable) {
        this.f54624a.schedule(runnable, j, TimeUnit.MILLISECONDS);
    }
}
