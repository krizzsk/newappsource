package com.google.android.gms.internal.ads;

import com.appboy.support.ValidationUtils;
import java.nio.ShortBuffer;
import java.util.Arrays;

final class zzatg {
    private final int zza;
    private final int zzb;
    private final int zzc;
    private final int zzd;
    private final int zze;
    private final short[] zzf;
    private int zzg;
    private short[] zzh;
    private int zzi;
    private short[] zzj;
    private int zzk;
    private short[] zzl;
    private int zzm = 0;
    private int zzn = 0;
    private float zzo = 1.0f;
    private float zzp = 1.0f;
    private int zzq;
    private int zzr;
    private int zzs;
    private int zzt;
    private int zzu = 0;
    private int zzv;
    private int zzw;
    private int zzx;

    public zzatg(int i, int i2) {
        this.zza = i;
        this.zzb = i2;
        this.zzc = i / 400;
        int i3 = i / 65;
        this.zzd = i3;
        int i4 = i3 + i3;
        this.zze = i4;
        this.zzf = new short[i4];
        this.zzg = i4;
        int i5 = i2 * i4;
        this.zzh = new short[i5];
        this.zzi = i4;
        this.zzj = new short[i5];
        this.zzk = i4;
        this.zzl = new short[i5];
    }

    private final int zzg(short[] sArr, int i, int i2, int i3) {
        int i4;
        int i5 = i * this.zzb;
        int i6 = 1;
        int i7 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i8 = 0;
        int i9 = 0;
        while (i2 <= i3) {
            int i11 = 0;
            for (int i12 = 0; i12 < i2; i12++) {
                short s = sArr[i5 + i12];
                short s2 = sArr[i5 + i2 + i12];
                if (s >= s2) {
                    i4 = s - s2;
                } else {
                    i4 = s2 - s;
                }
                i11 += i4;
            }
            int i13 = i11 * i8;
            int i14 = i6 * i2;
            if (i13 < i14) {
                i6 = i11;
            }
            if (i13 < i14) {
                i8 = i2;
            }
            int i15 = i11 * i7;
            int i16 = i9 * i2;
            if (i15 > i16) {
                i9 = i11;
            }
            if (i15 > i16) {
                i7 = i2;
            }
            i2++;
        }
        this.zzw = i6 / i8;
        this.zzx = i9 / i7;
        return i8;
    }

    private final void zzh(short[] sArr, int i, int i2) {
        zzk(i2);
        int i3 = this.zzb;
        System.arraycopy(sArr, i * i3, this.zzj, this.zzr * i3, i3 * i2);
        this.zzr += i2;
    }

    private final void zzi(short[] sArr, int i, int i2) {
        int i3 = this.zze / i2;
        int i4 = this.zzb;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C16530d.m42021o(i7, i5, i6, i9)];
            }
            this.zzf[i7] = (short) (i8 / i5);
        }
    }

    private final void zzj(int i) {
        int i2 = this.zzq;
        int i3 = this.zzg;
        if (i2 + i > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.zzg = i4;
            this.zzh = Arrays.copyOf(this.zzh, i4 * this.zzb);
        }
    }

    private final void zzk(int i) {
        int i2 = this.zzr;
        int i3 = this.zzi;
        if (i2 + i > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.zzi = i4;
            this.zzj = Arrays.copyOf(this.zzj, i4 * this.zzb);
        }
    }

    private static void zzl(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    private final void zzm() {
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
        int i12 = this.zzr;
        float f = this.zzo / this.zzp;
        double d = (double) f;
        int i13 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i14 = this.zzq;
            if (i14 >= this.zze) {
                int i15 = 0;
                while (true) {
                    int i16 = this.zzt;
                    if (i16 > 0) {
                        int min = Math.min(this.zze, i16);
                        zzh(this.zzh, i15, min);
                        this.zzt -= min;
                        i15 += min;
                    } else {
                        short[] sArr = this.zzh;
                        int i17 = this.zza;
                        if (i17 > 4000) {
                            i5 = i17 / 4000;
                        } else {
                            i5 = 1;
                        }
                        if (this.zzb == i13 && i5 == i13) {
                            i6 = zzg(sArr, i15, this.zzc, this.zzd);
                        } else {
                            zzi(sArr, i15, i5);
                            int zzg2 = zzg(this.zzf, 0, this.zzc / i5, this.zzd / i5);
                            if (i5 != i13) {
                                int i18 = zzg2 * i5;
                                int i19 = i5 * 4;
                                int i21 = i18 - i19;
                                int i22 = i18 + i19;
                                int i23 = this.zzc;
                                if (i21 < i23) {
                                    i21 = i23;
                                }
                                int i24 = this.zzd;
                                if (i22 > i24) {
                                    i22 = i24;
                                }
                                if (this.zzb == i13) {
                                    i6 = zzg(sArr, i15, i21, i22);
                                } else {
                                    zzi(sArr, i15, i13);
                                    i6 = zzg(this.zzf, 0, i21, i22);
                                }
                            } else {
                                i6 = zzg2;
                            }
                        }
                        int i25 = this.zzw;
                        int i26 = this.zzx;
                        if (i25 == 0 || (i11 = this.zzu) == 0 || i26 > i25 * 3 || i25 + i25 <= this.zzv * 3) {
                            i7 = i6;
                        } else {
                            i7 = i11;
                        }
                        this.zzv = i25;
                        this.zzu = i6;
                        if (d > 1.0d) {
                            short[] sArr2 = this.zzh;
                            if (f >= 2.0f) {
                                i9 = (int) (((float) i7) / (-1.0f + f));
                            } else {
                                this.zzt = (int) (((2.0f - f) * ((float) i7)) / (-1.0f + f));
                                i9 = i7;
                            }
                            zzk(i9);
                            int i27 = i9;
                            zzl(i9, this.zzb, this.zzj, this.zzr, sArr2, i15, sArr2, i15 + i7);
                            this.zzr += i27;
                            i15 = i7 + i27 + i15;
                        } else {
                            int i28 = i7;
                            short[] sArr3 = this.zzh;
                            if (f < 0.5f) {
                                i8 = (int) ((((float) i28) * f) / (1.0f - f));
                            } else {
                                this.zzt = (int) ((((f + f) - 4.0f) * ((float) i28)) / (1.0f - f));
                                i8 = i28;
                            }
                            int i29 = i28 + i8;
                            zzk(i29);
                            int i31 = this.zzb;
                            System.arraycopy(sArr3, i15 * i31, this.zzj, this.zzr * i31, i31 * i28);
                            zzl(i8, this.zzb, this.zzj, this.zzr + i28, sArr3, i28 + i15, sArr3, i15);
                            this.zzr += i29;
                            i15 += i8;
                        }
                    }
                    if (this.zze + i15 > i14) {
                        break;
                    }
                    i13 = 1;
                }
                int i32 = this.zzq - i15;
                short[] sArr4 = this.zzh;
                int i33 = this.zzb;
                System.arraycopy(sArr4, i15 * i33, sArr4, 0, i33 * i32);
                this.zzq = i32;
            }
        } else {
            zzh(this.zzh, 0, this.zzq);
            this.zzq = 0;
        }
        float f2 = this.zzp;
        if (f2 != 1.0f && this.zzr != i12) {
            int i34 = this.zza;
            int i35 = (int) (((float) i34) / f2);
            while (true) {
                if (i35 <= 16384 && i34 <= 16384) {
                    break;
                }
                i35 /= 2;
                i34 /= 2;
            }
            int i36 = this.zzr - i12;
            int i37 = this.zzs;
            int i38 = this.zzk;
            if (i37 + i36 > i38) {
                int i39 = (i38 / 2) + i36 + i38;
                this.zzk = i39;
                this.zzl = Arrays.copyOf(this.zzl, i39 * this.zzb);
            }
            short[] sArr5 = this.zzj;
            int i41 = this.zzb;
            System.arraycopy(sArr5, i12 * i41, this.zzl, this.zzs * i41, i41 * i36);
            this.zzr = i12;
            this.zzs += i36;
            int i42 = 0;
            while (true) {
                i = this.zzs;
                i2 = i - 1;
                if (i42 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.zzm + 1;
                    i4 = this.zzn;
                    if (i3 * i35 <= i4 * i34) {
                        break;
                    }
                    zzk(1);
                    int i43 = 0;
                    while (true) {
                        int i44 = this.zzb;
                        if (i43 >= i44) {
                            break;
                        }
                        short[] sArr6 = this.zzj;
                        int i45 = this.zzr;
                        short[] sArr7 = this.zzl;
                        int i46 = (i42 * i44) + i43;
                        short s = sArr7[i46];
                        short s2 = sArr7[i46 + i44];
                        int i47 = this.zzn;
                        int i48 = this.zzm;
                        int i49 = (i48 + 1) * i35;
                        int i51 = i49 - (i47 * i34);
                        int i52 = i49 - (i48 * i35);
                        sArr6[(i45 * i44) + i43] = (short) ((((i52 - i51) * s2) + (s * i51)) / i52);
                        i43++;
                    }
                    this.zzn++;
                    this.zzr++;
                }
                this.zzm = i3;
                if (i3 == i34) {
                    this.zzm = 0;
                    if (i4 == i35) {
                        z = true;
                    } else {
                        z = false;
                    }
                    zzayy.zze(z);
                    this.zzn = 0;
                }
                i42++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.zzl;
                int i53 = this.zzb;
                System.arraycopy(sArr8, i2 * i53, sArr8, 0, (i - i2) * i53);
                this.zzs -= i2;
            }
        }
    }

    public final int zza() {
        return this.zzr;
    }

    public final void zzb(ShortBuffer shortBuffer) {
        int min = Math.min(shortBuffer.remaining() / this.zzb, this.zzr);
        shortBuffer.put(this.zzj, 0, this.zzb * min);
        int i = this.zzr - min;
        this.zzr = i;
        short[] sArr = this.zzj;
        int i2 = this.zzb;
        System.arraycopy(sArr, min * i2, sArr, 0, i * i2);
    }

    public final void zzc() {
        int i;
        int i2 = this.zzq;
        float f = this.zzo;
        float f2 = this.zzp;
        int i3 = this.zzr + ((int) ((((((float) i2) / (f / f2)) + ((float) this.zzs)) / f2) + 0.5f));
        int i4 = this.zze;
        zzj(i4 + i4 + i2);
        int i5 = 0;
        while (true) {
            int i6 = this.zze;
            i = i6 + i6;
            int i7 = this.zzb;
            if (i5 >= i * i7) {
                break;
            }
            this.zzh[(i7 * i2) + i5] = 0;
            i5++;
        }
        this.zzq += i;
        zzm();
        if (this.zzr > i3) {
            this.zzr = i3;
        }
        this.zzq = 0;
        this.zzt = 0;
        this.zzs = 0;
    }

    public final void zzd(ShortBuffer shortBuffer) {
        int remaining = shortBuffer.remaining();
        int i = this.zzb;
        int i2 = remaining / i;
        int i3 = i * i2;
        zzj(i2);
        shortBuffer.get(this.zzh, this.zzq * this.zzb, (i3 + i3) / 2);
        this.zzq += i2;
        zzm();
    }

    public final void zze(float f) {
        this.zzp = f;
    }

    public final void zzf(float f) {
        this.zzo = f;
    }
}
