package com.veriff.sdk.internal;

import java.util.Arrays;

final class aby extends abl {

    /* renamed from: f */
    public final transient byte[][] f53605f;

    /* renamed from: g */
    public final transient int[] f53606g;

    public aby(abi abi, int i) {
        super((byte[]) null);
        acc.m50627a(abi.f53556b, 0, (long) i);
        abw abw = abi.f53555a;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        while (i3 < i) {
            int i5 = abw.f53598c;
            int i6 = abw.f53597b;
            if (i5 != i6) {
                i3 += i5 - i6;
                i4++;
                abw = abw.f53601f;
            } else {
                throw new AssertionError("s.limit == s.pos");
            }
        }
        this.f53605f = new byte[i4][];
        this.f53606g = new int[(i4 * 2)];
        abw abw2 = abi.f53555a;
        int i7 = 0;
        while (i2 < i) {
            byte[][] bArr = this.f53605f;
            bArr[i7] = abw2.f53596a;
            int i8 = abw2.f53598c;
            int i9 = abw2.f53597b;
            int i11 = (i8 - i9) + i2;
            if (i11 > i) {
                i2 = i;
            } else {
                i2 = i11;
            }
            int[] iArr = this.f53606g;
            iArr[i7] = i2;
            iArr[bArr.length + i7] = i9;
            abw2.f53599d = true;
            i7++;
            abw2 = abw2.f53601f;
        }
    }

    /* renamed from: k */
    private abl m50592k() {
        return new abl(mo53948i());
    }

    private Object writeReplace() {
        return m50592k();
    }

    /* renamed from: a */
    public String mo53932a() {
        return m50592k().mo53932a();
    }

    /* renamed from: b */
    public String mo53938b() {
        return m50592k().mo53938b();
    }

    /* renamed from: c */
    public abl mo53939c() {
        return m50592k().mo53939c();
    }

    /* renamed from: d */
    public abl mo53941d() {
        return m50592k().mo53941d();
    }

    /* renamed from: e */
    public abl mo53942e() {
        return m50592k().mo53942e();
    }

    public boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof abl) {
            abl abl = (abl) obj;
            if (abl.mo53946h() != mo53946h() || !mo53934a(0, abl, 0, mo53946h())) {
                return false;
            }
            return true;
        }
        return false;
    }

    /* renamed from: f */
    public String mo53944f() {
        return m50592k().mo53944f();
    }

    /* renamed from: g */
    public abl mo53945g() {
        return m50592k().mo53945g();
    }

    /* renamed from: h */
    public int mo53946h() {
        return this.f53606g[this.f53605f.length - 1];
    }

    public int hashCode() {
        int i = this.f53561d;
        if (i != 0) {
            return i;
        }
        int length = this.f53605f.length;
        int i2 = 0;
        int i3 = 0;
        int i4 = 1;
        while (i2 < length) {
            byte[] bArr = this.f53605f[i2];
            int[] iArr = this.f53606g;
            int i5 = iArr[length + i2];
            int i6 = iArr[i2];
            int i7 = (i6 - i3) + i5;
            while (i5 < i7) {
                i4 = (i4 * 31) + bArr[i5];
                i5++;
            }
            i2++;
            i3 = i6;
        }
        this.f53561d = i4;
        return i4;
    }

    /* renamed from: i */
    public byte[] mo53948i() {
        int[] iArr = this.f53606g;
        byte[][] bArr = this.f53605f;
        byte[] bArr2 = new byte[iArr[bArr.length - 1]];
        int length = bArr.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr2 = this.f53606g;
            int i3 = iArr2[length + i];
            int i4 = iArr2[i];
            System.arraycopy(this.f53605f[i], i3, bArr2, i2, i4 - i2);
            i++;
            i2 = i4;
        }
        return bArr2;
    }

    /* renamed from: j */
    public byte[] mo53949j() {
        return mo53948i();
    }

    public String toString() {
        return m50592k().toString();
    }

    /* renamed from: b */
    private int m50591b(int i) {
        int binarySearch = Arrays.binarySearch(this.f53606g, 0, this.f53605f.length, i + 1);
        return binarySearch >= 0 ? binarySearch : ~binarySearch;
    }

    /* renamed from: a */
    public abl mo53931a(int i, int i2) {
        return m50592k().mo53931a(i, i2);
    }

    /* renamed from: a */
    public byte mo53930a(int i) {
        int i2;
        acc.m50627a((long) this.f53606g[this.f53605f.length - 1], (long) i, 1);
        int b = m50591b(i);
        if (b == 0) {
            i2 = 0;
        } else {
            i2 = this.f53606g[b - 1];
        }
        int[] iArr = this.f53606g;
        byte[][] bArr = this.f53605f;
        return bArr[b][(i - i2) + iArr[bArr.length + b]];
    }

    /* renamed from: a */
    public void mo53933a(abi abi) {
        int length = this.f53605f.length;
        int i = 0;
        int i2 = 0;
        while (i < length) {
            int[] iArr = this.f53606g;
            int i3 = iArr[length + i];
            int i4 = iArr[i];
            abw abw = new abw(this.f53605f[i], i3, (i3 + i4) - i2, true, false);
            abw abw2 = abi.f53555a;
            if (abw2 == null) {
                abw.f53602g = abw;
                abw.f53601f = abw;
                abi.f53555a = abw;
            } else {
                abw2.f53602g.mo53986a(abw);
            }
            i++;
            i2 = i4;
        }
        abi.f53556b += (long) i2;
    }

    /* renamed from: a */
    public boolean mo53934a(int i, abl abl, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo53946h() - i3) {
            return false;
        }
        int b = m50591b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f53606g[b - 1];
            }
            int min = Math.min(i3, ((this.f53606g[b] - i4) + i4) - i);
            int[] iArr = this.f53606g;
            byte[][] bArr = this.f53605f;
            if (!abl.mo53935a(i2, bArr[b], (i - i4) + iArr[bArr.length + b], min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }

    /* renamed from: a */
    public boolean mo53935a(int i, byte[] bArr, int i2, int i3) {
        int i4;
        if (i < 0 || i > mo53946h() - i3 || i2 < 0 || i2 > bArr.length - i3) {
            return false;
        }
        int b = m50591b(i);
        while (i3 > 0) {
            if (b == 0) {
                i4 = 0;
            } else {
                i4 = this.f53606g[b - 1];
            }
            int min = Math.min(i3, ((this.f53606g[b] - i4) + i4) - i);
            int[] iArr = this.f53606g;
            byte[][] bArr2 = this.f53605f;
            if (!acc.m50629a(bArr2[b], (i - i4) + iArr[bArr2.length + b], bArr, i2, min)) {
                return false;
            }
            i += min;
            i2 += min;
            i3 -= min;
            b++;
        }
        return true;
    }
}
