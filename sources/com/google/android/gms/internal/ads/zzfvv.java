package com.google.android.gms.internal.ads;

import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

final class zzfvv extends zzfuq {
    /* access modifiers changed from: private */
    public zzfvj zza;
    /* access modifiers changed from: private */
    public ScheduledFuture zzb;

    private zzfvv(zzfvj zzfvj) {
        zzfvj.getClass();
        this.zza = zzfvj;
    }

    public static zzfvj zzg(zzfvj zzfvj, long j, TimeUnit timeUnit, ScheduledExecutorService scheduledExecutorService) {
        zzfvv zzfvv = new zzfvv(zzfvj);
        zzfvt zzfvt = new zzfvt(zzfvv);
        zzfvv.zzb = scheduledExecutorService.schedule(zzfvt, j, timeUnit);
        zzfvj.zzc(zzfvt, zzfuo.INSTANCE);
        return zzfvv;
    }

    public final String zza() {
        zzfvj zzfvj = this.zza;
        ScheduledFuture scheduledFuture = this.zzb;
        if (zzfvj == null) {
            return null;
        }
        String obj = zzfvj.toString();
        String k = C13715c.m34245k(new StringBuilder(obj.length() + 14), "inputFuture=[", obj, "]");
        if (scheduledFuture == null) {
            return k;
        }
        long delay = scheduledFuture.getDelay(TimeUnit.MILLISECONDS);
        if (delay <= 0) {
            return k;
        }
        StringBuilder sb = new StringBuilder(k.length() + 43);
        sb.append(k);
        sb.append(", remaining delay=[");
        sb.append(delay);
        sb.append(" ms]");
        return sb.toString();
    }

    public final void zzb() {
        zzs(this.zza);
        ScheduledFuture scheduledFuture = this.zzb;
        if (scheduledFuture != null) {
            scheduledFuture.cancel(false);
        }
        this.zza = null;
        this.zzb = null;
    }
}
