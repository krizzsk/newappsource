package com.google.protobuf;

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

/* renamed from: com.google.protobuf.b0 */
public class C14587b0<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: i */
    public static final /* synthetic */ int f36814i = 0;

    /* renamed from: b */
    public final int f36815b;

    /* renamed from: c */
    public List<C14587b0<K, V>.C16530d> f36816c = Collections.emptyList();

    /* renamed from: d */
    public Map<K, V> f36817d = Collections.emptyMap();

    /* renamed from: e */
    public boolean f36818e;

    /* renamed from: f */
    public volatile C14587b0<K, V>.f f36819f;

    /* renamed from: g */
    public Map<K, V> f36820g = Collections.emptyMap();

    /* renamed from: h */
    public volatile C14587b0<K, V>.C13555b f36821h;

    /* renamed from: com.google.protobuf.b0$a */
    public class C14588a implements Iterator<Map.Entry<K, V>>, p988j$.util.Iterator {

        /* renamed from: b */
        public int f36822b;

        /* renamed from: c */
        public Iterator<Map.Entry<K, V>> f36823c;

        public C14588a() {
            this.f36822b = C14587b0.this.f36816c.size();
        }

        /* renamed from: b */
        public final Iterator<Map.Entry<K, V>> mo44005b() {
            if (this.f36823c == null) {
                this.f36823c = C14587b0.this.f36820g.entrySet().iterator();
            }
            return this.f36823c;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            int i = this.f36822b;
            if ((i <= 0 || i > C14587b0.this.f36816c.size()) && !mo44005b().hasNext()) {
                return false;
            }
            return true;
        }

        public final Object next() {
            if (mo44005b().hasNext()) {
                return (Map.Entry) mo44005b().next();
            }
            List<C14587b0<K, V>.C16530d> list = C14587b0.this.f36816c;
            int i = this.f36822b - 1;
            this.f36822b = i;
            return list.get(i);
        }

        public final void remove() {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: com.google.protobuf.b0$b */
    public class C14589b extends C14587b0<K, V>.f {
        public C14589b() {
            super();
        }

        public final java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C14588a();
        }
    }

    /* renamed from: com.google.protobuf.b0$c */
    public static class C14590c {

        /* renamed from: a */
        public static final C14591a f36826a = new C14591a();

        /* renamed from: b */
        public static final C14592b f36827b = new C14592b();

        /* renamed from: com.google.protobuf.b0$c$a */
        public static class C14591a implements java.util.Iterator<Object>, p988j$.util.Iterator {
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

        /* renamed from: com.google.protobuf.b0$c$b */
        public static class C14592b implements Iterable<Object> {
            public final java.util.Iterator<Object> iterator() {
                return C14590c.f36826a;
            }
        }
    }

    /* renamed from: com.google.protobuf.b0$d */
    public class C14593d implements Map.Entry<K, V>, Comparable<C14587b0<K, V>.C16530d> {

        /* renamed from: b */
        public final K f36828b;

        /* renamed from: c */
        public V f36829c;

        public C14593d() {
            throw null;
        }

        public C14593d(K k, V v) {
            this.f36828b = k;
            this.f36829c = v;
        }

        public final int compareTo(Object obj) {
            return this.f36828b.compareTo(((C14593d) obj).f36828b);
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
            K k = this.f36828b;
            Object key = entry.getKey();
            if (k != null) {
                z = k.equals(key);
            } else if (key == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                V v = this.f36829c;
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
            return this.f36828b;
        }

        public final V getValue() {
            return this.f36829c;
        }

        public final int hashCode() {
            K k = this.f36828b;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f36829c;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public final V setValue(V v) {
            C14587b0 b0Var = C14587b0.this;
            int i = C14587b0.f36814i;
            b0Var.mo43990b();
            V v2 = this.f36829c;
            this.f36829c = v;
            return v2;
        }

        public final String toString() {
            return this.f36828b + "=" + this.f36829c;
        }
    }

    /* renamed from: com.google.protobuf.b0$e */
    public class C14594e implements java.util.Iterator<Map.Entry<K, V>>, p988j$.util.Iterator {

        /* renamed from: b */
        public int f36831b = -1;

        /* renamed from: c */
        public boolean f36832c;

        /* renamed from: d */
        public java.util.Iterator<Map.Entry<K, V>> f36833d;

        public C14594e() {
        }

        /* renamed from: b */
        public final java.util.Iterator<Map.Entry<K, V>> mo44017b() {
            if (this.f36833d == null) {
                this.f36833d = C14587b0.this.f36817d.entrySet().iterator();
            }
            return this.f36833d;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
        }

        public final boolean hasNext() {
            if (this.f36831b + 1 < C14587b0.this.f36816c.size()) {
                return true;
            }
            if (C14587b0.this.f36817d.isEmpty() || !mo44017b().hasNext()) {
                return false;
            }
            return true;
        }

        public final Object next() {
            this.f36832c = true;
            int i = this.f36831b + 1;
            this.f36831b = i;
            if (i < C14587b0.this.f36816c.size()) {
                return C14587b0.this.f36816c.get(this.f36831b);
            }
            return (Map.Entry) mo44017b().next();
        }

        public final void remove() {
            if (this.f36832c) {
                this.f36832c = false;
                C14587b0 b0Var = C14587b0.this;
                int i = C14587b0.f36814i;
                b0Var.mo43990b();
                if (this.f36831b < C14587b0.this.f36816c.size()) {
                    C14587b0 b0Var2 = C14587b0.this;
                    int i2 = this.f36831b;
                    this.f36831b = i2 - 1;
                    b0Var2.mo44002i(i2);
                    return;
                }
                mo44017b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.google.protobuf.b0$f */
    public class C14595f extends AbstractSet<Map.Entry<K, V>> {
        public C14595f() {
        }

        public final boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C14587b0.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public final void clear() {
            C14587b0.this.clear();
        }

        public final boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C14587b0.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C14594e();
        }

        public final boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C14587b0.this.remove(entry.getKey());
            return true;
        }

        public final int size() {
            return C14587b0.this.size();
        }
    }

    public C14587b0(int i) {
        this.f36815b = i;
    }

    /* renamed from: a */
    public final int mo43989a(K k) {
        int size = this.f36816c.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f36816c.get(size).f36828b);
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
            int compareTo2 = k.compareTo(this.f36816c.get(i2).f36828b);
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
    public final void mo43990b() {
        if (this.f36818e) {
            throw new UnsupportedOperationException();
        }
    }

    /* renamed from: c */
    public final Map.Entry<K, V> mo43991c(int i) {
        return this.f36816c.get(i);
    }

    public final void clear() {
        mo43990b();
        if (!this.f36816c.isEmpty()) {
            this.f36816c.clear();
        }
        if (!this.f36817d.isEmpty()) {
            this.f36817d.clear();
        }
    }

    public final boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo43989a(comparable) >= 0 || this.f36817d.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final int mo43994d() {
        return this.f36816c.size();
    }

    /* renamed from: e */
    public final Iterable<Map.Entry<K, V>> mo43995e() {
        if (this.f36817d.isEmpty()) {
            return C14590c.f36827b;
        }
        return this.f36817d.entrySet();
    }

    public final Set<Map.Entry<K, V>> entrySet() {
        if (this.f36819f == null) {
            this.f36819f = new C14595f();
        }
        return this.f36819f;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14587b0)) {
            return super.equals(obj);
        }
        C14587b0 b0Var = (C14587b0) obj;
        int size = size();
        if (size != b0Var.size()) {
            return false;
        }
        int d = mo43994d();
        if (d != b0Var.mo43994d()) {
            return entrySet().equals(b0Var.entrySet());
        }
        for (int i = 0; i < d; i++) {
            if (!mo43991c(i).equals(b0Var.mo43991c(i))) {
                return false;
            }
        }
        if (d != size) {
            return this.f36817d.equals(b0Var.f36817d);
        }
        return true;
    }

    /* renamed from: f */
    public final SortedMap<K, V> mo43998f() {
        mo43990b();
        if (this.f36817d.isEmpty() && !(this.f36817d instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f36817d = treeMap;
            TreeMap treeMap2 = treeMap;
            this.f36820g = treeMap.descendingMap();
        }
        return (SortedMap) this.f36817d;
    }

    /* renamed from: g */
    public void mo43987g() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f36818e) {
            if (this.f36817d.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f36817d);
            }
            this.f36817d = map;
            if (this.f36820g.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f36820g);
            }
            this.f36820g = map2;
            this.f36818e = true;
        }
    }

    public final V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo43989a(comparable);
        if (a >= 0) {
            return this.f36816c.get(a).f36829c;
        }
        return this.f36817d.get(comparable);
    }

    /* renamed from: h */
    public final V put(K k, V v) {
        mo43990b();
        int a = mo43989a(k);
        if (a >= 0) {
            return this.f36816c.get(a).setValue(v);
        }
        mo43990b();
        if (this.f36816c.isEmpty() && !(this.f36816c instanceof ArrayList)) {
            this.f36816c = new ArrayList(this.f36815b);
        }
        int i = -(a + 1);
        if (i >= this.f36815b) {
            return mo43998f().put(k, v);
        }
        int size = this.f36816c.size();
        int i2 = this.f36815b;
        if (size == i2) {
            C14593d remove = this.f36816c.remove(i2 - 1);
            mo43998f().put(remove.f36828b, remove.f36829c);
        }
        this.f36816c.add(i, new C14593d(k, v));
        return null;
    }

    public final int hashCode() {
        int d = mo43994d();
        int i = 0;
        for (int i2 = 0; i2 < d; i2++) {
            i += this.f36816c.get(i2).hashCode();
        }
        if (this.f36817d.size() > 0) {
            return i + this.f36817d.hashCode();
        }
        return i;
    }

    /* renamed from: i */
    public final V mo44002i(int i) {
        mo43990b();
        V v = this.f36816c.remove(i).f36829c;
        if (!this.f36817d.isEmpty()) {
            java.util.Iterator it = mo43998f().entrySet().iterator();
            List<C14587b0<K, V>.C16530d> list = this.f36816c;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C14593d((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public final V remove(Object obj) {
        mo43990b();
        Comparable comparable = (Comparable) obj;
        int a = mo43989a(comparable);
        if (a >= 0) {
            return mo44002i(a);
        }
        if (this.f36817d.isEmpty()) {
            return null;
        }
        return this.f36817d.remove(comparable);
    }

    public final int size() {
        return this.f36817d.size() + this.f36816c.size();
    }
}
