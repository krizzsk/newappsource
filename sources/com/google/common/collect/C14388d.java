package com.google.common.collect;

import java.util.Map;
import p583jk.C17875h;

/* renamed from: com.google.common.collect.d */
public abstract class C14388d<K, V> implements Map.Entry<K, V> {
    public boolean equals(Object obj) {
        if (!(obj instanceof Map.Entry)) {
            return false;
        }
        Map.Entry entry = (Map.Entry) obj;
        if (!C17875h.m44312w(getKey(), entry.getKey()) || !C17875h.m44312w(getValue(), entry.getValue())) {
            return false;
        }
        return true;
    }

    public abstract K getKey();

    public abstract V getValue();

    public int hashCode() {
        int i;
        Object key = getKey();
        Object value = getValue();
        int i2 = 0;
        if (key == null) {
            i = 0;
        } else {
            i = key.hashCode();
        }
        if (value != null) {
            i2 = value.hashCode();
        }
        return i ^ i2;
    }

    public V setValue(V v) {
        throw new UnsupportedOperationException();
    }

    public final String toString() {
        String valueOf = String.valueOf(getKey());
        String valueOf2 = String.valueOf(getValue());
        return C25541a.m63875e(valueOf2.length() + valueOf.length() + 1, valueOf, "=", valueOf2);
    }
}
