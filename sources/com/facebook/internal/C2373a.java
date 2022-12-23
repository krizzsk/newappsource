package com.facebook.internal;

import android.content.Intent;
import java.util.UUID;
import mf0.C24362h;
import p262t8.C6606a;

/* renamed from: com.facebook.internal.a */
public final class C2373a {

    /* renamed from: d */
    public static final C2374a f8598d = new C2374a();

    /* renamed from: e */
    public static C2373a f8599e;

    /* renamed from: a */
    public int f8600a;

    /* renamed from: b */
    public final UUID f8601b;

    /* renamed from: c */
    public Intent f8602c;

    /* renamed from: com.facebook.internal.a$a */
    public static final class C2374a {
        /* JADX WARNING: Removed duplicated region for block: B:13:0x0019 A[SYNTHETIC, Splitter:B:13:0x0019] */
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0022  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0024  */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final synchronized boolean mo12539a(com.facebook.internal.C2373a r4) {
            /*
                r3 = this;
                java.lang.Class<com.facebook.internal.a> r0 = com.facebook.internal.C2373a.class
                monitor-enter(r3)
                boolean r1 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x0027 }
                if (r1 == 0) goto L_0x000a
                goto L_0x0011
            L_0x000a:
                com.facebook.internal.a r1 = com.facebook.internal.C2373a.f8599e     // Catch:{ all -> 0x000d }
                goto L_0x0012
            L_0x000d:
                r1 = move-exception
                p262t8.C6606a.m15600a(r0, r1)     // Catch:{ all -> 0x0027 }
            L_0x0011:
                r1 = 0
            L_0x0012:
                boolean r2 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x0027 }
                if (r2 == 0) goto L_0x0019
                goto L_0x0020
            L_0x0019:
                com.facebook.internal.C2373a.f8599e = r4     // Catch:{ all -> 0x001c }
                goto L_0x0020
            L_0x001c:
                r4 = move-exception
                p262t8.C6606a.m15600a(r0, r4)     // Catch:{ all -> 0x0027 }
            L_0x0020:
                if (r1 == 0) goto L_0x0024
                r4 = 1
                goto L_0x0025
            L_0x0024:
                r4 = 0
            L_0x0025:
                monitor-exit(r3)
                return r4
            L_0x0027:
                r4 = move-exception
                monitor-exit(r3)
                throw r4
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.internal.C2373a.C2374a.mo12539a(com.facebook.internal.a):boolean");
        }
    }

    public C2373a(int i) {
        UUID randomUUID = UUID.randomUUID();
        C24362h.m61210e(randomUUID, "randomUUID()");
        this.f8600a = i;
        this.f8601b = randomUUID;
    }

    /* renamed from: a */
    public final UUID mo12536a() {
        if (C6606a.m15601b(this)) {
            return null;
        }
        try {
            return this.f8601b;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return null;
        }
    }

    /* renamed from: b */
    public final int mo12537b() {
        if (C6606a.m15601b(this)) {
            return 0;
        }
        try {
            return this.f8600a;
        } catch (Throwable th) {
            C6606a.m15600a(this, th);
            return 0;
        }
    }

    /* renamed from: c */
    public final void mo12538c() {
        if (!C6606a.m15601b(this)) {
            try {
                f8598d.mo12539a(this);
            } catch (Throwable th) {
                C6606a.m15600a(this, th);
            }
        }
    }
}
