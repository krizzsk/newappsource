package com.google.android.gms.location;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import com.google.android.gms.common.api.Api;
import com.google.android.gms.common.api.GoogleApi;
import com.google.android.gms.common.api.internal.TaskApiCall;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.tasks.Task;

public class ActivityRecognitionClient extends GoogleApi<Api.ApiOptions.NoOptions> {
    public static final /* synthetic */ int zza = 0;

    public ActivityRecognitionClient(Activity activity) {
        super(activity, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }

    public Task<Void> removeActivityTransitionUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new zzd(pendingIntent)).setMethodKey(2406).build());
    }

    public Task<Void> removeActivityUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new zze(pendingIntent)).setMethodKey(2402).build());
    }

    public Task<Void> removeSleepSegmentUpdates(PendingIntent pendingIntent) {
        return doWrite(TaskApiCall.builder().run(new zzf(pendingIntent)).setMethodKey(2411).build());
    }

    public Task<Void> requestActivityTransitionUpdates(ActivityTransitionRequest activityTransitionRequest, PendingIntent pendingIntent) {
        activityTransitionRequest.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new zzc(activityTransitionRequest, pendingIntent)).setMethodKey(2405).build());
    }

    public Task<Void> requestActivityUpdates(long j, PendingIntent pendingIntent) {
        zzk zzk = new zzk();
        zzk.zza(j);
        zzl zzb = zzk.zzb();
        zzb.zza(getContextAttributionTag());
        return doWrite(TaskApiCall.builder().run(new zzh(zzb, pendingIntent)).setMethodKey(2401).build());
    }

    public Task<Void> requestSleepSegmentUpdates(PendingIntent pendingIntent, SleepSegmentRequest sleepSegmentRequest) {
        Preconditions.checkNotNull(pendingIntent, "PendingIntent must be specified.");
        return doRead(TaskApiCall.builder().run(new zzg(this, pendingIntent, sleepSegmentRequest)).setFeatures(zzy.zzb).setMethodKey(2410).build());
    }

    public ActivityRecognitionClient(Context context) {
        super(context, LocationServices.API, Api.ApiOptions.NO_OPTIONS, GoogleApi.Settings.DEFAULT_SETTINGS);
    }
}
