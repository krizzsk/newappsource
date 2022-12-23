package p935yg;

/* renamed from: yg.e */
public final class C20723e {

    /* renamed from: a */
    public final int f52318a;

    /* renamed from: b */
    public final int f52319b;

    /* renamed from: c */
    public final byte[] f52320c;

    /* renamed from: d */
    public final int f52321d;

    /* renamed from: e */
    public final int f52322e;

    public C20723e(byte[] bArr, int i, int i2, int i3, int i4) {
        this.f52318a = i3;
        this.f52319b = i4;
        if (i3 + 0 > i || 0 + i4 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f52320c = bArr;
        this.f52321d = i;
        this.f52322e = i2;
    }

    /* renamed from: a */
    public final byte[] mo52869a() {
        int i = this.f52318a;
        int i2 = this.f52319b;
        int i3 = this.f52321d;
        if (i == i3 && i2 == this.f52322e) {
            return this.f52320c;
        }
        int i4 = i * i2;
        byte[] bArr = new byte[i4];
        int i5 = (0 * i3) + 0;
        if (i == i3) {
            System.arraycopy(this.f52320c, i5, bArr, 0, i4);
            return bArr;
        }
        for (int i6 = 0; i6 < i2; i6++) {
            System.arraycopy(this.f52320c, i5, bArr, i6 * i, i);
            i5 += this.f52321d;
        }
        return bArr;
    }

    /* renamed from: b */
    public final byte[] mo52870b(int i, byte[] bArr) {
        if (i < 0 || i >= this.f52319b) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int i2 = this.f52318a;
        if (bArr == null || bArr.length < i2) {
            bArr = new byte[i2];
        }
        System.arraycopy(this.f52320c, ((i + 0) * this.f52321d) + 0, bArr, 0, i2);
        return bArr;
    }

    /* renamed from: c */
    public final String toString() {
        char c;
        int i = this.f52318a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder((i + 1) * this.f52319b);
        for (int i2 = 0; i2 < this.f52319b; i2++) {
            bArr = mo52870b(i2, bArr);
            for (int i3 = 0; i3 < this.f52318a; i3++) {
                byte b = bArr[i3] & 255;
                if (b < 64) {
                    c = '#';
                } else if (b < 128) {
                    c = '+';
                } else if (b < 192) {
                    c = '.';
                } else {
                    c = ' ';
                }
                sb.append(c);
            }
            sb.append(10);
        }
        return sb.toString();
    }
}
