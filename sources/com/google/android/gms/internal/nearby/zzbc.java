package com.google.android.gms.internal.nearby;

import com.google.android.gms.common.internal.safeparcel.SafeParcelable;
import com.google.android.gms.nearby.exposurenotification.DailySummariesConfig;

@SafeParcelable.Reserved({1000})
public final class zzbc {
    private final zzbe zza = new zzbe((zzbd) null);

    public final zzbc zza(DailySummariesConfig dailySummariesConfig) {
        this.zza.zzb = dailySummariesConfig;
        return this;
    }

    public final zzbc zzb(zzcs zzcs) {
        this.zza.zza = zzcs;
        return this;
    }

    public final zzbe zzc() {
        return this.zza;
    }
}
