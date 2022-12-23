package cf0;

import java.util.Enumeration;
import java.util.Iterator;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: cf0.k */
public final class C21137k implements Iterator<Object>, C24497a, p988j$.util.Iterator {

    /* renamed from: b */
    public final /* synthetic */ Enumeration<Object> f52998b;

    public C21137k(Enumeration<Object> enumeration) {
        this.f52998b = enumeration;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f52998b.hasMoreElements();
    }

    public final Object next() {
        return this.f52998b.nextElement();
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
