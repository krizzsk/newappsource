package com.google.android.gms.internal.ads;

final class zzads implements zzadr {
    private final long[] zza;
    private final long[] zzb;
    private final long zzc;
    private final long zzd;

    private zzads(long[] jArr, long[] jArr2, long j, long j2) {
        this.zza = jArr;
        this.zzb = jArr2;
        this.zzc = j;
        this.zzd = j2;
    }

    public static zzads zza(long j, long j2, zzzl zzzl, zzdy zzdy) {
        int i;
        int i2;
        zzzl zzzl2 = zzzl;
        zzdy zzdy2 = zzdy;
        zzdy2.zzG(10);
        int zze = zzdy.zze();
        if (zze <= 0) {
            return null;
        }
        int i3 = zzzl2.zzd;
        long j3 = (long) zze;
        if (i3 >= 32000) {
            i = 1152;
        } else {
            i = 576;
        }
        long zzw = zzeg.zzw(j3, ((long) i) * 1000000, (long) i3);
        int zzo = zzdy.zzo();
        int zzo2 = zzdy.zzo();
        int zzo3 = zzdy.zzo();
        zzdy2.zzG(2);
        long j4 = j2 + ((long) zzzl2.zzc);
        long[] jArr = new long[zzo];
        long[] jArr2 = new long[zzo];
        int i4 = 0;
        long j5 = j2;
        while (i4 < zzo) {
            int i5 = zzo2;
            jArr[i4] = (((long) i4) * zzw) / ((long) zzo);
            long j6 = j4;
            jArr2[i4] = Math.max(j5, j6);
            if (zzo3 == 1) {
                i2 = zzdy.zzk();
            } else if (zzo3 == 2) {
                i2 = zzdy.zzo();
            } else if (zzo3 == 3) {
                i2 = zzdy.zzm();
            } else if (zzo3 != 4) {
                return null;
            } else {
                i2 = zzdy.zzn();
            }
            j5 += (long) (i2 * i5);
            i4++;
            j4 = j6;
            zzo2 = i5;
        }
        int i6 = (j > -1 ? 1 : (j == -1 ? 0 : -1));
        return new zzads(jArr, jArr2, zzw, j5);
    }

    public final long zzb() {
        return this.zzd;
    }

    public final long zzc(long j) {
        return this.zza[zzeg.zzd(this.zzb, j, true, true)];
    }

    public final long zze() {
        return this.zzc;
    }

    public final zzzt zzg(long j) {
        int zzd2 = zzeg.zzd(this.zza, j, true, true);
        zzzw zzzw = new zzzw(this.zza[zzd2], this.zzb[zzd2]);
        if (zzzw.zzb < j) {
            long[] jArr = this.zza;
            if (zzd2 != jArr.length - 1) {
                int i = zzd2 + 1;
                return new zzzt(zzzw, new zzzw(jArr[i], this.zzb[i]));
            }
        }
        return new zzzt(zzzw, zzzw);
    }

    public final boolean zzh() {
        return true;
    }
}
