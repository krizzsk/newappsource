package bi0;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* renamed from: bi0.h */
public class C21069h<E> {

    /* renamed from: a */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f52881a = AtomicReferenceFieldUpdater.newUpdater(C21069h.class, Object.class, "_cur");
    private volatile /* synthetic */ Object _cur = new C21070i(8, false);

    /* JADX WARNING: Removed duplicated region for block: B:7:0x0019 A[LOOP:1: B:7:0x0019->B:10:0x0024, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53209a(E r5) {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            bi0.i r0 = (bi0.C21070i) r0
            int r1 = r0.mo53213a(r5)
            r2 = 1
            if (r1 == 0) goto L_0x0027
            if (r1 == r2) goto L_0x0013
            r0 = 2
            if (r1 == r0) goto L_0x0011
            goto L_0x0000
        L_0x0011:
            r5 = 0
            return r5
        L_0x0013:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f52881a
            bi0.i r3 = r0.mo53217e()
        L_0x0019:
            boolean r2 = r1.compareAndSet(r4, r0, r3)
            if (r2 == 0) goto L_0x0020
            goto L_0x0000
        L_0x0020:
            java.lang.Object r2 = r1.get(r4)
            if (r2 == r0) goto L_0x0019
            goto L_0x0000
        L_0x0027:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21069h.mo53209a(java.lang.Object):boolean");
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0011 A[LOOP:1: B:4:0x0011->B:7:0x001c, LOOP_START] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53210b() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            bi0.i r0 = (bi0.C21070i) r0
            boolean r1 = r0.mo53214b()
            if (r1 == 0) goto L_0x000b
            return
        L_0x000b:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f52881a
            bi0.i r2 = r0.mo53217e()
        L_0x0011:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L_0x0018
            goto L_0x0000
        L_0x0018:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L_0x0011
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21069h.mo53210b():void");
    }

    /* renamed from: c */
    public final int mo53211c() {
        return ((C21070i) this._cur).mo53215c();
    }

    /* JADX WARNING: Removed duplicated region for block: B:4:0x0013 A[LOOP:1: B:4:0x0013->B:7:0x001e, LOOP_START] */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final E mo53212d() {
        /*
            r4 = this;
        L_0x0000:
            java.lang.Object r0 = r4._cur
            bi0.i r0 = (bi0.C21070i) r0
            java.lang.Object r1 = r0.mo53218f()
            bi0.q r2 = bi0.C21070i.f52884g
            if (r1 == r2) goto L_0x000d
            return r1
        L_0x000d:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r1 = f52881a
            bi0.i r2 = r0.mo53217e()
        L_0x0013:
            boolean r3 = r1.compareAndSet(r4, r0, r2)
            if (r3 == 0) goto L_0x001a
            goto L_0x0000
        L_0x001a:
            java.lang.Object r3 = r1.get(r4)
            if (r3 == r0) goto L_0x0013
            goto L_0x0000
        */
        throw new UnsupportedOperationException("Method not decompiled: bi0.C21069h.mo53212d():java.lang.Object");
    }
}
