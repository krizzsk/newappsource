package p988j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p988j$.util.function.C25977k;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.p */
public final /* synthetic */ class C26018p implements PrimitiveIterator.OfDouble {

    /* renamed from: a */
    final /* synthetic */ C26019q f64696a;

    private /* synthetic */ C26018p(C26019q qVar) {
        this.f64696a = qVar;
    }

    /* renamed from: c */
    public static /* synthetic */ PrimitiveIterator.OfDouble m64899c(C26019q qVar) {
        if (qVar == null) {
            return null;
        }
        return qVar instanceof C26017o ? ((C26017o) qVar).f64695a : new C26018p(qVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64696a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64696a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f64696a.mo83887b(C25977k.m64825a(doubleConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f64696a.hasNext();
    }

    public final /* synthetic */ double nextDouble() {
        return this.f64696a.nextDouble();
    }

    public final /* synthetic */ void remove() {
        this.f64696a.remove();
    }
}
