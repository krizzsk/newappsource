package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbAddress;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzri extends zzpd {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzri(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzd(zzqq zzqq) {
        this.zza.setResult(new UwbAddress(zzqq.zzb()));
    }
}
