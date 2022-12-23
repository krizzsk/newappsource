package c00;

import ce0.C21100e;
import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.Queue;

/* renamed from: c00.i */
public final class C13727i<T> implements Iterable<T> {

    /* renamed from: b */
    public final List<Iterable<? extends T>> f33799b;

    /* renamed from: c00.i$a */
    public static class C13728a<E> implements Iterator<E> {

        /* renamed from: b */
        public final Queue<Iterator<? extends E>> f33800b;

        public C13728a(ArrayDeque arrayDeque) {
            this.f33800b = arrayDeque;
        }

        public final boolean hasNext() {
            while (true) {
                Iterator peek = this.f33800b.peek();
                if (peek == null) {
                    return false;
                }
                if (peek.hasNext()) {
                    return true;
                }
                this.f33800b.poll();
            }
        }

        public final E next() {
            Iterator peek = this.f33800b.peek();
            if (peek != null && peek.hasNext()) {
                return peek.next();
            }
            throw new NoSuchElementException();
        }
    }

    public C13727i(List<Iterable<? extends T>> list) {
        C21100e.m49373x(list, "iterables");
        this.f33799b = list;
    }

    public final Iterator<T> iterator() {
        ArrayDeque arrayDeque = new ArrayDeque(this.f33799b.size());
        for (Iterable<? extends T> it : this.f33799b) {
            arrayDeque.addLast(it.iterator());
        }
        return new C13728a(arrayDeque);
    }
}
