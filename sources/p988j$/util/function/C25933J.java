package p988j$.util.function;

import java.util.function.IntConsumer;

/* renamed from: j$.util.function.J */
public final /* synthetic */ class C25933J implements IntConsumer {

    /* renamed from: a */
    final /* synthetic */ IntConsumer f64624a;

    private /* synthetic */ C25933J(IntConsumer intConsumer) {
        this.f64624a = intConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ IntConsumer m64775a(IntConsumer intConsumer) {
        if (intConsumer == null) {
            return null;
        }
        return intConsumer instanceof C25931I ? ((C25931I) intConsumer).f64621a : new C25933J(intConsumer);
    }

    public final /* synthetic */ void accept(int i) {
        this.f64624a.accept(i);
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return m64775a(this.f64624a.andThen(C25931I.m64773a(intConsumer)));
    }
}
