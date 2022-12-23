package p296w4;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: w4.a */
public final class C6983a<E> implements List<E> {

    /* renamed from: b */
    public AtomicBoolean f21748b = new AtomicBoolean(false);

    /* renamed from: c */
    public CopyOnWriteArrayList<E> f21749c = new CopyOnWriteArrayList<>();

    /* renamed from: d */
    public E[] f21750d;

    /* renamed from: e */
    public final E[] f21751e;

    public C6983a(E[] eArr) {
        this.f21751e = eArr;
    }

    public final void add(int i, E e) {
        this.f21749c.add(i, e);
        mo23227e();
    }

    public final boolean add(E e) {
        boolean add = this.f21749c.add(e);
        mo23227e();
        return add;
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean addAll = this.f21749c.addAll(i, collection);
        mo23227e();
        return addAll;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        boolean addAll = this.f21749c.addAll(collection);
        mo23227e();
        return addAll;
    }

    public final void clear() {
        this.f21749c.clear();
        mo23227e();
    }

    public final boolean contains(Object obj) {
        return this.f21749c.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f21749c.containsAll(collection);
    }

    /* renamed from: e */
    public final void mo23227e() {
        this.f21748b.set(false);
    }

    public final E get(int i) {
        mo23229i();
        return this.f21750d[i];
    }

    /* renamed from: i */
    public final void mo23229i() {
        if (!this.f21748b.get()) {
            this.f21750d = this.f21749c.toArray(this.f21751e);
            this.f21748b.set(true);
        }
    }

    public final int indexOf(Object obj) {
        return this.f21749c.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f21749c.isEmpty();
    }

    public final Iterator<E> iterator() {
        return this.f21749c.iterator();
    }

    public final int lastIndexOf(Object obj) {
        return this.f21749c.lastIndexOf(obj);
    }

    public final ListIterator<E> listIterator() {
        return this.f21749c.listIterator();
    }

    public final ListIterator<E> listIterator(int i) {
        return this.f21749c.listIterator(i);
    }

    public final E remove(int i) {
        E remove = this.f21749c.remove(i);
        mo23227e();
        return remove;
    }

    public final boolean remove(Object obj) {
        boolean remove = this.f21749c.remove(obj);
        mo23227e();
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean removeAll = this.f21749c.removeAll(collection);
        mo23227e();
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean retainAll = this.f21749c.retainAll(collection);
        mo23227e();
        return retainAll;
    }

    public final E set(int i, E e) {
        E e2 = this.f21749c.set(i, e);
        mo23227e();
        return e2;
    }

    public final int size() {
        return this.f21749c.size();
    }

    public final List<E> subList(int i, int i2) {
        return this.f21749c.subList(i, i2);
    }

    public final Object[] toArray() {
        mo23229i();
        return this.f21750d;
    }

    public final <T> T[] toArray(T[] tArr) {
        mo23229i();
        return this.f21750d;
    }
}
