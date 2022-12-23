package com.google.android.gms.internal.ads;

import android.util.SparseBooleanArray;

public final class zzw {
    private final SparseBooleanArray zza = new SparseBooleanArray();
    private boolean zzb;

    public final zzw zza(int i) {
        zzcw.zzf(!this.zzb);
        this.zza.append(i, true);
        return this;
    }

    public final zzy zzb() {
        zzcw.zzf(!this.zzb);
        this.zzb = true;
        return new zzy(this.zza, (zzx) null);
    }
}
