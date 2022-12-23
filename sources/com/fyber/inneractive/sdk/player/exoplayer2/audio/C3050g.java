package com.fyber.inneractive.sdk.player.exoplayer2.audio;

import com.appboy.support.ValidationUtils;
import com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a;
import java.util.Arrays;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.audio.g */
public final class C3050g {

    /* renamed from: a */
    public final int f10472a;

    /* renamed from: b */
    public final int f10473b;

    /* renamed from: c */
    public final int f10474c;

    /* renamed from: d */
    public final int f10475d;

    /* renamed from: e */
    public final int f10476e;

    /* renamed from: f */
    public final short[] f10477f;

    /* renamed from: g */
    public int f10478g;

    /* renamed from: h */
    public short[] f10479h;

    /* renamed from: i */
    public int f10480i;

    /* renamed from: j */
    public short[] f10481j;

    /* renamed from: k */
    public int f10482k;

    /* renamed from: l */
    public short[] f10483l;

    /* renamed from: m */
    public int f10484m = 0;

    /* renamed from: n */
    public int f10485n = 0;

    /* renamed from: o */
    public float f10486o = 1.0f;

    /* renamed from: p */
    public float f10487p = 1.0f;

    /* renamed from: q */
    public int f10488q;

    /* renamed from: r */
    public int f10489r;

    /* renamed from: s */
    public int f10490s;

    /* renamed from: t */
    public int f10491t;

    /* renamed from: u */
    public int f10492u = 0;

    /* renamed from: v */
    public int f10493v;

    /* renamed from: w */
    public int f10494w;

    /* renamed from: x */
    public int f10495x;

    public C3050g(int i, int i2) {
        this.f10472a = i;
        this.f10473b = i2;
        this.f10474c = i / 400;
        int i3 = i / 65;
        this.f10475d = i3;
        int i4 = i3 * 2;
        this.f10476e = i4;
        this.f10477f = new short[i4];
        this.f10478g = i4;
        int i5 = i2 * i4;
        this.f10479h = new short[i5];
        this.f10480i = i4;
        this.f10481j = new short[i5];
        this.f10482k = i4;
        this.f10483l = new short[i5];
    }

    /* renamed from: a */
    public final void mo14046a(int i) {
        int i2 = this.f10488q + i;
        int i3 = this.f10478g;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f10478g = i4;
            this.f10479h = Arrays.copyOf(this.f10479h, i4 * this.f10473b);
        }
    }

    /* renamed from: b */
    public final void mo14048b(int i) {
        int i2 = this.f10489r + i;
        int i3 = this.f10480i;
        if (i2 > i3) {
            int i4 = (i3 / 2) + i + i3;
            this.f10480i = i4;
            this.f10481j = Arrays.copyOf(this.f10481j, i4 * this.f10473b);
        }
    }

    /* renamed from: a */
    public final void mo14047a(short[] sArr, int i, int i2) {
        mo14048b(i2);
        int i3 = this.f10473b;
        System.arraycopy(sArr, i * i3, this.f10481j, this.f10489r * i3, i3 * i2);
        this.f10489r += i2;
    }

    /* renamed from: b */
    public final void mo14049b(short[] sArr, int i, int i2) {
        int i3 = this.f10476e / i2;
        int i4 = this.f10473b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C16530d.m42021o(i7, i5, i6, i9)];
            }
            this.f10477f[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: a */
    public final int mo14044a(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f10473b;
        int i5 = 1;
        int i6 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                short s = sArr[i4 + i11];
                short s2 = sArr[i4 + i2 + i11];
                i9 += s >= s2 ? s - s2 : s2 - s;
            }
            if (i9 * i7 < i5 * i2) {
                i7 = i2;
                i5 = i9;
            }
            if (i9 * i6 > i8 * i2) {
                i6 = i2;
                i8 = i9;
            }
            i2++;
        }
        this.f10494w = i5 / i7;
        this.f10495x = i8 / i6;
        return i7;
    }

    /* renamed from: a */
    public final void mo14045a() {
        int i;
        int i2;
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = this.f10489r;
        float f = this.f10486o / this.f10487p;
        double d = (double) f;
        int i9 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i11 = this.f10488q;
            if (i11 >= this.f10476e) {
                int i12 = 0;
                while (true) {
                    int i13 = this.f10491t;
                    if (i13 > 0) {
                        int min = Math.min(this.f10476e, i13);
                        mo14047a(this.f10479h, i12, min);
                        this.f10491t -= min;
                        i12 += min;
                    } else {
                        short[] sArr = this.f10479h;
                        int i14 = this.f10472a;
                        int i15 = i14 > 4000 ? i14 / 4000 : 1;
                        if (this.f10473b == i9 && i15 == i9) {
                            i5 = mo14044a(sArr, i12, this.f10474c, this.f10475d);
                        } else {
                            mo14049b(sArr, i12, i15);
                            int a = mo14044a(this.f10477f, 0, this.f10474c / i15, this.f10475d / i15);
                            if (i15 != i9) {
                                int i16 = a * i15;
                                int i17 = i15 * 4;
                                int i18 = i16 - i17;
                                int i19 = i16 + i17;
                                int i21 = this.f10474c;
                                if (i18 < i21) {
                                    i18 = i21;
                                }
                                int i22 = this.f10475d;
                                if (i19 > i22) {
                                    i19 = i22;
                                }
                                if (this.f10473b == i9) {
                                    i5 = mo14044a(sArr, i12, i18, i19);
                                } else {
                                    mo14049b(sArr, i12, i9);
                                    i5 = mo14044a(this.f10477f, 0, i18, i19);
                                }
                            } else {
                                i5 = a;
                            }
                        }
                        int i23 = this.f10494w;
                        int i24 = i23 != 0 && this.f10492u != 0 && this.f10495x <= i23 * 3 && i23 * 2 > this.f10493v * 3 ? this.f10492u : i5;
                        this.f10493v = i23;
                        this.f10492u = i5;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f10479h;
                            if (f >= 2.0f) {
                                i7 = (int) (((float) i24) / (f - 1.0f));
                            } else {
                                this.f10491t = (int) (((2.0f - f) * ((float) i24)) / (f - 1.0f));
                                i7 = i24;
                            }
                            mo14048b(i7);
                            int i25 = i7;
                            m7641a(i7, this.f10473b, this.f10481j, this.f10489r, sArr2, i12, sArr2, i12 + i24);
                            this.f10489r += i25;
                            i12 = i24 + i25 + i12;
                        } else {
                            int i26 = i24;
                            short[] sArr3 = this.f10479h;
                            if (f < 0.5f) {
                                i6 = (int) ((((float) i26) * f) / (1.0f - f));
                            } else {
                                this.f10491t = (int) ((((2.0f * f) - 1.0f) * ((float) i26)) / (1.0f - f));
                                i6 = i26;
                            }
                            int i27 = i26 + i6;
                            mo14048b(i27);
                            int i28 = this.f10473b;
                            System.arraycopy(sArr3, i12 * i28, this.f10481j, this.f10489r * i28, i28 * i26);
                            m7641a(i6, this.f10473b, this.f10481j, this.f10489r + i26, sArr3, i26 + i12, sArr3, i12);
                            this.f10489r += i27;
                            i12 += i6;
                        }
                    }
                    if (this.f10476e + i12 > i11) {
                        break;
                    }
                    i9 = 1;
                }
                int i29 = this.f10488q - i12;
                short[] sArr4 = this.f10479h;
                int i31 = this.f10473b;
                System.arraycopy(sArr4, i12 * i31, sArr4, 0, i31 * i29);
                this.f10488q = i29;
            }
        } else {
            mo14047a(this.f10479h, 0, this.f10488q);
            this.f10488q = 0;
        }
        float f2 = this.f10487p;
        if (f2 != 1.0f && this.f10489r != i8) {
            int i32 = this.f10472a;
            int i33 = (int) (((float) i32) / f2);
            while (true) {
                if (i33 <= 16384 && i32 <= 16384) {
                    break;
                }
                i33 /= 2;
                i32 /= 2;
            }
            int i34 = this.f10489r - i8;
            int i35 = this.f10490s + i34;
            int i36 = this.f10482k;
            if (i35 > i36) {
                int i37 = (i36 / 2) + i34 + i36;
                this.f10482k = i37;
                this.f10483l = Arrays.copyOf(this.f10483l, i37 * this.f10473b);
            }
            short[] sArr5 = this.f10481j;
            int i38 = this.f10473b;
            System.arraycopy(sArr5, i8 * i38, this.f10483l, this.f10490s * i38, i38 * i34);
            this.f10489r = i8;
            this.f10490s += i34;
            int i39 = 0;
            while (true) {
                i = this.f10490s;
                i2 = i - 1;
                if (i39 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f10484m + 1;
                    int i41 = i3 * i33;
                    i4 = this.f10485n;
                    if (i41 <= i4 * i32) {
                        break;
                    }
                    mo14048b(1);
                    int i42 = 0;
                    while (true) {
                        int i43 = this.f10473b;
                        if (i42 >= i43) {
                            break;
                        }
                        short[] sArr6 = this.f10483l;
                        int i44 = (i39 * i43) + i42;
                        short s = sArr6[i44];
                        short s2 = sArr6[i44 + i43];
                        int i45 = this.f10484m;
                        int i46 = i45 * i33;
                        int i47 = (i45 + 1) * i33;
                        int i48 = i47 - (this.f10485n * i32);
                        int i49 = i47 - i46;
                        this.f10481j[(this.f10489r * i43) + i42] = (short) ((((i49 - i48) * s2) + (s * i48)) / i49);
                        i42++;
                    }
                    this.f10485n++;
                    this.f10489r++;
                }
                this.f10484m = i3;
                if (i3 == i32) {
                    this.f10484m = 0;
                    C3380a.m8507b(i4 == i33);
                    this.f10485n = 0;
                }
                i39++;
            }
            if (i2 != 0) {
                short[] sArr7 = this.f10483l;
                int i51 = this.f10473b;
                System.arraycopy(sArr7, i2 * i51, sArr7, 0, (i - i2) * i51);
                this.f10490s -= i2;
            }
        }
    }

    /* renamed from: a */
    public static void m7641a(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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
}
