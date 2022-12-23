package c00;

import ce0.C21100e;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: c00.q */
public final class C13737q<E> implements ListIterator<E>, Iterator {

    /* renamed from: b */
    public final List<E> f33809b;

    /* renamed from: c */
    public int f33810c = -1;

    /* renamed from: d */
    public int f33811d = -1;

    public C13737q(List<E> list, int i) {
        C21100e.m49373x(list, "list");
        this.f33809b = list;
        if (i < 0 || i > list.size()) {
            throw new IndexOutOfBoundsException(i + " is not in the range [0, " + list.size() + ")");
        }
        this.f33810c = i - 1;
    }

    public final void add(E e) {
        this.f33809b.add(this.f33810c + 1, e);
        this.f33810c++;
        this.f33811d = -1;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.f33810c + 1 < this.f33809b.size();
    }

    public final boolean hasPrevious() {
        return this.f33810c >= 0;
    }

    public final E next() {
        if (hasNext()) {
            E e = this.f33809b.get(this.f33810c + 1);
            int i = this.f33810c + 1;
            this.f33810c = i;
            this.f33811d = i;
            return e;
        }
        throw new NoSuchElementException();
    }

    public final int nextIndex() {
        return this.f33810c + 1;
    }

    public final E previous() {
        if (hasPrevious()) {
            E e = this.f33809b.get(this.f33810c);
            int i = this.f33810c;
            this.f33811d = i;
            this.f33810c = i - 1;
            return e;
        }
        throw new NoSuchElementException();
    }

    public final int previousIndex() {
        return this.f33810c;
    }

    public final void remove() {
        int i = this.f33811d;
        if (i != -1) {
            this.f33809b.remove(i);
            int i2 = this.f33810c;
            if (i2 == this.f33811d) {
                this.f33810c = i2 - 1;
            }
            this.f33811d = -1;
            return;
        }
        throw new IllegalStateException("remove() called with no corresponding previous() or next() call");
    }

    public final void set(E e) {
        int i = this.f33811d;
        if (i != -1) {
            this.f33809b.set(i, e);
            return;
        }
        throw new IllegalStateException("set() or remove() called with no corresponding previous() or next() call");
    }
}
