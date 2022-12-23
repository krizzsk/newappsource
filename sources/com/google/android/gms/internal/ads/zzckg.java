package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.moovit.database.sqlite.SQLiteDatabase;

public final class zzckg implements zzjb {
    private final zzvw zza = new zzvw(true, SQLiteDatabase.OPEN_FULLMUTEX);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final long zza() {
        return 0;
    }

    public final void zzb() {
        zzj(false);
    }

    public final void zzc() {
        zzj(true);
    }

    public final void zzd() {
        zzj(true);
    }

    public final void zze(zzju[] zzjuArr, zztz zztz, zzvh[] zzvhArr) {
        int i;
        int i2 = 0;
        this.zzf = 0;
        while (true) {
            int length = zzjuArr.length;
            if (i2 < 2) {
                if (zzvhArr[i2] != null) {
                    int i3 = this.zzf;
                    if (zzjuArr[i2].zzb() != 1) {
                        i = 131072000;
                    } else {
                        i = 13107200;
                    }
                    this.zzf = i3 + i;
                }
                i2++;
            } else {
                this.zza.zzf(this.zzf);
                return;
            }
        }
    }

    public final boolean zzf() {
        return false;
    }

    public final boolean zzg(long j, long j2, float f) {
        boolean z = true;
        char c = j2 > this.zzc ? 0 : j2 < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (c != 2 && (c != 1 || !this.zzg || zza2 >= i)) {
            z = false;
        }
        this.zzg = z;
        return z;
    }

    public final boolean zzh(long j, float f, boolean z, long j2) {
        long j3 = z ? this.zze : this.zzd;
        return j3 <= 0 || j >= j3;
    }

    public final zzvw zzi() {
        return this.zza;
    }

    @VisibleForTesting
    public final void zzj(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzk(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzl(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzm(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzn(int i) {
        this.zzb = ((long) i) * 1000;
    }
}
