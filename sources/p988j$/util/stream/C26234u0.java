package p988j$.util.stream;

import p988j$.util.Spliterator;

/* renamed from: j$.util.stream.u0 */
final class C26234u0 extends C26148d {

    /* renamed from: j */
    private final C26229t0 f65028j;

    C26234u0(C26229t0 t0Var, C26239v0 v0Var, Spliterator spliterator) {
        super(v0Var, spliterator);
        this.f65028j = t0Var;
    }

    C26234u0(C26234u0 u0Var, Spliterator spliterator) {
        super((C26148d) u0Var, spliterator);
        this.f65028j = u0Var.f65028j;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:5:0x0026 A[LOOP:0: B:5:0x0026->B:8:0x0031, LOOP_START] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object mo84333a() {
        /*
            r4 = this;
            j$.util.stream.v0 r0 = r4.f64913a
            j$.util.stream.t0 r1 = r4.f65028j
            j$.util.function.Supplier r1 = r1.f65023b
            java.lang.Object r1 = r1.get()
            j$.util.stream.r0 r1 = (p988j$.util.stream.C26219r0) r1
            j$.util.Spliterator r2 = r4.f64914b
            r0.mo84464g1(r2, r1)
            boolean r0 = r1.f65008b
            j$.util.stream.t0 r1 = r4.f65028j
            j$.util.stream.s0 r1 = r1.f65022a
            boolean r1 = r1.f65013b
            r2 = 0
            if (r0 != r1) goto L_0x0033
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r0)
            if (r0 == 0) goto L_0x0033
            java.util.concurrent.atomic.AtomicReference r1 = r4.f64897h
        L_0x0026:
            boolean r3 = r1.compareAndSet(r2, r0)
            if (r3 == 0) goto L_0x002d
            goto L_0x0033
        L_0x002d:
            java.lang.Object r3 = r1.get()
            if (r3 == 0) goto L_0x0026
        L_0x0033:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: p988j$.util.stream.C26234u0.mo84333a():java.lang.Object");
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final C26158f mo84334d(Spliterator spliterator) {
        return new C26234u0(this, spliterator);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final Object mo84342i() {
        return Boolean.valueOf(!this.f65028j.f65022a.f65013b);
    }
}
