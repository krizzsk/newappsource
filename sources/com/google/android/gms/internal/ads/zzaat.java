package com.google.android.gms.internal.ads;

abstract class zzaat {
    public final zzzz zza;

    public zzaat(zzzz zzzz) {
        this.zza = zzzz;
    }

    public abstract boolean zza(zzdy zzdy) throws zzbp;

    public abstract boolean zzb(zzdy zzdy, long j) throws zzbp;

    public final boolean zzf(zzdy zzdy, long j) throws zzbp {
        return zza(zzdy) && zzb(zzdy, j);
    }
}
