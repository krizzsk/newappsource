package com.google.android.gms.analytics;

import com.google.android.gms.analytics.zzk;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.common.util.VisibleForTesting;
import java.util.ArrayList;
import java.util.List;

public class zzk<T extends zzk> {
    public final zzh zza;
    private final zzr zzb;
    private final List<zzi> zzc = new ArrayList();

    @VisibleForTesting
    public zzk(zzr zzr, Clock clock) {
        Preconditions.checkNotNull(zzr);
        this.zzb = zzr;
        zzh zzh = new zzh(this, clock);
        zzh.zzh();
        this.zza = zzh;
    }

    public void zze(zzh zzh) {
        throw null;
    }

    public final zzr zzm() {
        return this.zzb;
    }

    public final void zzn(zzh zzh) {
        for (zzi zza2 : this.zzc) {
            zza2.zza();
        }
    }
}
