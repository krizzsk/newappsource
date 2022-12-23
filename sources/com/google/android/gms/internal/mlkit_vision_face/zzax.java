package com.google.android.gms.internal.mlkit_vision_face;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzax<T> implements Iterator<T>, p988j$.util.Iterator {
    public int zzb;
    public int zzc;
    public int zzd = -1;
    public final /* synthetic */ zzbb zze;

    public /* synthetic */ zzax(zzbb zzbb, zzat zzat) {
        this.zze = zzbb;
        this.zzb = zzbb.zzf;
        this.zzc = zzbb.zzf();
    }

    private final void zzb() {
        if (this.zze.zzf != this.zzb) {
            throw new ConcurrentModificationException();
        }
    }

    public final /* synthetic */ void forEachRemaining(Consumer consumer) {
        Iterator.CC.$default$forEachRemaining(this, consumer);
    }

    public final /* synthetic */ void forEachRemaining(java.util.function.Consumer consumer) {
        forEachRemaining(Consumer.VivifiedWrapper.convert(consumer));
    }

    public final boolean hasNext() {
        return this.zzc >= 0;
    }

    public final T next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            T zza = zza(i);
            this.zzc = this.zze.zzg(this.zzc);
            return zza;
        }
        throw new NoSuchElementException();
    }

    public final void remove() {
        boolean z;
        zzb();
        if (this.zzd >= 0) {
            z = true;
        } else {
            z = false;
        }
        zzaa.zza(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzbb zzbb = this.zze;
        zzbb.remove(zzbb.zzb[this.zzd]);
        this.zzc--;
        this.zzd = -1;
    }

    public abstract T zza(int i);
}
