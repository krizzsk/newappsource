package com.google.android.gms.internal.ads;

import java.util.List;

public final class zzgqe {
    private final List zza;
    private final List zzb;

    public /* synthetic */ zzgqe(int i, int i2, zzgqd zzgqd) {
        this.zza = zzgpr.zzc(i);
        this.zzb = zzgpr.zzc(i2);
    }

    public final zzgqe zza(zzgqh zzgqh) {
        this.zzb.add(zzgqh);
        return this;
    }

    public final zzgqe zzb(zzgqh zzgqh) {
        this.zza.add(zzgqh);
        return this;
    }

    public final zzgqf zzc() {
        return new zzgqf(this.zza, this.zzb, (zzgqd) null);
    }
}
