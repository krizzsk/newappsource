package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzc implements RemoteCall {
    public final /* synthetic */ ActivityTransitionRequest zza;
    public final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzc(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        this.zza = activityTransitionRequest;
        this.zzb = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        ActivityTransitionRequest activityTransitionRequest = this.zza;
        PendingIntent pendingIntent = this.zzb;
        zzj zzj = new zzj((TaskCompletionSource) obj2);
        Preconditions.checkNotNull(activityTransitionRequest, "activityTransitionRequest must be specified.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(zzj, "ResultHolder not provided.");
        ((zzam) ((zzbe) obj).getService()).zzq(activityTransitionRequest, pendingIntent, new StatusCallback(zzj));
    }
}
