package com.google.android.play.core.assetpacks;

/* renamed from: com.google.android.play.core.assetpacks.w1 */
public final /* synthetic */ class C14332w1 implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f36104b;

    /* renamed from: c */
    public final /* synthetic */ Object f36105c;

    public /* synthetic */ C14332w1(Object obj, int i) {
        this.f36104b = i;
        this.f36105c = obj;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:?, code lost:
        return;
     */
    /* JADX WARNING: Exception block dominator not found, dom blocks: [] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            int r0 = r9.f36104b
            r1 = 1
            switch(r0) {
                case 0: goto L_0x0030;
                case 1: goto L_0x0008;
                default: goto L_0x0006;
            }
        L_0x0006:
            goto L_0x008e
        L_0x0008:
            java.lang.Object r0 = r9.f36105c
            android.content.Context r0 = (android.content.Context) r0
            java.util.concurrent.atomic.AtomicReference r2 = p506gd.C17170a.f44404e
            java.lang.Class<hd.k> r2 = p530hd.C17386k.class
            monitor-enter(r2)     // Catch:{ SecurityException -> 0x002f }
            hd.k r3 = p530hd.C17386k.f44780j     // Catch:{ all -> 0x002c }
            if (r3 != 0) goto L_0x001e
            hd.k r3 = new hd.k     // Catch:{ all -> 0x002c }
            com.google.android.play.core.splitinstall.zzo r4 = com.google.android.play.core.splitinstall.zzo.INSTANCE     // Catch:{ all -> 0x002c }
            r3.<init>(r0, r4)     // Catch:{ all -> 0x002c }
            p530hd.C17386k.f44780j = r3     // Catch:{ all -> 0x002c }
        L_0x001e:
            hd.k r0 = p530hd.C17386k.f44780j     // Catch:{ all -> 0x002c }
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x002f }
            monitor-enter(r0)     // Catch:{ SecurityException -> 0x002f }
            r0.f43767f = r1     // Catch:{ all -> 0x0029 }
            r0.mo49481b()     // Catch:{ all -> 0x0029 }
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x002f }
            goto L_0x002f
        L_0x0029:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ SecurityException -> 0x002f }
            throw r1     // Catch:{ SecurityException -> 0x002f }
        L_0x002c:
            r0 = move-exception
            monitor-exit(r2)     // Catch:{ SecurityException -> 0x002f }
            throw r0     // Catch:{ SecurityException -> 0x002f }
        L_0x002f:
            return
        L_0x0030:
            java.lang.Object r0 = r9.f36105c
            com.google.android.play.core.assetpacks.a0 r0 = (com.google.android.play.core.assetpacks.C14243a0) r0
            java.util.ArrayList r1 = r0.mo42790e()
            java.util.Iterator r1 = r1.iterator()
        L_0x003c:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x008d
            java.lang.Object r2 = r1.next()
            java.io.File r2 = (java.io.File) r2
            java.io.File[] r3 = r2.listFiles()
            if (r3 == 0) goto L_0x003c
            com.google.android.play.core.assetpacks.C14243a0.m35458f(r2)
            r3 = 0
            long r4 = com.google.android.play.core.assetpacks.C14243a0.m35457b(r2, r3)
            com.google.android.play.core.assetpacks.c2 r6 = r0.f35791b
            int r6 = r6.mo42806a()
            long r6 = (long) r6
            int r8 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
            if (r8 == 0) goto L_0x007e
            java.io.File r6 = new java.io.File
            java.io.File r7 = new java.io.File
            java.lang.String r4 = java.lang.String.valueOf(r4)
            r7.<init>(r2, r4)
            java.lang.String r4 = "stale.tmp"
            r6.<init>(r7, r4)
            r6.createNewFile()     // Catch:{ IOException -> 0x0075 }
            goto L_0x007e
        L_0x0075:
            androidx.appcompat.app.r r4 = com.google.android.play.core.assetpacks.C14243a0.f35789c
            java.lang.Object[] r5 = new java.lang.Object[r3]
            java.lang.String r6 = "Could not write staleness marker."
            r4.mo975b(r6, r5)
        L_0x007e:
            java.io.File[] r2 = r2.listFiles()
            int r4 = r2.length
        L_0x0083:
            if (r3 >= r4) goto L_0x003c
            r5 = r2[r3]
            com.google.android.play.core.assetpacks.C14243a0.m35458f(r5)
            int r3 = r3 + 1
            goto L_0x0083
        L_0x008d:
            return
        L_0x008e:
            java.lang.Object r0 = r9.f36105c
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            java.lang.ThreadLocal r2 = p627lg.C18209h.f46467c
            java.lang.Object r2 = r2.get()
            java.util.Deque r2 = (java.util.Deque) r2
            com.google.android.gms.common.internal.Preconditions.checkNotNull(r2)
            r2.add(r0)
            int r3 = r2.size()
            if (r3 > r1) goto L_0x00b4
        L_0x00a6:
            r0.run()
            r2.removeFirst()
            java.lang.Object r0 = r2.peekFirst()
            java.lang.Runnable r0 = (java.lang.Runnable) r0
            if (r0 != 0) goto L_0x00a6
        L_0x00b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.android.play.core.assetpacks.C14332w1.run():void");
    }
}
