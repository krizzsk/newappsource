package com.google.android.gms.location;

import android.location.Location;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzag implements Continuation {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzag(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final Object then(Task task) {
        TaskCompletionSource taskCompletionSource = this.zza;
        if (task.isSuccessful()) {
            taskCompletionSource.trySetResult((Location) task.getResult());
            return null;
        }
        taskCompletionSource.trySetException((Exception) Preconditions.checkNotNull(task.getException()));
        return null;
    }
}
