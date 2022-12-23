package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.a0 */
final class C26134a0 extends C26149d0 {
    C26134a0(Spliterator spliterator, int i) {
        super(spliterator, i);
    }

    /* renamed from: O */
    public final void mo84255O(IntConsumer intConsumer) {
        if (!isParallel()) {
            C26149d0.m65375A1(mo84473w1()).forEachRemaining(intConsumer);
        } else {
            super.mo84255O(intConsumer);
        }
    }

    /* renamed from: W */
    public final void mo84258W(IntConsumer intConsumer) {
        if (!isParallel()) {
            C26149d0.m65375A1(mo84473w1()).forEachRemaining(intConsumer);
        } else {
            super.mo84258W(intConsumer);
        }
    }

    public final /* bridge */ /* synthetic */ IntStream parallel() {
        parallel();
        return this;
    }

    public final /* bridge */ /* synthetic */ IntStream sequential() {
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
