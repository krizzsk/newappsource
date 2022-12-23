package p988j$.util;

import java.util.PrimitiveIterator;
import p988j$.util.function.C25964d0;
import p988j$.util.function.C25966e0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.w */
public final /* synthetic */ class C26266w implements C26268y, Iterator {

    /* renamed from: a */
    final /* synthetic */ PrimitiveIterator.OfLong f65076a;

    private /* synthetic */ C26266w(PrimitiveIterator.OfLong ofLong) {
        this.f65076a = ofLong;
    }

    /* renamed from: c */
    public static /* synthetic */ C26268y m65737c(PrimitiveIterator.OfLong ofLong) {
        if (ofLong == null) {
            return null;
        }
        return ofLong instanceof C26267x ? ((C26267x) ofLong).f65077a : new C26266w(ofLong);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo83882a(C25966e0 e0Var) {
        this.f65076a.forEachRemaining(C25964d0.m64810a(e0Var));
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f65076a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f65076a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f65076a.hasNext();
    }

    public final /* synthetic */ long nextLong() {
        return this.f65076a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f65076a.remove();
    }
}
