package c00;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: c00.k */
public class C13730k<E> implements List<E> {

    /* renamed from: b */
    public final List<E> f33802b;

    public C13730k(List<E> list) {
        this.f33802b = list;
    }

    public void add(int i, E e) {
        this.f33802b.add(i, e);
    }

    public boolean addAll(int i, Collection<? extends E> collection) {
        return this.f33802b.addAll(i, collection);
    }

    public void clear() {
        this.f33802b.clear();
    }

    public final boolean contains(Object obj) {
        return this.f33802b.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f33802b.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f33802b.equals(obj);
    }

    public final E get(int i) {
        return this.f33802b.get(i);
    }

    public final int hashCode() {
        return this.f33802b.hashCode();
    }

    public final int indexOf(Object obj) {
        return this.f33802b.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f33802b.isEmpty();
    }

    public Iterator<E> iterator() {
        return this.f33802b.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f33802b.lastIndexOf(obj);
    }

    public ListIterator<E> listIterator() {
        return this.f33802b.listIterator();
    }

    public E remove(int i) {
        return this.f33802b.remove(i);
    }

    public boolean removeAll(Collection<?> collection) {
        return this.f33802b.removeAll(collection);
    }

    public boolean retainAll(Collection<?> collection) {
        return this.f33802b.retainAll(collection);
    }

    public E set(int i, E e) {
        return this.f33802b.set(i, e);
    }

    public final int size() {
        return this.f33802b.size();
    }

    public List<E> subList(int i, int i2) {
        return this.f33802b.subList(i, i2);
    }

    public final Object[] toArray() {
        return this.f33802b.toArray();
    }

    public boolean add(E e) {
        return this.f33802b.add(e);
    }

    public boolean addAll(Collection<? extends E> collection) {
        return this.f33802b.addAll(collection);
    }

    public ListIterator<E> listIterator(int i) {
        return this.f33802b.listIterator(i);
    }

    public boolean remove(Object obj) {
        return this.f33802b.remove(obj);
    }

    public final <T> T[] toArray(T[] tArr) {
        return this.f33802b.toArray(tArr);
    }
}
