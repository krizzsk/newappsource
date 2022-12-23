package cf0;

import java.util.Iterator;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: cf0.u */
public abstract class C21147u implements Iterator<Integer>, C24497a, p988j$.util.Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* bridge */ /* synthetic */ Object next() {
        return Integer.valueOf(nextInt());
    }

    public abstract int nextInt();

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
