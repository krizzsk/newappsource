package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzow {
    private final int zza;
    private final int zzb;
    private final float zzc;
    private final float zzd;
    private final float zze;
    private final int zzf;
    private final int zzg;
    private final int zzh;
    private final short[] zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm;
    private short[] zzn;
    private int zzo;
    private int zzp;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu;
    private int zzv;

    public zzow(int i, int i2, float f, float f2, int i3) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = f;
        this.zzd = f2;
        this.zze = ((float) i) / ((float) i3);
        this.zzf = i / 400;
        int i4 = i / 65;
        this.zzg = i4;
        int i5 = i4 + i4;
        this.zzh = i5;
        this.zzi = new short[i5];
        int i6 = i5 * i2;
        this.zzj = new short[i6];
        this.zzl = new short[i6];
        this.zzn = new short[i6];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.zzb;
        int i5 = 1;
        int i6 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                i9 += Math.abs(sArr[i4 + i11] - sArr[(i4 + i2) + i11]);
            }
            int i12 = i9 * i7;
            int i13 = i5 * i2;
            if (i12 < i13) {
                i5 = i9;
            }
            if (i12 < i13) {
                i7 = i2;
            }
            int i14 = i9 * i6;
            int i15 = i8 * i2;
            if (i14 > i15) {
                i8 = i9;
            }
            if (i14 > i15) {
                i6 = i2;
            }
            i2++;
        }
        this.zzu = i5 / i7;
        this.zzv = i8 / i6;
        return i7;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        short[] zzl2 = zzl(this.zzl, this.zzm, i2);
        this.zzl = zzl2;
        int i3 = this.zzb;
        System.arraycopy(sArr, i * i3, zzl2, this.zzm * i3, i3 * i2);
        this.zzm += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3 = this.zzh / i2;
        int i4 = this.zzb;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C16530d.m42021o(i7, i5, i6, i9)];
            }
            this.zzi[i7] = (short) (i8 / i5);
        }
    }

    private static void zzj(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
        for (int i6 = 0; i6 < i2; i6++) {
            int i7 = (i3 * i2) + i6;
            int i8 = (i5 * i2) + i6;
            int i9 = (i4 * i2) + i6;
            for (int i11 = 0; i11 < i; i11++) {
                sArr[i7] = (short) (((sArr3[i8] * i11) + ((i - i11) * sArr2[i9])) / i);
                i7 += i2;
                i9 += i2;
                i8 += i2;
            }
        }
    }

    private final void zzk() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        int i7;
        int i8;
        int i9;
        int i11;
        int i12 = this.zzm;
        float f = this.zzc;
        float f2 = this.zzd;
        float f3 = f / f2;
        float f4 = this.zze * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i13 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i14 = this.zzk;
            if (i14 >= this.zzh) {
                int i15 = 0;
                while (true) {
                    int i16 = this.zzr;
                    if (i16 > 0) {
                        int min = Math.min(this.zzh, i16);
                        zzh(this.zzj, i15, min);
                        this.zzr -= min;
                        i15 += min;
                    } else {
                        short[] sArr = this.zzj;
                        int i17 = this.zza;
                        if (i17 > 4000) {
                            i5 = i17 / 4000;
                        } else {
                            i5 = 1;
                        }
                        if (this.zzb == i13 && i5 == i13) {
                            i6 = zzg(sArr, i15, this.zzf, this.zzg);
                        } else {
                            zzi(sArr, i15, i5);
                            int zzg2 = zzg(this.zzi, 0, this.zzf / i5, this.zzg / i5);
                            if (i5 != i13) {
                                int i18 = zzg2 * i5;
                                int i19 = i5 * 4;
                                int i21 = i18 - i19;
                                int i22 = i18 + i19;
                                int i23 = this.zzf;
                                if (i21 < i23) {
                                    i21 = i23;
                                }
                                int i24 = this.zzg;
                                if (i22 > i24) {
                                    i22 = i24;
                                }
                                if (this.zzb == i13) {
                                    i6 = zzg(sArr, i15, i21, i22);
                                } else {
                                    zzi(sArr, i15, i13);
                                    i6 = zzg(this.zzi, 0, i21, i22);
                                }
                            } else {
                                i6 = zzg2;
                            }
                        }
                        int i25 = this.zzu;
                        int i26 = this.zzv;
                        if (i25 == 0 || (i11 = this.zzs) == 0 || i26 > i25 * 3 || i25 + i25 <= this.zzt * 3) {
                            i7 = i6;
                        } else {
                            i7 = i11;
                        }
                        this.zzt = i25;
                        this.zzs = i6;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzj;
                            if (f3 >= 2.0f) {
                                i9 = (int) (((float) i7) / (-1.0f + f3));
                            } else {
                                this.zzr = (int) (((2.0f - f3) * ((float) i7)) / (-1.0f + f3));
                                i9 = i7;
                            }
                            short[] zzl2 = zzl(this.zzl, this.zzm, i9);
                            this.zzl = zzl2;
                            int i27 = i9;
                            short[] sArr3 = sArr2;
                            zzj(i9, this.zzb, zzl2, this.zzm, sArr3, i15, sArr3, i15 + i7);
                            this.zzm += i27;
                            i15 = i7 + i27 + i15;
                        } else {
                            int i28 = i7;
                            short[] sArr4 = this.zzj;
                            if (f3 < 0.5f) {
                                i8 = (int) ((((float) i28) * f3) / (f5 - f3));
                            } else {
                                this.zzr = (int) ((((f3 + f3) - 4.0f) * ((float) i28)) / (f5 - f3));
                                i8 = i28;
                            }
                            int i29 = i28 + i8;
                            short[] zzl3 = zzl(this.zzl, this.zzm, i29);
                            this.zzl = zzl3;
                            int i31 = this.zzb;
                            System.arraycopy(sArr4, i15 * i31, zzl3, this.zzm * i31, i31 * i28);
                            zzj(i8, this.zzb, this.zzl, this.zzm + i28, sArr4, i15 + i28, sArr4, i15);
                            this.zzm += i29;
                            i15 += i8;
                        }
                    }
                    if (this.zzh + i15 > i14) {
                        break;
                    }
                    f5 = 1.0f;
                    i13 = 1;
                }
                int i32 = this.zzk - i15;
                short[] sArr5 = this.zzj;
                int i33 = this.zzb;
                System.arraycopy(sArr5, i15 * i33, sArr5, 0, i33 * i32);
                this.zzk = i32;
                f5 = 1.0f;
            }
        } else {
            zzh(this.zzj, 0, this.zzk);
            this.zzk = 0;
        }
        if (f4 != f5 && this.zzm != i12) {
            int i34 = this.zza;
            int i35 = (int) (((float) i34) / f4);
            while (true) {
                if (i35 <= 16384 && i34 <= 16384) {
                    break;
                }
                i35 /= 2;
                i34 /= 2;
            }
            int i36 = this.zzm - i12;
            short[] zzl4 = zzl(this.zzn, this.zzo, i36);
            this.zzn = zzl4;
            short[] sArr6 = this.zzl;
            int i37 = this.zzb;
            System.arraycopy(sArr6, i12 * i37, zzl4, this.zzo * i37, i37 * i36);
            this.zzm = i12;
            this.zzo += i36;
            int i38 = 0;
            while (true) {
                i = this.zzo;
                i2 = i - 1;
                if (i38 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.zzp + 1;
                    i4 = this.zzq;
                    if (i3 * i35 <= i4 * i34) {
                        break;
                    }
                    this.zzl = zzl(this.zzl, this.zzm, 1);
                    int i39 = 0;
                    while (true) {
                        int i41 = this.zzb;
                        if (i39 >= i41) {
                            break;
                        }
                        short[] sArr7 = this.zzl;
                        int i42 = this.zzm;
                        short[] sArr8 = this.zzn;
                        int i43 = (i38 * i41) + i39;
                        short s = sArr8[i43];
                        short s2 = sArr8[i43 + i41];
                        int i44 = this.zzq;
                        int i45 = this.zzp;
                        int i46 = (i45 + 1) * i35;
                        int i47 = i46 - (i44 * i34);
                        int i48 = i46 - (i45 * i35);
                        sArr7[(i42 * i41) + i39] = (short) ((((i48 - i47) * s2) + (s * i47)) / i48);
                        i39++;
                    }
                    this.zzq++;
                    this.zzm++;
                }
                this.zzp = i3;
                if (i3 == i34) {
                    this.zzp = 0;
                    if (i4 == i35) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzcw.zzf(z);
                    this.zzq = 0;
                }
                i38++;
            }
            if (i2 != 0) {
                short[] sArr9 = this.zzn;
                int i49 = this.zzb;
                System.arraycopy(sArr9, i2 * i49, sArr9, 0, (i - i2) * i49);
                this.zzo -= i2;
            }
        }
    }

    private final short[] zzl(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.zzb;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    public final int zza() {
        int i = this.zzm * this.zzb;
        return i + i;
    }

    public final int zzb() {
        int i = this.zzk * this.zzb;
        return i + i;
    }

    public final void zzc() {
        this.zzk = 0;
        this.zzm = 0;
        this.zzo = 0;
        this.zzp = 0;
        this.zzq = 0;
        this.zzr = 0;
        this.zzs = 0;
        this.zzt = 0;
        this.zzu = 0;
        this.zzv = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzm);
        shortBuffer.put(this.zzl, 0, this.zzb * min);
        int i = this.zzm - min;
        this.zzm = i;
        short[] sArr = this.zzl;
        int i2 = this.zzb;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zze() {
        int i;
        int i2 = this.zzk;
        float f = this.zzc;
        float f2 = this.zzd;
        int i3 = this.zzm + ((int) ((((((float) i2) / (f / f2)) + ((float) this.zzo)) / (this.zze * f2)) + 0.5f));
        short[] sArr = this.zzj;
        int i4 = this.zzh;
        this.zzj = zzl(sArr, i2, i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.zzh;
            i = i6 + i6;
            int i7 = this.zzb;
            if (i5 >= i * i7) {
                break;
            }
            this.zzj[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.zzk += i;
        zzk();
        if (this.zzm > i3) {
            this.zzm = i3;
        }
        this.zzk = 0;
        this.zzr = 0;
        this.zzo = 0;
    }

    public final void zzf(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        short[] zzl2 = zzl(this.zzj, this.zzk, i2);
        this.zzj = zzl2;
        shortBuffer.get(zzl2, this.zzk * this.zzb, (i3 + i3) / 2);
        this.zzk += i2;
        zzk();
    }
}
