package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzfrp extends zzftg {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzfrp(Object obj) {
        this.zzb = obj;
    }

    public final boolean hasNext() {
        return !this.zza;
    }

    public final Object next() {
        if (!this.zza) {
            this.zza = true;
            return this.zzb;
        }
        throw new NoSuchElementException();
    }
}
