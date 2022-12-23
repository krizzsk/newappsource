package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzmm {
    private final zzmo zza = new zzmo((zzmn) null);

    public final zzmm zza(zzmb zzmb) {
        this.zza.zzc = zzmb;
        return this;
    }

    public final zzmm zzb(String[] strArr) {
        this.zza.zzb = strArr;
        return this;
    }

    public final zzmm zzc(zzkj zzkj) {
        this.zza.zza = zzkj;
        return this;
    }

    public final zzmo zzd() {
        return this.zza;
    }
}
