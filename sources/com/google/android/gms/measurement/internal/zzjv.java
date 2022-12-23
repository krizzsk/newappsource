package com.google.android.gms.measurement.internal;

import android.app.job.JobParameters;

public final /* synthetic */ class zzjv implements Runnable {
    public final /* synthetic */ zzjz zza;
    public final /* synthetic */ zzeo zzb;
    public final /* synthetic */ JobParameters zzc;

    public /* synthetic */ zzjv(zzjz zzjz, zzeo zzeo, JobParameters jobParameters) {
        this.zza = zzjz;
        this.zzb = zzeo;
        this.zzc = jobParameters;
    }

    public final void run() {
        this.zza.zzd(this.zzb, this.zzc);
    }
}
