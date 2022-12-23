package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.m */
public final class C21987m extends C21902k {

    /* renamed from: a */
    private final byte[] f55498a;

    /* renamed from: b */
    private final int f55499b;

    /* renamed from: c */
    private final int f55500c;

    /* renamed from: d */
    private final int f55501d;

    /* renamed from: e */
    private final int f55502e;

    public C21987m(byte[] bArr, int i, int i2, int i3, int i4, int i5, int i6, boolean z) {
        super(i5, i6);
        if (i3 + i5 > i || i4 + i6 > i2) {
            throw new IllegalArgumentException("Crop rectangle does not fit within image data.");
        }
        this.f55498a = bArr;
        this.f55499b = i;
        this.f55500c = i2;
        this.f55501d = i3;
        this.f55502e = i4;
        if (z) {
            m53626a(i5, i6);
        }
    }

    /* renamed from: a */
    public byte[] mo55670a(int i, byte[] bArr) {
        if (i < 0 || i >= mo55672c()) {
            throw new IllegalArgumentException("Requested row is outside the image: ".concat(String.valueOf(i)));
        }
        int b = mo55671b();
        if (bArr == null || bArr.length < b) {
            bArr = new byte[b];
        }
        System.arraycopy(this.f55498a, ((i + this.f55502e) * this.f55499b) + this.f55501d, bArr, 0, b);
        return bArr;
    }

    /* renamed from: a */
    public byte[] mo55669a() {
        int b = mo55671b();
        int c = mo55672c();
        int i = this.f55499b;
        if (b == i && c == this.f55500c) {
            return this.f55498a;
        }
        int i2 = b * c;
        byte[] bArr = new byte[i2];
        int i3 = (this.f55502e * i) + this.f55501d;
        if (b == i) {
            System.arraycopy(this.f55498a, i3, bArr, 0, i2);
            return bArr;
        }
        for (int i4 = 0; i4 < c; i4++) {
            System.arraycopy(this.f55498a, i3, bArr, i4 * b, b);
            i3 += this.f55499b;
        }
        return bArr;
    }

    /* renamed from: a */
    private void m53626a(int i, int i2) {
        byte[] bArr = this.f55498a;
        int i3 = (this.f55502e * this.f55499b) + this.f55501d;
        int i4 = 0;
        while (i4 < i2) {
            int i5 = (i / 2) + i3;
            int i6 = (i3 + i) - 1;
            int i7 = i3;
            while (i7 < i5) {
                byte b = bArr[i7];
                bArr[i7] = bArr[i6];
                bArr[i6] = b;
                i7++;
                i6--;
            }
            i4++;
            i3 += this.f55499b;
        }
    }
}
