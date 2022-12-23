package c00;

import java.util.ListIterator;

/* renamed from: c00.l */
public class C13731l<T> extends C13729j<T> implements ListIterator<T> {

    /* renamed from: c */
    public final ListIterator<T> f33803c;

    public C13731l(ListIterator<T> listIterator) {
        super(listIterator);
        this.f33803c = listIterator;
    }

    public void add(T t) {
        this.f33803c.add(t);
    }

    public final boolean hasPrevious() {
        return this.f33803c.hasPrevious();
    }

    public final int nextIndex() {
        return this.f33803c.nextIndex();
    }

    public final T previous() {
        return this.f33803c.previous();
    }

    public final int previousIndex() {
        return this.f33803c.previousIndex();
    }

    public void set(T t) {
        this.f33803c.set(t);
    }
}
