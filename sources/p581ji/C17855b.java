package p581ji;

/* renamed from: ji.b */
public final class C17855b {

    /* renamed from: a */
    public final int[] f45851a;

    /* renamed from: b */
    public final long f45852b;

    /* renamed from: c */
    public final int[] f45853c;

    public C17855b(int[] iArr, long j, int[] iArr2) {
        int length = iArr.length;
        int[] iArr3 = new int[length];
        System.arraycopy(iArr, 0, iArr3, 0, length);
        this.f45851a = iArr3;
        this.f45852b = j;
        int length2 = iArr2.length;
        int[] iArr4 = new int[length2];
        System.arraycopy(iArr2, 0, iArr4, 0, length2);
        this.f45853c = iArr4;
    }

    /* renamed from: a */
    public static int m44247a(int i, int[] iArr) {
        int length = ((iArr.length - i) - 1) << 5;
        int i2 = iArr[i];
        while (i2 != 0) {
            i2 >>>= 1;
            length++;
        }
        return length;
    }

    /* renamed from: b */
    public static int m44248b(int i, int i2, int[] iArr, int[] iArr2) {
        while (i != iArr.length && iArr[i] == 0) {
            i++;
        }
        if ((iArr.length - i) - (iArr2.length - i2) != 0) {
            return (iArr.length - i) - (iArr2.length - i2);
        }
        while (i < iArr.length) {
            int i3 = i + 1;
            int i4 = i2 + 1;
            long j = (((long) iArr[i]) & 4294967295L) - (4294967295L & ((long) iArr2[i2]));
            if (j != 0) {
                return (int) (j >> 5);
            }
            i2 = i4;
            i = i3;
        }
        return 0;
    }

    /* renamed from: c */
    public static void m44249c(int[] iArr, int[] iArr2, int[] iArr3, int[] iArr4, long j) {
        int[] iArr5 = iArr;
        int[] iArr6 = iArr2;
        int[] iArr7 = iArr4;
        char c = ' ';
        for (int i = 32; i >= 0; i--) {
            iArr5[i] = 0;
        }
        char c2 = 31;
        int i2 = 31;
        while (i2 >= 0) {
            long j2 = ((((((long) iArr5[c]) & 4294967295L) + (((((long) iArr6[i2]) & 4294967295L) * (((long) iArr3[c2]) & 4294967295L)) & 4294967295L)) & 4294967295L) * j) & 4294967295L;
            long j3 = 0;
            int i3 = 32;
            while (i3 > 0) {
                int i4 = i3 - 1;
                int i5 = i2;
                long j4 = (((long) iArr6[i2]) & 4294967295L) * (((long) iArr3[i4]) & 4294967295L);
                long j5 = (((long) iArr7[i4]) & 4294967295L) * j2;
                long j6 = j2;
                long j7 = (((long) iArr5[i3]) & 4294967295L) + (j4 & 4294967295L) + (j5 & 4294967295L) + (j3 & 4294967295L);
                j3 = (j3 >>> 32) + (j4 >>> 32) + (j5 >>> 32) + (j7 >>> 32);
                if (i3 != 32) {
                    iArr5[i3 + 1] = (int) j7;
                }
                i3 = i4;
                i2 = i5;
                j2 = j6;
            }
            long j8 = j3 + (((long) iArr5[0]) & 4294967295L);
            iArr5[1] = (int) j8;
            iArr5[0] = (int) (j8 >>> 32);
            i2--;
            c = ' ';
            c2 = 31;
        }
        if (m44248b(0, 0, iArr5, iArr7) >= 0) {
            m44251e(0, 0, iArr5, iArr7);
        }
        System.arraycopy(iArr5, 1, iArr6, 0, 32);
    }

    /* renamed from: d */
    public static int[] m44250d(int i, int[] iArr) {
        int[] iArr2;
        int i2 = i & 31;
        int i3 = 32 - i2;
        int i4 = (i >>> 5) + 32;
        if (i2 == 0 || (iArr[0] >>> i3) == 0) {
            iArr2 = new int[i4];
            if (i2 == 0) {
                System.arraycopy(iArr, 0, iArr2, 0, 32);
                return iArr2;
            }
        } else {
            iArr2 = new int[(i4 + 1)];
            iArr2[32] = iArr[31] << i2;
        }
        for (int i5 = 31; i5 >= 0; i5--) {
            iArr2[i5] = iArr2[i5] | (iArr[i5] >>> i3);
            int i6 = i5 + 1;
            iArr2[i6] = iArr2[i6] | (iArr[i5] << i2);
        }
        return iArr2;
    }

    /* renamed from: e */
    public static void m44251e(int i, int i2, int[] iArr, int[] iArr2) {
        int i3;
        int length = iArr.length - 1;
        int length2 = iArr2.length - 1;
        int i4 = 0;
        while (true) {
            int i5 = length2 - 1;
            long j = ((((long) iArr[length]) & 4294967295L) - (((long) iArr2[length2]) & 4294967295L)) + ((long) i4);
            i3 = length - 1;
            iArr[length] = (int) j;
            if (j < 0) {
                i4 = -1;
            } else {
                i4 = 0;
            }
            if (i5 < i2) {
                break;
            }
            length = i3;
            length2 = i5;
        }
        if (i3 >= i) {
            iArr[i3] = (int) ((((long) iArr[i3]) & 4294967295L) + ((long) i4));
        }
    }
}
