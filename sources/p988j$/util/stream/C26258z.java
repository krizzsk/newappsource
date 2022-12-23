package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.C25981m;

/* renamed from: j$.util.stream.z */
final class C26258z extends C26032C {
    C26258z(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    /* renamed from: H */
    public final void mo84153H(C25981m mVar) {
        if (!isParallel()) {
            C26032C.m64920A1(mo84473w1()).mo83818b(mVar);
        } else {
            super.mo84153H(mVar);
        }
    }

    /* renamed from: i0 */
    public final void mo84168i0(C25981m mVar) {
        if (!isParallel()) {
            C26032C.m64920A1(mo84473w1()).mo83818b(mVar);
        } else {
            super.mo84168i0(mVar);
        }
    }

    public final /* bridge */ /* synthetic */ C26047F parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ C26047F sequential() {
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
}
