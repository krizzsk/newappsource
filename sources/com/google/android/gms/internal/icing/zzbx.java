package com.google.android.gms.internal.icing;

import java.util.NoSuchElementException;

final class zzbx extends zzbz {
    public final /* synthetic */ zzcf zza;
    private int zzb = 0;
    private final int zzc;

    public zzbx(zzcf zzcf) {
        this.zza = zzcf;
        this.zzc = zzcf.zzc();
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
