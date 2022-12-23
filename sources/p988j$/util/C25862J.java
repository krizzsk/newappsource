package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.J */
public final /* synthetic */ class C25862J implements C25864L {

    /* renamed from: a */
    final /* synthetic */ Spliterator.OfPrimitive f64480a;

    private /* synthetic */ C25862J(Spliterator.OfPrimitive ofPrimitive) {
        this.f64480a = ofPrimitive;
    }

    /* renamed from: d */
    public static /* synthetic */ C25864L m64690d(Spliterator.OfPrimitive ofPrimitive) {
        if (ofPrimitive == null) {
            return null;
        }
        return ofPrimitive instanceof C25863K ? ((C25863K) ofPrimitive).f64481a : new C25862J(ofPrimitive);
    }

    public final /* synthetic */ int characteristics() {
        return this.f64480a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64480a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64480a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64480a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64480a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64480a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64480a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f64480a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64480a.tryAdvance(obj);
    }
}
