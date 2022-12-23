package p988j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.k */
public final /* synthetic */ class C25977k implements C25981m {

    /* renamed from: a */
    final /* synthetic */ DoubleConsumer f64661a;

    private /* synthetic */ C25977k(DoubleConsumer doubleConsumer) {
        this.f64661a = doubleConsumer;
    }

    /* renamed from: a */
    public static /* synthetic */ C25981m m64825a(DoubleConsumer doubleConsumer) {
        if (doubleConsumer == null) {
            return null;
        }
        return doubleConsumer instanceof C25979l ? ((C25979l) doubleConsumer).f64662a : new C25977k(doubleConsumer);
    }

    public final /* synthetic */ void accept(double d) {
        this.f64661a.accept(d);
    }

    /* renamed from: l */
    public final /* synthetic */ C25981m mo83888l(C25981m mVar) {
        return m64825a(this.f64661a.andThen(C25979l.m64827a(mVar)));
    }
}
