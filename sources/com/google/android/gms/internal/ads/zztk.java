package com.google.android.gms.internal.ads;

import com.moovit.database.sqlite.SQLiteDatabase;
import java.io.EOFException;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.util.Arrays;

final class zztk {
    private final zzdy zza = new zzdy(32);
    private zztj zzb;
    private zztj zzc;
    private zztj zzd;
    private long zze;
    private final zzvw zzf;

    public zztk(zzvw zzvw, byte[] bArr) {
        this.zzf = zzvw;
        zztj zztj = new zztj(0, SQLiteDatabase.OPEN_FULLMUTEX);
        this.zzb = zztj;
        this.zzc = zztj;
        this.zzd = zztj;
    }

    private final int zzi(int i) {
        zztj zztj = this.zzd;
        if (zztj.zzc == null) {
            zzvp zzb2 = this.zzf.zzb();
            zztj zztj2 = new zztj(this.zzd.zzb, SQLiteDatabase.OPEN_FULLMUTEX);
            zztj.zzc = zzb2;
            zztj.zzd = zztj2;
        }
        return Math.min(i, (int) (this.zzd.zzb - this.zze));
    }

    private static zztj zzj(zztj zztj, long j) {
        while (j >= zztj.zzb) {
            zztj = zztj.zzd;
        }
        return zztj;
    }

    private static zztj zzk(zztj zztj, long j, ByteBuffer byteBuffer, int i) {
        zztj zzj = zzj(zztj, j);
        while (i > 0) {
            int min = Math.min(i, (int) (zzj.zzb - j));
            byteBuffer.put(zzj.zzc.zza, zzj.zza(j), min);
            i -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztj zzl(zztj zztj, long j, byte[] bArr, int i) {
        zztj zzj = zzj(zztj, j);
        int i2 = i;
        while (i2 > 0) {
            int min = Math.min(i2, (int) (zzj.zzb - j));
            System.arraycopy(zzj.zzc.zza, zzj.zza(j), bArr, i - i2, min);
            i2 -= min;
            j += (long) min;
            if (j == zzj.zzb) {
                zzj = zzj.zzd;
            }
        }
        return zzj;
    }

    private static zztj zzm(zztj zztj, zzgc zzgc, zztm zztm, zzdy zzdy) {
        zztj zztj2;
        int i;
        zzgc zzgc2 = zzgc;
        zztm zztm2 = zztm;
        zzdy zzdy2 = zzdy;
        if (zzgc.zzk()) {
            long j = zztm2.zzb;
            zzdy2.zzC(1);
            zztj zzl = zzl(zztj, j, zzdy.zzH(), 1);
            long j2 = j + 1;
            byte b = zzdy.zzH()[0];
            byte b2 = b & 128;
            byte b3 = b & Byte.MAX_VALUE;
            zzfz zzfz = zzgc2.zza;
            byte[] bArr = zzfz.zza;
            if (bArr == null) {
                zzfz.zza = new byte[16];
            } else {
                Arrays.fill(bArr, (byte) 0);
            }
            zztj2 = zzl(zzl, j2, zzfz.zza, b3);
            long j3 = j2 + ((long) b3);
            if (b2 != 0) {
                zzdy2.zzC(2);
                zztj2 = zzl(zztj2, j3, zzdy.zzH(), 2);
                j3 += 2;
                i = zzdy.zzo();
            } else {
                i = 1;
            }
            int[] iArr = zzfz.zzd;
            if (iArr == null || iArr.length < i) {
                iArr = new int[i];
            }
            int[] iArr2 = iArr;
            int[] iArr3 = zzfz.zze;
            if (iArr3 == null || iArr3.length < i) {
                iArr3 = new int[i];
            }
            int[] iArr4 = iArr3;
            if (b2 != 0) {
                int i2 = i * 6;
                zzdy2.zzC(i2);
                zztj2 = zzl(zztj2, j3, zzdy.zzH(), i2);
                j3 += (long) i2;
                zzdy2.zzF(0);
                for (int i3 = 0; i3 < i; i3++) {
                    iArr2[i3] = zzdy.zzo();
                    iArr4[i3] = zzdy.zzn();
                }
            } else {
                iArr2[0] = 0;
                iArr4[0] = zztm2.zza - ((int) (j3 - zztm2.zzb));
            }
            zzzy zzzy = zztm2.zzc;
            int i4 = zzeg.zza;
            zzfz.zzc(i, iArr2, iArr4, zzzy.zzb, zzfz.zza, zzzy.zza, zzzy.zzc, zzzy.zzd);
            long j4 = zztm2.zzb;
            int i5 = (int) (j3 - j4);
            zztm2.zzb = j4 + ((long) i5);
            zztm2.zza -= i5;
        } else {
            zztj2 = zztj;
        }
        if (zzgc.zze()) {
            zzdy2.zzC(4);
            zztj zzl2 = zzl(zztj2, zztm2.zzb, zzdy.zzH(), 4);
            int zzn = zzdy.zzn();
            zztm2.zzb += 4;
            zztm2.zza -= 4;
            zzgc2.zzi(zzn);
            zztj zzk = zzk(zzl2, zztm2.zzb, zzgc2.zzb, zzn);
            zztm2.zzb += (long) zzn;
            int i6 = zztm2.zza - zzn;
            zztm2.zza = i6;
            ByteBuffer byteBuffer = zzgc2.zze;
            if (byteBuffer == null || byteBuffer.capacity() < i6) {
                zzgc2.zze = ByteBuffer.allocate(i6);
            } else {
                zzgc2.zze.clear();
            }
            return zzk(zzk, zztm2.zzb, zzgc2.zze, zztm2.zza);
        }
        zzgc2.zzi(zztm2.zza);
        return zzk(zztj2, zztm2.zzb, zzgc2.zzb, zztm2.zza);
    }

    private final void zzn(int i) {
        long j = this.zze + ((long) i);
        this.zze = j;
        zztj zztj = this.zzd;
        if (j == zztj.zzb) {
            this.zzd = zztj.zzd;
        }
    }

    public final int zza(zzp zzp, int i, boolean z) throws IOException {
        int zzi = zzi(i);
        zztj zztj = this.zzd;
        int zza2 = zzp.zza(zztj.zzc.zza, zztj.zza(this.zze), zzi);
        if (zza2 != -1) {
            zzn(zza2);
            return zza2;
        } else if (z) {
            return -1;
        } else {
            throw new EOFException();
        }
    }

    public final long zzb() {
        return this.zze;
    }

    public final void zzc(long j) {
        zztj zztj;
        if (j != -1) {
            while (true) {
                zztj = this.zzb;
                if (j < zztj.zzb) {
                    break;
                }
                this.zzf.zzc(zztj.zzc);
                this.zzb = this.zzb.zzb();
            }
            if (this.zzc.zza < zztj.zza) {
                this.zzc = zztj;
            }
        }
    }

    public final void zzd(zzgc zzgc, zztm zztm) {
        zzm(this.zzc, zzgc, zztm, this.zza);
    }

    public final void zze(zzgc zzgc, zztm zztm) {
        this.zzc = zzm(this.zzc, zzgc, zztm, this.zza);
    }

    public final void zzf() {
        zztj zztj = this.zzb;
        if (zztj.zzc != null) {
            this.zzf.zzd(zztj);
            zztj.zzb();
        }
        this.zzb.zze(0, SQLiteDatabase.OPEN_FULLMUTEX);
        zztj zztj2 = this.zzb;
        this.zzc = zztj2;
        this.zzd = zztj2;
        this.zze = 0;
        this.zzf.zzg();
    }

    public final void zzg() {
        this.zzc = this.zzb;
    }

    public final void zzh(zzdy zzdy, int i) {
        while (i > 0) {
            int zzi = zzi(i);
            zztj zztj = this.zzd;
            zzdy.zzB(zztj.zzc.zza, zztj.zza(this.zze), zzi);
            i -= zzi;
            zzn(zzi);
        }
    }
}
