package p988j$.util;

import java.util.PrimitiveIterator;
import p988j$.util.function.C25979l;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.o */
public final /* synthetic */ class C26017o implements C26019q, Iterator {

    /* renamed from: a */
    final /* synthetic */ PrimitiveIterator.OfDouble f64695a;

    private /* synthetic */ C26017o(PrimitiveIterator.OfDouble ofDouble) {
        this.f64695a = ofDouble;
    }

    /* renamed from: c */
    public static /* synthetic */ C26019q m64897c(PrimitiveIterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C26018p ? ((C26018p) ofDouble).f64696a : new C26017o(ofDouble);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo83887b(C25981m mVar) {
        this.f64695a.forEachRemaining(C25979l.m64827a(mVar));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64695a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64695a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f64695a.hasNext();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f64695a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f64695a.remove();
    }
}
