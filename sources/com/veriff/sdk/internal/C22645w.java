package com.veriff.sdk.internal;

import java.lang.reflect.Array;

/* renamed from: com.veriff.sdk.internal.w */
public final class C22645w extends C22610v {

    /* renamed from: a */
    private C22469s f57207a;

    public C22645w(C21902k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    private static int m55199a(int i, int i2) {
        if (i < 2) {
            return 2;
        }
        return i > i2 ? i2 : i;
    }

    /* renamed from: a */
    private static void m55201a(byte[] bArr, int i, int i2, int i3, int i4, int[][] iArr, C22469s sVar) {
        int i5 = i;
        int i6 = i2;
        int i7 = i4 - 8;
        int i8 = i3 - 8;
        for (int i9 = 0; i9 < i6; i9++) {
            int i11 = i9 << 3;
            int i12 = i11 > i7 ? i7 : i11;
            int a = m55199a(i9, i6 - 3);
            for (int i13 = 0; i13 < i5; i13++) {
                int i14 = i13 << 3;
                int i15 = i14 > i8 ? i8 : i14;
                int a2 = m55199a(i13, i5 - 3);
                int i16 = 0;
                for (int i17 = -2; i17 <= 2; i17++) {
                    int[] iArr2 = iArr[a + i17];
                    i16 += iArr2[a2 - 2] + iArr2[a2 - 1] + iArr2[a2] + iArr2[a2 + 1] + iArr2[2 + a2];
                }
                m55200a(bArr, i15, i12, i16 / 25, i3, sVar);
            }
        }
    }

    /* renamed from: b */
    public C22469s mo54943b() throws C21946l {
        C22469s sVar = this.f57207a;
        if (sVar != null) {
            return sVar;
        }
        C21902k a = mo54942a();
        int b = a.mo55671b();
        int c = a.mo55672c();
        if (b < 40 || c < 40) {
            this.f57207a = super.mo54943b();
        } else {
            byte[] a2 = a.mo55669a();
            int i = b >> 3;
            if ((b & 7) != 0) {
                i++;
            }
            int i2 = i;
            int i3 = c >> 3;
            if ((c & 7) != 0) {
                i3++;
            }
            int i4 = i3;
            int[][] a3 = m55202a(a2, i2, i4, b, c);
            C22469s sVar2 = new C22469s(b, c);
            m55201a(a2, i2, i4, b, c, a3, sVar2);
            this.f57207a = sVar2;
        }
        return this.f57207a;
    }

    /* renamed from: a */
    private static void m55200a(byte[] bArr, int i, int i2, int i3, int i4, C22469s sVar) {
        int i5 = (i2 * i4) + i;
        int i6 = 0;
        while (i6 < 8) {
            for (int i7 = 0; i7 < 8; i7++) {
                if ((bArr[i5 + i7] & 255) <= i3) {
                    sVar.mo56579b(i + i7, i2 + i6);
                }
            }
            i6++;
            i5 += i4;
        }
    }

    /* renamed from: a */
    private static int[][] m55202a(byte[] bArr, int i, int i2, int i3, int i4) {
        int i5 = i;
        int i6 = i2;
        int i7 = 8;
        int i8 = i4 - 8;
        int i9 = i3 - 8;
        int[] iArr = new int[2];
        iArr[1] = i5;
        iArr[0] = i6;
        int[][] iArr2 = (int[][]) Array.newInstance(Integer.TYPE, iArr);
        int i11 = 0;
        while (i11 < i6) {
            int i12 = i11 << 3;
            if (i12 > i8) {
                i12 = i8;
            }
            int i13 = 0;
            while (i13 < i5) {
                int i14 = i13 << 3;
                if (i14 > i9) {
                    i14 = i9;
                }
                int i15 = (i12 * i3) + i14;
                byte b = 255;
                int i16 = 0;
                int i17 = 0;
                byte b2 = 0;
                while (i16 < i7) {
                    byte b3 = b2;
                    int i18 = 0;
                    while (i18 < i7) {
                        byte b4 = bArr[i15 + i18] & 255;
                        i17 += b4;
                        if (b4 < b) {
                            b = b4;
                        }
                        if (b4 > b3) {
                            b3 = b4;
                        }
                        i18++;
                        i7 = 8;
                    }
                    if (b3 - b <= 24) {
                        i16++;
                        i15 += i3;
                        b2 = b3;
                        i7 = 8;
                    }
                    while (true) {
                        i16++;
                        i15 += i3;
                        if (i16 >= 8) {
                            break;
                        }
                        int i19 = 0;
                        for (int i21 = 8; i19 < i21; i21 = 8) {
                            i17 += bArr[i15 + i19] & 255;
                            i19++;
                        }
                    }
                    i16++;
                    i15 += i3;
                    b2 = b3;
                    i7 = 8;
                }
                int i22 = i17 >> 6;
                if (b2 - b <= 24) {
                    i22 = b / 2;
                    if (i11 > 0 && i13 > 0) {
                        int[] iArr3 = iArr2[i11 - 1];
                        int i23 = i13 - 1;
                        int i24 = (((iArr2[i11][i23] * 2) + iArr3[i13]) + iArr3[i23]) / 4;
                        if (b < i24) {
                            i22 = i24;
                        }
                        iArr2[i11][i13] = i22;
                        i13++;
                        i7 = 8;
                    }
                }
                iArr2[i11][i13] = i22;
                i13++;
                i7 = 8;
            }
            i11++;
            i7 = 8;
        }
        return iArr2;
    }
}
