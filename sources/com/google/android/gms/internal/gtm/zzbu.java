package com.google.android.gms.internal.gtm;

import java.lang.Thread;

final class zzbu implements Thread.UncaughtExceptionHandler {
    public final /* synthetic */ zzbv zza;

    public zzbu(zzbv zzbv) {
        this.zza = zzbv;
    }

    public final void uncaughtException(Thread thread, Throwable th) {
        zzfb zzn = this.zza.zzn();
        if (zzn != null) {
            zzn.zzK("Job execution failed", th);
        }
    }
}
