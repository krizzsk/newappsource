package com.google.android.gms.internal.location;

import android.location.Location;
import com.google.android.gms.common.api.Status;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicReference;

final class zzq extends zzan {
    public final /* synthetic */ AtomicReference zza;
    public final /* synthetic */ CountDownLatch zzb;

    public zzq(zzz zzz, AtomicReference atomicReference, CountDownLatch countDownLatch) {
        this.zza = atomicReference;
        this.zzb = countDownLatch;
    }

    public final void zzb(Status status, Location location) {
        if (status.isSuccess()) {
            this.zza.set(location);
        }
        this.zzb.countDown();
    }
}
