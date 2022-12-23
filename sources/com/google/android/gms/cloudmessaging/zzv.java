package com.google.android.gms.cloudmessaging;

import android.os.Bundle;
import android.util.Log;
import com.google.android.gms.tasks.Continuation;
import com.google.android.gms.tasks.Task;
import java.io.IOException;

public final /* synthetic */ class zzv implements Continuation {
    public static final /* synthetic */ zzv zza = new zzv();

    private /* synthetic */ zzv() {
    }

    public final Object then(Task task) {
        if (task.isSuccessful()) {
            return (Bundle) task.getResult();
        }
        if (Log.isLoggable("Rpc", 3)) {
            new StringBuilder(String.valueOf(task.getException()).length() + 22);
        }
        throw new IOException("SERVICE_NOT_AVAILABLE", task.getException());
    }
}
