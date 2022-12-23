package p988j$.util;

import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.r */
public final /* synthetic */ class C26020r implements IntConsumer {

    /* renamed from: a */
    public final /* synthetic */ Consumer f64697a;

    public /* synthetic */ C26020r(Consumer consumer) {
        this.f64697a = consumer;
    }

    public final void accept(int i) {
        this.f64697a.accept(Integer.valueOf(i));
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }
}
