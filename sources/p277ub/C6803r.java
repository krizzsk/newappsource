package p277ub;

import java.nio.charset.Charset;
import java.util.Arrays;
import p583jk.C17875h;
import p624ld.C18187b;

/* renamed from: ub.r */
public final class C6803r {

    /* renamed from: a */
    public byte[] f21038a;

    /* renamed from: b */
    public int f21039b;

    /* renamed from: c */
    public int f21040c;

    public C6803r() {
        this.f21038a = C6774a0.f20964f;
    }

    /* renamed from: A */
    public final void mo22981A(int i) {
        mo23007z(this.f21039b + i);
    }

    /* renamed from: a */
    public final void mo22982a(int i) {
        byte[] bArr = this.f21038a;
        if (i > bArr.length) {
            this.f21038a = Arrays.copyOf(bArr, i);
        }
    }

    /* renamed from: b */
    public final void mo22983b(int i, int i2, byte[] bArr) {
        System.arraycopy(this.f21038a, this.f21039b, bArr, i, i2);
        this.f21039b += i2;
    }

    /* renamed from: c */
    public final int mo22984c() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f21039b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: d */
    public final String mo22985d() {
        boolean z;
        int i = this.f21040c;
        int i2 = this.f21039b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f21040c) {
            byte b = this.f21038a[i2];
            int i3 = C6774a0.f20959a;
            if (b == 10 || b == 13) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                break;
            }
            i2++;
        }
        int i4 = this.f21039b;
        if (i2 - i4 >= 3) {
            byte[] bArr = this.f21038a;
            if (bArr[i4] == -17 && bArr[i4 + 1] == -69 && bArr[i4 + 2] == -65) {
                this.f21039b = i4 + 3;
            }
        }
        byte[] bArr2 = this.f21038a;
        int i5 = this.f21039b;
        String k = C6774a0.m15951k(i5, i2 - i5, bArr2);
        this.f21039b = i2;
        int i6 = this.f21040c;
        if (i2 == i6) {
            return k;
        }
        byte[] bArr3 = this.f21038a;
        if (bArr3[i2] == 13) {
            int i7 = i2 + 1;
            this.f21039b = i7;
            if (i7 == i6) {
                return k;
            }
        }
        int i8 = this.f21039b;
        if (bArr3[i8] == 10) {
            this.f21039b = i8 + 1;
        }
        return k;
    }

    /* renamed from: e */
    public final int mo22986e() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f21039b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: f */
    public final short mo22987f() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        this.f21039b = i2 + 1;
        return (short) (((bArr[i2] & 255) << 8) | (bArr[i] & 255));
    }

    /* renamed from: g */
    public final long mo22988g() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f21039b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: h */
    public final int mo22989h() {
        int e = mo22986e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException(C13715c.m34241g(29, "Top bit not zero: ", e));
    }

    /* renamed from: i */
    public final int mo22990i() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        this.f21039b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: j */
    public final long mo22991j() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f21039b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: k */
    public final String mo22992k() {
        int i = this.f21040c;
        int i2 = this.f21039b;
        if (i - i2 == 0) {
            return null;
        }
        while (i2 < this.f21040c && this.f21038a[i2] != 0) {
            i2++;
        }
        byte[] bArr = this.f21038a;
        int i3 = this.f21039b;
        String k = C6774a0.m15951k(i3, i2 - i3, bArr);
        this.f21039b = i2;
        if (i2 >= this.f21040c) {
            return k;
        }
        this.f21039b = i2 + 1;
        return k;
    }

    /* renamed from: l */
    public final String mo22993l(int i) {
        int i2;
        if (i == 0) {
            return "";
        }
        int i3 = this.f21039b;
        int i4 = (i3 + i) - 1;
        if (i4 >= this.f21040c || this.f21038a[i4] != 0) {
            i2 = i;
        } else {
            i2 = i - 1;
        }
        String k = C6774a0.m15951k(i3, i2, this.f21038a);
        this.f21039b += i;
        return k;
    }

    /* renamed from: m */
    public final String mo22994m(int i) {
        return mo22995n(i, C18187b.f46429c);
    }

    /* renamed from: n */
    public final String mo22995n(int i, Charset charset) {
        String str = new String(this.f21038a, this.f21039b, i, charset);
        this.f21039b += i;
        return str;
    }

    /* renamed from: o */
    public final int mo22996o() {
        return (mo22997p() << 21) | (mo22997p() << 14) | (mo22997p() << 7) | mo22997p();
    }

    /* renamed from: p */
    public final int mo22997p() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        this.f21039b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: q */
    public final long mo22998q() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f21039b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: r */
    public final int mo22999r() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f21039b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: s */
    public final int mo23000s() {
        int c = mo22984c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException(C13715c.m34241g(29, "Top bit not zero: ", c));
    }

    /* renamed from: t */
    public final long mo23001t() {
        long j = mo22991j();
        if (j >= 0) {
            return j;
        }
        StringBuilder sb = new StringBuilder(38);
        sb.append("Top bit not zero: ");
        sb.append(j);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: u */
    public final int mo23002u() {
        byte[] bArr = this.f21038a;
        int i = this.f21039b;
        int i2 = i + 1;
        this.f21039b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: v */
    public final long mo23003v() {
        int i;
        int i2;
        long j = (long) this.f21038a[this.f21039b];
        int i3 = 7;
        while (true) {
            i = 1;
            if (i3 < 0) {
                break;
            }
            int i4 = 1 << i3;
            if ((((long) i4) & j) != 0) {
                i3--;
            } else if (i3 < 6) {
                j &= (long) (i4 - 1);
                i2 = 7 - i3;
            } else if (i3 == 7) {
                i2 = 1;
            }
        }
        i2 = 0;
        if (i2 != 0) {
            while (i < i2) {
                byte b = this.f21038a[this.f21039b + i];
                if ((b & 192) == 128) {
                    j = (j << 6) | ((long) (b & 63));
                    i++;
                } else {
                    StringBuilder sb = new StringBuilder(62);
                    sb.append("Invalid UTF-8 sequence continuation byte: ");
                    sb.append(j);
                    throw new NumberFormatException(sb.toString());
                }
            }
            this.f21039b += i2;
            return j;
        }
        StringBuilder sb2 = new StringBuilder(55);
        sb2.append("Invalid UTF-8 sequence first byte: ");
        sb2.append(j);
        throw new NumberFormatException(sb2.toString());
    }

    /* renamed from: w */
    public final void mo23004w(int i) {
        byte[] bArr = this.f21038a;
        if (bArr.length < i) {
            bArr = new byte[i];
        }
        mo23005x(i, bArr);
    }

    /* renamed from: x */
    public final void mo23005x(int i, byte[] bArr) {
        this.f21038a = bArr;
        this.f21040c = i;
        this.f21039b = 0;
    }

    /* renamed from: y */
    public final void mo23006y(int i) {
        boolean z;
        if (i < 0 || i > this.f21038a.length) {
            z = false;
        } else {
            z = true;
        }
        C17875h.m44301k(z);
        this.f21040c = i;
    }

    /* renamed from: z */
    public final void mo23007z(int i) {
        boolean z;
        if (i < 0 || i > this.f21040c) {
            z = false;
        } else {
            z = true;
        }
        C17875h.m44301k(z);
        this.f21039b = i;
    }

    public C6803r(int i) {
        this.f21038a = new byte[i];
        this.f21040c = i;
    }

    public C6803r(byte[] bArr) {
        this.f21038a = bArr;
        this.f21040c = bArr.length;
    }

    public C6803r(byte[] bArr, int i) {
        this.f21038a = bArr;
        this.f21040c = i;
    }
}
