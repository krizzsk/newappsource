package com.google.android.gms.internal.ads;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzgmo implements Iterator, p988j$.util.Iterator {
    private final ArrayDeque zza;
    private zzgjb zzb;

    public /* synthetic */ zzgmo(zzgjg zzgjg, zzgmn zzgmn) {
        if (zzgjg instanceof zzgmq) {
            zzgmq zzgmq = (zzgmq) zzgjg;
            ArrayDeque arrayDeque = new ArrayDeque(zzgmq.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzgmq);
            this.zzb = zzb(zzgmq.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzgjb) zzgjg;
    }

    private final zzgjb zzb(zzgjg zzgjg) {
        while (zzgjg instanceof zzgmq) {
            zzgmq zzgmq = (zzgmq) zzgjg;
            this.zza.push(zzgmq);
            zzgjg = zzgmq.zzd;
        }
        return (zzgjb) zzgjg;
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzb != null;
    }

    public final void remove() {
        throw new UnsupportedOperationException();
    }

    /* renamed from: zza */
    public final zzgjb next() {
        zzgjb zzgjb;
        zzgjb zzgjb2 = this.zzb;
        if (zzgjb2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzgjb = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzgjb;
                } else {
                    zzgjb = zzb(((zzgmq) this.zza.pop()).zze);
                }
            } while (zzgjb.zzD());
            this.zzb = zzgjb;
            return zzgjb2;
        }
        throw new NoSuchElementException();
    }
}
