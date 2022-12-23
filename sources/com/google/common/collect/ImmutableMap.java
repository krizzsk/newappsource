package com.google.common.collect;

import com.google.common.collect.ImmutableCollection;
import java.io.Serializable;
import java.util.AbstractMap;
import java.util.Arrays;
import java.util.Collection;
import java.util.Map;
import java.util.Objects;
import java.util.Set;
import p001a0.C0016g;
import p001a0.C0017h;
import p584jl.C17885a;
import p988j$.util.Map;
import p988j$.util.Spliterator;
import p988j$.util.function.BiConsumer;
import p988j$.util.function.BiFunction;
import p988j$.util.function.Function;

public abstract class ImmutableMap<K, V> implements Map<K, V>, Serializable, p988j$.util.Map {

    /* renamed from: e */
    public static final Map.Entry<?, ?>[] f36202e = new Map.Entry[0];

    /* renamed from: b */
    public transient ImmutableSet<Map.Entry<K, V>> f36203b;

    /* renamed from: c */
    public transient ImmutableSet<K> f36204c;

    /* renamed from: d */
    public transient ImmutableCollection<V> f36205d;

    public static abstract class IteratorBasedImmutableMap<K, V> extends ImmutableMap<K, V> {
        /* renamed from: c */
        public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
            return new ImmutableMapEntrySet<K, V>() {
                /* renamed from: I */
                public final ImmutableMap<K, V> mo43150I() {
                    return IteratorBasedImmutableMap.this;
                }

                /* renamed from: u */
                public final C14439w0<Map.Entry<K, V>> mo43108u() {
                    return IteratorBasedImmutableMap.this.mo43119l();
                }
            };
        }

        /* renamed from: d */
        public final ImmutableSet<K> mo43138d() {
            return new ImmutableMapKeySet(this);
        }

        /* renamed from: e */
        public final ImmutableCollection<V> mo43089e() {
            return new ImmutableMapValues(this);
        }

        public final /* bridge */ /* synthetic */ Set entrySet() {
            return entrySet();
        }

        public final Set keySet() {
            ImmutableSet<K> immutableSet = this.f36204c;
            if (immutableSet != null) {
                return immutableSet;
            }
            ImmutableSet<K> d = mo43138d();
            this.f36204c = d;
            return d;
        }

        /* renamed from: l */
        public abstract C14394f0 mo43119l();

        public final /* bridge */ /* synthetic */ Collection values() {
            return values();
        }
    }

    public static class SerializedForm<K, V> implements Serializable {
        private static final long serialVersionUID = 0;
        private final Object keys;
        private final Object values;

        public SerializedForm(ImmutableMap<K, V> immutableMap) {
            Object[] objArr = new Object[immutableMap.size()];
            Object[] objArr2 = new Object[immutableMap.size()];
            C14439w0<Map.Entry<K, V>> u = immutableMap.entrySet().iterator();
            int i = 0;
            while (u.hasNext()) {
                Map.Entry next = u.next();
                objArr[i] = next.getKey();
                objArr2[i] = next.getValue();
                i++;
            }
            this.keys = objArr;
            this.values = objArr2;
        }

        /* renamed from: a */
        public C14370b<K, V> mo43093a(int i) {
            return new C14370b<>(i);
        }

        public final Object readResolve() {
            Object obj = this.keys;
            if (!(obj instanceof ImmutableSet)) {
                Object[] objArr = (Object[]) obj;
                Object[] objArr2 = (Object[]) this.values;
                C14370b a = mo43093a(objArr.length);
                for (int i = 0; i < objArr.length; i++) {
                    a.mo43096c(objArr[i], objArr2[i]);
                }
                return a.mo43094a();
            }
            ImmutableSet immutableSet = (ImmutableSet) obj;
            C14370b a2 = mo43093a(immutableSet.size());
            C14439w0 u = immutableSet.iterator();
            C14439w0 u2 = ((ImmutableCollection) this.values).iterator();
            while (u.hasNext()) {
                a2.mo43096c(u.next(), u2.next());
            }
            return a2.mo43094a();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$a */
    public class C14369a extends C14439w0<K> {

        /* renamed from: b */
        public final /* synthetic */ C14439w0 f36206b;

        public C14369a(C14439w0 w0Var) {
            this.f36206b = w0Var;
        }

        public final boolean hasNext() {
            return this.f36206b.hasNext();
        }

        public final K next() {
            return ((Map.Entry) this.f36206b.next()).getKey();
        }
    }

    /* renamed from: com.google.common.collect.ImmutableMap$b */
    public static class C14370b<K, V> {

        /* renamed from: a */
        public Map.Entry<K, V>[] f36207a;

        /* renamed from: b */
        public int f36208b = 0;

        public C14370b(int i) {
            this.f36207a = new Map.Entry[i];
        }

        /* renamed from: a */
        public ImmutableMap<K, V> mo43094a() {
            return mo43095b();
        }

        /* renamed from: b */
        public ImmutableMap<K, V> mo43095b() {
            int i = this.f36208b;
            if (i == 0) {
                return RegularImmutableMap.f36246i;
            }
            if (i != 1) {
                return RegularImmutableMap.m35824l(i, this.f36207a);
            }
            Map.Entry<K, V> entry = this.f36207a[0];
            Objects.requireNonNull(entry);
            return new SingletonImmutableBiMap(entry.getKey(), entry.getValue());
        }

        /* renamed from: c */
        public void mo43096c(Object obj, Object obj2) {
            int i = this.f36208b + 1;
            Map.Entry<K, V>[] entryArr = this.f36207a;
            if (i > entryArr.length) {
                this.f36207a = (Map.Entry[]) Arrays.copyOf(entryArr, ImmutableCollection.C14366a.m35679a(entryArr.length, i));
            }
            C17885a.m44454p(obj, obj2);
            AbstractMap.SimpleImmutableEntry simpleImmutableEntry = new AbstractMap.SimpleImmutableEntry(obj, obj2);
            Map.Entry<K, V>[] entryArr2 = this.f36207a;
            int i2 = this.f36208b;
            this.f36208b = i2 + 1;
            entryArr2[i2] = simpleImmutableEntry;
        }
    }

    /* renamed from: a */
    public static IllegalArgumentException m35705a(Object obj, String str, Object obj2) {
        String valueOf = String.valueOf(obj);
        String valueOf2 = String.valueOf(obj2);
        return new IllegalArgumentException(C0016g.m31o(C0017h.m58O(valueOf2.length() + valueOf.length() + str.length() + 34, "Multiple entries with same ", str, ": ", valueOf), " and ", valueOf2));
    }

    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v1, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v2, resolved type: java.util.Set} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r2v1, resolved type: java.util.ArrayList} */
    /* JADX DEBUG: Multi-variable search result rejected for TypeSearchVarInfo{r4v11, resolved type: java.util.Set} */
    /* JADX WARNING: Multi-variable type inference failed */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static com.google.common.collect.ImmutableMap m35706b(java.util.HashMap r4) {
        /*
            boolean r0 = r4 instanceof com.google.common.collect.ImmutableMap
            if (r0 == 0) goto L_0x000e
            boolean r0 = r4 instanceof java.util.SortedMap
            if (r0 != 0) goto L_0x000e
            com.google.common.collect.ImmutableMap r4 = (com.google.common.collect.ImmutableMap) r4
            r4.mo43115g()
            return r4
        L_0x000e:
            boolean r0 = r4 instanceof java.util.EnumMap
            r1 = 1
            if (r0 == 0) goto L_0x0066
            java.util.EnumMap r4 = (java.util.EnumMap) r4
            java.util.EnumMap r0 = new java.util.EnumMap
            r0.<init>(r4)
            java.util.Set r4 = r0.entrySet()
            java.util.Iterator r4 = r4.iterator()
        L_0x0022:
            boolean r2 = r4.hasNext()
            if (r2 == 0) goto L_0x003a
            java.lang.Object r2 = r4.next()
            java.util.Map$Entry r2 = (java.util.Map.Entry) r2
            java.lang.Object r3 = r2.getKey()
            java.lang.Object r2 = r2.getValue()
            p584jl.C17885a.m44454p(r3, r2)
            goto L_0x0022
        L_0x003a:
            int r4 = r0.size()
            if (r4 == 0) goto L_0x0063
            if (r4 == r1) goto L_0x0048
            com.google.common.collect.ImmutableEnumMap r4 = new com.google.common.collect.ImmutableEnumMap
            r4.<init>(r0)
            goto L_0x0065
        L_0x0048:
            java.util.Set r4 = r0.entrySet()
            java.lang.Object r4 = p584jl.C17885a.m44428Y(r4)
            java.util.Map$Entry r4 = (java.util.Map.Entry) r4
            java.lang.Object r0 = r4.getKey()
            java.lang.Enum r0 = (java.lang.Enum) r0
            java.lang.Object r4 = r4.getValue()
            com.google.common.collect.SingletonImmutableBiMap r1 = new com.google.common.collect.SingletonImmutableBiMap
            r1.<init>(r0, r4)
            r4 = r1
            goto L_0x0065
        L_0x0063:
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r4 = com.google.common.collect.RegularImmutableMap.f36246i
        L_0x0065:
            return r4
        L_0x0066:
            java.util.Set r4 = r4.entrySet()
            java.util.Map$Entry<?, ?>[] r0 = f36202e
            boolean r2 = r4 instanceof java.util.Collection
            if (r2 == 0) goto L_0x0071
            goto L_0x008c
        L_0x0071:
            java.util.Iterator r4 = r4.iterator()
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            r4.getClass()
        L_0x007d:
            boolean r3 = r4.hasNext()
            if (r3 == 0) goto L_0x008b
            java.lang.Object r3 = r4.next()
            r2.add(r3)
            goto L_0x007d
        L_0x008b:
            r4 = r2
        L_0x008c:
            java.lang.Object[] r4 = r4.toArray(r0)
            java.util.Map$Entry[] r4 = (java.util.Map.Entry[]) r4
            int r0 = r4.length
            if (r0 == 0) goto L_0x00b2
            if (r0 == r1) goto L_0x009d
            int r0 = r4.length
            com.google.common.collect.ImmutableMap r4 = com.google.common.collect.RegularImmutableMap.m35824l(r0, r4)
            goto L_0x00b4
        L_0x009d:
            r0 = 0
            r4 = r4[r0]
            java.util.Objects.requireNonNull(r4)
            java.lang.Object r0 = r4.getKey()
            java.lang.Object r4 = r4.getValue()
            com.google.common.collect.SingletonImmutableBiMap r1 = new com.google.common.collect.SingletonImmutableBiMap
            r1.<init>(r0, r4)
            r4 = r1
            goto L_0x00b4
        L_0x00b2:
            com.google.common.collect.ImmutableMap<java.lang.Object, java.lang.Object> r4 = com.google.common.collect.RegularImmutableMap.f36246i
        L_0x00b4:
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.common.collect.ImmutableMap.m35706b(java.util.HashMap):com.google.common.collect.ImmutableMap");
    }

    /* renamed from: j */
    public static <K, V> ImmutableMap<K, V> m35707j() {
        return RegularImmutableMap.f36246i;
    }

    /* renamed from: c */
    public abstract ImmutableSet<Map.Entry<K, V>> mo43133c();

    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V compute(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object compute(Object obj, java.util.function.BiFunction biFunction) {
        return compute(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Deprecated
    public final V computeIfAbsent(K k, Function<? super K, ? extends V> function) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object computeIfAbsent(Object obj, java.util.function.Function function) {
        return computeIfAbsent(obj, Function.VivifiedWrapper.convert(function));
    }

    @Deprecated
    public final V computeIfPresent(K k, BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object computeIfPresent(Object obj, java.util.function.BiFunction biFunction) {
        return computeIfPresent(obj, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public boolean containsKey(Object obj) {
        return get(obj) != null;
    }

    public boolean containsValue(Object obj) {
        return values().contains(obj);
    }

    /* renamed from: d */
    public abstract ImmutableSet<K> mo43138d();

    /* renamed from: e */
    public abstract ImmutableCollection<V> mo43089e();

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof Map) {
            return entrySet().equals(((Map) obj).entrySet());
        }
        return false;
    }

    /* renamed from: f */
    public final ImmutableSet<Map.Entry<K, V>> entrySet() {
        ImmutableSet<Map.Entry<K, V>> immutableSet = this.f36203b;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<Map.Entry<K, V>> c = mo43133c();
        this.f36203b = c;
        return c;
    }

    public /* synthetic */ void forEach(BiConsumer biConsumer) {
        Map.CC.$default$forEach(this, biConsumer);
    }

    public /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public abstract void mo43115g();

    public abstract V get(Object obj);

    public final V getOrDefault(Object obj, V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    /* renamed from: h */
    public C14439w0<K> mo43117h() {
        return new C14369a(entrySet().iterator());
    }

    public int hashCode() {
        return C14433u0.m35897a(entrySet());
    }

    /* renamed from: i */
    public Spliterator<K> mo43118i() {
        return C14415o.m35877c(entrySet().spliterator(), new C14428s());
    }

    public final boolean isEmpty() {
        return size() == 0;
    }

    /* renamed from: k */
    public ImmutableCollection<V> values() {
        ImmutableCollection<V> immutableCollection = this.f36205d;
        if (immutableCollection != null) {
            return immutableCollection;
        }
        ImmutableCollection<V> e = mo43089e();
        this.f36205d = e;
        return e;
    }

    public Set keySet() {
        ImmutableSet<K> immutableSet = this.f36204c;
        if (immutableSet != null) {
            return immutableSet;
        }
        ImmutableSet<K> d = mo43138d();
        this.f36204c = d;
        return d;
    }

    @Deprecated
    public final V merge(K k, V v, BiFunction<? super V, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ Object merge(Object obj, Object obj2, java.util.function.BiFunction biFunction) {
        return merge(obj, obj2, BiFunction.VivifiedWrapper.convert(biFunction));
    }

    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void putAll(java.util.Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V putIfAbsent(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final boolean replace(K k, V v, V v2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final void replaceAll(BiFunction<? super K, ? super V, ? extends V> biFunction) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void replaceAll(java.util.function.BiFunction biFunction) {
        replaceAll(BiFunction.VivifiedWrapper.convert(biFunction));
    }

    public final String toString() {
        int size = size();
        C17885a.m44456q(size, "size");
        StringBuilder sb = new StringBuilder((int) Math.min(((long) size) * 8, 1073741824));
        sb.append('{');
        boolean z = true;
        for (Map.Entry entry : entrySet()) {
            if (!z) {
                sb.append(", ");
            }
            z = false;
            sb.append(entry.getKey());
            sb.append('=');
            sb.append(entry.getValue());
        }
        sb.append('}');
        return sb.toString();
    }

    public Object writeReplace() {
        return new SerializedForm(this);
    }

    @Deprecated
    public final boolean remove(Object obj, Object obj2) {
        throw new UnsupportedOperationException();
    }

    @Deprecated
    public final V replace(K k, V v) {
        throw new UnsupportedOperationException();
    }
}
