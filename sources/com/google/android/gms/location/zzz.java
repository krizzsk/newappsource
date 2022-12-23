package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzz implements RemoteCall {
    public final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzz(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzA(this.zza, new zzav((TaskCompletionSource) obj2));
    }
}
