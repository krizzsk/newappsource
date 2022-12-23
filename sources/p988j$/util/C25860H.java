package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p988j$.util.function.C25962c0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.H */
public final /* synthetic */ class C25860H implements Spliterator.OfLong {

    /* renamed from: a */
    final /* synthetic */ C25861I f64479a;

    private /* synthetic */ C25860H(C25861I i) {
        this.f64479a = i;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfLong m64687a(C25861I i) {
        if (i == null) {
            return null;
        }
        return i instanceof C25859G ? ((C25859G) i).f64478a : new C25860H(i);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64479a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64479a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64479a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64479a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f64479a.mo83848a(C25962c0.m64807a(longConsumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64479a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64479a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64479a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64479a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f64479a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(LongConsumer longConsumer) {
        return this.f64479a.mo83849c(C25962c0.m64807a(longConsumer));
    }
}
