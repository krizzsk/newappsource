package com.google.android.gms.internal.contextmanager;

import java.util.NoSuchElementException;

final class zzku extends zzkx {
    public final /* synthetic */ zzld zza;
    private int zzb = 0;
    private final int zzc;

    public zzku(zzld zzld) {
        this.zza = zzld;
        this.zzc = zzld.zzd();
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
