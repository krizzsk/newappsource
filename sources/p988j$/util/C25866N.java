package p988j$.util;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.function.Consumer;

/* renamed from: j$.util.N */
final class C25866N implements Iterator, Consumer {

    /* renamed from: a */
    boolean f64483a = false;

    /* renamed from: b */
    Object f64484b;

    /* renamed from: c */
    final /* synthetic */ Spliterator f64485c;

    C25866N(Spliterator spliterator) {
        this.f64485c = spliterator;
    }

    public final void accept(Object obj) {
        this.f64483a = true;
        this.f64484b = obj;
    }

    public final /* synthetic */ Consumer andThen(Consumer consumer) {
        return Consumer.CC.$default$andThen(this, consumer);
    }

    public final boolean hasNext() {
        if (!this.f64483a) {
            this.f64485c.tryAdvance(this);
        }
        return this.f64483a;
    }

    public final Object next() {
        if (this.f64483a || hasNext()) {
            this.f64483a = false;
            return this.f64484b;
        }
        throw new NoSuchElementException();
    }
}
