package p988j$.util.function;

import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.function.H */
public final /* synthetic */ class C25929H implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ IntConsumer f64618a;

    /* renamed from: b */
    public final /* synthetic */ IntConsumer f64619b;

    public /* synthetic */ C25929H(IntConsumer intConsumer, IntConsumer intConsumer2) {
        this.f64618a = intConsumer;
        this.f64619b = intConsumer2;
    }

    public final void accept(int i) {
        IntConsumer intConsumer = this.f64618a;
        IntConsumer intConsumer2 = this.f64619b;
        intConsumer.accept(i);
        intConsumer2.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
