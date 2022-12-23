package com.google.android.gms.internal.mlkit_vision_barcode;

import java.util.ConcurrentModificationException;
import java.util.Iterator;
import java.util.NoSuchElementException;
import p988j$.util.Iterator;
import p988j$.util.function.Consumer;

abstract class zzbo implements Iterator, p988j$.util.Iterator {
    public int zzb;
    public int zzc;
    public int zzd = -1;
    public final /* synthetic */ zzbs zze;

    public /* synthetic */ zzbo(zzbs zzbs, zzbk zzbk) {
        this.zze = zzbs;
        this.zzb = zzbs.zzf;
        this.zzc = zzbs.zze();
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
        zzaq.zzd(z, "no calls to next() since the last call to remove()");
        this.zzb += 32;
        zzbs zzbs = this.zze;
        zzbs.remove(zzbs.zzg(zzbs, this.zzd));
        this.zzc--;
        this.zzd = -1;
    }

    public abstract Object zza(int i);
}
