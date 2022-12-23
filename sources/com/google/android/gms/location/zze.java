package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zze implements RemoteCall {
    public final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zze(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ((zzbe) obj).zzv(this.zza);
        ((TaskCompletionSource) obj2).setResult(null);
    }
}
