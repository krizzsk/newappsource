package com.google.android.gms.cloudmessaging;

import com.appsflyer.internal.referrer.Payload;
import com.google.android.gms.tasks.TaskCompletionSource;
import java.io.IOException;

public final /* synthetic */ class zzy implements Runnable {
    public final /* synthetic */ TaskCompletionSource zza;

    public /* synthetic */ zzy(TaskCompletionSource taskCompletionSource) {
        this.zza = taskCompletionSource;
    }

    public final void run() {
        this.zza.trySetException(new IOException(Payload.RESPONSE_TIMEOUT));
    }
}
