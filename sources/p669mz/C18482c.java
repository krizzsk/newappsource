package p669mz;

import c00.C13729j;
import c00.C13730k;
import c00.C13734o;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

/* renamed from: mz.c */
public final class C18482c<E> extends C13730k<E> implements C18480a<C18486d<E>> {

    /* renamed from: c */
    public final ArrayList f47086c = new ArrayList(1);

    /* renamed from: mz.c$a */
    public class C18483a extends C13729j<E> {
        public C18483a(Iterator it) {
            super(it);
        }

        public final void remove() {
            super.remove();
            C18482c.this.mo50907s();
        }
    }

    /* renamed from: mz.c$b */
    public class C18484b extends C13734o<E> {
        public C18484b(ListIterator listIterator) {
            super(listIterator);
        }

        /* renamed from: e */
        public final void mo40649e() {
            C18482c.this.mo50907s();
        }
    }

    /* renamed from: mz.c$c */
    public class C18485c extends C13734o<E> {
        public C18485c(ListIterator listIterator) {
            super(listIterator);
        }

        /* renamed from: e */
        public final void mo40649e() {
            C18482c.this.mo50907s();
        }
    }

    /* renamed from: mz.c$d */
    public interface C18486d<E> {
        /* renamed from: a */
        void mo50908a();
    }

    public C18482c(ArrayList arrayList) {
        super(arrayList);
    }

    /* renamed from: a */
    public final void mo50903a(Object obj) {
        this.f47086c.add((C18486d) obj);
    }

    public final void add(int i, E e) {
        super.add(i, e);
        mo50907s();
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        boolean addAll = super.addAll(i, collection);
        mo50907s();
        return addAll;
    }

    /* renamed from: b */
    public final void mo50904b(Object obj) {
        this.f47086c.remove((C18486d) obj);
    }

    public final void clear() {
        super.clear();
        mo50907s();
    }

    public final Iterator<E> iterator() {
        return new C18483a(super.iterator());
    }

    public final ListIterator<E> listIterator() {
        return new C18484b(super.listIterator());
    }

    public final E remove(int i) {
        E remove = super.remove(i);
        mo50907s();
        return remove;
    }

    public final boolean removeAll(Collection<?> collection) {
        boolean removeAll = super.removeAll(collection);
        mo50907s();
        return removeAll;
    }

    public final boolean retainAll(Collection<?> collection) {
        boolean retainAll = super.retainAll(collection);
        mo50907s();
        return retainAll;
    }

    /* renamed from: s */
    public final void mo50907s() {
        Iterator it = this.f47086c.iterator();
        while (it.hasNext()) {
            ((C18486d) it.next()).mo50908a();
        }
    }

    public final E set(int i, E e) {
        E e2 = super.set(i, e);
        mo50907s();
        return e2;
    }

    public final List<E> subList(int i, int i2) {
        throw new UnsupportedOperationException("subList is not currently supported (because it's hard)");
    }

    public final ListIterator<E> listIterator(int i) {
        return new C18485c(super.listIterator(i));
    }

    public final boolean add(E e) {
        boolean add = super.add(e);
        mo50907s();
        return add;
    }

    public final boolean addAll(Collection<? extends E> collection) {
        boolean addAll = super.addAll(collection);
        mo50907s();
        return addAll;
    }

    public final boolean remove(Object obj) {
        boolean remove = super.remove(obj);
        mo50907s();
        return remove;
    }
}
