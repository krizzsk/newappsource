package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.awareness.snapshot.TimeIntervalsResult;
import com.google.android.gms.awareness.state.TimeIntervals;
import com.google.android.gms.common.api.Status;

final class zzaa implements TimeIntervalsResult {
    public final /* synthetic */ zzaq zza;

    public zzaa(zzac zzac, zzaq zzaq) {
        this.zza = zzaq;
    }

    public final Status getStatus() {
        return this.zza.getStatus();
    }

    public final TimeIntervals getTimeIntervals() {
        zzz zza2 = this.zza.zza();
        if (zza2 == null) {
            return null;
        }
        return zza2.zzd();
    }
}
