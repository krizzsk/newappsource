package com.google.android.gms.internal.ads;

import android.os.SystemClock;
import com.google.android.gms.maps.model.BitmapDescriptorFactory;

public final class zzgp {
    private final long zza;
    private final long zzb;
    private long zzc = -9223372036854775807L;
    private long zzd = -9223372036854775807L;
    private long zze = -9223372036854775807L;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;
    private float zzi = 1.03f;
    private float zzj = 0.97f;
    private float zzk = 1.0f;
    private long zzl = -9223372036854775807L;
    private long zzm = -9223372036854775807L;
    private long zzn = -9223372036854775807L;

    public /* synthetic */ zzgp(float f, float f2, long j, float f3, long j2, long j3, float f4, zzgo zzgo) {
        this.zza = j2;
        this.zzb = j3;
    }

    private static long zzf(long j, long j2, float f) {
        return (long) ((((float) j2) * 9.999871E-4f) + (((float) j) * 0.999f));
    }

    private final void zzg() {
        long j = this.zzc;
        if (j != -9223372036854775807L) {
            long j2 = this.zzd;
            if (j2 != -9223372036854775807L) {
                j = j2;
            }
            long j3 = this.zzf;
            if (j3 != -9223372036854775807L && j < j3) {
                j = j3;
            }
            long j4 = this.zzg;
            if (j4 != -9223372036854775807L && j > j4) {
                j = j4;
            }
        } else {
            j = -9223372036854775807L;
        }
        if (this.zze != j) {
            this.zze = j;
            this.zzh = j;
            this.zzm = -9223372036854775807L;
            this.zzn = -9223372036854775807L;
            this.zzl = -9223372036854775807L;
        }
    }

    public final float zza(long j, long j2) {
        if (this.zzc == -9223372036854775807L) {
            return 1.0f;
        }
        long j3 = j - j2;
        long j4 = this.zzm;
        if (j4 == -9223372036854775807L) {
            this.zzm = j3;
            this.zzn = 0;
        } else {
            long max = Math.max(j3, zzf(j4, j3, 0.999f));
            this.zzm = max;
            this.zzn = zzf(this.zzn, Math.abs(j3 - max), 0.999f);
        }
        if (this.zzl != -9223372036854775807L && SystemClock.elapsedRealtime() - this.zzl < 1000) {
            return this.zzk;
        }
        this.zzl = SystemClock.elapsedRealtime();
        long j5 = (this.zzn * 3) + this.zzm;
        if (this.zzh > j5) {
            long zzv = zzeg.zzv(1000);
            float f = (float) zzv;
            long[] jArr = {j5, this.zze, this.zzh - (((long) ((this.zzk - 4.0f) * f)) + ((long) ((this.zzi - 4.0f) * f)))};
            for (int i = 1; i < 3; i++) {
                long j6 = jArr[i];
                if (j6 > j5) {
                    j5 = j6;
                }
            }
            this.zzh = j5;
        } else {
            j5 = zzeg.zzr(j - ((long) (Math.max(BitmapDescriptorFactory.HUE_RED, this.zzk - 4.0f) / 1.0E-7f)), this.zzh, j5);
            this.zzh = j5;
            long j7 = this.zzg;
            if (j7 != -9223372036854775807L && j5 > j7) {
                this.zzh = j7;
                j5 = j7;
            }
        }
        long j8 = j - j5;
        if (Math.abs(j8) < this.zza) {
            this.zzk = 1.0f;
            return 1.0f;
        }
        float zza2 = zzeg.zza((((float) j8) * 1.0E-7f) + 1.0f, this.zzj, this.zzi);
        this.zzk = zza2;
        return zza2;
    }

    public final long zzb() {
        return this.zzh;
    }

    public final void zzc() {
        long j = this.zzh;
        if (j != -9223372036854775807L) {
            long j2 = j + this.zzb;
            this.zzh = j2;
            long j3 = this.zzg;
            if (j3 != -9223372036854775807L && j2 > j3) {
                this.zzh = j3;
            }
            this.zzl = -9223372036854775807L;
        }
    }

    public final void zzd(zzau zzau) {
        long j = zzau.zzc;
        this.zzc = zzeg.zzv(-9223372036854775807L);
        this.zzf = zzeg.zzv(-9223372036854775807L);
        this.zzg = zzeg.zzv(-9223372036854775807L);
        this.zzj = 0.97f;
        this.zzi = 1.03f;
        zzg();
    }

    public final void zze(long j) {
        this.zzd = j;
        zzg();
    }
}
