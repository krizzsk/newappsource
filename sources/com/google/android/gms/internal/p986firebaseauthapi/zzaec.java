package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaec */
final class zzaec implements Iterator, p988j$.util.Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return false;
    }

    public final Object next() {
        throw new NoSuchElementException();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
