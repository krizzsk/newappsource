package p241s0;

import java.lang.reflect.Array;
import java.util.Collection;
import java.util.Iterator;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import p988j$.util.Iterator;
import p988j$.util.Map;
import p988j$.util.function.Consumer;

/* renamed from: s0.g */
public abstract class C6307g<K, V> {

    /* renamed from: a */
    public C6307g<K, V>.C13555b f19948a;

    /* renamed from: b */
    public C6307g<K, V>.C13715c f19949b;

    /* renamed from: c */
    public C6307g<K, V>.C16759e f19950c;

    /* renamed from: s0.g$a */
    public final class C6308a<T> implements Iterator<T>, p988j$.util.Iterator {

        /* renamed from: b */
        public final int f19951b;

        /* renamed from: c */
        public int f19952c;

        /* renamed from: d */
        public int f19953d;

        /* renamed from: e */
        public boolean f19954e = false;

        public C6308a(int i) {
            this.f19951b = i;
            this.f19952c = C6307g.this.mo22281d();
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            return this.f19953d < this.f19952c;
        }

        public final T next() {
            if (hasNext()) {
                T b = C6307g.this.mo22279b(this.f19953d, this.f19951b);
                this.f19953d++;
                this.f19954e = true;
                return b;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f19954e) {
                int i = this.f19953d - 1;
                this.f19953d = i;
                this.f19952c--;
                this.f19954e = false;
                C6307g.this.mo22285h(i);
                return;
            }
            throw new IllegalStateException();
        }
    }

    /* renamed from: s0.g$b */
    public final class C6309b implements Set<Map.Entry<K, V>> {
        public C6309b() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends Map.Entry<K, V>> collection) {
            int d = C6307g.this.mo22281d();
            for (Map.Entry entry : collection) {
                C6307g.this.mo22284g(entry.getKey(), entry.getValue());
            }
            if (d != C6307g.this.mo22281d()) {
                return true;
            }
            return false;
        }

        public final void clear() {
            C6307g.this.mo22278a();
        }

        public final boolean contains(Object obj) {
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            int e = C6307g.this.mo22282e(entry.getKey());
            if (e < 0) {
                return false;
            }
            Object b = C6307g.this.mo22279b(e, 1);
            Object value = entry.getValue();
            if (b == value || (b != null && b.equals(value))) {
                return true;
            }
            return false;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C6307g.m14941j(this, obj);
        }

        public final int hashCode() {
            int i;
            int i2;
            int i3 = 0;
            for (int d = C6307g.this.mo22281d() - 1; d >= 0; d--) {
                Object b = C6307g.this.mo22279b(d, 0);
                Object b2 = C6307g.this.mo22279b(d, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 == null) {
                    i2 = 0;
                } else {
                    i2 = b2.hashCode();
                }
                i3 += i ^ i2;
            }
            return i3;
        }

        public final boolean isEmpty() {
            return C6307g.this.mo22281d() == 0;
        }

        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C6311d();
        }

        public final boolean remove(Object obj) {
            throw new UnsupportedOperationException();
        }

        public final boolean removeAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final boolean retainAll(Collection<?> collection) {
            throw new UnsupportedOperationException();
        }

        public final int size() {
            return C6307g.this.mo22281d();
        }

        public final Object[] toArray() {
            throw new UnsupportedOperationException();
        }

        public final <T> T[] toArray(T[] tArr) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: s0.g$d */
    public final class C6311d implements java.util.Iterator<Map.Entry<K, V>>, Map.Entry<K, V>, p988j$.util.Iterator, Map.Entry {

        /* renamed from: b */
        public int f19958b;

        /* renamed from: c */
        public int f19959c;

        /* renamed from: d */
        public boolean f19960d = false;

        public C6311d() {
            this.f19958b = C6307g.this.mo22281d() - 1;
            this.f19959c = -1;
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (!this.f19960d) {
                throw new IllegalStateException("This container does not support retaining Map.Entry objects");
            } else if (!(obj instanceof Map.Entry)) {
                return false;
            } else {
                Map.Entry entry = (Map.Entry) obj;
                Object key = entry.getKey();
                Object b = C6307g.this.mo22279b(this.f19959c, 0);
                if (key == b || (key != null && key.equals(b))) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    return false;
                }
                Object value = entry.getValue();
                Object b2 = C6307g.this.mo22279b(this.f19959c, 1);
                if (value == b2 || (value != null && value.equals(b2))) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
                return false;
            }
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final K getKey() {
            if (this.f19960d) {
                return C6307g.this.mo22279b(this.f19959c, 0);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final V getValue() {
            if (this.f19960d) {
                return C6307g.this.mo22279b(this.f19959c, 1);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final boolean hasNext() {
            return this.f19959c < this.f19958b;
        }

        public final int hashCode() {
            int i;
            if (this.f19960d) {
                int i2 = 0;
                Object b = C6307g.this.mo22279b(this.f19959c, 0);
                Object b2 = C6307g.this.mo22279b(this.f19959c, 1);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                if (b2 != null) {
                    i2 = b2.hashCode();
                }
                return i ^ i2;
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final Object next() {
            if (hasNext()) {
                this.f19959c++;
                this.f19960d = true;
                return this;
            }
            throw new NoSuchElementException();
        }

        public final void remove() {
            if (this.f19960d) {
                C6307g.this.mo22285h(this.f19959c);
                this.f19959c--;
                this.f19958b--;
                this.f19960d = false;
                return;
            }
            throw new IllegalStateException();
        }

        public final V setValue(V v) {
            if (this.f19960d) {
                return C6307g.this.mo22286i(this.f19959c, v);
            }
            throw new IllegalStateException("This container does not support retaining Map.Entry objects");
        }

        public final String toString() {
            return getKey() + "=" + getValue();
        }
    }

    /* renamed from: j */
    public static <T> boolean m14941j(Set<T> set, Object obj) {
        if (set == obj) {
            return true;
        }
        if (obj instanceof Set) {
            Set set2 = (Set) obj;
            try {
                if (set.size() != set2.size() || !set.containsAll(set2)) {
                    return false;
                }
                return true;
            } catch (ClassCastException | NullPointerException unused) {
            }
        }
        return false;
    }

    /* renamed from: k */
    public static <K, V> boolean m14942k(java.util.Map<K, V> map, Collection<?> collection) {
        int size = map.size();
        java.util.Iterator<K> it = map.keySet().iterator();
        while (it.hasNext()) {
            if (!collection.contains(it.next())) {
                it.remove();
            }
        }
        if (size != map.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public abstract void mo22278a();

    /* renamed from: b */
    public abstract Object mo22279b(int i, int i2);

    /* renamed from: c */
    public abstract java.util.Map<K, V> mo22280c();

    /* renamed from: d */
    public abstract int mo22281d();

    /* renamed from: e */
    public abstract int mo22282e(Object obj);

    /* renamed from: f */
    public abstract int mo22283f(Object obj);

    /* renamed from: g */
    public abstract void mo22284g(K k, V v);

    /* renamed from: h */
    public abstract void mo22285h(int i);

    /* renamed from: i */
    public abstract V mo22286i(int i, V v);

    /* renamed from: l */
    public final Object[] mo22353l(int i, Object[] objArr) {
        int d = mo22281d();
        if (objArr.length < d) {
            objArr = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), d);
        }
        for (int i2 = 0; i2 < d; i2++) {
            objArr[i2] = mo22279b(i2, i);
        }
        if (objArr.length > d) {
            objArr[d] = null;
        }
        return objArr;
    }

    /* renamed from: s0.g$c */
    public final class C6310c implements Set<K> {
        public C6310c() {
        }

        public final boolean add(K k) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends K> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C6307g.this.mo22278a();
        }

        public final boolean contains(Object obj) {
            return C6307g.this.mo22282e(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            java.util.Map c = C6307g.this.mo22280c();
            for (Object containsKey : collection) {
                if (!c.containsKey(containsKey)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean equals(Object obj) {
            return C6307g.m14941j(this, obj);
        }

        public final int hashCode() {
            int i;
            int i2 = 0;
            for (int d = C6307g.this.mo22281d() - 1; d >= 0; d--) {
                Object b = C6307g.this.mo22279b(d, 0);
                if (b == null) {
                    i = 0;
                } else {
                    i = b.hashCode();
                }
                i2 += i;
            }
            return i2;
        }

        public final boolean isEmpty() {
            return C6307g.this.mo22281d() == 0;
        }

        public final java.util.Iterator<K> iterator() {
            return new C6308a(0);
        }

        public final boolean remove(Object obj) {
            int e = C6307g.this.mo22282e(obj);
            if (e < 0) {
                return false;
            }
            C6307g.this.mo22285h(e);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            java.util.Map c = C6307g.this.mo22280c();
            int size = c.size();
            for (Object remove : collection) {
                c.remove(remove);
            }
            if (size != c.size()) {
                return true;
            }
            return false;
        }

        public final boolean retainAll(Collection<?> collection) {
            return C6307g.m14942k(C6307g.this.mo22280c(), collection);
        }

        public final int size() {
            return C6307g.this.mo22281d();
        }

        public final Object[] toArray() {
            C6307g gVar = C6307g.this;
            int d = gVar.mo22281d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = gVar.mo22279b(i, 0);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C6307g.this.mo22353l(0, tArr);
        }
    }

    /* renamed from: s0.g$e */
    public final class C6312e implements Collection<V> {
        public C6312e() {
        }

        public final boolean add(V v) {
            throw new UnsupportedOperationException();
        }

        public final boolean addAll(Collection<? extends V> collection) {
            throw new UnsupportedOperationException();
        }

        public final void clear() {
            C6307g.this.mo22278a();
        }

        public final boolean contains(Object obj) {
            return C6307g.this.mo22283f(obj) >= 0;
        }

        public final boolean containsAll(Collection<?> collection) {
            for (Object contains : collection) {
                if (!contains(contains)) {
                    return false;
                }
            }
            return true;
        }

        public final boolean isEmpty() {
            return C6307g.this.mo22281d() == 0;
        }

        public final java.util.Iterator<V> iterator() {
            return new C6308a(1);
        }

        public final boolean remove(Object obj) {
            int f = C6307g.this.mo22283f(obj);
            if (f < 0) {
                return false;
            }
            C6307g.this.mo22285h(f);
            return true;
        }

        public final boolean removeAll(Collection<?> collection) {
            int d = C6307g.this.mo22281d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (collection.contains(C6307g.this.mo22279b(i, 1))) {
                    C6307g.this.mo22285h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final boolean retainAll(Collection<?> collection) {
            int d = C6307g.this.mo22281d();
            int i = 0;
            boolean z = false;
            while (i < d) {
                if (!collection.contains(C6307g.this.mo22279b(i, 1))) {
                    C6307g.this.mo22285h(i);
                    i--;
                    d--;
                    z = true;
                }
                i++;
            }
            return z;
        }

        public final int size() {
            return C6307g.this.mo22281d();
        }

        public final Object[] toArray() {
            C6307g gVar = C6307g.this;
            int d = gVar.mo22281d();
            Object[] objArr = new Object[d];
            for (int i = 0; i < d; i++) {
                objArr[i] = gVar.mo22279b(i, 1);
            }
            return objArr;
        }

        public final <T> T[] toArray(T[] tArr) {
            return C6307g.this.mo22353l(1, tArr);
        }
    }
}
