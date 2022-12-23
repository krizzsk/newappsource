package com.google.android.gms.internal.clearcut;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzeq implements Iterator, p988j$.util.Iterator {
    private int pos;
    private Iterator zzor;
    private final /* synthetic */ zzei zzos;
    private boolean zzow;

    private zzeq(zzei zzei) {
        this.zzos = zzei;
        this.pos = -1;
    }

    public /* synthetic */ zzeq(zzei zzei, zzej zzej) {
        this(zzei);
    }

    private final Iterator zzdw() {
        if (this.zzor == null) {
            this.zzor = this.zzos.zzon.entrySet().iterator();
        }
        return this.zzor;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.pos + 1 < this.zzos.zzom.size() || (!this.zzos.zzon.isEmpty() && zzdw().hasNext());
    }

    public final /* synthetic */ Object next() {
        this.zzow = true;
        int i = this.pos + 1;
        this.pos = i;
        return (Map.Entry) (i < this.zzos.zzom.size() ? this.zzos.zzom.get(this.pos) : zzdw().next());
    }

    public final void remove() {
        if (this.zzow) {
            this.zzow = false;
            this.zzos.zzdu();
            if (this.pos < this.zzos.zzom.size()) {
                zzei zzei = this.zzos;
                int i = this.pos;
                this.pos = i - 1;
                Object unused = zzei.zzal(i);
                return;
            }
            zzdw().remove();
            return;
        }
        throw new IllegalStateException("remove() was called before next()");
    }
}
