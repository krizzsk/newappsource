package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.TaskCompletionSource;

final class zzrg extends zzoq {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzrg(zzrs zzrs, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void zzd(boolean z) {
        this.zza.setResult(Boolean.valueOf(z));
    }
}
