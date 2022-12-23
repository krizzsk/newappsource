package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzqg {
    private final zzqi zza = new zzqi((zzqh) null);

    public final zzqg zza(zzoy zzoy) {
        this.zza.zzc = zzoy;
        return this;
    }

    public final zzqg zzb(zzpy zzpy) {
        this.zza.zzb = zzpy;
        return this;
    }

    public final zzqg zzc(zzpb zzpb) {
        this.zza.zza = zzpb;
        return this;
    }

    public final zzqi zzd() {
        return this.zza;
    }
}
