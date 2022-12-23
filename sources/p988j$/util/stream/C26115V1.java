package p988j$.util.stream;

import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.V1 */
final class C26115V1 extends C26127Y1 {
    C26115V1(Spliterator spliterator, int i, boolean z) {
        super(spliterator, i, z);
    }

    /* renamed from: F */
    public final void mo84371F(Consumer consumer) {
        if (!isParallel()) {
            mo84473w1().forEachRemaining(consumer);
        } else {
            super.mo84371F(consumer);
        }
    }

    public final void forEach(Consumer consumer) {
        if (!isParallel()) {
            mo84473w1().forEachRemaining(consumer);
        } else {
            super.forEach(consumer);
        }
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
