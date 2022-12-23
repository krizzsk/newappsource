package com.google.common.collect;

import ce0.C21100e;
import com.google.common.collect.ImmutableMapEntry;
import com.google.common.collect.ImmutableMapEntrySet;
import java.util.Map;
import java.util.Objects;
import p583jk.C17884p;
import p584jl.C17885a;
import p988j$.util.function.BiConsumer;

final class RegularImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: i */
    public static final ImmutableMap<Object, Object> f36246i = new RegularImmutableMap(ImmutableMap.f36202e, (ImmutableMapEntry<K, V>[]) null, 0);
    private static final long serialVersionUID = 0;

    /* renamed from: f */
    public final transient Map.Entry<K, V>[] f36247f;

    /* renamed from: g */
    public final transient ImmutableMapEntry<K, V>[] f36248g;

    /* renamed from: h */
    public final transient int f36249h;

    public static final class KeySet<K> extends IndexedImmutableSet<K> {
        private final RegularImmutableMap<K, ?> map;

        public KeySet(RegularImmutableMap<K, ?> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        public final boolean contains(Object obj) {
            return this.map.containsKey(obj);
        }

        public final K get(int i) {
            return this.map.f36247f[i].getKey();
        }

        /* renamed from: s */
        public final boolean mo43086s() {
            return true;
        }

        public final int size() {
            return this.map.f36247f.length;
        }
    }

    public static final class Values<K, V> extends ImmutableList<V> {
        public final RegularImmutableMap<K, V> map;

        public Values(RegularImmutableMap<K, V> regularImmutableMap) {
            this.map = regularImmutableMap;
        }

        public final V get(int i) {
            return this.map.f36247f[i].getValue();
        }

        /* renamed from: s */
        public final boolean mo43086s() {
            return true;
        }

        public final int size() {
            return this.map.f36247f.length;
        }
    }

    public RegularImmutableMap(Map.Entry<K, V>[] entryArr, ImmutableMapEntry<K, V>[] immutableMapEntryArr, int i) {
        this.f36247f = entryArr;
        this.f36248g = immutableMapEntryArr;
        this.f36249h = i;
    }

    /* renamed from: l */
    public static <K, V> ImmutableMap<K, V> m35824l(int i, Map.Entry<K, V>[] entryArr) {
        Map.Entry<K, V>[] entryArr2;
        ImmutableMapEntry immutableMapEntry;
        C17884p.m44374n(i, entryArr.length);
        if (i == 0) {
            return (RegularImmutableMap) f36246i;
        }
        if (i == entryArr.length) {
            entryArr2 = entryArr;
        } else {
            entryArr2 = new ImmutableMapEntry[i];
        }
        int max = Math.max(i, 2);
        int highestOneBit = Integer.highestOneBit(max);
        if (max > ((int) (((double) highestOneBit) * 1.2d))) {
            int i2 = highestOneBit << 1;
            if (i2 > 0) {
                highestOneBit = i2;
            } else {
                highestOneBit = 1073741824;
            }
        }
        ImmutableMapEntry[] immutableMapEntryArr = new ImmutableMapEntry[highestOneBit];
        int i3 = highestOneBit - 1;
        for (int i4 = 0; i4 < i; i4++) {
            Map.Entry<K, V> entry = entryArr[i4];
            Objects.requireNonNull(entry);
            K key = entry.getKey();
            V value = entry.getValue();
            C17885a.m44454p(key, value);
            int C0 = C21100e.m49301C0(key.hashCode()) & i3;
            ImmutableMapEntry immutableMapEntry2 = immutableMapEntryArr[C0];
            if (immutableMapEntry2 == null) {
                immutableMapEntry = m35827p(entry, key, value);
            } else {
                immutableMapEntry = new ImmutableMapEntry.NonTerminalImmutableMapEntry(key, value, immutableMapEntry2);
            }
            immutableMapEntryArr[C0] = immutableMapEntry;
            entryArr2[i4] = immutableMapEntry;
            int i5 = 0;
            while (immutableMapEntry2 != null) {
                if (!key.equals(immutableMapEntry2.getKey())) {
                    i5++;
                    immutableMapEntry2 = immutableMapEntry2.mo43152a();
                } else {
                    throw ImmutableMap.m35705a(immutableMapEntry, LinksConfiguration.KEY_KEY, immutableMapEntry2);
                }
            }
            if (i5 > 8) {
                return JdkBackedImmutableMap.m35789l(i, entryArr);
            }
        }
        return new RegularImmutableMap(entryArr2, immutableMapEntryArr, i3);
    }

    /* renamed from: n */
    public static <V> V m35825n(Object obj, ImmutableMapEntry<?, V>[] immutableMapEntryArr, int i) {
        if (!(obj == null || immutableMapEntryArr == null)) {
            for (ImmutableMapEntry<?, V> immutableMapEntry = immutableMapEntryArr[i & C21100e.m49301C0(obj.hashCode())]; immutableMapEntry != null; immutableMapEntry = immutableMapEntry.mo43152a()) {
                if (obj.equals(immutableMapEntry.getKey())) {
                    return immutableMapEntry.getValue();
                }
            }
        }
        return null;
    }

    /* renamed from: o */
    public static <K, V> ImmutableMapEntry<K, V> m35826o(Map.Entry<K, V> entry) {
        return m35827p(entry, entry.getKey(), entry.getValue());
    }

    /* renamed from: p */
    public static <K, V> ImmutableMapEntry<K, V> m35827p(Map.Entry<K, V> entry, K k, V v) {
        boolean z;
        if (!(entry instanceof ImmutableMapEntry) || !((ImmutableMapEntry) entry).mo43154c()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            return (ImmutableMapEntry) entry;
        }
        return new ImmutableMapEntry<>(k, v);
    }

    /* renamed from: c */
    public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.f36247f);
    }

    /* renamed from: d */
    public final ImmutableSet<K> mo43138d() {
        return new KeySet(this);
    }

    /* renamed from: e */
    public final ImmutableCollection<V> mo43089e() {
        return new Values(this);
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        for (Map.Entry<K, V> entry : this.f36247f) {
            biConsumer.accept(entry.getKey(), entry.getValue());
        }
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        return m35825n(obj, this.f36248g, this.f36249h);
    }

    public final int size() {
        return this.f36247f.length;
    }
}
