package cf0;

import java.util.Iterator;
import mf0.C24362h;
import nf0.C24497a;
import p583jk.C17875h;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: cf0.t */
public final class C21146t<T> implements Iterator<C21144r<? extends T>>, C24497a, p988j$.util.Iterator {

    /* renamed from: b */
    public final Iterator<T> f53004b;

    /* renamed from: c */
    public int f53005c;

    public C21146t(Iterator<? extends T> it) {
        C24362h.m61211f(it, "iterator");
        this.f53004b = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f53004b.hasNext();
    }

    public final Object next() {
        int i = this.f53005c;
        this.f53005c = i + 1;
        if (i >= 0) {
            return new C21144r(i, this.f53004b.next());
        }
        C17875h.m44294U();
        throw null;
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
