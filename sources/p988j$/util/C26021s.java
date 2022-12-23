package p988j$.util;

import java.util.PrimitiveIterator;
import p988j$.util.function.C25933J;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.s */
public final /* synthetic */ class C26021s implements C26264u, Iterator {

    /* renamed from: a */
    final /* synthetic */ PrimitiveIterator.OfInt f64698a;

    private /* synthetic */ C26021s(PrimitiveIterator.OfInt ofInt) {
        this.f64698a = ofInt;
    }

    /* renamed from: c */
    public static /* synthetic */ C26264u m64901c(PrimitiveIterator.OfInt ofInt) {
        if (ofInt == null) {
            return null;
        }
        return ofInt instanceof C26263t ? ((C26263t) ofInt).f65074a : new C26021s(ofInt);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f64698a.forEachRemaining(Consumer.Wrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f64698a.forEachRemaining(C25933J.m64775a(intConsumer));
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f64698a.forEachRemaining(obj);
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f64698a.hasNext();
    }

    public final /* synthetic */ int nextInt() {
        return this.f64698a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f64698a.remove();
    }
}
