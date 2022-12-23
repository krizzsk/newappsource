package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzax implements RemoteCall {
    public final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzax(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzw(this.zza, new zzba((TaskCompletionSource) obj2));
    }
}
