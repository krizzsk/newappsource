package com.google.android.gms.internal.p986firebaseauthapi;

import com.google.android.gms.tasks.Task;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.util.concurrent.ExecutorService;

/* renamed from: com.google.android.gms.internal.firebase-auth-api.zzxg */
public class zzxg {
    public zzwd zza;
    public ExecutorService zzb;

    public final Task zzP(zzxf zzxf) {
        TaskCompletionSource taskCompletionSource = new TaskCompletionSource();
        this.zzb.execute(new zzxe(this, zzxf, taskCompletionSource));
        return taskCompletionSource.getTask();
    }
}
