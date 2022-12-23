package p906wz;

import b00.C13556a;
import java.util.concurrent.atomic.AtomicBoolean;
import mf0.C24362h;
import p906wz.C20431c;
import p906wz.C20436g;
import yh0.C25319k;

/* renamed from: wz.a */
public final class C20429a<RQ extends C20431c<RQ, RS>, RS extends C20436g<RQ, RS>> implements Runnable, C13556a {

    /* renamed from: b */
    public final RQ f51751b;

    /* renamed from: c */
    public final C25319k<RS> f51752c;

    /* renamed from: d */
    public final AtomicBoolean f51753d = new AtomicBoolean(false);

    public C20429a(RQ rq, C25319k<? super RS> kVar) {
        C24362h.m61211f(rq, "request");
        C24362h.m61211f(kVar, "producer");
        this.f51751b = rq;
        this.f51752c = kVar;
    }

    public final boolean cancel(boolean z) {
        this.f51753d.set(true);
        return true;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:32:0x0060, code lost:
        r5.f51752c.mo61909q().mo60342E((java.lang.Throwable) null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:33:0x0069, code lost:
        return;
     */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x001b A[Catch:{ all -> 0x0016, all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x001c A[Catch:{ all -> 0x0016, all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0037 A[Catch:{ all -> 0x0016, all -> 0x006a }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0060 A[EDGE_INSN: B:37:0x0060->B:32:0x0060 ?: BREAK  , SYNTHETIC] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void run() {
        /*
            r5 = this;
            r0 = 0
            r1 = 0
            r2 = 1
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.f51753d     // Catch:{ all -> 0x0016 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0016 }
            if (r3 != 0) goto L_0x0018
            yh0.k<RS> r3 = r5.f51752c     // Catch:{ all -> 0x0016 }
            boolean r3 = r3.mo60343F()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0014
            goto L_0x0018
        L_0x0014:
            r3 = 0
            goto L_0x0019
        L_0x0016:
            r3 = move-exception
            goto L_0x0053
        L_0x0018:
            r3 = 1
        L_0x0019:
            if (r3 == 0) goto L_0x001c
            goto L_0x003f
        L_0x001c:
            RQ r3 = r5.f51751b     // Catch:{ all -> 0x0016 }
            r3.mo5818H()     // Catch:{ all -> 0x0016 }
        L_0x0021:
            java.util.concurrent.atomic.AtomicBoolean r3 = r5.f51753d     // Catch:{ all -> 0x0016 }
            boolean r3 = r3.get()     // Catch:{ all -> 0x0016 }
            if (r3 != 0) goto L_0x0034
            yh0.k<RS> r3 = r5.f51752c     // Catch:{ all -> 0x0016 }
            boolean r3 = r3.mo60343F()     // Catch:{ all -> 0x0016 }
            if (r3 == 0) goto L_0x0032
            goto L_0x0034
        L_0x0032:
            r3 = 0
            goto L_0x0035
        L_0x0034:
            r3 = 1
        L_0x0035:
            if (r3 != 0) goto L_0x0060
            RQ r3 = r5.f51751b     // Catch:{ all -> 0x0016 }
            wz.g r3 = r3.mo40051G()     // Catch:{ all -> 0x0016 }
            if (r3 != 0) goto L_0x0049
        L_0x003f:
            yh0.k<RS> r1 = r5.f51752c
            yh0.j r1 = r1.mo61909q()
            r1.mo60342E(r0)
            return
        L_0x0049:
            yh0.k<RS> r4 = r5.f51752c     // Catch:{ all -> 0x0016 }
            java.lang.Object r3 = kotlinx.coroutines.channels.C24198b.m60667a(r4, r3)     // Catch:{ all -> 0x0016 }
            yh0.C25312f.m63570a(r3)     // Catch:{ all -> 0x0016 }
            goto L_0x0021
        L_0x0053:
            java.util.concurrent.atomic.AtomicBoolean r4 = r5.f51753d     // Catch:{ all -> 0x006a }
            boolean r1 = r4.compareAndSet(r1, r2)     // Catch:{ all -> 0x006a }
            if (r1 == 0) goto L_0x0060
            yh0.k<RS> r1 = r5.f51752c     // Catch:{ all -> 0x006a }
            p389bl.C13637c.m34071k(r1, r3)     // Catch:{ all -> 0x006a }
        L_0x0060:
            yh0.k<RS> r1 = r5.f51752c
            yh0.j r1 = r1.mo61909q()
            r1.mo60342E(r0)
            return
        L_0x006a:
            r1 = move-exception
            yh0.k<RS> r2 = r5.f51752c
            yh0.j r2 = r2.mo61909q()
            r2.mo60342E(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: p906wz.C20429a.run():void");
    }
}
