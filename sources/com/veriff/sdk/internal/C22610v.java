package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.v */
public class C22610v extends C21660g {

    /* renamed from: a */
    private static final byte[] f57029a = new byte[0];

    /* renamed from: b */
    private byte[] f57030b = f57029a;

    /* renamed from: c */
    private final int[] f57031c = new int[32];

    public C22610v(C21902k kVar) {
        super(kVar);
    }

    /* renamed from: a */
    private void m55122a(int i) {
        if (this.f57030b.length < i) {
            this.f57030b = new byte[i];
        }
        for (int i2 = 0; i2 < 32; i2++) {
            this.f57031c[i2] = 0;
        }
    }

    /* renamed from: b */
    public C22469s mo54943b() throws C21946l {
        C21902k a = mo54942a();
        int b = a.mo55671b();
        int c = a.mo55672c();
        C22469s sVar = new C22469s(b, c);
        m55122a(b);
        int[] iArr = this.f57031c;
        for (int i = 1; i < 5; i++) {
            byte[] a2 = a.mo55670a((c * i) / 5, this.f57030b);
            int i2 = (b << 2) / 5;
            for (int i3 = b / 5; i3 < i2; i3++) {
                int i4 = (a2[i3] & 255) >> 3;
                iArr[i4] = iArr[i4] + 1;
            }
        }
        int a3 = m55121a(iArr);
        byte[] a4 = a.mo55669a();
        for (int i5 = 0; i5 < c; i5++) {
            int i6 = i5 * b;
            for (int i7 = 0; i7 < b; i7++) {
                if ((a4[i6 + i7] & 255) < a3) {
                    sVar.mo56579b(i7, i5);
                }
            }
        }
        return sVar;
    }

    /* renamed from: a */
    private static int m55121a(int[] iArr) throws C21946l {
        int length = iArr.length;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        for (int i4 = 0; i4 < length; i4++) {
            int i5 = iArr[i4];
            if (i5 > i) {
                i3 = i4;
                i = i5;
            }
            if (i5 > i2) {
                i2 = i5;
            }
        }
        int i6 = 0;
        int i7 = 0;
        for (int i8 = 0; i8 < length; i8++) {
            int i9 = i8 - i3;
            int i11 = iArr[i8] * i9 * i9;
            if (i11 > i7) {
                i6 = i8;
                i7 = i11;
            }
        }
        if (i3 <= i6) {
            int i12 = i3;
            i3 = i6;
            i6 = i12;
        }
        if (i3 - i6 > length / 16) {
            int i13 = i3 - 1;
            int i14 = i13;
            int i15 = -1;
            while (i13 > i6) {
                int i16 = i13 - i6;
                int i17 = (i2 - iArr[i13]) * (i3 - i13) * i16 * i16;
                if (i17 > i15) {
                    i14 = i13;
                    i15 = i17;
                }
                i13--;
            }
            return i14 << 3;
        }
        throw C21946l.m53563a();
    }
}
