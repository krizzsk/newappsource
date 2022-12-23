package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzqt {
    private final zzqv zza = new zzqv((zzqu) null);

    public final zzqt zza(int i) {
        this.zza.zza = i;
        return this;
    }

    public final zzqt zzb(int i) {
        this.zza.zzb = i;
        return this;
    }

    public final zzqv zzc() {
        return this.zza;
    }
}
