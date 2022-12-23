package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.common.api.internal.StatusCallback;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzh implements RemoteCall {
    public final /* synthetic */ zzl zza;
    public final /* synthetic */ PendingIntent zzb;

    public /* synthetic */ zzh(zzl zzl, PendingIntent pendingIntent) {
        this.zza = zzl;
        this.zzb = pendingIntent;
    }

    public final void accept(Object obj, Object obj2) {
        zzl zzl = this.zza;
        PendingIntent pendingIntent = this.zzb;
        zzj zzj = new zzj((TaskCompletionSource) obj2);
        Preconditions.checkNotNull(zzl, "ActivityRecognitionRequest can't be null.");
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        Preconditions.checkNotNull(zzj, "ResultHolder not provided.");
        ((zzam) ((zzbe) obj).getService()).zzs(zzl, pendingIntent, new StatusCallback(zzj));
    }
}
