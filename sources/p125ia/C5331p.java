package p125ia;

import com.appboy.support.ValidationUtils;
import java.util.Arrays;
import p583jk.C17875h;

/* renamed from: ia.p */
public final class C5331p {

    /* renamed from: a */
    public final int f17566a;

    /* renamed from: b */
    public final int f17567b;

    /* renamed from: c */
    public final float f17568c;

    /* renamed from: d */
    public final float f17569d;

    /* renamed from: e */
    public final float f17570e;

    /* renamed from: f */
    public final int f17571f;

    /* renamed from: g */
    public final int f17572g;

    /* renamed from: h */
    public final int f17573h;

    /* renamed from: i */
    public final short[] f17574i;

    /* renamed from: j */
    public short[] f17575j;

    /* renamed from: k */
    public int f17576k;

    /* renamed from: l */
    public short[] f17577l;

    /* renamed from: m */
    public int f17578m;

    /* renamed from: n */
    public short[] f17579n;

    /* renamed from: o */
    public int f17580o;

    /* renamed from: p */
    public int f17581p;

    /* renamed from: q */
    public int f17582q;

    /* renamed from: r */
    public int f17583r;

    /* renamed from: s */
    public int f17584s;

    /* renamed from: t */
    public int f17585t;

    /* renamed from: u */
    public int f17586u;

    /* renamed from: v */
    public int f17587v;

    public C5331p(int i, int i2, float f, float f2, int i3) {
        this.f17566a = i;
        this.f17567b = i2;
        this.f17568c = f;
        this.f17569d = f2;
        this.f17570e = ((float) i) / ((float) i3);
        this.f17571f = i / 400;
        int i4 = i / 65;
        this.f17572g = i4;
        int i5 = i4 * 2;
        this.f17573h = i5;
        this.f17574i = new short[i5];
        this.f17575j = new short[(i5 * i2)];
        this.f17577l = new short[(i5 * i2)];
        this.f17579n = new short[(i5 * i2)];
    }

    /* renamed from: e */
    public static void m13365e(int i, int i2, short[] sArr, int i3, short[] sArr2, int i4, short[] sArr3, int i5) {
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

    /* renamed from: a */
    public final void mo21111a(short[] sArr, int i, int i2) {
        short[] c = mo21113c(this.f17577l, this.f17578m, i2);
        this.f17577l = c;
        int i3 = this.f17567b;
        System.arraycopy(sArr, i * i3, c, this.f17578m * i3, i3 * i2);
        this.f17578m += i2;
    }

    /* renamed from: b */
    public final void mo21112b(short[] sArr, int i, int i2) {
        int i3 = this.f17573h / i2;
        int i4 = this.f17567b;
        int i5 = i2 * i4;
        int i6 = i * i4;
        for (int i7 = 0; i7 < i3; i7++) {
            int i8 = 0;
            for (int i9 = 0; i9 < i5; i9++) {
                i8 += sArr[C16530d.m42021o(i7, i5, i6, i9)];
            }
            this.f17574i[i7] = (short) (i8 / i5);
        }
    }

    /* renamed from: c */
    public final short[] mo21113c(short[] sArr, int i, int i2) {
        int length = sArr.length;
        int i3 = this.f17567b;
        int i4 = length / i3;
        if (i + i2 <= i4) {
            return sArr;
        }
        return Arrays.copyOf(sArr, (((i4 * 3) / 2) + i2) * i3);
    }

    /* renamed from: d */
    public final int mo21114d(short[] sArr, int i, int i2, int i3) {
        int i4 = i * this.f17567b;
        int i5 = 1;
        int i6 = ValidationUtils.APPBOY_STRING_MAX_LENGTH;
        int i7 = 0;
        int i8 = 0;
        while (i2 <= i3) {
            int i9 = 0;
            for (int i11 = 0; i11 < i2; i11++) {
                i9 += Math.abs(sArr[i4 + i11] - sArr[(i4 + i2) + i11]);
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
        this.f17586u = i5 / i7;
        this.f17587v = i8 / i6;
        return i7;
    }

    /* renamed from: f */
    public final void mo21115f() {
        int i;
        int i2;
        int i3;
        int i4;
        boolean z;
        int i5;
        int i6;
        boolean z2;
        int i7;
        int i8;
        int i9;
        int i11 = this.f17578m;
        float f = this.f17568c;
        float f2 = this.f17569d;
        float f3 = f / f2;
        float f4 = this.f17570e * f2;
        double d = (double) f3;
        float f5 = 1.0f;
        int i12 = 1;
        if (d > 1.00001d || d < 0.99999d) {
            int i13 = this.f17576k;
            if (i13 >= this.f17573h) {
                int i14 = 0;
                while (true) {
                    int i15 = this.f17583r;
                    if (i15 > 0) {
                        int min = Math.min(this.f17573h, i15);
                        mo21111a(this.f17575j, i14, min);
                        this.f17583r -= min;
                        i14 += min;
                    } else {
                        short[] sArr = this.f17575j;
                        int i16 = this.f17566a;
                        if (i16 > 4000) {
                            i5 = i16 / 4000;
                        } else {
                            i5 = 1;
                        }
                        if (this.f17567b == i12 && i5 == i12) {
                            i6 = mo21114d(sArr, i14, this.f17571f, this.f17572g);
                        } else {
                            mo21112b(sArr, i14, i5);
                            int d2 = mo21114d(this.f17574i, 0, this.f17571f / i5, this.f17572g / i5);
                            if (i5 != i12) {
                                int i17 = d2 * i5;
                                int i18 = i5 * 4;
                                int i19 = i17 - i18;
                                int i21 = i17 + i18;
                                int i22 = this.f17571f;
                                if (i19 < i22) {
                                    i19 = i22;
                                }
                                int i23 = this.f17572g;
                                if (i21 > i23) {
                                    i21 = i23;
                                }
                                if (this.f17567b == i12) {
                                    i6 = mo21114d(sArr, i14, i19, i21);
                                } else {
                                    mo21112b(sArr, i14, i12);
                                    i6 = mo21114d(this.f17574i, 0, i19, i21);
                                }
                            } else {
                                i6 = d2;
                            }
                        }
                        int i24 = this.f17586u;
                        int i25 = this.f17587v;
                        if (i24 == 0 || this.f17584s == 0 || i25 > i24 * 3 || i24 * 2 <= this.f17585t * 3) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (z2) {
                            i7 = this.f17584s;
                        } else {
                            i7 = i6;
                        }
                        this.f17585t = i24;
                        this.f17584s = i6;
                        if (d > 1.0d) {
                            short[] sArr2 = this.f17575j;
                            if (f3 >= 2.0f) {
                                i9 = (int) (((float) i7) / (f3 - f5));
                            } else {
                                this.f17583r = (int) (((2.0f - f3) * ((float) i7)) / (f3 - f5));
                                i9 = i7;
                            }
                            short[] c = mo21113c(this.f17577l, this.f17578m, i9);
                            this.f17577l = c;
                            int i26 = i9;
                            short[] sArr3 = sArr2;
                            m13365e(i9, this.f17567b, c, this.f17578m, sArr3, i14, sArr3, i14 + i7);
                            this.f17578m += i26;
                            i14 = i7 + i26 + i14;
                        } else {
                            int i27 = i7;
                            short[] sArr4 = this.f17575j;
                            if (f3 < 0.5f) {
                                i8 = (int) ((((float) i27) * f3) / (f5 - f3));
                            } else {
                                this.f17583r = (int) ((((2.0f * f3) - f5) * ((float) i27)) / (f5 - f3));
                                i8 = i27;
                            }
                            int i28 = i27 + i8;
                            short[] c2 = mo21113c(this.f17577l, this.f17578m, i28);
                            this.f17577l = c2;
                            int i29 = this.f17567b;
                            System.arraycopy(sArr4, i14 * i29, c2, this.f17578m * i29, i29 * i27);
                            m13365e(i8, this.f17567b, this.f17577l, this.f17578m + i27, sArr4, i14 + i27, sArr4, i14);
                            this.f17578m += i28;
                            i14 += i8;
                        }
                    }
                    if (this.f17573h + i14 > i13) {
                        break;
                    }
                    f5 = 1.0f;
                    i12 = 1;
                }
                int i31 = this.f17576k - i14;
                short[] sArr5 = this.f17575j;
                int i32 = this.f17567b;
                System.arraycopy(sArr5, i14 * i32, sArr5, 0, i32 * i31);
                this.f17576k = i31;
            }
            f5 = 1.0f;
        } else {
            mo21111a(this.f17575j, 0, this.f17576k);
            this.f17576k = 0;
        }
        if (f4 != f5 && this.f17578m != i11) {
            int i33 = this.f17566a;
            int i34 = (int) (((float) i33) / f4);
            while (true) {
                if (i34 <= 16384 && i33 <= 16384) {
                    break;
                }
                i34 /= 2;
                i33 /= 2;
            }
            int i35 = this.f17578m - i11;
            short[] c3 = mo21113c(this.f17579n, this.f17580o, i35);
            this.f17579n = c3;
            short[] sArr6 = this.f17577l;
            int i36 = this.f17567b;
            System.arraycopy(sArr6, i11 * i36, c3, this.f17580o * i36, i36 * i35);
            this.f17578m = i11;
            this.f17580o += i35;
            int i37 = 0;
            while (true) {
                i = this.f17580o;
                i2 = i - 1;
                if (i37 >= i2) {
                    break;
                }
                while (true) {
                    i3 = this.f17581p + 1;
                    int i38 = i3 * i34;
                    i4 = this.f17582q;
                    if (i38 <= i4 * i33) {
                        break;
                    }
                    this.f17577l = mo21113c(this.f17577l, this.f17578m, 1);
                    int i39 = 0;
                    while (true) {
                        int i41 = this.f17567b;
                        if (i39 >= i41) {
                            break;
                        }
                        short[] sArr7 = this.f17579n;
                        int i42 = (i37 * i41) + i39;
                        short s = sArr7[i42];
                        short s2 = sArr7[i42 + i41];
                        int i43 = this.f17581p;
                        int i44 = i43 * i34;
                        int i45 = (i43 + 1) * i34;
                        int i46 = i45 - (this.f17582q * i33);
                        int i47 = i45 - i44;
                        this.f17577l[(this.f17578m * i41) + i39] = (short) ((((i47 - i46) * s2) + (s * i46)) / i47);
                        i39++;
                    }
                    this.f17582q++;
                    this.f17578m++;
                }
                this.f17581p = i3;
                if (i3 == i33) {
                    this.f17581p = 0;
                    if (i4 == i34) {
                        z = true;
                    } else {
                        z = false;
                    }
                    C17875h.m44304o(z);
                    this.f17582q = 0;
                }
                i37++;
            }
            if (i2 != 0) {
                short[] sArr8 = this.f17579n;
                int i48 = this.f17567b;
                System.arraycopy(sArr8, i2 * i48, sArr8, 0, (i - i2) * i48);
                this.f17580o -= i2;
            }
        }
    }
}
