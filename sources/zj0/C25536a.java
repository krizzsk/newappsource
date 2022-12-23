package zj0;

/* renamed from: zj0.a */
public final class C25536a implements C25539d {

    /* renamed from: b */
    public int f63792b;

    public C25536a(int i) {
        this.f63792b = i + 8;
    }

    /* renamed from: a */
    public final int mo21181a(int i, int i2, byte[] bArr) {
        int i3 = (i2 + i) - 4;
        int i4 = i;
        while (i4 <= i3) {
            if ((bArr[i4 + 3] & 255) == 235) {
                int i5 = i4 + 2;
                int i6 = i4 + 1;
                int i7 = ((((((bArr[i5] & 255) << 16) | ((bArr[i6] & 255) << 8)) | (bArr[i4] & 255)) << 2) - ((this.f63792b + i4) - i)) >>> 2;
                bArr[i5] = (byte) (i7 >>> 16);
                bArr[i6] = (byte) (i7 >>> 8);
                bArr[i4] = (byte) i7;
            }
            i4 += 4;
        }
        int i8 = i4 - i;
        this.f63792b += i8;
        return i8;
    }
}
