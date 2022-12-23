package com.veriff.sdk.internal;

/* renamed from: com.veriff.sdk.internal.k */
public abstract class C21902k {

    /* renamed from: a */
    private final int f55370a;

    /* renamed from: b */
    private final int f55371b;

    public C21902k(int i, int i2) {
        this.f55370a = i;
        this.f55371b = i2;
    }

    /* renamed from: a */
    public abstract byte[] mo55669a();

    /* renamed from: a */
    public abstract byte[] mo55670a(int i, byte[] bArr);

    /* renamed from: b */
    public final int mo55671b() {
        return this.f55370a;
    }

    /* renamed from: c */
    public final int mo55672c() {
        return this.f55371b;
    }

    public final String toString() {
        char c;
        int i = this.f55370a;
        byte[] bArr = new byte[i];
        StringBuilder sb = new StringBuilder((i + 1) * this.f55371b);
        for (int i2 = 0; i2 < this.f55371b; i2++) {
            bArr = mo55670a(i2, bArr);
            for (int i3 = 0; i3 < this.f55370a; i3++) {
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
