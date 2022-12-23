package com.google.common.collect;

import java.io.Serializable;

class ImmutableEntry<K, V> extends C14388d<K, V> implements Serializable {
    private static final long serialVersionUID = 0;
    public final K key;
    public final V value;

    public ImmutableEntry(K k, V v) {
        this.key = k;
        this.value = v;
    }

    public final K getKey() {
        return this.key;
    }

    public final V getValue() {
        return this.value;
    }

    public final V setValue(V v) {
        throw new UnsupportedOperationException();
    }
}
