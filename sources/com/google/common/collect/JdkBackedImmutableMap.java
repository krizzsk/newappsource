package com.google.common.collect;

import com.google.common.collect.ImmutableMapEntrySet;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import p988j$.util.Map;
import p988j$.util.function.BiConsumer;

final class JdkBackedImmutableMap<K, V> extends ImmutableMap<K, V> {

    /* renamed from: f */
    public final transient Map<K, V> f36233f;

    /* renamed from: g */
    public final transient ImmutableList<Map.Entry<K, V>> f36234g;

    public JdkBackedImmutableMap(HashMap hashMap, ImmutableList immutableList) {
        this.f36233f = hashMap;
        this.f36234g = immutableList;
    }

    /* renamed from: l */
    public static <K, V> ImmutableMap<K, V> m35789l(int i, Map.Entry<K, V>[] entryArr) {
        HashMap a = C14396g0.m35866a(i);
        int i2 = 0;
        while (i2 < i) {
            Map.Entry<K, V> entry = entryArr[i2];
            Objects.requireNonNull(entry);
            ImmutableMapEntry o = RegularImmutableMap.m35826o(entry);
            entryArr[i2] = o;
            Object putIfAbsent = Map.EL.putIfAbsent(a, o.getKey(), entryArr[i2].getValue());
            if (putIfAbsent == null) {
                i2++;
            } else {
                Map.Entry<K, V> entry2 = entryArr[i2];
                String valueOf = String.valueOf(entry2.getKey());
                String valueOf2 = String.valueOf(putIfAbsent);
                throw ImmutableMap.m35705a(entry2, LinksConfiguration.KEY_KEY, C25541a.m63875e(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2));
            }
        }
        return new JdkBackedImmutableMap(a, ImmutableList.m35690x(i, entryArr));
    }

    /* renamed from: c */
    public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
        return new ImmutableMapEntrySet.RegularEntrySet(this, this.f36234g);
    }

    /* renamed from: d */
    public final ImmutableSet<K> mo43138d() {
        return new ImmutableMapKeySet(this);
    }

    /* renamed from: e */
    public final ImmutableCollection<V> mo43089e() {
        return new ImmutableMapValues(this);
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        this.f36234g.forEach(new C14385b0(biConsumer));
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        return this.f36233f.get(obj);
    }

    public final int size() {
        return this.f36234g.size();
    }
}
