package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.List;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzdd implements Iterator, p988j$.util.Iterator {
    private int pos;
    private Iterator zzlz;
    private final /* synthetic */ zzdb zzma;

    private zzdd(zzdb zzdb) {
        this.zzma = zzdb;
        this.pos = zzdb.zzlq.size();
    }

    private final Iterator zzde() {
        if (this.zzlz == null) {
            this.zzlz = this.zzma.zzlt.entrySet().iterator();
        }
        return this.zzlz;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        int i = this.pos;
        return (i > 0 && i <= this.zzma.zzlq.size()) || zzde().hasNext();
    }

    public final /* synthetic */ Object next() {
        if (zzde().hasNext()) {
            return (Map.Entry) zzde().next();
        }
        List zzc = this.zzma.zzlq;
        int i = this.pos - 1;
        this.pos = i;
        return (Map.Entry) zzc.get(i);
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    public /* synthetic */ zzdd(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
