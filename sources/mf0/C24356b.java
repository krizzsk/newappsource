package mf0;

import java.util.Iterator;
import java.util.NoSuchElementException;
import nf0.C24497a;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: mf0.b */
public final class C24356b<T> implements Iterator<T>, C24497a, p988j$.util.Iterator {

    /* renamed from: b */
    public final T[] f61667b;

    /* renamed from: c */
    public int f61668c;

    public C24356b(T[] tArr) {
        C24362h.m61211f(tArr, "array");
        this.f61667b = tArr;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f61668c < this.f61667b.length;
    }

    public final T next() {
        try {
            T[] tArr = this.f61667b;
            int i = this.f61668c;
            this.f61668c = i + 1;
            return tArr[i];
        } catch (ArrayIndexOutOfBoundsException e) {
            this.f61668c--;
            throw new NoSuchElementException(e.getMessage());
        }
    }

    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
