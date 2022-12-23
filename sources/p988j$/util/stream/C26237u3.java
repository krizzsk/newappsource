package p988j$.util.stream;

import p988j$.util.C26016n;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.u3 */
final class C26237u3 extends C26247w3 implements Spliterator.OfInt, IntConsumer {

    /* renamed from: e */
    int f65032e;

    C26237u3(Spliterator.OfInt ofInt, long j, long j2) {
        super(ofInt, j, j2);
    }

    C26237u3(Spliterator.OfInt ofInt, C26237u3 u3Var) {
        super(ofInt, u3Var);
    }

    public final void accept(int i) {
        this.f65032e = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        C26016n.m64890e(this, consumer);
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final Spliterator mo84592n(Spliterator spliterator) {
        return new C26237u3((Spliterator.OfInt) spliterator, this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo84593p(Object obj) {
        ((IntConsumer) obj).accept(this.f65032e);
    }

    /* access modifiers changed from: protected */
    /* renamed from: q */
    public final C26137a3 mo84594q() {
        return new C26128Y2();
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return C26016n.m64893i(this, consumer);
    }
}
