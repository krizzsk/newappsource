package com.google.android.gms.internal.nearby;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzfb implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzfb(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult(task.getResult());
            return;
        }
        Exception exception = task.getException();
        if (exception != null) {
            taskCompletionSource.trySetException(exception);
        } else {
            taskCompletionSource.trySetException(new IllegalStateException("Failed task has null exception"));
        }
    }
}
