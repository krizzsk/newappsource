package com.google.android.gms.internal.contextmanager;

import java.io.IOException;
import java.util.Arrays;

public final class zzoo {
    private static final zzoo zza = new zzoo(0, new int[0], new Object[0], false);
    private int zzb;
    private int[] zzc;
    private Object[] zzd;
    private int zze;
    private boolean zzf;

    private zzoo() {
        this(0, new int[8], new Object[8], true);
    }

    private zzoo(int i, int[] iArr, Object[] objArr, boolean z) {
        this.zze = -1;
        this.zzb = i;
        this.zzc = iArr;
        this.zzd = objArr;
        this.zzf = z;
    }

    public static zzoo zzc() {
        return zza;
    }

    public static zzoo zzd(zzoo zzoo, zzoo zzoo2) {
        int i = zzoo.zzb + zzoo2.zzb;
        int[] copyOf = Arrays.copyOf(zzoo.zzc, i);
        System.arraycopy(zzoo2.zzc, 0, copyOf, zzoo.zzb, zzoo2.zzb);
        Object[] copyOf2 = Arrays.copyOf(zzoo.zzd, i);
        System.arraycopy(zzoo2.zzd, 0, copyOf2, zzoo.zzb, zzoo2.zzb);
        return new zzoo(i, copyOf, copyOf2, true);
    }

    public static zzoo zze() {
        return new zzoo(0, new int[8], new Object[8], true);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof zzoo)) {
            return false;
        }
        zzoo zzoo = (zzoo) obj;
        int i = this.zzb;
        if (i == zzoo.zzb) {
            int[] iArr = this.zzc;
            int[] iArr2 = zzoo.zzc;
            int i2 = 0;
            while (true) {
                if (i2 >= i) {
                    Object[] objArr = this.zzd;
                    Object[] objArr2 = zzoo.zzd;
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
                    i3 = zzlk.zzD(i8 << 3) + 8;
                } else if (i9 == 2) {
                    int zzD = zzlk.zzD(i8 << 3);
                    int zzd2 = ((zzld) this.zzd[i6]).zzd();
                    i5 = zzlk.zzD(zzd2) + zzd2 + zzD + i5;
                } else if (i9 == 3) {
                    int zzC = zzlk.zzC(i8);
                    i2 = zzC + zzC;
                    i = ((zzoo) this.zzd[i6]).zza();
                } else if (i9 == 5) {
                    ((Integer) this.zzd[i6]).intValue();
                    i3 = zzlk.zzD(i8 << 3) + 4;
                } else {
                    throw new IllegalStateException(zzmp.zza());
                }
                i5 = i3 + i5;
            } else {
                long longValue = ((Long) this.zzd[i6]).longValue();
                i2 = zzlk.zzD(i8 << 3);
                i = zzlk.zzE(longValue);
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
            int zzD = zzlk.zzD(8);
            int zzd2 = ((zzld) this.zzd[i3]).zzd();
            i2 += zzlk.zzD(zzd2) + zzd2 + zzlk.zzD(24) + zzlk.zzD(i4 >>> 3) + zzlk.zzD(16) + zzD + zzD;
        }
        this.zze = i2;
        return i2;
    }

    public final void zzf() {
        this.zzf = false;
    }

    public final void zzg(StringBuilder sb, int i) {
        for (int i2 = 0; i2 < this.zzb; i2++) {
            zznp.zzb(sb, i, String.valueOf(this.zzc[i2] >>> 3), this.zzd[i2]);
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

    public final void zzi(zzll zzll) throws IOException {
        for (int i = 0; i < this.zzb; i++) {
            zzll.zzw(this.zzc[i] >>> 3, this.zzd[i]);
        }
    }

    public final void zzj(zzll zzll) throws IOException {
        if (this.zzb != 0) {
            for (int i = 0; i < this.zzb; i++) {
                int i2 = this.zzc[i];
                Object obj = this.zzd[i];
                int i3 = i2 >>> 3;
                int i4 = i2 & 7;
                if (i4 == 0) {
                    zzll.zzt(i3, ((Long) obj).longValue());
                } else if (i4 == 1) {
                    zzll.zzm(i3, ((Long) obj).longValue());
                } else if (i4 == 2) {
                    zzll.zzd(i3, (zzld) obj);
                } else if (i4 == 3) {
                    zzll.zzF(i3);
                    ((zzoo) obj).zzj(zzll);
                    zzll.zzh(i3);
                } else if (i4 == 5) {
                    zzll.zzk(i3, ((Integer) obj).intValue());
                } else {
                    throw new RuntimeException(zzmp.zza());
                }
            }
        }
    }
}
