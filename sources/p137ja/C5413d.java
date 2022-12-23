package p137ja;

import zj0.C25539d;

/* renamed from: ja.d */
public final class C5413d implements C25539d {

    /* renamed from: c */
    public static final int[] f17770c = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 4, 4, 6, 6, 0, 0, 7, 7, 4, 4, 0, 0, 4, 4, 0, 0};

    /* renamed from: b */
    public int f17771b;

    public /* synthetic */ C5413d() {
    }

    public /* synthetic */ C5413d(int i) {
        this.f17771b = i;
    }

    /* renamed from: a */
    public int mo21181a(int i, int i2, byte[] bArr) {
        int i3;
        int i4;
        int i5 = (i + i2) - 16;
        int i6 = i;
        while (i6 <= i5) {
            int i7 = f17770c[bArr[i6] & 31];
            int i8 = 5;
            int i9 = 0;
            while (i9 < 3) {
                if (((i7 >>> i9) & 1) == 0) {
                    i4 = i6;
                } else {
                    int i11 = i8 >>> 3;
                    int i12 = i8 & 7;
                    long j = 0;
                    int i13 = 0;
                    while (i13 < 6) {
                        j |= (((long) bArr[(i6 + i11) + i13]) & 255) << (i13 * 8);
                        i13++;
                        i6 = i6;
                    }
                    i4 = i6;
                    long j2 = j >>> i12;
                    if (((j2 >>> 37) & 15) == 5 && ((j2 >>> 9) & 7) == 0) {
                        i3 = i9;
                        long j3 = (long) ((((((((int) (j2 >>> 36)) & 1) << 20) | ((int) ((j2 >>> 13) & 1048575))) << 4) - ((this.f17771b + i4) - i)) >>> 4);
                        long j4 = ((((j2 & -77309403137L) | ((j3 & 1048575) << 13)) | ((j3 & 1048576) << 16)) << i12) | (((long) ((1 << i12) - 1)) & j);
                        for (int i14 = 0; i14 < 6; i14++) {
                            bArr[i4 + i11 + i14] = (byte) ((int) (j4 >>> (i14 * 8)));
                        }
                        i9 = i3 + 1;
                        i8 += 41;
                        i6 = i4;
                    }
                }
                i3 = i9;
                i9 = i3 + 1;
                i8 += 41;
                i6 = i4;
            }
            i6 += 16;
        }
        int i15 = i6 - i;
        this.f17771b += i15;
        return i15;
    }
}
