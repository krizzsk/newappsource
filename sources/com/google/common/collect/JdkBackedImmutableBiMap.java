package com.google.common.collect;

import com.google.common.collect.ImmutableMapEntrySet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p988j$.util.Map;

final class JdkBackedImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {
    private final Map<V, K> backwardDelegate;

    /* renamed from: f */
    public final transient ImmutableList<Map.Entry<K, V>> f36231f;
    private final Map<K, V> forwardDelegate;

    /* renamed from: g */
    public transient JdkBackedImmutableBiMap<V, K> f36232g;

    public final class InverseEntries extends ImmutableList<Map.Entry<V, K>> {
        public InverseEntries() {
        }

        public final Object get(int i) {
            Map.Entry entry = JdkBackedImmutableBiMap.this.f36231f.get(i);
            return new ImmutableEntry(entry.getValue(), entry.getKey());
        }

        /* renamed from: s */
        public final boolean mo43086s() {
            return false;
        }

        public final int size() {
            return JdkBackedImmutableBiMap.this.f36231f.size();
        }
    }

    public JdkBackedImmutableBiMap(ImmutableList<Map.Entry<K, V>> immutableList, Map<K, V> map, Map<V, K> map2) {
        this.f36231f = immutableList;
        this.forwardDelegate = map;
        this.backwardDelegate = map2;
    }

    /* renamed from: n */
    public static <K, V> ImmutableBiMap<K, V> m35783n(int i, Map.Entry<K, V>[] entryArr) {
        HashMap a = C14396g0.m35866a(i);
        HashMap a2 = C14396g0.m35866a(i);
        int i2 = 0;
        while (i2 < i) {
            Map.Entry<K, V> entry = entryArr[i2];
            Objects.requireNonNull(entry);
            ImmutableMapEntry o = RegularImmutableMap.m35826o(entry);
            entryArr[i2] = o;
            Object putIfAbsent = Map.EL.putIfAbsent(a, o.getKey(), o.getValue());
            if (putIfAbsent == null) {
                Object putIfAbsent2 = Map.EL.putIfAbsent(a2, o.getValue(), o.getKey());
                if (putIfAbsent2 == null) {
                    i2++;
                } else {
                    String valueOf = String.valueOf(putIfAbsent2);
                    String valueOf2 = String.valueOf(o.getValue());
                    throw ImmutableMap.m35705a(C25541a.m63875e(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2), "value", entryArr[i2]);
                }
            } else {
                String valueOf3 = String.valueOf(o.getKey());
                String valueOf4 = String.valueOf(putIfAbsent);
                throw ImmutableMap.m35705a(C25541a.m63875e(valueOf4.length() + valueOf3.length() + 1, valueOf3, "=", valueOf4), LinksConfiguration.KEY_KEY, entryArr[i2]);
            }
        }
        return new JdkBackedImmutableBiMap(ImmutableList.m35690x(i, entryArr), a, a2);
    }

    /* renamed from: c */
    public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.f36231f);
    }

    /* renamed from: d */
    public final ImmutableSet<K> mo43138d() {
        return new ImmutableMapKeySet(this);
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        return this.forwardDelegate.get(obj);
    }

    /* renamed from: l */
    public final ImmutableBiMap<V, K> mo43091l() {
        JdkBackedImmutableBiMap<V, K> jdkBackedImmutableBiMap = this.f36232g;
        if (jdkBackedImmutableBiMap != null) {
            return jdkBackedImmutableBiMap;
        }
        JdkBackedImmutableBiMap<V, K> jdkBackedImmutableBiMap2 = new JdkBackedImmutableBiMap<>(new InverseEntries(), this.backwardDelegate, this.forwardDelegate);
        this.f36232g = jdkBackedImmutableBiMap2;
        jdkBackedImmutableBiMap2.f36232g = this;
        return jdkBackedImmutableBiMap2;
    }

    public final int size() {
        return this.f36231f.size();
    }
}
