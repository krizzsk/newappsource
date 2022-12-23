package com.google.android.gms.measurement.internal;

import com.google.android.gms.common.internal.Preconditions;
import java.lang.Thread;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;

final class zzft extends FutureTask implements Comparable {
    public final boolean zza;
    public final /* synthetic */ zzfv zzb;
    private final long zzc;
    private final String zzd;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfv, Runnable runnable, boolean z, String str) {
        super(runnable, (Object) null);
        this.zzb = zzfv;
        Preconditions.checkNotNull(str);
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = str;
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            C16530d.m42018k(zzfv.zzs, "Tasks index overflow");
        }
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        zzft zzft = (zzft) obj;
        boolean z = this.zza;
        if (z == zzft.zza) {
            int i = (this.zzc > zzft.zzc ? 1 : (this.zzc == zzft.zzc ? 0 : -1));
            if (i < 0) {
                return -1;
            }
            if (i > 0) {
                return 1;
            }
            this.zzb.zzs.zzay().zzh().zzb("Two tasks share the same index. index", Long.valueOf(this.zzc));
            return 0;
        } else if (!z) {
            return 1;
        } else {
            return -1;
        }
    }

    public final void setException(Throwable th) {
        Thread.UncaughtExceptionHandler defaultUncaughtExceptionHandler;
        this.zzb.zzs.zzay().zzd().zzb(this.zzd, th);
        if ((th instanceof zzfr) && (defaultUncaughtExceptionHandler = Thread.getDefaultUncaughtExceptionHandler()) != null) {
            defaultUncaughtExceptionHandler.uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public zzft(zzfv zzfv, Callable callable, boolean z, String str) {
        super(callable);
        this.zzb = zzfv;
        Preconditions.checkNotNull("Task exception on worker thread");
        long andIncrement = zzfv.zza.getAndIncrement();
        this.zzc = andIncrement;
        this.zzd = "Task exception on worker thread";
        this.zza = z;
        if (andIncrement == Long.MAX_VALUE) {
            C16530d.m42018k(zzfv.zzs, "Tasks index overflow");
        }
    }
}
