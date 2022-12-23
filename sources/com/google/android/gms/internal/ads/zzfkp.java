package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzfkp implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfkp(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.setResult(zzfmu.zzc());
    }
}
