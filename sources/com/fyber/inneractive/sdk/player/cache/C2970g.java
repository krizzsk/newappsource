package com.fyber.inneractive.sdk.player.cache;

/* renamed from: com.fyber.inneractive.sdk.player.cache.g */
public class C2970g implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ C2971h f10168a;

    public C2970g(C2971h hVar) {
        this.f10168a = hVar;
    }

    /* JADX WARNING: Removed duplicated region for block: B:25:0x0060  */
    /* JADX WARNING: Removed duplicated region for block: B:26:0x0066  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void run() {
        /*
            r10 = this;
            r0 = 1
            r1 = 0
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r3 = r2.f10171c     // Catch:{ IOException -> 0x0042 }
            if (r3 != 0) goto L_0x0016
            com.fyber.inneractive.sdk.player.cache.c r3 = r2.f10170b     // Catch:{ IOException -> 0x0042 }
            java.lang.String r2 = r2.mo13788a()     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r2 = r3.mo13757b(r2)     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f10168a     // Catch:{ IOException -> 0x0042 }
            r3.f10171c = r2     // Catch:{ IOException -> 0x0042 }
        L_0x0016:
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$f r3 = r2.f10171c     // Catch:{ IOException -> 0x0042 }
            if (r3 != 0) goto L_0x0040
            com.fyber.inneractive.sdk.player.cache.c r3 = r2.f10170b     // Catch:{ IOException -> 0x0042 }
            java.lang.String r2 = r2.mo13788a()     // Catch:{ IOException -> 0x0042 }
            com.fyber.inneractive.sdk.player.cache.c$c r2 = r3.mo13754a((java.lang.String) r2)     // Catch:{ IOException -> 0x0042 }
            if (r2 != 0) goto L_0x002a
            r3 = 1
            goto L_0x002b
        L_0x002a:
            r3 = 0
        L_0x002b:
            if (r2 == 0) goto L_0x005e
            r2.mo13770a()     // Catch:{ IOException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a     // Catch:{ IOException -> 0x003e }
            com.fyber.inneractive.sdk.player.cache.c$f r4 = r2.f10171c     // Catch:{ IOException -> 0x003e }
            if (r4 != 0) goto L_0x005e
            com.fyber.inneractive.sdk.player.cache.h$e r2 = r2.f10176h     // Catch:{ IOException -> 0x003e }
            if (r2 == 0) goto L_0x005e
            r2.start()     // Catch:{ IOException -> 0x003e }
            return
        L_0x003e:
            r2 = move-exception
            goto L_0x0044
        L_0x0040:
            r3 = 0
            goto L_0x005e
        L_0x0042:
            r2 = move-exception
            r3 = 0
        L_0x0044:
            r4 = 2
            java.lang.Object[] r4 = new java.lang.Object[r4]
            com.fyber.inneractive.sdk.player.cache.h r5 = r10.f10168a
            java.lang.String r6 = r5.f10169a
            r4[r1] = r6
            java.lang.String r5 = r5.mo13788a()
            r4[r0] = r5
            java.lang.String r5 = "%s | Exception raised waiting on availbility for %s"
            java.lang.String r4 = java.lang.String.format(r5, r4)
            java.lang.Object[] r5 = new java.lang.Object[r1]
            com.fyber.inneractive.sdk.util.IAlog.m9901a(r4, r2, r5)
        L_0x005e:
            if (r3 == 0) goto L_0x0066
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a
            com.fyber.inneractive.sdk.player.cache.C2971h.m7324b(r0, r1)
            goto L_0x00d5
        L_0x0066:
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a
            boolean unused = r2.getClass()
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a
            boolean unused = r2.f10183o = r1
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a
            java.lang.String r4 = r2.mo13788a()
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f10168a
            java.lang.String r5 = r3.f10173e
            com.fyber.inneractive.sdk.player.cache.c r6 = r3.f10170b
            java.lang.String r3 = r3.mo13788a()
            java.io.File r6 = r6.mo13755a(r3, r1)
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f10168a
            java.lang.String r8 = r3.f10180l
            com.fyber.inneractive.sdk.player.cache.a r9 = new com.fyber.inneractive.sdk.player.cache.a
            r7 = 0
            r3 = r9
            r3.<init>(r4, r5, r6, r7, r8)
            r2.f10174f = r9
            com.fyber.inneractive.sdk.player.cache.h r2 = r10.f10168a
            com.fyber.inneractive.sdk.player.cache.a r2 = r2.f10174f
            java.lang.Object r2 = r2.f10110d
            monitor-enter(r2)
            com.fyber.inneractive.sdk.player.cache.h r3 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r3 = r3.f10174f     // Catch:{ all -> 0x00d6 }
            java.io.File r3 = r3.f10107a     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x00a7
            boolean r3 = r3.exists()     // Catch:{ all -> 0x00d6 }
            if (r3 == 0) goto L_0x00a7
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x00cf
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.b r1 = r0.f10172d     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r3 = r0.f10174f     // Catch:{ all -> 0x00d6 }
            java.lang.String r0 = r0.f10180l     // Catch:{ all -> 0x00d6 }
            r1.mo13753a(r3, r0)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r1 = r0.f10174f     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.b r0 = r0.f10172d     // Catch:{ all -> 0x00d6 }
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f10113a     // Catch:{ all -> 0x00d6 }
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f10111e     // Catch:{ all -> 0x00d6 }
            r1.putAll(r0)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.a r1 = r0.f10174f     // Catch:{ all -> 0x00d6 }
            r0.mo13789a((com.fyber.inneractive.sdk.player.cache.C2953a) r1)     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            r0.mo13792b()     // Catch:{ all -> 0x00d6 }
            goto L_0x00d4
        L_0x00cf:
            com.fyber.inneractive.sdk.player.cache.h r0 = r10.f10168a     // Catch:{ all -> 0x00d6 }
            com.fyber.inneractive.sdk.player.cache.C2971h.m7324b(r0, r1)     // Catch:{ all -> 0x00d6 }
        L_0x00d4:
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
        L_0x00d5:
            return
        L_0x00d6:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ all -> 0x00d6 }
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.cache.C2970g.run():void");
    }
}
