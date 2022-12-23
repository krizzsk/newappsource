package p988j$.util.stream;

import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.N */
final class C26082N extends C26148d {

    /* renamed from: j */
    private final C26057H f64786j;

    C26082N(C26057H h, C26239v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f64786j = h;
    }

    C26082N(C26082N n, Spliterator spliterator) {
        super((C26148d) n, spliterator);
        this.f64786j = n.f64786j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:21:0x0046 A[LOOP:2: B:21:0x0046->B:24:0x0051, LOOP_START] */
    /* JADX WARNING: Removed duplicated region for block: B:4:0x0020 A[LOOP:0: B:4:0x0020->B:7:0x002b, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84333a() {
        /*
            r5 = this;
            j$.util.stream.v0 r0 = r5.f64913a
            j$.util.stream.H r1 = r5.f64786j
            j$.util.function.Supplier r1 = r1.f64746d
            java.lang.Object r1 = r1.get()
            j$.util.stream.F3 r1 = (p988j$.util.stream.C26051F3) r1
            j$.util.Spliterator r2 = r5.f64914b
            r0.mo84464g1(r2, r1)
            java.lang.Object r0 = r1.get()
            j$.util.stream.H r1 = r5.f64786j
            boolean r1 = r1.f64743a
            r2 = 0
            if (r1 != 0) goto L_0x002e
            if (r0 == 0) goto L_0x002d
            java.util.concurrent.atomic.AtomicReference r1 = r5.f64897h
        L_0x0020:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x0027
            goto L_0x002d
        L_0x0027:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0020
        L_0x002d:
            return r2
        L_0x002e:
            if (r0 == 0) goto L_0x0058
            r1 = r5
        L_0x0031:
            if (r1 == 0) goto L_0x0041
            j$.util.stream.f r3 = r1.mo84484c()
            if (r3 == 0) goto L_0x003f
            j$.util.stream.f r4 = r3.f64916d
            if (r4 == r1) goto L_0x003f
            r1 = 0
            goto L_0x0042
        L_0x003f:
            r1 = r3
            goto L_0x0031
        L_0x0041:
            r1 = 1
        L_0x0042:
            if (r1 == 0) goto L_0x0054
            java.util.concurrent.atomic.AtomicReference r1 = r5.f64897h
        L_0x0046:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x004d
            goto L_0x0057
        L_0x004d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0046
            goto L_0x0057
        L_0x0054:
            r5.mo84481h()
        L_0x0057:
            return r0
        L_0x0058:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26082N.mo84333a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C26158f mo84334d(Spliterator spliterator) {
        return new C26082N(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Object mo84342i() {
        return this.f64786j.f64744b;
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0037 A[LOOP:2: B:19:0x0037->B:22:0x0042, LOOP_START] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCompletion(java.util.concurrent.CountedCompleter r7) {
        /*
            r6 = this;
            j$.util.stream.H r0 = r6.f64786j
            boolean r0 = r0.f64743a
            if (r0 == 0) goto L_0x0051
            j$.util.stream.f r0 = r6.f64916d
            j$.util.stream.N r0 = (p988j$.util.stream.C26082N) r0
            r1 = 0
            r2 = r1
        L_0x000c:
            if (r0 == r2) goto L_0x0051
            java.lang.Object r2 = r0.mo84476b()
            if (r2 == 0) goto L_0x0049
            j$.util.stream.H r3 = r6.f64786j
            j$.util.function.Predicate r3 = r3.f64745c
            boolean r3 = r3.test(r2)
            if (r3 == 0) goto L_0x0049
            r6.mo84478e(r2)
            r0 = r6
        L_0x0022:
            if (r0 == 0) goto L_0x0032
            j$.util.stream.f r3 = r0.mo84484c()
            if (r3 == 0) goto L_0x0030
            j$.util.stream.f r4 = r3.f64916d
            if (r4 == r0) goto L_0x0030
            r0 = 0
            goto L_0x0033
        L_0x0030:
            r0 = r3
            goto L_0x0022
        L_0x0032:
            r0 = 1
        L_0x0033:
            if (r0 == 0) goto L_0x0045
            java.util.concurrent.atomic.AtomicReference r0 = r6.f64897h
        L_0x0037:
            boolean r3 = r0.compareAndSet(r1, r2)
            if (r3 == 0) goto L_0x003e
            goto L_0x0051
        L_0x003e:
            java.lang.Object r3 = r0.get()
            if (r3 == 0) goto L_0x0037
            goto L_0x0051
        L_0x0045:
            r6.mo84481h()
            goto L_0x0051
        L_0x0049:
            j$.util.stream.f r2 = r6.f64917e
            j$.util.stream.N r2 = (p988j$.util.stream.C26082N) r2
            r5 = r2
            r2 = r0
            r0 = r5
            goto L_0x000c
        L_0x0051:
            super.onCompletion(r7)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26082N.onCompletion(java.util.concurrent.CountedCompleter):void");
    }
}
