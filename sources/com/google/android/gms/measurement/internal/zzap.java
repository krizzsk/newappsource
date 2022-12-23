package com.google.android.gms.measurement.internal;

import android.os.Handler;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.internal.measurement.zzby;

abstract class zzap {
    private static volatile Handler zza;
    private final zzgt zzb;
    private final Runnable zzc;
    /* access modifiers changed from: private */
    public volatile long zzd;

    public zzap(zzgt zzgt) {
        Preconditions.checkNotNull(zzgt);
        this.zzb = zzgt;
        this.zzc = new zzao(this, zzgt);
    }

    private final Handler zzf() {
        Handler handler;
        if (zza != null) {
            return zza;
        }
        synchronized (zzap.class) {
            if (zza == null) {
                zza = new zzby(this.zzb.zzau().getMainLooper());
            }
            handler = zza;
        }
        return handler;
    }

    public final void zzb() {
        this.zzd = 0;
        zzf().removeCallbacks(this.zzc);
    }

    public abstract void zzc();

    public final void zzd(long j) {
        zzb();
        if (j >= 0) {
            this.zzd = this.zzb.zzav().currentTimeMillis();
            if (!zzf().postDelayed(this.zzc, j)) {
                this.zzb.zzay().zzd().zzb("Failed to schedule delayed post. time", Long.valueOf(j));
            }
        }
    }

    public final boolean zze() {
        return this.zzd != 0;
    }
}
