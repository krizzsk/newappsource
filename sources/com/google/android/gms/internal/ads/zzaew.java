package com.google.android.gms.internal.ads;

import com.moovit.database.sqlite.SQLiteDatabase;

final class zzaew {
    public final zzaet zza;
    public final int zzb;
    public final long[] zzc;
    public final int[] zzd;
    public final int zze;
    public final long[] zzf;
    public final int[] zzg;
    public final long zzh;

    public zzaew(zzaet zzaet, long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2, long j) {
        boolean z;
        boolean z2;
        int length = iArr.length;
        int length2 = jArr2.length;
        boolean z3 = true;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        int length3 = jArr.length;
        if (length3 == length2) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzcw.zzd(z2);
        int length4 = iArr2.length;
        zzcw.zzd(length4 != length2 ? false : z3);
        this.zza = zzaet;
        this.zzc = jArr;
        this.zzd = iArr;
        this.zze = i;
        this.zzf = jArr2;
        this.zzg = iArr2;
        this.zzh = j;
        this.zzb = length3;
        if (length4 > 0) {
            int i2 = length4 - 1;
            iArr2[i2] = iArr2[i2] | SQLiteDatabase.ENABLE_WRITE_AHEAD_LOGGING;
        }
    }

    public final int zza(long j) {
        for (int zzd2 = zzeg.zzd(this.zzf, j, true, false); zzd2 >= 0; zzd2--) {
            if ((this.zzg[zzd2] & 1) != 0) {
                return zzd2;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzb2 = zzeg.zzb(this.zzf, j, true, false); zzb2 < this.zzf.length; zzb2++) {
            if ((this.zzg[zzb2] & 1) != 0) {
                return zzb2;
            }
        }
        return -1;
    }
}
