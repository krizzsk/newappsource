package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.TimeoutException;

public final /* synthetic */ class zzfc implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfc(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (!taskCompletionSource.getTask().isComplete()) {
            taskCompletionSource.trySetException(new TimeoutException("Timed out."));
        }
    }
}
