package wh0;

import bi0.C21077o;
import ff0.C23349c;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.coroutines.CoroutineContext;

/* renamed from: wh0.f0 */
public final class C25175f0<T> extends C21077o<T> {

    /* renamed from: e */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f63455e = AtomicIntegerFieldUpdater.newUpdater(C25175f0.class, "_decision");
    private volatile /* synthetic */ int _decision = 0;

    public C25175f0(C23349c cVar, CoroutineContext coroutineContext) {
        super(cVar, coroutineContext);
    }

    /* renamed from: G */
    public final void mo53227G(Object obj) {
        mo53229t0(obj);
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: t0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53229t0(java.lang.Object r5) {
        /*
            r4 = this;
        L_0x0000:
            int r0 = r4._decision
            r1 = 0
            r2 = 2
            r3 = 1
            if (r0 == 0) goto L_0x0016
            if (r0 != r3) goto L_0x000a
            goto L_0x001f
        L_0x000a:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "Already resumed"
            java.lang.String r0 = r0.toString()
            r5.<init>(r0)
            throw r5
        L_0x0016:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f63455e
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0022
            return
        L_0x0022:
            ff0.c<T> r0 = r4.f52892d
            ff0.c r0 = ce0.C21100e.m49351l0(r0)
            java.lang.Object r5 = p583jk.C17875h.m44287L(r5)
            r1 = 0
            p258t4.C6587a.m15521z(r0, r5, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25175f0.mo53229t0(java.lang.Object):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:0:0x0000 A[LOOP_START, MTH_ENTER_BLOCK] */
    /* renamed from: w0 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo61806w0() {
        /*
            r3 = this;
        L_0x0000:
            int r0 = r3._decision
            r1 = 0
            if (r0 == 0) goto L_0x0015
            r2 = 2
            if (r0 != r2) goto L_0x0009
            goto L_0x001f
        L_0x0009:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "Already suspended"
            java.lang.String r1 = r1.toString()
            r0.<init>(r1)
            throw r0
        L_0x0015:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = f63455e
            r2 = 1
            boolean r0 = r0.compareAndSet(r3, r1, r2)
            if (r0 == 0) goto L_0x0000
            r1 = 1
        L_0x001f:
            if (r1 == 0) goto L_0x0024
            kotlin.coroutines.intrinsics.CoroutineSingletons r0 = kotlin.coroutines.intrinsics.CoroutineSingletons.COROUTINE_SUSPENDED
            return r0
        L_0x0024:
            java.lang.Object r0 = r3.mo61779d0()
            java.lang.Object r0 = mf0.C24368m.m61234j(r0)
            boolean r1 = r0 instanceof wh0.C25219u
            if (r1 != 0) goto L_0x0031
            return r0
        L_0x0031:
            wh0.u r0 = (wh0.C25219u) r0
            java.lang.Throwable r0 = r0.f63493a
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: wh0.C25175f0.mo61806w0():java.lang.Object");
    }
}
