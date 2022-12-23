package p988j$.util;

import com.google.android.gms.analytics.ecommerce.ProductAction;
import java.util.NoSuchElementException;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;
import p988j$.util.function.IntConsumer;

/* renamed from: j$.util.O */
final class C25867O implements C26264u, IntConsumer, Iterator {

    /* renamed from: a */
    boolean f64486a = false;

    /* renamed from: b */
    int f64487b;

    /* renamed from: c */
    final /* synthetic */ Spliterator.OfInt f64488c;

    C25867O(Spliterator.OfInt ofInt) {
        this.f64488c = ofInt;
    }

    public final void accept(int i) {
        this.f64486a = true;
        this.f64487b = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer.CC.$default$andThen(this, intConsumer);
    }

    public final void forEachRemaining(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            forEachRemaining((IntConsumer) consumer);
            return;
        }
        consumer.getClass();
        if (!C25883c0.f64528a) {
            forEachRemaining((IntConsumer) new C26020r(consumer));
        } else {
            C25883c0.m64722a(C25867O.class, "{0} calling PrimitiveIterator.OfInt.forEachRemainingInt(action::accept)");
            throw null;
        }
    }

    public final void forEachRemaining(IntConsumer intConsumer) {
        intConsumer.getClass();
        while (hasNext()) {
            intConsumer.accept(nextInt());
        }
    }

    public final boolean hasNext() {
        if (!this.f64486a) {
            this.f64488c.tryAdvance((IntConsumer) this);
        }
        return this.f64486a;
    }

    public final Integer next() {
        if (!C25883c0.f64528a) {
            return Integer.valueOf(nextInt());
        }
        C25883c0.m64722a(C25867O.class, "{0} calling PrimitiveIterator.OfInt.nextInt()");
        throw null;
    }

    public final int nextInt() {
        if (this.f64486a || hasNext()) {
            this.f64486a = false;
            return this.f64487b;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException(ProductAction.ACTION_REMOVE);
    }
}
