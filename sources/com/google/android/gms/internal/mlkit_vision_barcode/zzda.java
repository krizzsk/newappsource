package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

public abstract class zzda implements Iterator, p988j$.util.Iterator {
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
