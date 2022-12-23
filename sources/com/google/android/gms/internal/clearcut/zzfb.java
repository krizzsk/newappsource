package com.google.android.gms.internal.clearcut;

import java.util.ListIterator;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzfb implements ListIterator<String>, Iterator {
    private ListIterator<String> zzpc;
    private final /* synthetic */ int zzpd;
    private final /* synthetic */ zzfa zzpe;

    public zzfb(zzfa zzfa, int i) {
        this.zzpe = zzfa;
        this.zzpd = i;
        this.zzpc = zzfa.zzpb.listIterator(i);
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
        return this.zzpc.hasNext();
    }

    public final boolean hasPrevious() {
        return this.zzpc.hasPrevious();
    }

    public final /* synthetic */ Object next() {
        return this.zzpc.next();
    }

    public final int nextIndex() {
        return this.zzpc.nextIndex();
    }

    public final /* synthetic */ Object previous() {
        return this.zzpc.previous();
    }

    public final int previousIndex() {
        return this.zzpc.previousIndex();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public final /* synthetic */ void set(Object obj) {
        throw new UnsupportedOperationException();
    }
}
