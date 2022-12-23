package p336z8;

import com.facebook.internal.CallbackManagerImpl;

/* renamed from: z8.c */
public final /* synthetic */ class C7503c implements CallbackManagerImpl.C2365a {

    /* renamed from: a */
    public final /* synthetic */ int f22978a;

    public /* synthetic */ C7503c(int i) {
        this.f22978a = i;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:20:0x0038 A[Catch:{ all -> 0x0020 }] */
    /* JADX WARNING: Removed duplicated region for block: B:27:0x0047  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo12522a(int r8, android.content.Intent r9) {
        /*
            r7 = this;
            int r8 = r7.f22978a
            z8.d r0 = new z8.d
            r0.<init>()
            java.lang.Class<com.facebook.internal.z> r1 = com.facebook.internal.C2440z.class
            java.util.UUID r2 = com.facebook.internal.C2440z.m6403i(r9)
            r3 = 0
            if (r2 != 0) goto L_0x0011
            goto L_0x0041
        L_0x0011:
            com.facebook.internal.a$a r4 = com.facebook.internal.C2373a.f8598d
            monitor-enter(r4)
            java.lang.Class<com.facebook.internal.a> r5 = com.facebook.internal.C2373a.class
            boolean r6 = p262t8.C6606a.m15601b(r5)     // Catch:{ all -> 0x003d }
            if (r6 == 0) goto L_0x001d
            goto L_0x0024
        L_0x001d:
            com.facebook.internal.a r5 = com.facebook.internal.C2373a.f8599e     // Catch:{ all -> 0x0020 }
            goto L_0x0025
        L_0x0020:
            r6 = move-exception
            p262t8.C6606a.m15600a(r5, r6)     // Catch:{ all -> 0x003d }
        L_0x0024:
            r5 = r3
        L_0x0025:
            if (r5 == 0) goto L_0x0040
            java.util.UUID r6 = r5.mo12536a()     // Catch:{ all -> 0x003d }
            boolean r2 = mf0.C24362h.m61206a(r6, r2)     // Catch:{ all -> 0x003d }
            if (r2 == 0) goto L_0x0040
            int r2 = r5.mo12537b()     // Catch:{ all -> 0x003d }
            if (r2 == r8) goto L_0x0038
            goto L_0x0040
        L_0x0038:
            r4.mo12539a(r3)     // Catch:{ all -> 0x003d }
            monitor-exit(r4)
            goto L_0x0042
        L_0x003d:
            r8 = move-exception
            goto L_0x00c2
        L_0x0040:
            monitor-exit(r4)
        L_0x0041:
            r5 = r3
        L_0x0042:
            r8 = 0
            if (r5 != 0) goto L_0x0047
            goto L_0x00c1
        L_0x0047:
            com.facebook.internal.y r2 = com.facebook.internal.C2438y.f8734a
            java.util.UUID r2 = r5.mo12536a()
            java.lang.String r4 = "callId"
            mf0.C24362h.m61211f(r2, r4)
            java.io.File r8 = com.facebook.internal.C2438y.m6397e(r2, r8)
            if (r8 != 0) goto L_0x0059
            goto L_0x005c
        L_0x0059:
            kf0.C23775c.m58350Q0(r8)
        L_0x005c:
            r8 = 1
            if (r9 == 0) goto L_0x0089
            boolean r2 = p262t8.C6606a.m15601b(r1)
            if (r2 == 0) goto L_0x0066
            goto L_0x0083
        L_0x0066:
            boolean r2 = com.facebook.internal.C2440z.m6408o(r9)     // Catch:{ all -> 0x007f }
            if (r2 != 0) goto L_0x006d
            goto L_0x0083
        L_0x006d:
            android.os.Bundle r2 = com.facebook.internal.C2440z.m6402h(r9)     // Catch:{ all -> 0x007f }
            if (r2 == 0) goto L_0x007a
            java.lang.String r4 = "error"
            android.os.Bundle r2 = r2.getBundle(r4)     // Catch:{ all -> 0x007f }
            goto L_0x0084
        L_0x007a:
            android.os.Bundle r2 = r9.getExtras()     // Catch:{ all -> 0x007f }
            goto L_0x0084
        L_0x007f:
            r2 = move-exception
            p262t8.C6606a.m15600a(r1, r2)
        L_0x0083:
            r2 = r3
        L_0x0084:
            com.facebook.FacebookException r2 = com.facebook.internal.C2440z.m6404j(r2)
            goto L_0x008a
        L_0x0089:
            r2 = r3
        L_0x008a:
            if (r2 == 0) goto L_0x0098
            boolean r9 = r2 instanceof com.facebook.FacebookOperationCanceledException
            if (r9 == 0) goto L_0x0094
            r0.mo23769p(r5)
            goto L_0x00c1
        L_0x0094:
            r0.mo23770q(r5, r2)
            goto L_0x00c1
        L_0x0098:
            if (r9 == 0) goto L_0x00be
            boolean r2 = p262t8.C6606a.m15601b(r1)
            if (r2 == 0) goto L_0x00a1
            goto L_0x00be
        L_0x00a1:
            int r2 = com.facebook.internal.C2440z.m6407n(r9)     // Catch:{ all -> 0x00ba }
            android.os.Bundle r9 = r9.getExtras()     // Catch:{ all -> 0x00ba }
            boolean r2 = com.facebook.internal.C2440z.m6409p(r2)     // Catch:{ all -> 0x00ba }
            if (r2 == 0) goto L_0x00b8
            if (r9 != 0) goto L_0x00b2
            goto L_0x00b8
        L_0x00b2:
            java.lang.String r2 = "com.facebook.platform.protocol.RESULT_ARGS"
            android.os.Bundle r9 = r9.getBundle(r2)     // Catch:{ all -> 0x00ba }
        L_0x00b8:
            r3 = r9
            goto L_0x00be
        L_0x00ba:
            r9 = move-exception
            p262t8.C6606a.m15600a(r1, r9)
        L_0x00be:
            r0.mo23771r(r5, r3)
        L_0x00c1:
            return r8
        L_0x00c2:
            monitor-exit(r4)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: p336z8.C7503c.mo12522a(int, android.content.Intent):boolean");
    }
}
