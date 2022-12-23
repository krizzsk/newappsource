package com.google.android.gms.internal.nearby;

import java.util.NoSuchElementException;

final class zzst extends zzsy {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzst(Object obj) {
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
