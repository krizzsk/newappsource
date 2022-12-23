package org.simpleframework.xml.util;

import java.util.LinkedHashMap;
import java.util.Map;

public class LimitedCache<T> extends LinkedHashMap<Object, T> {
    private final int capacity = 50000;

    public final boolean removeEldestEntry(Map.Entry<Object, T> entry) {
        return size() > this.capacity;
    }
}
