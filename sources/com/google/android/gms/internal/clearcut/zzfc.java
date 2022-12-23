package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzfc implements Iterator<String>, p988j$.util.Iterator {
    private final /* synthetic */ zzfa zzpe;
    private Iterator<String> zzpf;

    public zzfc(zzfa zzfa) {
        this.zzpe = zzfa;
        this.zzpf = zzfa.zzpb.iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzpf.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.zzpf.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
