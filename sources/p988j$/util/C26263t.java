package p988j$.util;

import java.util.PrimitiveIterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;
import p988j$.util.function.C25931I;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.t */
public final /* synthetic */ class C26263t implements PrimitiveIterator.OfInt {

    /* renamed from: a */
    final /* synthetic */ C26264u f65074a;

    private /* synthetic */ C26263t(C26264u uVar) {
        this.f65074a = uVar;
    }

    /* renamed from: c */
    public static /* synthetic */ PrimitiveIterator.OfInt m65735c(C26264u uVar) {
        if (uVar == null) {
            return null;
        }
        return uVar instanceof C26021s ? ((C26021s) uVar).f64698a : new C26263t(uVar);
    }

    public final /* synthetic */ void forEachRemaining(Object obj) {
        this.f65074a.forEachRemaining(obj);
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        this.f65074a.forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ void forEachRemaining(IntConsumer intConsumer) {
        this.f65074a.forEachRemaining(C25931I.m64773a(intConsumer));
    }

    public final /* synthetic */ boolean hasNext() {
        return this.f65074a.hasNext();
    }

    public final /* synthetic */ int nextInt() {
        return this.f65074a.nextInt();
    }

    public final /* synthetic */ void remove() {
        this.f65074a.remove();
    }
}
