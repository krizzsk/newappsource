package c00;

import c00.C13717b;
import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: c00.h */
public abstract class C13726h<E> implements List<E> {
    public final void add(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public final boolean containsAll(Collection<?> collection) {
        for (Object contains : collection) {
            if (!((C13717b.C13718a) this).contains(contains)) {
                return false;
            }
        }
        return true;
    }

    public final boolean isEmpty() {
        C13717b.C13718a aVar = (C13717b.C13718a) this;
        if (aVar.f33793c - aVar.f33792b == 0) {
            return true;
        }
        return false;
    }

    public final Iterator<E> iterator() {
        return new C13737q(this, 0);
    }

    public final ListIterator<E> listIterator() {
        return new C13737q(this, 0);
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException();
    }

    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException();
    }

    public final Object[] toArray() {
        C13717b.C13718a aVar = (C13717b.C13718a) this;
        int i = aVar.f33793c - aVar.f33792b;
        Object[] objArr = new Object[i];
        for (int i2 = 0; i2 < i; i2++) {
            objArr[i2] = aVar.get(i2);
        }
        return objArr;
    }

    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final ListIterator<E> listIterator(int i) {
        return new C13737q(this, i);
    }

    public final <T> T[] toArray(T[] tArr) {
        C13717b.C13718a aVar = (C13717b.C13718a) this;
        int i = aVar.f33793c - aVar.f33792b;
        if (tArr.length < i) {
            tArr = (Object[]) Array.newInstance(tArr.getClass().getComponentType(), i);
        }
        int i2 = 0;
        while (i2 < i) {
            try {
                tArr[i2] = aVar.get(i2);
                i2++;
            } catch (ClassCastException unused) {
                throw new ArrayStoreException();
            }
        }
        if (tArr.length > i) {
            tArr[i] = null;
        }
        return tArr;
    }
}
