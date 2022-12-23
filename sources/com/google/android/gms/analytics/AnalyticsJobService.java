package com.google.android.gms.analytics;

import android.annotation.TargetApi;
import android.app.job.JobParameters;
import android.app.job.JobService;
import android.content.Intent;
import com.google.android.gms.internal.gtm.zzfm;
import com.google.android.gms.internal.gtm.zzfn;

@TargetApi(24)
public final class AnalyticsJobService extends JobService implements zzfm {
    private zzfn<AnalyticsJobService> zza;

    private final zzfn<AnalyticsJobService> zzb() {
        if (this.zza == null) {
            this.zza = new zzfn<>(this);
        }
        return this.zza;
    }

    public boolean callServiceStopSelfResult(int i) {
        return stopSelfResult(i);
    }

    public final void onCreate() {
        super.onCreate();
        zzb().zze();
    }

    public final void onDestroy() {
        zzb().zzf();
        super.onDestroy();
    }

    public final int onStartCommand(Intent intent, int i, int i2) {
        zzb().zza(intent, i, i2);
        return 2;
    }

    public boolean onStartJob(JobParameters jobParameters) {
        zzb().zzi(jobParameters);
        return true;
    }

    public boolean onStopJob(JobParameters jobParameters) {
        return false;
    }

    @TargetApi(24)
    public final void zza(JobParameters jobParameters, boolean z) {
        jobFinished(jobParameters, false);
    }
}
