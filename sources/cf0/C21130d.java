package cf0;

import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import kotlin.collections.C23816b;
import mf0.C24362h;
import nf0.C24497a;
import p583jk.C17884p;
import p626lf.C18201b;

/* renamed from: cf0.d */
public final class C21130d<T> implements Collection<T>, C24497a {

    /* renamed from: b */
    public final T[] f52993b;

    /* renamed from: c */
    public final boolean f52994c;

    public C21130d(T[] tArr, boolean z) {
        C24362h.m61211f(tArr, LinksConfiguration.KEY_VALUES);
        this.f52993b = tArr;
        this.f52994c = z;
    }

    public final boolean add(T t) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean addAll(Collection<? extends T> collection) {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final void clear() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }

    public final boolean contains(Object obj) {
        return C23816b.m58437S0(this.f52993b, obj);
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

    public final boolean isEmpty() {
        return this.f52993b.length == 0;
    }

    public final Iterator<T> iterator() {
        return C17884p.m44341L(this.f52993b);
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

    public final int size() {
        return this.f52993b.length;
    }

    public final Object[] toArray() {
        T[] tArr = this.f52993b;
        boolean z = this.f52994c;
        Class<Object[]> cls = Object[].class;
        C24362h.m61211f(tArr, "<this>");
        if (z && C24362h.m61206a(tArr.getClass(), cls)) {
            return tArr;
        }
        Object[] copyOf = Arrays.copyOf(tArr, tArr.length, cls);
        C24362h.m61210e(copyOf, "copyOf(this, this.size, Array<Any?>::class.java)");
        return copyOf;
    }

    public final <T> T[] toArray(T[] tArr) {
        C24362h.m61211f(tArr, "array");
        return C18201b.m44909B(this, tArr);
    }
}
