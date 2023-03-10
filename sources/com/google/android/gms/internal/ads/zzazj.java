package com.google.android.gms.internal.ads;

import android.os.SystemClock;

public final class zzazj implements zzazc {
    private boolean zza;
    private long zzb;
    private long zzc;
    private zzarw zzd = zzarw.zza;

    public final long zzI() {
        long j;
        long j2 = this.zzb;
        if (!this.zza) {
            return j2;
        }
        long elapsedRealtime = SystemClock.elapsedRealtime() - this.zzc;
        zzarw zzarw = this.zzd;
        if (zzarw.zzb == 1.0f) {
            j = zzard.zza(elapsedRealtime);
        } else {
            j = zzarw.zza(elapsedRealtime);
        }
        return j2 + j;
    }

    public final zzarw zzJ() {
        throw null;
    }

    public final zzarw zzK(zzarw zzarw) {
        if (this.zza) {
            zza(zzI());
        }
        this.zzd = zzarw;
        return zzarw;
    }

    public final void zza(long j) {
        this.zzb = j;
        if (this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
        }
    }

    public final void zzb() {
        if (!this.zza) {
            this.zzc = SystemClock.elapsedRealtime();
            this.zza = true;
        }
    }

    public final void zzc() {
        if (this.zza) {
            zza(zzI());
            this.zza = false;
        }
    }

    public final void zzd(zzazc zzazc) {
        zza(zzazc.zzI());
        this.zzd = zzazc.zzJ();
    }
}
