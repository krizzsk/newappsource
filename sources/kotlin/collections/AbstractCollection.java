package kotlin.collections;

import java.util.Collection;
import java.util.Iterator;
import mf0.C24362h;
import nf0.C24497a;
import p626lf.C18201b;

public abstract class AbstractCollection<E> implements Collection<E>, C24497a {
    public final boolean add(E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public boolean contains(E e) {
        if (isEmpty()) {
            return false;
        }
        for (Object a : this) {
            if (C24362h.m61206a(a, e)) {
                return true;
            }
        }
        return false;
    }

    public final boolean containsAll(Collection<? extends Object> collection) {
        C24362h.m61211f(collection, "elements");
        if (collection.isEmpty()) {
            return true;
        }
        Iterator<T> it = collection.iterator();
        while (it.hasNext()) {
            if (!contains(it.next())) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: e */
    public abstract int mo53351e();

    public boolean isEmpty() {
        return mo53351e() == 0;
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean removeAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean retainAll(Collection<? extends Object> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final /* bridge */ int size() {
        return mo53351e();
    }

    public final Object[] toArray() {
        return C18201b.m44908A(this);
    }

    public final String toString() {
        return C23825c.m58520q0(this, ", ", "[", "]", new AbstractCollection$toString$1(this), 24);
    }

    public final <T> T[] toArray(T[] tArr) {
        C24362h.m61211f(tArr, "array");
        return C18201b.m44909B(this, tArr);
    }
}
