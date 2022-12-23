package com.google.android.gms.internal.contextmanager;

import com.google.android.gms.common.api.PendingResult;
import com.google.android.gms.common.api.Result;
import com.google.android.gms.common.api.ResultCallback;
import com.google.android.gms.common.internal.Preconditions;
import java.util.concurrent.TimeUnit;

public abstract class zzi<T1 extends Result, T2 extends Result> extends PendingResult<T1> {
    private final PendingResult<T2> zza;

    public zzi(PendingResult<T2> pendingResult) {
        this.zza = (PendingResult) Preconditions.checkNotNull(pendingResult);
    }

    public final void addStatusListener(PendingResult.StatusListener statusListener) {
        this.zza.addStatusListener(statusListener);
    }

    public final T1 await() {
        return zza(this.zza.await());
    }

    public final void cancel() {
        this.zza.cancel();
    }

    public final boolean isCanceled() {
        return this.zza.isCanceled();
    }

    public final void setResultCallback(ResultCallback<? super T1> resultCallback) {
        this.zza.setResultCallback(new zzg(this, resultCallback));
    }

    public abstract T1 zza(T2 t2);

    public final T1 await(long j, TimeUnit timeUnit) {
        return zza(this.zza.await(j, timeUnit));
    }

    public final void setResultCallback(ResultCallback<? super T1> resultCallback, long j, TimeUnit timeUnit) {
        this.zza.setResultCallback(new zzh(this, resultCallback), j, timeUnit);
    }
}
