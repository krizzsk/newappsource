package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.ArrayDeque;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

final class zzfz implements Iterator, p988j$.util.Iterator {
    private final ArrayDeque zza;
    private zzcy zzb;

    public /* synthetic */ zzfz(zzdb zzdb, zzfx zzfx) {
        if (zzdb instanceof zzga) {
            zzga zzga = (zzga) zzdb;
            ArrayDeque arrayDeque = new ArrayDeque(zzga.zzf());
            this.zza = arrayDeque;
            arrayDeque.push(zzga);
            this.zzb = zzb(zzga.zzd);
            return;
        }
        this.zza = null;
        this.zzb = (zzcy) zzdb;
    }

    private final zzcy zzb(zzdb zzdb) {
        while (zzdb instanceof zzga) {
            zzga zzga = (zzga) zzdb;
            this.zza.push(zzga);
            zzdb = zzga.zzd;
        }
        return (zzcy) zzdb;
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
    public final zzcy next() {
        zzcy zzcy;
        zzcy zzcy2 = this.zzb;
        if (zzcy2 != null) {
            do {
                ArrayDeque arrayDeque = this.zza;
                zzcy = null;
                if (arrayDeque == null || arrayDeque.isEmpty()) {
                    this.zzb = zzcy;
                } else {
                    zzcy = zzb(((zzga) this.zza.pop()).zze);
                }
            } while (zzcy.zzd() == 0);
            this.zzb = zzcy;
            return zzcy2;
        }
        throw new NoSuchElementException();
    }
}
