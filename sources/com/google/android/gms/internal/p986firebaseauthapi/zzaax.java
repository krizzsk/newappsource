package com.google.android.gms.internal.p986firebaseauthapi;

import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzaax */
abstract class zzaax implements zzaaz, Iterator {
    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final /* synthetic */ Object next() {
        return Byte.valueOf(zza());
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
