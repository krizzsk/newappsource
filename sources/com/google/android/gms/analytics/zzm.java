package com.google.android.gms.analytics;

import android.util.Log;
import java.lang.Thread;
import java.util.concurrent.FutureTask;

final class zzm extends FutureTask {
    public final /* synthetic */ zzn zza;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzm(zzn zzn, Runnable runnable, Object obj) {
        super(runnable, obj);
        this.zza = zzn;
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler zze = this.zza.zza.zzg;
        if (zze != null) {
            zze.uncaughtException(Thread.currentThread(), th);
        } else if (Log.isLoggable("GAv4", 6)) {
            new StringBuilder(String.valueOf(th).length() + 37);
        }
        super.setException(th);
    }
}
