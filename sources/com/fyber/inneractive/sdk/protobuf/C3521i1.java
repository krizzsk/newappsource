package com.fyber.inneractive.sdk.protobuf;

import com.fyber.inneractive.sdk.protobuf.C3596u;
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

/* renamed from: com.fyber.inneractive.sdk.protobuf.i1 */
public class C3521i1<K extends Comparable<K>, V> extends AbstractMap<K, V> {

    /* renamed from: g */
    public static final /* synthetic */ int f12455g = 0;

    /* renamed from: a */
    public final int f12456a;

    /* renamed from: b */
    public List<C3521i1<K, V>.C13715c> f12457b;

    /* renamed from: c */
    public Map<K, V> f12458c;

    /* renamed from: d */
    public boolean f12459d;

    /* renamed from: e */
    public volatile C3521i1<K, V>.C16759e f12460e;

    /* renamed from: f */
    public Map<K, V> f12461f;

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$a */
    public class C3522a extends C3521i1<FieldDescriptorType, Object> {
        public C3522a(int i) {
            super(i, (C3522a) null);
        }

        /* renamed from: d */
        public void mo14961d() {
            if (!this.f12459d) {
                for (int i = 0; i < this.f12457b.size(); i++) {
                    Map.Entry a = mo14954a(i);
                    if (((C3596u.C3597a) a.getKey()).mo14765b()) {
                        a.setValue(Collections.unmodifiableList((List) a.getValue()));
                    }
                }
                for (Map.Entry entry : mo14956b()) {
                    if (((C3596u.C3597a) entry.getKey()).mo14765b()) {
                        entry.setValue(Collections.unmodifiableList((List) entry.getValue()));
                    }
                }
            }
            C3521i1.super.mo14961d();
        }

        public /* bridge */ /* synthetic */ Object put(Object obj, Object obj2) {
            return put((Comparable) obj, obj2);
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b */
    public static class C3523b {

        /* renamed from: a */
        public static final Iterator<Object> f12462a = new C3524a();

        /* renamed from: b */
        public static final Iterable<Object> f12463b = new C3525b();

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$a */
        public class C3524a implements Iterator<Object>, p988j$.util.Iterator {
            public final /* synthetic */ void forEachRemaining(Consumer consumer) {
                Iterator.CC.$default$forEachRemaining(this, consumer);
            }

            public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
                forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
            }

            public boolean hasNext() {
                return false;
            }

            public Object next() {
                throw new NoSuchElementException();
            }

            public void remove() {
                throw new UnsupportedOperationException();
            }
        }

        /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$b$b */
        public class C3525b implements Iterable<Object> {
            public java.util.Iterator<Object> iterator() {
                return C3523b.f12462a;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$c */
    public class C3526c implements Map.Entry<K, V>, Comparable<C3521i1<K, V>.C13715c> {

        /* renamed from: a */
        public final K f12464a;

        /* renamed from: b */
        public V f12465b;

        public C3526c(K k, V v) {
            this.f12464a = k;
            this.f12465b = v;
        }

        public int compareTo(Object obj) {
            return this.f12464a.compareTo(((C3526c) obj).f12464a);
        }

        public boolean equals(Object obj) {
            boolean z;
            boolean z2;
            if (obj == this) {
                return true;
            }
            if (!(obj instanceof Map.Entry)) {
                return false;
            }
            Map.Entry entry = (Map.Entry) obj;
            K k = this.f12464a;
            Object key = entry.getKey();
            if (k != null) {
                z = k.equals(key);
            } else if (key == null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                V v = this.f12465b;
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

        public Object getKey() {
            return this.f12464a;
        }

        public V getValue() {
            return this.f12465b;
        }

        public int hashCode() {
            K k = this.f12464a;
            int i = 0;
            int hashCode = k == null ? 0 : k.hashCode();
            V v = this.f12465b;
            if (v != null) {
                i = v.hashCode();
            }
            return hashCode ^ i;
        }

        public V setValue(V v) {
            C3521i1 i1Var = C3521i1.this;
            int i = C3521i1.f12455g;
            i1Var.mo14955a();
            V v2 = this.f12465b;
            this.f12465b = v;
            return v2;
        }

        public String toString() {
            return this.f12464a + "=" + this.f12465b;
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$d */
    public class C3527d implements java.util.Iterator<Map.Entry<K, V>>, p988j$.util.Iterator {

        /* renamed from: a */
        public int f12467a = -1;

        /* renamed from: b */
        public boolean f12468b;

        /* renamed from: c */
        public java.util.Iterator<Map.Entry<K, V>> f12469c;

        public C3527d() {
        }

        /* renamed from: b */
        public final java.util.Iterator<Map.Entry<K, V>> mo14978b() {
            if (this.f12469c == null) {
                this.f12469c = C3521i1.this.f12458c.entrySet().iterator();
            }
            return this.f12469c;
        }

        public final /* synthetic */ void forEachRemaining(Consumer consumer) {
            Iterator.CC.$default$forEachRemaining(this, consumer);
        }

        public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
            forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
        }

        public boolean hasNext() {
            if (this.f12467a + 1 < C3521i1.this.f12457b.size()) {
                return true;
            }
            if (C3521i1.this.f12458c.isEmpty() || !mo14978b().hasNext()) {
                return false;
            }
            return true;
        }

        public Object next() {
            this.f12468b = true;
            int i = this.f12467a + 1;
            this.f12467a = i;
            if (i < C3521i1.this.f12457b.size()) {
                return C3521i1.this.f12457b.get(this.f12467a);
            }
            return (Map.Entry) mo14978b().next();
        }

        public void remove() {
            if (this.f12468b) {
                this.f12468b = false;
                C3521i1 i1Var = C3521i1.this;
                int i = C3521i1.f12455g;
                i1Var.mo14955a();
                if (this.f12467a < C3521i1.this.f12457b.size()) {
                    C3521i1 i1Var2 = C3521i1.this;
                    int i2 = this.f12467a;
                    this.f12467a = i2 - 1;
                    i1Var2.mo14957c(i2);
                    return;
                }
                mo14978b().remove();
                return;
            }
            throw new IllegalStateException("remove() was called before next()");
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.protobuf.i1$e */
    public class C3528e extends AbstractSet<Map.Entry<K, V>> {
        public C3528e() {
        }

        public boolean add(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (contains(entry)) {
                return false;
            }
            C3521i1.this.put((Comparable) entry.getKey(), entry.getValue());
            return true;
        }

        public void clear() {
            C3521i1.this.clear();
        }

        public boolean contains(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            Object obj2 = C3521i1.this.get(entry.getKey());
            Object value = entry.getValue();
            if (obj2 == value || (obj2 != null && obj2.equals(value))) {
                return true;
            }
            return false;
        }

        public java.util.Iterator<Map.Entry<K, V>> iterator() {
            return new C3527d();
        }

        public boolean remove(Object obj) {
            Map.Entry entry = (Map.Entry) obj;
            if (!contains(entry)) {
                return false;
            }
            C3521i1.this.remove(entry.getKey());
            return true;
        }

        public int size() {
            return C3521i1.this.size();
        }
    }

    public /* synthetic */ C3521i1(int i, C3522a aVar) {
        this(i);
    }

    /* renamed from: b */
    public static <FieldDescriptorType extends C3596u.C3597a<FieldDescriptorType>> C3521i1<FieldDescriptorType, Object> m9010b(int i) {
        return new C3522a(i);
    }

    /* renamed from: a */
    public Map.Entry<K, V> mo14954a(int i) {
        return this.f12457b.get(i);
    }

    /* renamed from: c */
    public final V mo14957c(int i) {
        mo14955a();
        V v = this.f12457b.remove(i).f12465b;
        if (!this.f12458c.isEmpty()) {
            java.util.Iterator it = mo14958c().entrySet().iterator();
            List<C3521i1<K, V>.C13715c> list = this.f12457b;
            Map.Entry entry = (Map.Entry) it.next();
            list.add(new C3526c((Comparable) entry.getKey(), entry.getValue()));
            it.remove();
        }
        return v;
    }

    public void clear() {
        mo14955a();
        if (!this.f12457b.isEmpty()) {
            this.f12457b.clear();
        }
        if (!this.f12458c.isEmpty()) {
            this.f12458c.clear();
        }
    }

    public boolean containsKey(Object obj) {
        Comparable comparable = (Comparable) obj;
        if (mo14952a(comparable) >= 0 || this.f12458c.containsKey(comparable)) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public void mo14961d() {
        Map<K, V> map;
        Map<K, V> map2;
        if (!this.f12459d) {
            if (this.f12458c.isEmpty()) {
                map = Collections.emptyMap();
            } else {
                map = Collections.unmodifiableMap(this.f12458c);
            }
            this.f12458c = map;
            if (this.f12461f.isEmpty()) {
                map2 = Collections.emptyMap();
            } else {
                map2 = Collections.unmodifiableMap(this.f12461f);
            }
            this.f12461f = map2;
            this.f12459d = true;
        }
    }

    public Set<Map.Entry<K, V>> entrySet() {
        if (this.f12460e == null) {
            this.f12460e = new C3528e();
        }
        return this.f12460e;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3521i1)) {
            return super.equals(obj);
        }
        C3521i1 i1Var = (C3521i1) obj;
        int size = size();
        if (size != i1Var.size()) {
            return false;
        }
        int size2 = this.f12457b.size();
        if (size2 != i1Var.f12457b.size()) {
            return entrySet().equals(i1Var.entrySet());
        }
        for (int i = 0; i < size2; i++) {
            if (!mo14954a(i).equals(i1Var.mo14954a(i))) {
                return false;
            }
        }
        if (size2 != size) {
            return this.f12458c.equals(i1Var.f12458c);
        }
        return true;
    }

    public V get(Object obj) {
        Comparable comparable = (Comparable) obj;
        int a = mo14952a(comparable);
        if (a >= 0) {
            return this.f12457b.get(a).f12465b;
        }
        return this.f12458c.get(comparable);
    }

    public int hashCode() {
        int size = this.f12457b.size();
        int i = 0;
        for (int i2 = 0; i2 < size; i2++) {
            i += this.f12457b.get(i2).hashCode();
        }
        if (this.f12458c.size() > 0) {
            return i + this.f12458c.hashCode();
        }
        return i;
    }

    public V remove(Object obj) {
        mo14955a();
        Comparable comparable = (Comparable) obj;
        int a = mo14952a(comparable);
        if (a >= 0) {
            return mo14957c(a);
        }
        if (this.f12458c.isEmpty()) {
            return null;
        }
        return this.f12458c.remove(comparable);
    }

    public int size() {
        return this.f12458c.size() + this.f12457b.size();
    }

    public C3521i1(int i) {
        this.f12456a = i;
        this.f12457b = Collections.emptyList();
        this.f12458c = Collections.emptyMap();
        this.f12461f = Collections.emptyMap();
    }

    /* renamed from: a */
    public V put(K k, V v) {
        mo14955a();
        int a = mo14952a(k);
        if (a >= 0) {
            C3526c cVar = this.f12457b.get(a);
            C3521i1.this.mo14955a();
            V v2 = cVar.f12465b;
            cVar.f12465b = v;
            return v2;
        }
        mo14955a();
        if (this.f12457b.isEmpty() && !(this.f12457b instanceof ArrayList)) {
            this.f12457b = new ArrayList(this.f12456a);
        }
        int i = -(a + 1);
        if (i >= this.f12456a) {
            return mo14958c().put(k, v);
        }
        int size = this.f12457b.size();
        int i2 = this.f12456a;
        if (size == i2) {
            C3526c remove = this.f12457b.remove(i2 - 1);
            mo14958c().put(remove.f12464a, remove.f12465b);
        }
        this.f12457b.add(i, new C3526c(k, v));
        return null;
    }

    /* renamed from: b */
    public Iterable<Map.Entry<K, V>> mo14956b() {
        if (this.f12458c.isEmpty()) {
            return C3523b.f12463b;
        }
        return this.f12458c.entrySet();
    }

    /* renamed from: c */
    public final SortedMap<K, V> mo14958c() {
        mo14955a();
        if (this.f12458c.isEmpty() && !(this.f12458c instanceof TreeMap)) {
            TreeMap treeMap = new TreeMap();
            this.f12458c = treeMap;
            this.f12461f = treeMap.descendingMap();
        }
        return (SortedMap) this.f12458c;
    }

    /* renamed from: a */
    public final int mo14952a(K k) {
        int size = this.f12457b.size() - 1;
        if (size >= 0) {
            int compareTo = k.compareTo(this.f12457b.get(size).f12464a);
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
            int compareTo2 = k.compareTo(this.f12457b.get(i2).f12464a);
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

    /* renamed from: a */
    public final void mo14955a() {
        if (this.f12459d) {
            throw new UnsupportedOperationException();
        }
    }
}
