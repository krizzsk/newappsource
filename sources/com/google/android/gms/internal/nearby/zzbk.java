package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;

@SafeParcelable.Reserved({1000})
public final class zzbk {
    private final zzbm zza = new zzbm((zzbl) null);

    public final zzbk zza(zzdb zzdb) {
        this.zza.zza = zzdb;
        return this;
    }

    public final zzbk zzb(String str) {
        this.zza.zzb = str;
        return this;
    }

    public final zzbm zzc() {
        return this.zza;
    }
}
