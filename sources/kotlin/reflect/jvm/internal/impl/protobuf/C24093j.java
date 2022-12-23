package kotlin.reflect.jvm.internal.impl.protobuf;

import java.lang.Comparable;
import java.util.AbstractMap;
import java.util.AbstractSet;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;
import java.util.SortedMap;
import java.util.TreeMap;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j */
public class C24093j<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f61090g = 0;

    /* renamed from: b */
    public final int f61091b;

    /* renamed from: c */
    public List<C24093j<K, V>.C13555b> f61092c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f61093d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f61094e;

    /* renamed from: f */
    public volatile C24093j<K, V>.C16530d f61095f;

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a */
    public static class C24094a {

        /* renamed from: a */
        public static final C24095a f61096a = new C24095a();

        /* renamed from: b */
        public static final C24096b f61097b = new C24096b();

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a$a */
        public static class C24095a implements Iterator<Object>, p988j$.util.Iterator {
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
            }

            public final boolean hasNext() {
                return false;
            }

            public final Object next() {
                throw new NoSuchElementException();
            }

            public final void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$a$b */
        public static class C24096b implements Iterable<Object> {
            public final java.util.Iterator<Object> iterator() {
                return C24094a.f61096a;
            }
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$b */
    public class C24097b implements Comparable<C24093j<K, V>.C13555b>, Map.Entry<K, V> {

        /* renamed from: b */
        public final K f61098b;

        /* renamed from: c */
        public V f61099c;

        public C24097b() {
            throw null;
        }

        public C24097b(K k, V v) {
            this.f61098b = k;
            this.f61099c = v;
        }

        public final int compareTo(Object obj) {
            return this.f61098b.compareTo(((C24097b) obj).f61098b);
        }

        public final boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f61098b;
            Object key = entry.getKey();
            if (k != null) {
                z = k.equals(key);
            } else if (key == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                V v = this.f61099c;
                Object value = entry.getValue();
                if (v != null) {
                    z2 = v.equals(value);
                } else if (value == null) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                if (z2) {
                    return true;
                }
            }
            return false;
        }

        public final Object getKey() {
            return this.f61098b;
        }

        public final V getValue() {
            return this.f61099c;
        }

        public final int hashCode() {
            K k = this.f61098b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f61099c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            C24093j jVar = C24093j.this;
            int i = C24093j.f61090g;
            jVar.mo60058b();
            V v2 = this.f61099c;
            this.f61099c = v;
            return v2;
        }

        public final String toString() {
            String valueOf = String.valueOf(this.f61098b);
            String valueOf2 = String.valueOf(this.f61099c);
            return C13715c.m34245k(new StringBuilder(valueOf2.length() + valueOf.length() + 1), valueOf, "=", valueOf2);
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$c */
    public class C24098c implements java.util.Iterator<Map.Entry<K, V>>, p988j$.util.Iterator {

        /* renamed from: b */
        public int f61101b = -1;

        /* renamed from: c */
        public boolean f61102c;

        /* renamed from: d */
        public java.util.Iterator<Map.Entry<K, V>> f61103d;

        public C24098c() {
        }

        /* renamed from: b */
        public final java.util.Iterator<Map.Entry<K, V>> mo60078b() {
            if (this.f61103d == null) {
                this.f61103d = C24093j.this.f61093d.entrySet().iterator();
            }
            return this.f61103d;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f61101b + 1 < C24093j.this.f61092c.size() || mo60078b().hasNext()) {
                return true;
            }
            return false;
        }

        public final Object next() {
            this.f61102c = true;
            int i = this.f61101b + 1;
            this.f61101b = i;
            if (i < C24093j.this.f61092c.size()) {
                return C24093j.this.f61092c.get(this.f61101b);
            }
            return (Map.Entry) mo60078b().next();
        }

        public final void remove() {
            if (this.f61102c) {
                this.f61102c = false;
                C24093j jVar = C24093j.this;
                int i = C24093j.f61090g;
                jVar.mo60058b();
                if (this.f61101b < C24093j.this.f61092c.size()) {
                    C24093j jVar2 = C24093j.this;
                    int i2 = this.f61101b;
                    this.f61101b = i2 - 1;
                    jVar2.mo60065f(i2);
                    return;
                }
                mo60078b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: kotlin.reflect.jvm.internal.impl.protobuf.j$d */
    public class C24099d extends AbstractSet<Map.Entry<K, V>> {
        public C24099d() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C24093j.this.mo60063e((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            C24093j.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C24093j.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C24098c();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C24093j.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return C24093j.this.size();
        }
    }

    public C24093j(int i) {
        this.f61091b = i;
    }

    /* renamed from: a */
    public final int mo60057a(K k) {
        int size = this.f61092c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f61092c.get(size).f61098b);
            if (compareTo > 0) {
                return -(size + 2);
            }
            if (compareTo == 0) {
                return size;
            }
        }
        int i = 0;
        while (i <= size) {
            int i2 = (i + size) / 2;
            int compareTo2 = k.compareTo(this.f61092c.get(i2).f61098b);
            if (compareTo2 < 0) {
                size = i2 - 1;
            } else if (compareTo2 <= 0) {
                return i2;
            } else {
                i = i2 + 1;
            }
        }
        return -(i + 1);
    }

    /* renamed from: b */
    public final void mo60058b() {
        if (this.f61094e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Iterable<Map.Entry<K, V>> mo60059c() {
        return this.f61093d.isEmpty() ? C24094a.f61097b : this.f61093d.entrySet();
    }

    public final void clear() {
        mo60058b();
        if (!this.f61092c.isEmpty()) {
            this.f61092c.clear();
        }
        if (!this.f61093d.isEmpty()) {
            this.f61093d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo60057a(comparable) >= 0 || this.f61093d.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final SortedMap<K, V> mo60062d() {
        mo60058b();
        if (this.f61093d.isEmpty() && !(this.f61093d instanceof TreeMap)) {
            this.f61093d = new TreeMap();
        }
        return (SortedMap) this.f61093d;
    }

    /* renamed from: e */
    public final V mo60063e(K k, V v) {
        mo60058b();
        int a = mo60057a(k);
        if (a >= 0) {
            return this.f61092c.get(a).setValue(v);
        }
        mo60058b();
        if (this.f61092c.isEmpty() && !(this.f61092c instanceof ArrayList)) {
            this.f61092c = new ArrayList(this.f61091b);
        }
        int i = -(a + 1);
        if (i >= this.f61091b) {
            return mo60062d().put(k, v);
        }
        int size = this.f61092c.size();
        int i2 = this.f61091b;
        if (size == i2) {
            C24097b remove = this.f61092c.remove(i2 - 1);
            mo60062d().put(remove.f61098b, remove.f61099c);
        }
        this.f61092c.add(i, new C24097b(k, v));
        return null;
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f61095f == null) {
            this.f61095f = new C24099d();
        }
        return this.f61095f;
    }

    /* renamed from: f */
    public final V mo60065f(int i) {
        mo60058b();
        V v = this.f61092c.remove(i).f61099c;
        if (!this.f61093d.isEmpty()) {
            java.util.Iterator it = mo60062d().entrySet().iterator();
            List<C24093j<K, V>.C13555b> list = this.f61092c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C24097b((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo60057a(comparable);
        if (a >= 0) {
            return this.f61092c.get(a).f61099c;
        }
        return this.f61093d.get(comparable);
    }

    public final V remove(Object obj) {
        mo60058b();
        Comparable comparable = (Comparable) obj;
        int a = mo60057a(comparable);
        if (a >= 0) {
            return mo60065f(a);
        }
        if (this.f61093d.isEmpty()) {
            return null;
        }
        return this.f61093d.remove(comparable);
    }

    public final int size() {
        return this.f61093d.size() + this.f61092c.size();
    }
}
