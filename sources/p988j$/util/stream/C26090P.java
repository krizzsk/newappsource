package p988j$.util.stream;

import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.stream.P */
final class C26090P extends C26105T implements C26156e2 {

    /* renamed from: b */
    final IntConsumer f64795b;

    C26090P(IntConsumer intConsumer, boolean z) {
        super(z);
        this.f64795b = intConsumer;
    }

    public final void accept(int i) {
        this.f64795b.accept(i);
    }

    public final /* bridge */ /* synthetic */ void accept(Object obj) {
        mo84323e((Integer) obj);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    /* renamed from: e */
    public final /* synthetic */ void mo84323e(Integer num) {
        C26239v0.m65669o0(this, num);
    }
}
