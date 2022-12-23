package com.google.android.gms.internal.ads;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzfqn implements Iterator, p988j$.util.Iterator {
    public int zzb;
    public int zzc;
    public int zzd = -1;
    public final /* synthetic */ zzfqr zze;

    public /* synthetic */ zzfqn(zzfqr zzfqr, zzfqj zzfqj) {
        this.zze = zzfqr;
        this.zzb = zzfqr.zzf;
        this.zzc = zzfqr.zze();
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

    public final Object next() {
        zzb();
        if (hasNext()) {
            int i = this.zzc;
            this.zzd = i;
            Object zza = zza(i);
            this.zzc = this.zze.zzf(this.zzc);
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
        zzfos.zzi(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzfqr zzfqr = this.zze;
        zzfqr.remove(zzfqr.zzg(zzfqr, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
