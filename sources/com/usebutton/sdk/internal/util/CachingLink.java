package com.usebutton.sdk.internal.util;

public interface CachingLink<K, V> extends Link<K, V> {
    void put(K k, V v);

    int size();
}
