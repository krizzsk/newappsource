package zj0;

/* renamed from: zj0.b */
public final class C25537b implements C25539d {

    /* renamed from: b */
    public int f63793b;

    public C25537b(int i) {
        this.f63793b = i + 4;
    }

    /* renamed from: a */
    public final int mo21181a(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            int i5 = i4 + 1;
            byte b = bArr[i5];
            if ((b & 248) == 240) {
                int i6 = i4 + 3;
                byte b2 = bArr[i6];
                if ((b2 & 248) == 248) {
                    byte b3 = ((b & 7) << 19) | ((bArr[i4] & 255) << 11) | ((b2 & 7) << 8);
                    int i7 = i4 + 2;
                    int i8 = (((b3 | (bArr[i7] & 255)) << 1) - ((this.f63793b + i4) - i)) >>> 1;
                    bArr[i5] = (byte) (240 | ((i8 >>> 19) & 7));
                    bArr[i4] = (byte) (i8 >>> 11);
                    bArr[i6] = (byte) (((i8 >>> 8) & 7) | 248);
                    bArr[i7] = (byte) i8;
                    i4 = i7;
                }
            }
            i4 += 2;
        }
        int i9 = i4 - i;
        this.f63793b += i9;
        return i9;
    }
}
