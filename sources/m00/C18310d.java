package m00;

import android.content.Context;
import android.view.View;
import c00.C13729j;
import c00.C13731l;
import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: m00.d */
public abstract class C18310d<T, VT extends View, VH> extends C18307b<T, VT, VH> implements List<T> {

    /* renamed from: g */
    public final List<T> f46697g;

    /* renamed from: h */
    public boolean f46698h;

    /* renamed from: m00.d$a */
    public class C18311a extends C13729j<T> {
        public C18311a(Iterator it) {
            super(it);
        }

        public final void remove() {
            super.remove();
            C18310d.this.mo50748i();
        }
    }

    /* renamed from: m00.d$b */
    public class C18312b extends C13731l<T> {
        public C18312b(ListIterator<T> listIterator) {
            super(listIterator);
        }

        public final void add(T t) {
            super.add(t);
            C18310d.this.mo50748i();
        }

        public final void remove() {
            super.remove();
            C18310d.this.mo50748i();
        }

        public final void set(T t) {
            super.set(t);
            C18310d.this.mo50748i();
        }
    }

    public C18310d(Context context, int i) {
        this(context, i, i, new ArrayList());
    }

    public final void add(int i, T t) {
        this.f46697g.add(i, t);
        mo50748i();
    }

    public final boolean addAll(int i, Collection<? extends T> collection) {
        if (!this.f46697g.addAll(i, collection)) {
            return false;
        }
        mo50748i();
        return true;
    }

    public final void clear() {
        this.f46697g.clear();
        mo50748i();
    }

    public final boolean contains(Object obj) {
        return this.f46697g.contains(obj);
    }

    public final boolean containsAll(Collection<?> collection) {
        return this.f46697g.containsAll(collection);
    }

    public final boolean equals(Object obj) {
        return this.f46697g.equals(obj);
    }

    public final T get(int i) {
        return this.f46697g.get(i);
    }

    public final int getCount() {
        return this.f46697g.size();
    }

    public final T getItem(int i) {
        return this.f46697g.get(i);
    }

    public final int hashCode() {
        return this.f46697g.hashCode();
    }

    /* renamed from: i */
    public final void mo50748i() {
        if (this.f46698h) {
            notifyDataSetChanged();
        }
    }

    public final int indexOf(Object obj) {
        return this.f46697g.indexOf(obj);
    }

    public final boolean isEmpty() {
        return this.f46697g.isEmpty();
    }

    public final Iterator<T> iterator() {
        return new C18311a(this.f46697g.iterator());
    }

    public final int lastIndexOf(Object obj) {
        return this.f46697g.lastIndexOf(obj);
    }

    public final ListIterator<T> listIterator() {
        return new C18312b(this.f46697g.listIterator());
    }

    public final void notifyDataSetChanged() {
        super.notifyDataSetChanged();
        this.f46698h = true;
    }

    public final T remove(int i) {
        T remove = this.f46697g.remove(i);
        mo50748i();
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        if (!this.f46697g.removeAll(collection)) {
            return false;
        }
        mo50748i();
        return true;
    }

    public final boolean retainAll(Collection<?> collection) {
        if (!this.f46697g.retainAll(collection)) {
            return false;
        }
        mo50748i();
        return true;
    }

    public final T set(int i, T t) {
        T t2 = this.f46697g.set(i, t);
        mo50748i();
        return t2;
    }

    public final int size() {
        return this.f46697g.size();
    }

    public final List<T> subList(int i, int i2) {
        throw new UnsupportedOperationException("subList is not supported");
    }

    public final Object[] toArray() {
        return this.f46697g.toArray();
    }

    public C18310d(Context context, int i, List<T> list) {
        this(context, i, i, list);
    }

    public final ListIterator<T> listIterator(int i) {
        return new C18312b(this.f46697g.listIterator(i));
    }

    public final <E> E[] toArray(E[] eArr) {
        return this.f46697g.toArray(eArr);
    }

    public C18310d(Context context, int i, int i2, List list) {
        super(context, i, i2);
        this.f46698h = true;
        C21100e.m49373x(list, "list");
        this.f46697g = list;
    }

    public final boolean add(T t) {
        boolean add = this.f46697g.add(t);
        mo50748i();
        return add;
    }

    public final boolean addAll(Collection<? extends T> collection) {
        if (!this.f46697g.addAll(collection)) {
            return false;
        }
        mo50748i();
        return true;
    }

    public final boolean remove(Object obj) {
        if (!this.f46697g.remove(obj)) {
            return false;
        }
        mo50748i();
        return true;
    }
}
