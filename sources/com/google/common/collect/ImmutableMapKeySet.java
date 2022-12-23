package com.google.common.collect;

import p583jk.C17884p;
import p988j$.util.Map;
import p988j$.util.Spliterator;
import p988j$.util.function.Consumer;

final class ImmutableMapKeySet<K, V> extends IndexedImmutableSet<K> {

    /* renamed from: e */
    public static final /* synthetic */ int f36213e = 0;
    private final ImmutableMap<K, V> map;

    public ImmutableMapKeySet(ImmutableMap<K, V> immutableMap) {
        this.map = immutableMap;
    }

    public final boolean contains(Object obj) {
        return this.map.containsKey(obj);
    }

    public final void forEach(Consumer<? super K> consumer) {
        C17884p.m44373l(consumer);
        Map.EL.forEach(this.map, new C14430t(consumer));
    }

    public final /* synthetic */ void forEach(java.util.function.Consumer consumer) {
        forEach(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final K get(int i) {
        return this.map.entrySet().mo43098e().get(i).getKey();
    }

    /* renamed from: s */
    public final boolean mo43086s() {
        return true;
    }

    public final int size() {
        return this.map.size();
    }

    public final Spliterator<K> spliterator() {
        return this.map.mo43118i();
    }

    /* renamed from: u */
    public final C14439w0<K> iterator() {
        return this.map.mo43117h();
    }
}
