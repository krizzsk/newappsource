package p988j$.util;

import p988j$.util.function.C25975j;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.m */
public final /* synthetic */ class C26015m implements C25981m {

    /* renamed from: a */
    public final /* synthetic */ Consumer f64694a;

    public /* synthetic */ C26015m(Consumer consumer) {
        this.f64694a = consumer;
    }

    public final void accept(double d) {
        this.f64694a.accept(Double.valueOf(d));
    }

    /* renamed from: l */
    public final C25981m mo83888l(C25981m mVar) {
        mVar.getClass();
        return new C25975j(this, mVar);
    }
}
