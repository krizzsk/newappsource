package com.google.android.gms.internal.mlkit_vision_face;

import java.util.NoSuchElementException;

final class zzbn extends zzcg {
    public boolean zza;
    public final /* synthetic */ Object zzb;

    public zzbn(Object obj) {
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
