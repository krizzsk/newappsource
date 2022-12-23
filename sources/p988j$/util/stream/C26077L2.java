package p988j$.util.stream;

import p988j$.util.C25864L;
import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.Spliterators;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.L2 */
final class C26077L2 extends C26093P2 implements Spliterator.OfInt {

    /* renamed from: g */
    final /* synthetic */ C26081M2 f64781g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    C26077L2(C26081M2 m2, int i, int i2, int i3, int i4) {
        super(m2, i, i2, i3, i4);
        this.f64781g = m2;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final void mo84324d(int i, Object obj, Object obj2) {
        ((IntConsumer) obj2).accept(((int[]) obj)[i]);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: e */
    public final C25864L mo84325e(Object obj, int i, int i2) {
        return Spliterators.spliterator((int[]) obj, i, i2 + i, 1040);
    }

    /* access modifiers changed from: package-private */
    /* renamed from: f */
    public final C25864L mo84326f(int i, int i2, int i3, int i4) {
        return new C26077L2(this.f64781g, i, i2, i3, i4);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }
}
