package com.google.android.gms.internal.gtm;

import java.io.IOException;
import java.util.Arrays;

public final class zzxp {
    private static final zzxp zza = new zzxp(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzxp() {
        this(0, new int[8], new Object[8], true);
    }

    private zzxp(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzxp zzc() {
        return zza;
    }

    public static zzxp zzd(zzxp zzxp, zzxp zzxp2) {
        int i = zzxp.zzb + zzxp2.zzb;
        int[] copyOf = Arrays.copyOf(zzxp.zzc, i);
        System.arraycopy(zzxp2.zzc, 0, copyOf, zzxp.zzb, zzxp2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzxp.zzd, i);
        System.arraycopy(zzxp2.zzd, 0, copyOf2, zzxp.zzb, zzxp2.zzb);
        return new zzxp(i, copyOf, copyOf2, true);
    }

    public static zzxp zze() {
        return new zzxp(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzxp)) {
            return false;
        }
        zzxp zzxp = (zzxp) obj;
        int i = this.zzb;
        if (i == zzxp.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzxp.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzxp.zzd;
                    int i3 = this.zzb;
                    int i4 = 0;
                    while (i4 < i3) {
                        if (objArr[i4].equals(objArr2[i4])) {
                            i4++;
                        }
                    }
                    return true;
                } else if (iArr[i2] != iArr2[i2]) {
                    break;
                } else {
                    i2++;
                }
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = this.zzb;
        int i2 = (i + 527) * 31;
        int[] iArr = this.zzc;
        int i3 = 17;
        int i4 = 17;
        for (int i5 = 0; i5 < i; i5++) {
            i4 = (i4 * 31) + iArr[i5];
        }
        int i6 = (i2 + i4) * 31;
        Object[] objArr = this.zzd;
        int i7 = this.zzb;
        for (int i8 = 0; i8 < i7; i8++) {
            i3 = (i3 * 31) + objArr[i8].hashCode();
        }
        return i6 + i3;
    }

    public final int zza() {
        int i;
        int i2;
        int i3;
        int i4 = this.zze;
        if (i4 != -1) {
            return i4;
        }
        int i5 = 0;
        for (int i6 = 0; i6 < this.zzb; i6++) {
            int i7 = this.zzc[i6];
            int i8 = i7 >>> 3;
            int i9 = i7 & 7;
            if (i9 != 0) {
                if (i9 == 1) {
                    ((Long) this.zzd[i6]).longValue();
                    i3 = zzto.zzD(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzD = zzto.zzD(i8 << 3);
                    int zzd2 = ((zztd) this.zzd[i6]).zzd();
                    i5 = zzto.zzD(zzd2) + zzd2 + zzD + i5;
                } else if (i9 == 3) {
                    int zzC = zzto.zzC(i8);
                    i2 = zzC + zzC;
                    i = ((zzxp) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).intValue();
                    i3 = zzto.zzD(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzvk.zza());
                }
                i5 = i3 + i5;
            } else {
                long longValue = ((Long) this.zzd[i6]).longValue();
                i2 = zzto.zzD(i8 << 3);
                i = zzto.zzE(longValue);
            }
            i5 = i + i2 + i5;
        }
        this.zze = i5;
        return i5;
    }

    public final int zzb() {
        int i = this.zze;
        if (i != -1) {
            return i;
        }
        int i2 = 0;
        for (int i3 = 0; i3 < this.zzb; i3++) {
            int i4 = this.zzc[i3];
            int zzD = zzto.zzD(8);
            int zzd2 = ((zztd) this.zzd[i3]).zzd();
            i2 += zzto.zzD(zzd2) + zzd2 + zzto.zzD(24) + zzto.zzD(i4 >>> 3) + zzto.zzD(16) + zzD + zzD;
        }
        this.zze = i2;
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zzwm.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
        }
    }

    public final void zzh(int i, Object obj) {
        int i2;
        if (this.zzf) {
            int i3 = this.zzb;
            int[] iArr = this.zzc;
            if (i3 == iArr.length) {
                if (i3 < 4) {
                    i2 = 8;
                } else {
                    i2 = i3 >> 1;
                }
                int i4 = i3 + i2;
                this.zzc = Arrays.copyOf(iArr, i4);
                this.zzd = Arrays.copyOf(this.zzd, i4);
            }
            int[] iArr2 = this.zzc;
            int i5 = this.zzb;
            iArr2[i5] = i;
            this.zzd[i5] = obj;
            this.zzb = i5 + 1;
            return;
        }
        throw new UnsupportedOperationException();
    }

    public final void zzi(zztp zztp) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zztp.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzj(zztp zztp) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zztp.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zztp.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zztp.zzd(i3, (zztd) obj);
                } else if (i4 == 3) {
                    zztp.zzF(i3);
                    ((zzxp) obj).zzj(zztp);
                    zztp.zzh(i3);
                } else if (i4 == 5) {
                    zztp.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzvk.zza());
                }
            }
        }
    }
}
