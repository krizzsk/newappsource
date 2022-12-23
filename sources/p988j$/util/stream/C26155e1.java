package p988j$.util.stream;

import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.e1 */
final class C26155e1 extends C26165g1 implements Spliterator.OfInt {
    C26155e1(C26028B0 b0) {
        super(b0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }
}
