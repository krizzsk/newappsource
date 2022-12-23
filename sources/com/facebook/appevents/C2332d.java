package com.facebook.appevents;

import com.facebook.appevents.AppEventsLogger;
import com.facebook.appevents.C2338j;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.atomic.AtomicBoolean;
import p184n8.C5872d;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.d */
public final /* synthetic */ class C2332d implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f8522b;

    public /* synthetic */ C2332d(int i) {
        this.f8522b = i;
    }

    public final void run() {
        switch (this.f8522b) {
            case 0:
                Class<C2335g> cls = C2335g.class;
                if (!C6606a.m15601b(cls)) {
                    try {
                        C2335g.f8532e = null;
                        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor = C2338j.f8537c;
                        if (C2338j.C2339a.m6213b() != AppEventsLogger.FlushBehavior.EXPLICIT_ONLY) {
                            C2335g.m6199d(FlushReason.TIMER);
                            return;
                        }
                        return;
                    } catch (Throwable th) {
                        C6606a.m15600a(cls, th);
                        return;
                    }
                } else {
                    return;
                }
            default:
                C5872d dVar = C5872d.f18869a;
                Class<C5872d> cls2 = C5872d.class;
                if (!C6606a.m15601b(cls2)) {
                    try {
                        AtomicBoolean atomicBoolean = C5872d.f18870b;
                        if (!atomicBoolean.get()) {
                            atomicBoolean.set(true);
                            C5872d.f18869a.mo21747a();
                            return;
                        }
                        return;
                    } catch (Throwable th2) {
                        C6606a.m15600a(cls2, th2);
                        return;
                    }
                } else {
                    return;
                }
        }
    }
}
