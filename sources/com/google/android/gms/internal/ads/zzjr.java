package com.google.android.gms.internal.ads;

import android.os.Looper;
import android.os.SystemClock;
import java.util.concurrent.TimeoutException;

public final class zzjr {
    private final zzjq zza;
    private final zzjp zzb;
    private final zzcx zzc;
    private final zzci zzd;
    private int zze;
    private Object zzf;
    private final Looper zzg;
    private final int zzh;
    private boolean zzi;
    private boolean zzj;
    private boolean zzk;

    public zzjr(zzjp zzjp, zzjq zzjq, zzci zzci, int i, zzcx zzcx, Looper looper) {
        this.zzb = zzjp;
        this.zza = zzjq;
        this.zzd = zzci;
        this.zzg = looper;
        this.zzc = zzcx;
        this.zzh = i;
    }

    public final int zza() {
        return this.zze;
    }

    public final Looper zzb() {
        return this.zzg;
    }

    public final zzjq zzc() {
        return this.zza;
    }

    public final zzjr zzd() {
        zzcw.zzf(!this.zzi);
        this.zzi = true;
        this.zzb.zzm(this);
        return this;
    }

    public final zzjr zze(Object obj) {
        zzcw.zzf(!this.zzi);
        this.zzf = obj;
        return this;
    }

    public final zzjr zzf(int i) {
        zzcw.zzf(!this.zzi);
        this.zze = i;
        return this;
    }

    public final Object zzg() {
        return this.zzf;
    }

    public final synchronized void zzh(boolean z) {
        this.zzj = z | this.zzj;
        this.zzk = true;
        notifyAll();
    }

    public final synchronized boolean zzi(long j) throws InterruptedException, TimeoutException {
        boolean z;
        zzcw.zzf(this.zzi);
        if (this.zzg.getThread() != Thread.currentThread()) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzf(z);
        long elapsedRealtime = SystemClock.elapsedRealtime() + j;
        while (!this.zzk) {
            if (j > 0) {
                wait(j);
                j = elapsedRealtime - SystemClock.elapsedRealtime();
            } else {
                throw new TimeoutException("Message delivery timed out.");
            }
        }
        return this.zzj;
    }

    public final synchronized boolean zzj() {
        return false;
    }
}
