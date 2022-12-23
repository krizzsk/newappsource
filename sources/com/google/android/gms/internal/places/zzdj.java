package com.google.android.gms.internal.places;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzdj implements Iterator, p988j$.util.Iterator {
    private int pos;
    private Iterator zzlz;
    private final /* synthetic */ zzdb zzma;
    private boolean zzmd;

    private zzdj(zzdb zzdb) {
        this.zzma = zzdb;
        this.pos = -1;
    }

    private final Iterator zzde() {
        if (this.zzlz == null) {
            this.zzlz = this.zzma.zzlr.entrySet().iterator();
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
        if (this.pos + 1 < this.zzma.zzlq.size() || (!this.zzma.zzlr.isEmpty() && zzde().hasNext())) {
            return true;
        }
        return false;
    }

    public final /* synthetic */ Object next() {
        this.zzmd = true;
        int i = this.pos + 1;
        this.pos = i;
        if (i < this.zzma.zzlq.size()) {
            return (Map.Entry) this.zzma.zzlq.get(this.pos);
        }
        return (Map.Entry) zzde().next();
    }

    public final void remove() {
        if (this.zzmd) {
            this.zzmd = false;
            this.zzma.zzcx();
            if (this.pos < this.zzma.zzlq.size()) {
                zzdb zzdb = this.zzma;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzdb.zzan(i);
                return;
            }
            zzde().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }

    public /* synthetic */ zzdj(zzdb zzdb, zzde zzde) {
        this(zzdb);
    }
}
