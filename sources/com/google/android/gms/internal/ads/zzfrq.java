package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.NoSuchElementException;

enum zzfrq implements Iterator, p988j$.util.Iterator {
    INSTANCE;

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        zzfos.zzi(false, "no calls to next() since the last call to remove()");
    }
}
