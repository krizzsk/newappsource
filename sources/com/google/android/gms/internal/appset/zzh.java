package com.google.android.gms.internal.appset;

import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzh implements Runnable {
    public final /* synthetic */ zzl zza;
    public final /* synthetic */ TaskCompletionSource zzb;

    public /* synthetic */ zzh(zzl zzl, TaskCompletionSource taskCompletionSource) {
        this.zza = zzl;
        this.zzb = taskCompletionSource;
    }

    public final void run() {
        this.zza.zzd(this.zzb);
    }
}
