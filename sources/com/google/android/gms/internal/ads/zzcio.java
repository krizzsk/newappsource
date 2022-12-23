package com.google.android.gms.internal.ads;

import com.google.android.gms.common.util.VisibleForTesting;
import com.moovit.database.sqlite.SQLiteDatabase;

public final class zzcio {
    private final zzayl zza = new zzayl(true, SQLiteDatabase.OPEN_FULLMUTEX);
    private long zzb = 15000000;
    private long zzc = 30000000;
    private long zzd = 2500000;
    private long zze = 5000000;
    private int zzf;
    private boolean zzg;

    public final void zza() {
        zze(false);
    }

    public final void zzb() {
        zze(true);
    }

    public final void zzc() {
        zze(true);
    }

    public final void zzd(zzarx[] zzarxArr, zzaxp zzaxp, zzayb zzayb) {
        this.zzf = 0;
        for (int i = 0; i < 2; i++) {
            if (zzayb.zza(i) != null) {
                this.zzf = zzazn.zzf(zzarxArr[i].zzc()) + this.zzf;
            }
        }
        this.zza.zzf(this.zzf);
    }

    @VisibleForTesting
    public final void zze(boolean z) {
        this.zzf = 0;
        this.zzg = false;
        if (z) {
            this.zza.zze();
        }
    }

    public final synchronized void zzf(int i) {
        this.zzd = ((long) i) * 1000;
    }

    public final synchronized void zzg(int i) {
        this.zze = ((long) i) * 1000;
    }

    public final synchronized void zzh(int i) {
        this.zzc = ((long) i) * 1000;
    }

    public final synchronized void zzi(int i) {
        this.zzb = ((long) i) * 1000;
    }

    public final synchronized boolean zzj(long j) {
        boolean z;
        z = true;
        char c = j > this.zzc ? 0 : j < this.zzb ? (char) 2 : 1;
        int zza2 = this.zza.zza();
        int i = this.zzf;
        if (c != 2) {
            if (c != 1 || !this.zzg || zza2 >= i) {
                z = false;
            }
        }
        this.zzg = z;
        return z;
    }

    public final synchronized boolean zzk(long j, boolean z) {
        long j2;
        j2 = z ? this.zze : this.zzd;
        return j2 <= 0 || j >= j2;
    }

    public final zzayl zzl() {
        return this.zza;
    }
}
