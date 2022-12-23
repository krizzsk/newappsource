package com.google.android.gms.nearby.messages.internal;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;

final class zzaz implements OnCompleteListener {
    public final /* synthetic */ TaskCompletionSource zza;

    public zzaz(zzbh zzbh, TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void onComplete(Task task) {
        if (task.isSuccessful()) {
            this.zza.setResult(null);
        } else {
            this.zza.setException(task.getException());
        }
    }
}
