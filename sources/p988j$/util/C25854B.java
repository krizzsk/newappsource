package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p988j$.util.function.C25979l;
import p988j$.util.function.C25981m;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.B */
public final /* synthetic */ class C25854B implements C25856D {

    /* renamed from: a */
    final /* synthetic */ Spliterator.OfDouble f64468a;

    private /* synthetic */ C25854B(Spliterator.OfDouble ofDouble) {
        this.f64468a = ofDouble;
    }

    /* renamed from: d */
    public static /* synthetic */ C25856D m64668d(Spliterator.OfDouble ofDouble) {
        if (ofDouble == null) {
            return null;
        }
        return ofDouble instanceof C25855C ? ((C25855C) ofDouble).f64469a : new C25854B(ofDouble);
    }

    /* renamed from: b */
    public final /* synthetic */ void mo83818b(C25981m mVar) {
        this.f64468a.forEachRemaining(C25979l.m64827a(mVar));
    }

    public final /* synthetic */ int characteristics() {
        return this.f64468a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64468a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64468a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64468a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64468a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64468a.getExactSizeIfKnown();
    }

    /* renamed from: h */
    public final /* synthetic */ boolean mo83820h(C25981m mVar) {
        return this.f64468a.tryAdvance(C25979l.m64827a(mVar));
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64468a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f64468a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64468a.tryAdvance(obj);
    }
}
