package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.connection.DiscoveryOptions;

@SafeParcelable.Reserved({1000})
public final class zzmu {
    private final zzmw zza = new zzmw((zzmv) null);

    public final zzmu zza(zzkc zzkc) {
        this.zza.zze = zzkc;
        return this;
    }

    public final zzmu zzb(long j) {
        this.zza.zzc = j;
        return this;
    }

    public final zzmu zzc(DiscoveryOptions discoveryOptions) {
        this.zza.zzd = discoveryOptions;
        return this;
    }

    public final zzmu zzd(zzkj zzkj) {
        this.zza.zza = zzkj;
        return this;
    }

    public final zzmu zze(String str) {
        this.zza.zzb = str;
        return this;
    }

    public final zzmw zzf() {
        return this.zza;
    }
}
