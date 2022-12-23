package com.google.android.gms.internal.ads;

import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;

public final /* synthetic */ class zzfkq implements Continuation {
    public static final /* synthetic */ zzfkq zza = new zzfkq();

    private /* synthetic */ zzfkq() {
    }

    public final Object then(Task task) {
        return Boolean.valueOf(task.isSuccessful());
    }
}
