package p577je;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: je.b0 */
public final class C17782b0<E> implements List<E>, RandomAccess {

    /* renamed from: b */
    public final List<E> f45610b;

    public C17782b0(List<E> list) {
        this.f45610b = Collections.unmodifiableList(list);
    }

    public final boolean add(E e) {
        return this.f45610b.add(e);
    }

    public final boolean addAll(Collection<? extends E> collection) {
        return this.f45610b.addAll(collection);
    }

    public final void clear() {
        this.f45610b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f45610b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f45610b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f45610b.equals(obj);
    }

    public final E get(int i) {
        return this.f45610b.get(i);
    }

    public final int hashCode() {
        return this.f45610b.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f45610b.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f45610b.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f45610b.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f45610b.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f45610b.listIterator();
    }

    public final boolean remove(Object obj) {
        return this.f45610b.remove(obj);
    }

    public final boolean removeAll(Collection<?> collection) {
        return this.f45610b.removeAll(collection);
    }

    public final boolean retainAll(Collection<?> collection) {
        return this.f45610b.retainAll(collection);
    }

    public final E set(int i, E e) {
        return this.f45610b.set(i, e);
    }

    public final int size() {
        return this.f45610b.size();
    }

    public final List<E> subList(int i, int i2) {
        return this.f45610b.subList(i, i2);
    }

    public final Object[] toArray() {
        return this.f45610b.toArray();
    }

    public final void add(int i, E e) {
        this.f45610b.add(i, e);
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        return this.f45610b.addAll(i, collection);
    }

    public final ListIterator<E> listIterator(int i) {
        return this.f45610b.listIterator(i);
    }

    public final E remove(int i) {
        return this.f45610b.remove(i);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f45610b.toArray(tArr);
    }
}
