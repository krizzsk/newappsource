package com.google.android.gms.internal.nearby;

import android.os.Looper;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

public final class zzfd {
    public static Task zza(Task task, long j) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        task.addOnCompleteListener(new zzfb(taskCompletionSource));
        new zzh(Looper.getMainLooper()).postDelayed(new zzfc(taskCompletionSource), j);
        return taskCompletionSource.getTask();
    }
}
