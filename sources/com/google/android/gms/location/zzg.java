package com.google.android.gms.location;

import android.app.PendingIntent;
import com.google.android.gms.common.api.internal.RemoteCall;
import com.google.android.gms.internal.location.zzam;
import com.google.android.gms.internal.location.zzbe;
import com.google.android.gms.tasks.TaskCompletionSource;

public final /* synthetic */ class zzg implements RemoteCall {
    public final /* synthetic */ ActivityRecognitionClient zza;
    public final /* synthetic */ PendingIntent zzb;
    public final /* synthetic */ SleepSegmentRequest zzc;

    public /* synthetic */ zzg(ActivityRecognitionClient activityRecognitionClient, PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        this.zza = activityRecognitionClient;
        this.zzb = pendingIntent;
        this.zzc = sleepSegmentRequest;
    }

    public final void accept(Object obj, Object obj2) {
        ActivityRecognitionClient activityRecognitionClient = this.zza;
        ((zzam) ((zzbe) obj).getService()).zzt(this.zzb, this.zzc, new zzi(activityRecognitionClient, (TaskCompletionSource) obj2));
    }
}
