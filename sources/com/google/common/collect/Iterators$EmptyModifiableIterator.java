package com.google.common.collect;

import java.util.Iterator;
import java.util.NoSuchElementException;

enum Iterators$EmptyModifiableIterator implements Iterator<Object>, p988j$.util.Iterator {
    INSTANCE;

    public boolean hasNext() {
        return false;
    }

    public Object next() {
        throw new NoSuchElementException();
    }

    public void remove() {
        throw new IllegalStateException("no calls to next() since the last call to remove()");
    }
}
