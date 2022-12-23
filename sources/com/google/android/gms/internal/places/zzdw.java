package com.google.android.gms.internal.places;

import java.util.ListIterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzdw implements ListIterator<String>, Iterator {
    private final /* synthetic */ int zzbp;
    private final /* synthetic */ zzdt zzml;
    private ListIterator<String> zzmm;

    public zzdw(zzdt zzdt, int i) {
        this.zzml = zzdt;
        this.zzbp = i;
        this.zzmm = zzdt.zzmj.listIterator(i);
    }

    public final /* synthetic */ void add(Object obj) {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzmm.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzmm.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.zzmm.next();
    }

    public final int nextIndex() {
        return this.zzmm.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.zzmm.previous();
    }

    public final int previousIndex() {
        return this.zzmm.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
