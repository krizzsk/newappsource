package com.google.android.gms.internal.mlkit_vision_barcode_bundled;

import java.util.NoSuchElementException;

final class zzcs extends zzcv {
    public final /* synthetic */ zzdb zza;
    private int zzb = 0;
    private final int zzc;

    public zzcs(zzdb zzdb) {
        this.zza = zzdb;
        this.zzc = zzdb.zzd();
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
