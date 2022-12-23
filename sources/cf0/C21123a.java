package cf0;

import com.fyber.inneractive.sdk.external.InneractiveMediationNameConsts;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.NoSuchElementException;
import java.util.RandomAccess;
import kotlin.collections.AbstractCollection;
import mf0.C24362h;
import nf0.C24497a;
import p001a0.C0016g;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: cf0.a */
public abstract class C21123a<E> extends AbstractCollection<E> implements List<E> {

    /* renamed from: cf0.a$a */
    public static final class C21124a {
        /* renamed from: a */
        public static void m49422a(int i, int i2, int i3) {
            if (i < 0 || i2 > i3) {
                StringBuilder s = C0016g.m35s("fromIndex: ", i, ", toIndex: ", i2, ", size: ");
                s.append(i3);
                throw new IndexOutOfBoundsException(s.toString());
            } else if (i > i2) {
                throw new IllegalArgumentException(C13715c.m34244j("fromIndex: ", i, " > toIndex: ", i2));
            }
        }
    }

    /* renamed from: cf0.a$b */
    public class C21125b implements Iterator<E>, C24497a, p988j$.util.Iterator {

        /* renamed from: b */
        public int f52987b;

        public C21125b() {
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f52987b < C21123a.this.mo53351e()) {
                return true;
            }
            return false;
        }

        public final E next() {
            if (hasNext()) {
                C21123a<E> aVar = C21123a.this;
                int i = this.f52987b;
                this.f52987b = i + 1;
                return aVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: cf0.a$c */
    public class C21126c extends C21123a<E>.C13555b implements ListIterator<E> {
        public C21126c(int i) {
            super();
            int e = C21123a.this.mo53351e();
            if (i < 0 || i > e) {
                throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", e));
            }
            this.f52987b = i;
        }

        public final void add(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }

        public final boolean hasPrevious() {
            return this.f52987b > 0;
        }

        public final int nextIndex() {
            return this.f52987b;
        }

        public final E previous() {
            if (hasPrevious()) {
                C21123a<E> aVar = C21123a.this;
                int i = this.f52987b - 1;
                this.f52987b = i;
                return aVar.get(i);
            }
            throw new NoSuchElementException();
        }

        public final int previousIndex() {
            return this.f52987b - 1;
        }

        public final void set(E e) {
            throw new UnsupportedOperationException("Operation is not supported for read-only collection");
        }
    }

    /* renamed from: cf0.a$d */
    public static final class C21127d<E> extends C21123a<E> implements RandomAccess {

        /* renamed from: b */
        public final C21123a<E> f52990b;

        /* renamed from: c */
        public final int f52991c;

        /* renamed from: d */
        public int f52992d;

        public C21127d(C21123a<? extends E> aVar, int i, int i2) {
            C24362h.m61211f(aVar, "list");
            this.f52990b = aVar;
            this.f52991c = i;
            C21124a.m49422a(i, i2, aVar.mo53351e());
            this.f52992d = i2 - i;
        }

        /* renamed from: e */
        public final int mo53351e() {
            return this.f52992d;
        }

        public final E get(int i) {
            int i2 = this.f52992d;
            if (i >= 0 && i < i2) {
                return this.f52990b.get(this.f52991c + i);
            }
            throw new IndexOutOfBoundsException(C13715c.m34244j("index: ", i, ", size: ", i2));
        }
    }

    public final void add(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(int i, Collection<? extends E> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof List)) {
            return false;
        }
        Collection collection = (Collection) obj;
        C24362h.m61211f(collection, InneractiveMediationNameConsts.OTHER);
        if (size() != collection.size()) {
            return false;
        }
        java.util.Iterator it = collection.iterator();
        for (Object a : this) {
            if (!C24362h.m61206a(a, it.next())) {
            }
        }
        return true;
        return false;
    }

    public abstract E get(int i);

    public final int hashCode() {
        int i;
        int i2 = 1;
        for (Object next : this) {
            int i3 = i2 * 31;
            if (next != null) {
                i = next.hashCode();
            } else {
                i = 0;
            }
            i2 = i3 + i;
        }
        return i2;
    }

    public int indexOf(E e) {
        int i = 0;
        for (Object a : this) {
            if (C24362h.m61206a(a, e)) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public final java.util.Iterator<E> iterator() {
        return new C21125b();
    }

    public int lastIndexOf(E e) {
        ListIterator listIterator = listIterator(size());
        while (listIterator.hasPrevious()) {
            if (C24362h.m61206a(listIterator.previous(), e)) {
                return listIterator.nextIndex();
            }
        }
        return -1;
    }

    public final ListIterator<E> listIterator() {
        return new C21126c(0);
    }

    public final E remove(int i) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final E set(int i, E e) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final List<E> subList(int i, int i2) {
        return new C21127d(this, i, i2);
    }

    public final ListIterator<E> listIterator(int i) {
        return new C21126c(i);
    }
}
