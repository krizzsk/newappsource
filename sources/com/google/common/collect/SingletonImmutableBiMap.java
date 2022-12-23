package com.google.common.collect;

import java.util.Map;
import p584jl.C17885a;
import p988j$.util.function.BiConsumer;

final class SingletonImmutableBiMap<K, V> extends ImmutableBiMap<K, V> {

    /* renamed from: f */
    public final transient K f36257f;

    /* renamed from: g */
    public final transient V f36258g;

    /* renamed from: h */
    public final transient ImmutableBiMap<V, K> f36259h;

    /* renamed from: i */
    public transient ImmutableBiMap<V, K> f36260i;

    public SingletonImmutableBiMap(K k, V v) {
        C17885a.m44454p(k, v);
        this.f36257f = k;
        this.f36258g = v;
        this.f36259h = null;
    }

    /* renamed from: c */
    public final ImmutableSet<Map.Entry<K, V>> mo43133c() {
        ImmutableEntry immutableEntry = new ImmutableEntry(this.f36257f, this.f36258g);
        int i = ImmutableSet.f36222c;
        return new SingletonImmutableSet(immutableEntry);
    }

    public final boolean containsKey(Object obj) {
        return this.f36257f.equals(obj);
    }

    public final boolean containsValue(Object obj) {
        return this.f36258g.equals(obj);
    }

    /* renamed from: d */
    public final ImmutableSet<K> mo43138d() {
        K k = this.f36257f;
        int i = ImmutableSet.f36222c;
        return new SingletonImmutableSet(k);
    }

    public final void forEach(BiConsumer<? super K, ? super V> biConsumer) {
        biConsumer.getClass();
        biConsumer.accept(this.f36257f, this.f36258g);
    }

    public final /* synthetic */ void forEach(java.util.function.BiConsumer biConsumer) {
        forEach(BiConsumer.VivifiedWrapper.convert(biConsumer));
    }

    /* renamed from: g */
    public final void mo43115g() {
    }

    public final V get(Object obj) {
        if (this.f36257f.equals(obj)) {
            return this.f36258g;
        }
        return null;
    }

    /* renamed from: l */
    public final ImmutableBiMap<V, K> mo43091l() {
        ImmutableBiMap<V, K> immutableBiMap = this.f36259h;
        if (immutableBiMap != null) {
            return immutableBiMap;
        }
        ImmutableBiMap<V, K> immutableBiMap2 = this.f36260i;
        if (immutableBiMap2 != null) {
            return immutableBiMap2;
        }
        SingletonImmutableBiMap singletonImmutableBiMap = new SingletonImmutableBiMap(this.f36258g, this.f36257f, this);
        this.f36260i = singletonImmutableBiMap;
        return singletonImmutableBiMap;
    }

    public final int size() {
        return 1;
    }

    public SingletonImmutableBiMap(K k, V v, ImmutableBiMap<V, K> immutableBiMap) {
        this.f36257f = k;
        this.f36258g = v;
        this.f36259h = immutableBiMap;
    }
}
