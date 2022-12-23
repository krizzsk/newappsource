package com.google.android.gms.internal.ads;

import java.util.Iterator;
import java.util.List;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzgpk implements Iterator, p988j$.util.Iterator {
    public int zza = 0;
    public final /* synthetic */ zzgpl zzb;

    public zzgpk(zzgpl zzgpl) {
        this.zzb = zzgpl;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zza < this.zzb.zza.size() || this.zzb.zzb.hasNext();
    }

    public final Object next() {
        if (this.zza < this.zzb.zza.size()) {
            List list = this.zzb.zza;
            int i = this.zza;
            this.zza = i + 1;
            return list.get(i);
        }
        zzgpl zzgpl = this.zzb;
        zzgpl.zza.add(zzgpl.zzb.next());
        return next();
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
