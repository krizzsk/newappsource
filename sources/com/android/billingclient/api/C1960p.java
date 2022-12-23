package com.android.billingclient.api;

/* renamed from: com.android.billingclient.api.p */
public final /* synthetic */ class C1960p implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f6784b;

    /* renamed from: c */
    public final /* synthetic */ Object f6785c;

    public /* synthetic */ C1960p(Object obj, int i) {
        this.f6784b = i;
        this.f6785c = obj;
    }

    /* JADX WARNING: Removed duplicated region for block: B:18:0x007a A[Catch:{ IOException -> 0x0082 }] */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x003e A[SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r13 = this;
            int r0 = r13.f6784b
            r1 = 0
            r2 = 0
            switch(r0) {
                case 0: goto L_0x0008;
                default: goto L_0x0007;
            }
        L_0x0007:
            goto L_0x001a
        L_0x0008:
            java.lang.Object r0 = r13.f6785c
            com.android.billingclient.api.r r0 = (com.android.billingclient.api.C1962r) r0
            com.android.billingclient.api.c r3 = r0.f6790e
            r3.f6738a = r2
            com.android.billingclient.api.c r2 = r0.f6790e
            r2.f6743f = r1
            com.android.billingclient.api.f r1 = com.android.billingclient.api.C1964t.f6804l
            r0.mo9581a(r1)
            return
        L_0x001a:
            java.lang.Object r0 = r13.f6785c
            com.google.android.play.core.assetpacks.r2 r0 = (com.google.android.play.core.assetpacks.C14313r2) r0
            dd.c0 r3 = r0.f36020b
            java.lang.Object r3 = r3.zza()
            com.google.android.play.core.assetpacks.y2 r3 = (com.google.android.play.core.assetpacks.C14341y2) r3
            com.google.android.play.core.assetpacks.a0 r4 = r0.f36019a
            r4.getClass()
            java.util.HashMap r5 = new java.util.HashMap
            r5.<init>()
            java.util.HashMap r6 = new java.util.HashMap
            r6.<init>()
            r7 = 1
            java.util.ArrayList r8 = r4.mo42790e()     // Catch:{ IOException -> 0x0082 }
            java.util.Iterator r8 = r8.iterator()     // Catch:{ IOException -> 0x0082 }
        L_0x003e:
            boolean r9 = r8.hasNext()     // Catch:{ IOException -> 0x0082 }
            if (r9 == 0) goto L_0x008e
            java.lang.Object r9 = r8.next()     // Catch:{ IOException -> 0x0082 }
            java.io.File r9 = (java.io.File) r9     // Catch:{ IOException -> 0x0082 }
            java.lang.String r10 = r9.getName()     // Catch:{ IOException -> 0x0082 }
            java.lang.String r10 = r4.mo42796m(r10)     // Catch:{ IOException -> 0x0082 }
            if (r10 != 0) goto L_0x0055
            goto L_0x006d
        L_0x0055:
            java.io.File r11 = new java.io.File     // Catch:{ IOException -> 0x0082 }
            java.lang.String r12 = "assets"
            r11.<init>(r10, r12)     // Catch:{ IOException -> 0x0082 }
            boolean r12 = r11.isDirectory()     // Catch:{ IOException -> 0x0082 }
            if (r12 != 0) goto L_0x006f
            androidx.appcompat.app.r r10 = com.google.android.play.core.assetpacks.C14243a0.f35789c     // Catch:{ IOException -> 0x0082 }
            java.lang.Object[] r12 = new java.lang.Object[r7]     // Catch:{ IOException -> 0x0082 }
            r12[r2] = r11     // Catch:{ IOException -> 0x0082 }
            java.lang.String r11 = "Failed to find assets directory: %s"
            r10.mo975b(r11, r12)     // Catch:{ IOException -> 0x0082 }
        L_0x006d:
            r12 = r1
            goto L_0x0078
        L_0x006f:
            java.lang.String r11 = r11.getCanonicalPath()     // Catch:{ IOException -> 0x0082 }
            com.google.android.play.core.assetpacks.e0 r12 = new com.google.android.play.core.assetpacks.e0     // Catch:{ IOException -> 0x0082 }
            r12.<init>(r2, r10, r11)     // Catch:{ IOException -> 0x0082 }
        L_0x0078:
            if (r12 == 0) goto L_0x003e
            java.lang.String r9 = r9.getName()     // Catch:{ IOException -> 0x0082 }
            r6.put(r9, r12)     // Catch:{ IOException -> 0x0082 }
            goto L_0x003e
        L_0x0082:
            r1 = move-exception
            androidx.appcompat.app.r r8 = com.google.android.play.core.assetpacks.C14243a0.f35789c
            java.lang.Object[] r7 = new java.lang.Object[r7]
            r7[r2] = r1
            java.lang.String r1 = "Could not process directory while scanning installed packs: %s"
            r8.mo975b(r1, r7)
        L_0x008e:
            java.util.Set r1 = r6.keySet()
            java.util.Iterator r1 = r1.iterator()
        L_0x0096:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x00ae
            java.lang.Object r2 = r1.next()
            java.lang.String r2 = (java.lang.String) r2
            long r6 = r4.mo42792i(r2)
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            r5.put(r2, r6)
            goto L_0x0096
        L_0x00ae:
            id.o r1 = r3.mo42874c(r5)
            dd.c0 r2 = r0.f36022d
            java.lang.Object r2 = r2.zza()
            java.util.concurrent.Executor r2 = (java.util.concurrent.Executor) r2
            com.google.android.play.core.assetpacks.a0 r3 = r0.f36019a
            r3.getClass()
            androidx.appcompat.app.r r4 = new androidx.appcompat.app.r
            r5 = 6
            r4.<init>(r3, r5)
            id.k r3 = r1.f45199b
            id.i r5 = new id.i
            r5.<init>(r2, r4)
            r3.mo50022a(r5)
            r1.mo50029b()
            dd.c0 r0 = r0.f36022d
            java.lang.Object r0 = r0.zza()
            java.util.concurrent.Executor r0 = (java.util.concurrent.Executor) r0
            m9.b r2 = p172m9.C5720b.f18547c
            id.k r3 = r1.f45199b
            id.g r4 = new id.g
            r4.<init>(r0, r2)
            r3.mo50022a(r4)
            r1.mo50029b()
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.android.billingclient.api.C1960p.run():void");
    }
}
