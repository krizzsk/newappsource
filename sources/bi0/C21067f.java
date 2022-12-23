package bi0;

import ci0.C21217l;
import kotlin.coroutines.CoroutineContext;
import kotlinx.coroutines.CoroutineDispatcher;
import wh0.C25157b0;
import wh0.C25171e0;
import wh0.C25190k0;
import wh0.C25192l;

/* renamed from: bi0.f */
public final class C21067f extends CoroutineDispatcher implements Runnable, C25171e0 {

    /* renamed from: d */
    public final CoroutineDispatcher f52876d;

    /* renamed from: e */
    public final int f52877e;

    /* renamed from: f */
    public final /* synthetic */ C25171e0 f52878f;

    /* renamed from: g */
    public final C21069h<Runnable> f52879g;

    /* renamed from: h */
    public final Object f52880h;
    private volatile int runningWorkers;

    public C21067f(C21217l lVar, int i) {
        C25171e0 e0Var;
        this.f52876d = lVar;
        this.f52877e = i;
        if (lVar instanceof C25171e0) {
            e0Var = (C25171e0) lVar;
        } else {
            e0Var = null;
        }
        this.f52878f = e0Var == null ? C25157b0.f63434a : e0Var;
        this.f52879g = new C21069h<>();
        this.f52880h = new Object();
    }

    /* renamed from: f */
    public final void mo53203f(long j, C25192l lVar) {
        this.f52878f.mo53203f(j, lVar);
    }

    /* renamed from: g */
    public final C25190k0 mo53204g(long j, Runnable runnable, CoroutineContext coroutineContext) {
        return this.f52878f.mo53204g(j, runnable, coroutineContext);
    }

    /* renamed from: k */
    public final void mo4335k(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z;
        this.f52879g.mo53209a(runnable);
        boolean z2 = true;
        if (this.runningWorkers >= this.f52877e) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (this.f52880h) {
                if (this.runningWorkers >= this.f52877e) {
                    z2 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z2) {
                this.f52876d.mo4335k(this, this);
            }
        }
    }

    /* renamed from: q */
    public final void mo53205q(CoroutineContext coroutineContext, Runnable runnable) {
        boolean z;
        this.f52879g.mo53209a(runnable);
        boolean z2 = true;
        if (this.runningWorkers >= this.f52877e) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            synchronized (this.f52880h) {
                if (this.runningWorkers >= this.f52877e) {
                    z2 = false;
                } else {
                    this.runningWorkers++;
                }
            }
            if (z2) {
                this.f52876d.mo53205q(this, this);
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r1 = r4.f52880h;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x002c, code lost:
        monitor-enter(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:?, code lost:
        r4.runningWorkers--;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0039, code lost:
        if (r4.f52879g.mo53211c() != 0) goto L_0x003d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:19:0x003b, code lost:
        monitor-exit(r1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:20:0x003c, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:22:?, code lost:
        r4.runningWorkers++;
        r2 = bf0.C21050d.f52856a;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r4 = this;
            r0 = 0
        L_0x0001:
            r1 = 0
        L_0x0002:
            bi0.h<java.lang.Runnable> r2 = r4.f52879g
            java.lang.Object r2 = r2.mo53212d()
            java.lang.Runnable r2 = (java.lang.Runnable) r2
            if (r2 == 0) goto L_0x002a
            r2.run()     // Catch:{ all -> 0x0010 }
            goto L_0x0016
        L_0x0010:
            r2 = move-exception
            kotlin.coroutines.EmptyCoroutineContext r3 = kotlin.coroutines.EmptyCoroutineContext.f60190b
            p389bl.C13637c.m34080w(r3, r2)
        L_0x0016:
            int r1 = r1 + 1
            r2 = 16
            if (r1 < r2) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r2 = r4.f52876d
            boolean r2 = r2.mo4336x(r4)
            if (r2 == 0) goto L_0x0002
            kotlinx.coroutines.CoroutineDispatcher r0 = r4.f52876d
            r0.mo4335k(r4, r4)
            return
        L_0x002a:
            java.lang.Object r1 = r4.f52880h
            monitor-enter(r1)
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + -1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            bi0.h<java.lang.Runnable> r2 = r4.f52879g     // Catch:{ all -> 0x0047 }
            int r2 = r2.mo53211c()     // Catch:{ all -> 0x0047 }
            if (r2 != 0) goto L_0x003d
            monitor-exit(r1)
            return
        L_0x003d:
            int r2 = r4.runningWorkers     // Catch:{ all -> 0x0047 }
            int r2 = r2 + 1
            r4.runningWorkers = r2     // Catch:{ all -> 0x0047 }
            bf0.d r2 = bf0.C21050d.f52856a     // Catch:{ all -> 0x0047 }
            monitor-exit(r1)
            goto L_0x0001
        L_0x0047:
            r0 = move-exception
            monitor-exit(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21067f.run():void");
    }
}
