package com.google.android.gms.internal.p986firebaseauthapi;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzan */
public abstract class zzan implements Iterator, p988j$.util.Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    @Deprecated
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
