package com.google.android.gms.internal.contextmanager;

import java.util.Iterator;
import java.util.Map;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzmt<K> implements Iterator<Map.Entry<K, Object>>, p988j$.util.Iterator {
    private final Iterator<Map.Entry<K, Object>> zza;

    public zzmt(Iterator<Map.Entry<K, Object>> it) {
        this.zza = it;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza.hasNext();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        Map.Entry next = this.zza.next();
        if (next.getValue() instanceof zzmu) {
            return new zzms(next, (zzmr) null);
        }
        return next;
    }

    public final void remove() {
        this.zza.remove();
    }
}
