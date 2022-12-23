package p988j$.util;

import java.util.Comparator;
import java.util.Spliterator;
import p988j$.util.function.C25964d0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.G */
public final /* synthetic */ class C25859G implements C25861I {

    /* renamed from: a */
    final /* synthetic */ Spliterator.OfLong f64478a;

    private /* synthetic */ C25859G(Spliterator.OfLong ofLong) {
        this.f64478a = ofLong;
    }

    /* renamed from: d */
    public static /* synthetic */ C25861I m64684d(Spliterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C25860H ? ((C25860H) ofLong).f64479a : new C25859G(ofLong);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo83848a(C25966e0 e0Var) {
        this.f64478a.forEachRemaining(C25964d0.m64810a(e0Var));
    }

    /* renamed from: c */
    public final /* synthetic */ boolean mo83849c(C25966e0 e0Var) {
        return this.f64478a.tryAdvance(C25964d0.m64810a(e0Var));
    }

    public final /* synthetic */ int characteristics() {
        return this.f64478a.characteristics();
    }

    public final /* synthetic */ long estimateSize() {
        return this.f64478a.estimateSize();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64478a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64478a.forEachRemaining(obj);
    }

    public final /* synthetic */ Comparator getComparator() {
        return this.f64478a.getComparator();
    }

    public final /* synthetic */ long getExactSizeIfKnown() {
        return this.f64478a.getExactSizeIfKnown();
    }

    public final /* synthetic */ boolean hasCharacteristics(int i) {
        return this.f64478a.hasCharacteristics(i);
    }

    public final /* synthetic */ boolean tryAdvance(Consumer consumer) {
        return this.f64478a.tryAdvance(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ boolean tryAdvance(Object obj) {
        return this.f64478a.tryAdvance(obj);
    }
}
