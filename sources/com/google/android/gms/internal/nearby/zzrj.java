package com.google.android.gms.internal.nearby;

import com.google.android.gms.nearby.uwb.UwbComplexChannel;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzrj extends zzpg {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzrj(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzd(zzqv zzqv) {
        TaskCompletionSource taskCompletionSource = this.zza;
        UwbComplexChannel.Builder builder = new UwbComplexChannel.Builder();
        builder.setChannel(zzqv.zza());
        builder.setPreambleIndex(zzqv.zzb());
        taskCompletionSource.setResult(builder.build());
    }
}
