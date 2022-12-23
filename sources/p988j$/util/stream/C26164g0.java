package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.C25966e0;

/* renamed from: j$.util.stream.g0 */
final class C26164g0 extends C26179j0 {
    C26164g0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    /* renamed from: E */
    public final void mo84486E(C25966e0 e0Var) {
        if (!isParallel()) {
            C26179j0.m65449A1(mo84473w1()).mo83848a(e0Var);
        } else {
            super.mo84486E(e0Var);
        }
    }

    public final /* bridge */ /* synthetic */ C26194m0 parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ C26194m0 sequential() {
        sequential();
        return this;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: t1 */
    public final boolean mo84139t1() {
        throw new UnsupportedOperationException();
    }

    /* access modifiers changed from: package-private */
    /* renamed from: u1 */
    public final C26166g2 mo84142u1(int i, C26166g2 g2Var) {
        throw new UnsupportedOperationException();
    }

    /* renamed from: x */
    public final void mo84487x(C25966e0 e0Var) {
        if (!isParallel()) {
            C26179j0.m65449A1(mo84473w1()).mo83848a(e0Var);
        } else {
            super.mo84487x(e0Var);
        }
    }
}
