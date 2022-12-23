package p988j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.I */
public final /* synthetic */ class C25931I implements IntConsumer {

    /* renamed from: a */
    final /* synthetic */ IntConsumer f64621a;

    private /* synthetic */ C25931I(IntConsumer intConsumer) {
        this.f64621a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m64773a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C25933J ? ((C25933J) intConsumer).f64624a : new C25931I(intConsumer);
    }

    public final /* synthetic */ void accept(int i) {
        this.f64621a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m64773a(this.f64621a.andThen(C25933J.m64775a(intConsumer)));
    }
}
