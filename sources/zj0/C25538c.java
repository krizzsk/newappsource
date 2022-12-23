package zj0;

/* renamed from: zj0.c */
public final class C25538c implements C25539d {

    /* renamed from: b */
    public int f63794b;

    public C25538c(int i) {
        this.f63794b = i;
    }

    /* renamed from: a */
    public final int mo21181a(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            byte b = bArr[i4];
            if ((b == 64 && (bArr[i4 + 1] & 192) == 0) || (b == Byte.MAX_VALUE && (bArr[i4 + 1] & 192) == 192)) {
                int i5 = i4 + 1;
                int i6 = i4 + 2;
                int i7 = i4 + 3;
                int i8 = (((((((b & 255) << 24) | ((bArr[i5] & 255) << 16)) | ((bArr[i6] & 255) << 8)) | (bArr[i7] & 255)) << 2) - ((this.f63794b + i4) - i)) >>> 2;
                int i9 = (i8 & 4194303) | (((0 - ((i8 >>> 22) & 1)) << 22) & 1073741823) | 1073741824;
                bArr[i4] = (byte) (i9 >>> 24);
                bArr[i5] = (byte) (i9 >>> 16);
                bArr[i6] = (byte) (i9 >>> 8);
                bArr[i7] = (byte) i9;
            }
            i4 += 4;
        }
        int i11 = i4 - i;
        this.f63794b += i11;
        return i11;
    }
}
