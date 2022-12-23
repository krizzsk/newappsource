package com.google.android.gms.internal.ads;

public final class zzzk implements zzzv {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final boolean zzd;

    public zzzk(long[] jArr, long[] jArr2, long j) {
        boolean z;
        boolean z2;
        int length = jArr.length;
        int length2 = jArr2.length;
        if (length == length2) {
            z = true;
        } else {
            z = false;
        }
        zzcw.zzd(z);
        if (length2 > 0) {
            z2 = true;
        } else {
            z2 = false;
        }
        this.zzd = z2;
        if (!z2 || jArr2[0] <= 0) {
            this.zza = jArr;
            this.zzb = jArr2;
        } else {
            int i = length2 + 1;
            long[] jArr3 = new long[i];
            this.zza = jArr3;
            long[] jArr4 = new long[i];
            this.zzb = jArr4;
            System.arraycopy(jArr, 0, jArr3, 1, length2);
            System.arraycopy(jArr2, 0, jArr4, 1, length2);
        }
        this.zzc = j;
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzt zzg(long j) {
        if (!this.zzd) {
            zzzw zzzw = zzzw.zza;
            return new zzzt(zzzw, zzzw);
        }
        int zzd2 = zzeg.zzd(this.zzb, j, true, true);
        zzzw zzzw2 = new zzzw(this.zzb[zzd2], this.zza[zzd2]);
        if (zzzw2.zzb != j) {
            long[] jArr = this.zzb;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzzt(zzzw2, new zzzw(jArr[i], this.zza[i]));
            }
        }
        return new zzzt(zzzw2, zzzw2);
    }

    public final boolean zzh() {
        return this.zzd;
    }
}
