package org.simpleframework.xml.util;

import p988j$.util.concurrent.ConcurrentHashMap;

public class ConcurrentCache<T> extends ConcurrentHashMap<Object, T> {
    public final boolean contains(Object obj) {
        return containsKey(obj);
    }
}
