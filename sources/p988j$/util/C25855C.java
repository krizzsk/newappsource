package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import p988j$.util.function.C25977k;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.C */
public final /* synthetic */ class C25855C implements Spliterator.OfDouble {

    /* renamed from: a */
    final /* synthetic */ C25856D f64469a;

    private /* synthetic */ C25855C(C25856D d) {
        this.f64469a = d;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfDouble m64671a(C25856D d) {
        if (d == null) {
            return null;
        }
        return d instanceof C25854B ? ((C25854B) d).f64468a : new C25855C(d);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64469a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64469a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64469a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64469a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(DoubleConsumer doubleConsumer) {
        this.f64469a.mo83818b(C25977k.m64825a(doubleConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64469a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64469a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64469a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64469a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f64469a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(DoubleConsumer doubleConsumer) {
        return this.f64469a.mo83820h(C25977k.m64825a(doubleConsumer));
    }
}
