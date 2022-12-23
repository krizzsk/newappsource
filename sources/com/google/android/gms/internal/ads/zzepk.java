package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.Clock;

final class zzepk {
    public final zzfvj zza;
    private final long zzb;
    private final Clock zzc;

    public zzepk(zzfvj zzfvj, long j, Clock clock) {
        this.zza = zzfvj;
        this.zzc = clock;
        this.zzb = clock.elapsedRealtime() + j;
    }

    public final boolean zza() {
        return this.zzb < this.zzc.elapsedRealtime();
    }
}
