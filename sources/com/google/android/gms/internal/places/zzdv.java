package com.google.android.gms.internal.places;

import java.util.Iterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzdv implements Iterator<String>, p988j$.util.Iterator {
    private Iterator<String> zzmk;
    private final /* synthetic */ zzdt zzml;

    public zzdv(zzdt zzdt) {
        this.zzml = zzdt;
        this.zzmk = zzdt.zzmj.iterator();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzmk.hasNext();
    }

    public final /* synthetic */ Object next() {
        return this.zzmk.next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
