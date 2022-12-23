package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.RangingCapabilities;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzrh extends zzou {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzrh(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzd(zzps zzps) {
        this.zza.setResult(new RangingCapabilities(zzps.zzc(), zzps.zzb(), zzps.zzd(), zzps.zza()));
    }
}
