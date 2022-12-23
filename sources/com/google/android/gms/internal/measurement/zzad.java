package com.google.android.gms.internal.measurement;

import java.util.Iterator;
import java.util.NoSuchElementException;

final class zzad implements Iterator {
    public final /* synthetic */ zzae zza;
    private int zzb = 0;

    public zzad(zzae zzae) {
        this.zza = zzae;
    }

    public final boolean hasNext() {
        return this.zzb < this.zza.zzc();
    }

    public final /* bridge */ /* synthetic */ Object next() {
        if (this.zzb < this.zza.zzc()) {
            zzae zzae = this.zza;
            int i = this.zzb;
            this.zzb = i + 1;
            return zzae.zze(i);
        }
        throw new NoSuchElementException(C16759e.m42349e("Out of bounds index: ", this.zzb));
    }
}
