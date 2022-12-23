package com.google.firebase.crashlytics.internal.common;

import com.google.firebase.crashlytics.internal.settings.C14454a;
import java.lang.Thread;
import java.util.concurrent.atomic.AtomicBoolean;
import p459ee.C16810a;
import p696oe.C18736f;

/* renamed from: com.google.firebase.crashlytics.internal.common.e */
public final class C14452e implements Thread.UncaughtExceptionHandler {

    /* renamed from: a */
    public final C14453a f36498a;

    /* renamed from: b */
    public final C18736f f36499b;

    /* renamed from: c */
    public final Thread.UncaughtExceptionHandler f36500c;

    /* renamed from: d */
    public final C16810a f36501d;

    /* renamed from: e */
    public final AtomicBoolean f36502e = new AtomicBoolean(false);

    /* renamed from: com.google.firebase.crashlytics.internal.common.e$a */
    public interface C14453a {
    }

    public C14452e(C14447a aVar, C14454a aVar2, Thread.UncaughtExceptionHandler uncaughtExceptionHandler, C16810a aVar3) {
        this.f36498a = aVar;
        this.f36499b = aVar2;
        this.f36500c = uncaughtExceptionHandler;
        this.f36501d = aVar3;
    }

    /* JADX WARNING: Removed duplicated region for block: B:9:0x0019 A[Catch:{ Exception -> 0x002f, all -> 0x0023 }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void uncaughtException(java.lang.Thread r4, java.lang.Throwable r5) {
        /*
            r3 = this;
            java.util.concurrent.atomic.AtomicBoolean r0 = r3.f36502e
            r1 = 1
            r0.set(r1)
            r0 = 0
            if (r4 != 0) goto L_0x000b
        L_0x0009:
            r1 = 0
            goto L_0x0017
        L_0x000b:
            if (r5 != 0) goto L_0x000e
            goto L_0x0009
        L_0x000e:
            ee.a r2 = r3.f36501d     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            boolean r2 = r2.mo49484b()     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            if (r2 == 0) goto L_0x0017
            goto L_0x0009
        L_0x0017:
            if (r1 == 0) goto L_0x002f
            com.google.firebase.crashlytics.internal.common.e$a r1 = r3.f36498a     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            oe.f r2 = r3.f36499b     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            com.google.firebase.crashlytics.internal.common.a r1 = (com.google.firebase.crashlytics.internal.common.C14447a) r1     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            r1.mo43333a(r2, r4, r5)     // Catch:{ Exception -> 0x002f, all -> 0x0023 }
            goto L_0x002f
        L_0x0023:
            r1 = move-exception
            java.lang.Thread$UncaughtExceptionHandler r2 = r3.f36500c
            r2.uncaughtException(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f36502e
            r4.set(r0)
            throw r1
        L_0x002f:
            java.lang.Thread$UncaughtExceptionHandler r1 = r3.f36500c
            r1.uncaughtException(r4, r5)
            java.util.concurrent.atomic.AtomicBoolean r4 = r3.f36502e
            r4.set(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.firebase.crashlytics.internal.common.C14452e.uncaughtException(java.lang.Thread, java.lang.Throwable):void");
    }
}
