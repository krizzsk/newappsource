package com.google.android.gms.internal.ads;

final class zzavn {
    public final int zza;
    public final long[] zzb;
    public final int[] zzc;
    public final int zzd;
    public final long[] zze;
    public final int[] zzf;

    public zzavn(long[] jArr, int[] iArr, int i, long[] jArr2, int[] iArr2) {
        boolean z;
        boolean z2;
        int length = jArr2.length;
        boolean z3 = true;
        if (iArr.length == length) {
            z = true;
        } else {
            z = false;
        }
        zzayy.zzc(z);
        int length2 = jArr.length;
        if (length2 == length) {
            z2 = true;
        } else {
            z2 = false;
        }
        zzayy.zzc(z2);
        zzayy.zzc(iArr2.length != length ? false : z3);
        this.zzb = jArr;
        this.zzc = iArr;
        this.zzd = i;
        this.zze = jArr2;
        this.zzf = iArr2;
        this.zza = length2;
    }

    public final int zza(long j) {
        for (int zzc2 = zzazn.zzc(this.zze, j, true, false); zzc2 >= 0; zzc2--) {
            if ((this.zzf[zzc2] & 1) != 0) {
                return zzc2;
            }
        }
        return -1;
    }

    public final int zzb(long j) {
        for (int zzb2 = zzazn.zzb(this.zze, j, true, false); zzb2 < this.zze.length; zzb2++) {
            if ((this.zzf[zzb2] & 1) != 0) {
                return zzb2;
            }
        }
        return -1;
    }
}
