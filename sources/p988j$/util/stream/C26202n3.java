package p988j$.util.stream;

import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.stream.n3 */
final class C26202n3 extends C26217q3 implements Spliterator.OfInt {
    C26202n3(Spliterator.OfInt ofInt, long j, long j2) {
        super(ofInt, j, j2);
    }

    C26202n3(Spliterator.OfInt ofInt, long j, long j2, long j3, long j4) {
        super(ofInt, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final Spliterator mo84578d(Spliterator spliterator, long j, long j2, long j3, long j4) {
        return new C26202n3((Spliterator.OfInt) spliterator, j, j2, j3, j4);
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final Object mo84579e() {
        return new C26197m3(0);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }
}
