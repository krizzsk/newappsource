package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import java.util.function.Consumer;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.K */
public final /* synthetic */ class C25863K implements Spliterator.OfPrimitive {

    /* renamed from: a */
    final /* synthetic */ C25864L f64481a;

    private /* synthetic */ C25863K(C25864L l) {
        this.f64481a = l;
    }

    /* renamed from: a */
    public static /* synthetic */ Spliterator.OfPrimitive m64691a(C25864L l) {
        if (l == null) {
            return null;
        }
        return l instanceof C25862J ? ((C25862J) l).f64480a : new C25863K(l);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64481a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64481a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64481a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64481a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64481a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64481a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64481a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64481a.tryAdvance(obj);
    }

    public final /* synthetic */ boolean tryAdvance(java.util.function.Consumer consumer) {
        return this.f64481a.tryAdvance(Consumer.VivifiedWrapper.convert(consumer));
    }
}
