package p988j$.util.function;

import java.util.function.DoubleConsumer;

/* renamed from: j$.util.function.l */
public final /* synthetic */ class C25979l implements DoubleConsumer {

    /* renamed from: a */
    final /* synthetic */ C25981m f64662a;

    private /* synthetic */ C25979l(C25981m mVar) {
        this.f64662a = mVar;
    }

    /* renamed from: a */
    public static /* synthetic */ DoubleConsumer m64827a(C25981m mVar) {
        if (mVar == null) {
            return null;
        }
        return mVar instanceof C25977k ? ((C25977k) mVar).f64661a : new C25979l(mVar);
    }

    public final /* synthetic */ void accept(double d) {
        this.f64662a.accept(d);
    }

    public final /* synthetic */ DoubleConsumer andThen(DoubleConsumer doubleConsumer) {
        return m64827a(this.f64662a.mo83888l(C25977k.m64825a(doubleConsumer)));
    }
}
