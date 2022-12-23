package com.google.android.gms.internal.ads;

import android.os.Handler;
import android.os.Looper;
import com.google.android.gms.ads.internal.util.zzf;
import com.google.android.gms.ads.internal.util.zzs;
import com.google.android.gms.ads.internal.zzt;
import java.util.concurrent.Executor;

final class zzcfs implements Executor {
    private final Handler zza = new zzf(Looper.getMainLooper());

    public final void execute(Runnable runnable) {
        if (Looper.getMainLooper().getThread() == Thread.currentThread()) {
            try {
                runnable.run();
            } catch (Throwable th) {
                zzt.zzp();
                zzs.zzH(zzt.zzo().zzc(), th);
                throw th;
            }
        } else {
            this.zza.post(runnable);
        }
    }
}
