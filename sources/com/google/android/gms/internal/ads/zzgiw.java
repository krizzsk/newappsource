package com.google.android.gms.internal.ads;

import java.util.NoSuchElementException;

final class zzgiw extends zzgiy {
    public final /* synthetic */ zzgjg zza;
    private int zzb = 0;
    private final int zzc;

    public zzgiw(zzgjg zzgjg) {
        this.zza = zzgjg;
        this.zzc = zzgjg.zzd();
    }

    public final boolean hasNext() {
        return this.zzb < this.zzc;
    }

    public final byte zza() {
        int i = this.zzb;
        if (i < this.zzc) {
            this.zzb = i + 1;
            return this.zza.zzb(i);
        }
        throw new NoSuchElementException();
    }
}
