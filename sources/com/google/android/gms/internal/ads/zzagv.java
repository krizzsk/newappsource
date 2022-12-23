package com.google.android.gms.internal.ads;

import java.io.IOException;

final class zzagv {
    private final zzee zza = new zzee(0);
    private final zzdy zzb = new zzdy();
    private boolean zzc;
    private boolean zzd;
    private boolean zze;
    private long zzf = -9223372036854775807L;
    private long zzg = -9223372036854775807L;
    private long zzh = -9223372036854775807L;

    public static long zzc(zzdy zzdy) {
        zzdy zzdy2 = zzdy;
        int zzc2 = zzdy.zzc();
        if (zzdy.zza() < 9) {
            return -9223372036854775807L;
        }
        byte[] bArr = new byte[9];
        zzdy2.zzB(bArr, 0, 9);
        zzdy2.zzF(zzc2);
        byte b = bArr[0];
        if ((b & 196) == 68) {
            byte b2 = bArr[2];
            if ((b2 & 4) == 4) {
                byte b3 = bArr[4];
                if ((b3 & 4) == 4 && (bArr[5] & 1) == 1 && (bArr[8] & 3) == 3) {
                    long j = (long) b;
                    long j2 = (long) b2;
                    long j3 = (j & 3) << 28;
                    return ((((long) bArr[1]) & 255) << 20) | j3 | (((56 & j) >> 3) << 30) | (((j2 & 248) >> 3) << 15) | ((j2 & 3) << 13) | ((((long) bArr[3]) & 255) << 5) | ((((long) b3) & 248) >> 3);
                }
            }
        }
        return -9223372036854775807L;
    }

    private final int zzf(zzyt zzyt) {
        zzdy zzdy = this.zzb;
        byte[] bArr = zzeg.zzf;
        int length = bArr.length;
        zzdy.zzD(bArr, 0);
        this.zzc = true;
        zzyt.zzj();
        return 0;
    }

    private static final int zzg(byte[] bArr, int i) {
        return (bArr[i + 3] & 255) | ((bArr[i] & 255) << 24) | ((bArr[i + 1] & 255) << 16) | ((bArr[i + 2] & 255) << 8);
    }

    public final int zza(zzyt zzyt, zzzs zzzs) throws IOException {
        long j = -9223372036854775807L;
        if (!this.zze) {
            long zzd2 = zzyt.zzd();
            int min = (int) Math.min(20000, zzd2);
            long j2 = zzd2 - ((long) min);
            if (zzyt.zzf() != j2) {
                zzzs.zza = j2;
                return 1;
            }
            this.zzb.zzC(min);
            zzyt.zzj();
            ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min, false);
            zzdy zzdy = this.zzb;
            int zzc2 = zzdy.zzc();
            int zzd3 = zzdy.zzd() - 4;
            while (true) {
                if (zzd3 < zzc2) {
                    break;
                }
                if (zzg(zzdy.zzH(), zzd3) == 442) {
                    zzdy.zzF(zzd3 + 4);
                    long zzc3 = zzc(zzdy);
                    if (zzc3 != -9223372036854775807L) {
                        j = zzc3;
                        break;
                    }
                }
                zzd3--;
            }
            this.zzg = j;
            this.zze = true;
            return 0;
        } else if (this.zzg == -9223372036854775807L) {
            zzf(zzyt);
            return 0;
        } else if (!this.zzd) {
            int min2 = (int) Math.min(20000, zzyt.zzd());
            if (zzyt.zzf() != 0) {
                zzzs.zza = 0;
                return 1;
            }
            this.zzb.zzC(min2);
            zzyt.zzj();
            ((zzym) zzyt).zzm(this.zzb.zzH(), 0, min2, false);
            zzdy zzdy2 = this.zzb;
            int zzc4 = zzdy2.zzc();
            int zzd4 = zzdy2.zzd();
            while (true) {
                if (zzc4 >= zzd4 - 3) {
                    break;
                }
                if (zzg(zzdy2.zzH(), zzc4) == 442) {
                    zzdy2.zzF(zzc4 + 4);
                    long zzc5 = zzc(zzdy2);
                    if (zzc5 != -9223372036854775807L) {
                        j = zzc5;
                        break;
                    }
                }
                zzc4++;
            }
            this.zzf = j;
            this.zzd = true;
            return 0;
        } else {
            long j3 = this.zzf;
            if (j3 == -9223372036854775807L) {
                zzf(zzyt);
                return 0;
            }
            long zzb2 = this.zza.zzb(this.zzg) - this.zza.zzb(j3);
            this.zzh = zzb2;
            if (zzb2 < 0) {
                this.zzh = -9223372036854775807L;
            }
            zzf(zzyt);
            return 0;
        }
    }

    public final long zzb() {
        return this.zzh;
    }

    public final zzee zzd() {
        return this.zza;
    }

    public final boolean zze() {
        return this.zzc;
    }
}
