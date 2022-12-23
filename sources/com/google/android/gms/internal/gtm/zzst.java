package com.google.android.gms.internal.gtm;

import java.util.NoSuchElementException;

final class zzst extends zzsw {
    public final /* synthetic */ zztd zza;
    private int zzb = 0;
    private final int zzc;

    public zzst(zztd zztd) {
        this.zza = zztd;
        this.zzc = zztd.zzd();
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
