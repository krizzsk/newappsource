package p988j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.LongConsumer;
import p988j$.util.function.C25962c0;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.x */
public final /* synthetic */ class C26267x implements PrimitiveIterator.OfLong {

    /* renamed from: a */
    final /* synthetic */ C26268y f65077a;

    private /* synthetic */ C26267x(C26268y yVar) {
        this.f65077a = yVar;
    }

    /* renamed from: c */
    public static /* synthetic */ PrimitiveIterator.OfLong m65739c(C26268y yVar) {
        if (yVar == null) {
            return null;
        }
        return yVar instanceof C26266w ? ((C26266w) yVar).f65076a : new C26267x(yVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f65077a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f65077a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(LongConsumer longConsumer) {
        this.f65077a.mo83882a(C25962c0.m64807a(longConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f65077a.hasNext();
    }

    public final /* synthetic */ long nextLong() {
        return this.f65077a.nextLong();
    }

    public final /* synthetic */ void remove() {
        this.f65077a.remove();
    }
}
