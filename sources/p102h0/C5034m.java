package p102h0;

import p695od.C18728c;

/* renamed from: h0.m */
public final class C5034m implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ int f17004b;

    /* renamed from: c */
    public final /* synthetic */ C18728c f17005c;

    /* renamed from: d */
    public final /* synthetic */ C5035n f17006d;

    public C5034m(C5035n nVar, int i, C18728c cVar) {
        this.f17006d = nVar;
        this.f17004b = i;
        this.f17005c = cVar;
    }

    /* JADX WARNING: Missing exception handler attribute for start block: B:52:0x00b6 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r10 = this;
            h0.n r0 = r10.f17006d
            int r1 = r10.f17004b
            od.c r2 = r10.f17005c
            java.lang.String r3 = "Less than 0 remaining futures"
            java.util.ArrayList r4 = r0.f17008c
            boolean r5 = r0.isDone()
            if (r5 != 0) goto L_0x0109
            if (r4 != 0) goto L_0x0014
            goto L_0x0109
        L_0x0014:
            r5 = 0
            r6 = 1
            r7 = 0
            boolean r8 = r2.isDone()     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.lang.String r9 = "Tried to set value from future which is not done"
            mf0.C24361g.m61193w(r9, r8)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.lang.Object r2 = p102h0.C5023g.m12856d(r2)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            r4.set(r1, r2)     // Catch:{ CancellationException -> 0x00b6, ExecutionException -> 0x008d, RuntimeException -> 0x0068, Error -> 0x0046 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f17010e
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x0030
            goto L_0x0031
        L_0x0030:
            r6 = 0
        L_0x0031:
            mf0.C24361g.m61193w(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f17008c
            if (r1 == 0) goto L_0x00db
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x0043:
            r1 = move-exception
            goto L_0x00e3
        L_0x0046:
            r1 = move-exception
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r2 = r0.f17012g     // Catch:{ all -> 0x0043 }
            r2.mo2698c(r1)     // Catch:{ all -> 0x0043 }
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f17010e
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x0055
            goto L_0x0056
        L_0x0055:
            r6 = 0
        L_0x0056:
            mf0.C24361g.m61193w(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f17008c
            if (r1 == 0) goto L_0x00db
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x0068:
            r1 = move-exception
            boolean r2 = r0.f17009d     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x0072
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r2 = r0.f17012g     // Catch:{ all -> 0x0043 }
            r2.mo2698c(r1)     // Catch:{ all -> 0x0043 }
        L_0x0072:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f17010e
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x007b
            goto L_0x007c
        L_0x007b:
            r6 = 0
        L_0x007c:
            mf0.C24361g.m61193w(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f17008c
            if (r1 == 0) goto L_0x00db
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x008d:
            r1 = move-exception
            boolean r2 = r0.f17009d     // Catch:{ all -> 0x0043 }
            if (r2 == 0) goto L_0x009b
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r2 = r0.f17012g     // Catch:{ all -> 0x0043 }
            java.lang.Throwable r1 = r1.getCause()     // Catch:{ all -> 0x0043 }
            r2.mo2698c(r1)     // Catch:{ all -> 0x0043 }
        L_0x009b:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f17010e
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x00a4
            goto L_0x00a5
        L_0x00a4:
            r6 = 0
        L_0x00a5:
            mf0.C24361g.m61193w(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f17008c
            if (r1 == 0) goto L_0x00db
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
            goto L_0x00d7
        L_0x00b6:
            boolean r1 = r0.f17009d     // Catch:{ all -> 0x0043 }
            if (r1 == 0) goto L_0x00bd
            r0.cancel(r7)     // Catch:{ all -> 0x0043 }
        L_0x00bd:
            java.util.concurrent.atomic.AtomicInteger r1 = r0.f17010e
            int r1 = r1.decrementAndGet()
            if (r1 < 0) goto L_0x00c6
            goto L_0x00c7
        L_0x00c6:
            r6 = 0
        L_0x00c7:
            mf0.C24361g.m61193w(r3, r6)
            if (r1 != 0) goto L_0x0110
            java.util.ArrayList r1 = r0.f17008c
            if (r1 == 0) goto L_0x00db
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>(r1)
        L_0x00d7:
            r0.mo2697b(r2)
            goto L_0x0110
        L_0x00db:
            boolean r0 = r0.isDone()
            mf0.C24361g.m61193w(r5, r0)
            goto L_0x0110
        L_0x00e3:
            java.util.concurrent.atomic.AtomicInteger r2 = r0.f17010e
            int r2 = r2.decrementAndGet()
            if (r2 < 0) goto L_0x00ec
            goto L_0x00ed
        L_0x00ec:
            r6 = 0
        L_0x00ed:
            mf0.C24361g.m61193w(r3, r6)
            if (r2 != 0) goto L_0x0108
            java.util.ArrayList r2 = r0.f17008c
            if (r2 == 0) goto L_0x0101
            androidx.concurrent.futures.CallbackToFutureAdapter$a<java.util.List<V>> r0 = r0.f17012g
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>(r2)
            r0.mo2697b(r3)
            goto L_0x0108
        L_0x0101:
            boolean r0 = r0.isDone()
            mf0.C24361g.m61193w(r5, r0)
        L_0x0108:
            throw r1
        L_0x0109:
            boolean r0 = r0.f17009d
            java.lang.String r1 = "Future was done before all dependencies completed"
            mf0.C24361g.m61193w(r1, r0)
        L_0x0110:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p102h0.C5034m.run():void");
    }
}
