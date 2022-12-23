package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzbo {
    private final zzbq zza = new zzbq((zzbp) null);

    public final zzbo zza(zzdf zzdf) {
        this.zza.zza = zzdf;
        return this;
    }

    public final zzbo zzb(String str) {
        this.zza.zzb = str;
        return this;
    }

    public final zzbq zzc() {
        return this.zza;
    }
}
