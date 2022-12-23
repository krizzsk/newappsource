package p028ba;

import p275u9.C6738j;
import p275u9.C6751s;

/* renamed from: ba.b */
public final /* synthetic */ class C1508b implements Runnable {

    /* renamed from: b */
    public final /* synthetic */ C1515i f5420b;

    /* renamed from: c */
    public final /* synthetic */ C6751s f5421c;

    /* renamed from: d */
    public final /* synthetic */ int f5422d;

    /* renamed from: e */
    public final /* synthetic */ Runnable f5423e;

    public /* synthetic */ C1508b(C1515i iVar, C6738j jVar, int i, Runnable runnable) {
        this.f5420b = iVar;
        this.f5421c = jVar;
        this.f5422d = i;
        this.f5423e = runnable;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(2:12|13) */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x0046, code lost:
        r0 = move-exception;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:?, code lost:
        r0.f5445d.mo5853a(r1, r2 + 1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0052, code lost:
        r3.run();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0055, code lost:
        throw r0;
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x0048 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r9 = this;
            ba.i r0 = r9.f5420b
            u9.s r1 = r9.f5421c
            int r2 = r9.f5422d
            java.lang.Runnable r3 = r9.f5423e
            r0.getClass()
            r4 = 1
            da.a r5 = r0.f5447f     // Catch:{ SynchronizationException -> 0x0048 }
            ca.d r6 = r0.f5444c     // Catch:{ SynchronizationException -> 0x0048 }
            java.util.Objects.requireNonNull(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            d0.k0 r7 = new d0.k0     // Catch:{ SynchronizationException -> 0x0048 }
            r8 = 3
            r7.<init>(r6, r8)     // Catch:{ SynchronizationException -> 0x0048 }
            r5.mo6658a(r7)     // Catch:{ SynchronizationException -> 0x0048 }
            android.content.Context r5 = r0.f5442a     // Catch:{ SynchronizationException -> 0x0048 }
            java.lang.String r6 = "connectivity"
            java.lang.Object r5 = r5.getSystemService(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            android.net.ConnectivityManager r5 = (android.net.ConnectivityManager) r5     // Catch:{ SynchronizationException -> 0x0048 }
            android.net.NetworkInfo r5 = r5.getActiveNetworkInfo()     // Catch:{ SynchronizationException -> 0x0048 }
            if (r5 == 0) goto L_0x0034
            boolean r5 = r5.isConnected()     // Catch:{ SynchronizationException -> 0x0048 }
            if (r5 == 0) goto L_0x0034
            r5 = 1
            goto L_0x0035
        L_0x0034:
            r5 = 0
        L_0x0035:
            if (r5 != 0) goto L_0x0042
            da.a r5 = r0.f5447f     // Catch:{ SynchronizationException -> 0x0048 }
            ba.c r6 = new ba.c     // Catch:{ SynchronizationException -> 0x0048 }
            r6.<init>(r0, r1, r2)     // Catch:{ SynchronizationException -> 0x0048 }
            r5.mo6658a(r6)     // Catch:{ SynchronizationException -> 0x0048 }
            goto L_0x004e
        L_0x0042:
            r0.mo5860a(r1, r2)     // Catch:{ SynchronizationException -> 0x0048 }
            goto L_0x004e
        L_0x0046:
            r0 = move-exception
            goto L_0x0052
        L_0x0048:
            ba.m r0 = r0.f5445d     // Catch:{ all -> 0x0046 }
            int r2 = r2 + r4
            r0.mo5853a(r1, r2)     // Catch:{ all -> 0x0046 }
        L_0x004e:
            r3.run()
            return
        L_0x0052:
            r3.run()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: p028ba.C1508b.run():void");
    }
}
