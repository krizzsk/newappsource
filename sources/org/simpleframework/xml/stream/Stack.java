package org.simpleframework.xml.stream;

import java.util.ArrayList;

class Stack<T> extends ArrayList<T> {
    public Stack() {
        super(6);
    }

    /* renamed from: i */
    public final T mo61111i() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return get(size - 1);
    }

    public final T pop() {
        int size = size();
        if (size <= 0) {
            return null;
        }
        return remove(size - 1);
    }
}
