package com.facebook.appevents;

import p135j8.C5398d;
import p262t8.C6606a;

/* renamed from: com.facebook.appevents.h */
public final class C2336h {

    /* renamed from: a */
    public static final /* synthetic */ int f8534a = 0;

    static {
        new C2336h();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0051, code lost:
        r5 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:32:?, code lost:
        p262t8.C6606a.m15600a(r0, r5);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x005f, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static final synchronized void m6202a(androidx.lifecycle.C1042u r5) {
        /*
            java.lang.Class<com.facebook.appevents.h> r0 = com.facebook.appevents.C2336h.class
            monitor-enter(r0)
            boolean r1 = p262t8.C6606a.m15601b(r0)     // Catch:{ all -> 0x0060 }
            if (r1 == 0) goto L_0x000b
            monitor-exit(r0)
            return
        L_0x000b:
            java.lang.String r1 = "eventsToPersist"
            mf0.C24362h.m61211f(r5, r1)     // Catch:{ all -> 0x0051 }
            int r1 = p135j8.C5398d.f17731a     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.PersistedEvents r1 = com.facebook.appevents.C2318c.m6188a()     // Catch:{ all -> 0x0051 }
            java.util.Set r2 = r5.mo4333h()     // Catch:{ all -> 0x0051 }
            java.util.Iterator r2 = r2.iterator()     // Catch:{ all -> 0x0051 }
        L_0x001e:
            boolean r3 = r2.hasNext()     // Catch:{ all -> 0x0051 }
            if (r3 == 0) goto L_0x0056
            java.lang.Object r3 = r2.next()     // Catch:{ all -> 0x0051 }
            com.facebook.appevents.AccessTokenAppIdPair r3 = (com.facebook.appevents.AccessTokenAppIdPair) r3     // Catch:{ all -> 0x0051 }
            monitor-enter(r5)     // Catch:{ all -> 0x0051 }
            java.lang.String r4 = "accessTokenAppIdPair"
            mf0.C24362h.m61211f(r3, r4)     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r5.f3985a     // Catch:{ all -> 0x0053 }
            java.util.HashMap r4 = (java.util.HashMap) r4     // Catch:{ all -> 0x0053 }
            java.lang.Object r4 = r4.get(r3)     // Catch:{ all -> 0x0053 }
            com.facebook.appevents.q r4 = (com.facebook.appevents.C2353q) r4     // Catch:{ all -> 0x0053 }
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            if (r4 == 0) goto L_0x0045
            java.util.List r4 = r4.mo12512c()     // Catch:{ all -> 0x0051 }
            r1.mo12458a(r3, r4)     // Catch:{ all -> 0x0051 }
            goto L_0x001e
        L_0x0045:
            java.lang.String r5 = "Required value was null."
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException     // Catch:{ all -> 0x0051 }
            java.lang.String r5 = r5.toString()     // Catch:{ all -> 0x0051 }
            r1.<init>(r5)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0051:
            r5 = move-exception
            goto L_0x005b
        L_0x0053:
            r1 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0051 }
            throw r1     // Catch:{ all -> 0x0051 }
        L_0x0056:
            com.facebook.appevents.C2318c.m6189b(r1)     // Catch:{ all -> 0x0051 }
            monitor-exit(r0)
            return
        L_0x005b:
            p262t8.C6606a.m15600a(r0, r5)     // Catch:{ all -> 0x0060 }
            monitor-exit(r0)
            return
        L_0x0060:
            r5 = move-exception
            monitor-exit(r0)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.facebook.appevents.C2336h.m6202a(androidx.lifecycle.u):void");
    }

    /* renamed from: b */
    public static final synchronized void m6203b(AccessTokenAppIdPair accessTokenAppIdPair, C2353q qVar) {
        Class<C2336h> cls = C2336h.class;
        synchronized (cls) {
            if (!C6606a.m15601b(cls)) {
                try {
                    int i = C5398d.f17731a;
                    PersistedEvents a = C2318c.m6188a();
                    a.mo12458a(accessTokenAppIdPair, qVar.mo12512c());
                    C2318c.m6189b(a);
                } catch (Throwable th) {
                    C6606a.m15600a(cls, th);
                }
            }
        }
    }
}
