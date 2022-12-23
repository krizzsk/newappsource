package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzf implements RemoteCall {
    public final /* synthetic */ PendingIntent zza;

    public /* synthetic */ zzf(PendingIntent pendingIntent) {
        this.zza = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        PendingIntent pendingIntent = this.zza;
        zzj zzj = new zzj((TaskCompletionSource) obj2);
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(zzj, "ResultHolder not provided.");
        ((zzam) ((zzbe) obj).getService()).zzp(pendingIntent, new StatusCallback(zzj));
    }
}
