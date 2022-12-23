package com.google.android.gms.internal.measurement;

import java.util.NoSuchElementException;

final class zziu extends zziw {
    public final /* synthetic */ zzjd zza;
    private int zzb = 0;
    private final int zzc;

    public zziu(zzjd zzjd) {
        this.zza = zzjd;
        this.zzc = zzjd.zzd();
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
