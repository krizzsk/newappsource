package p277ub;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: ub.s */
public final class C6804s {

    /* renamed from: a */
    public byte[] f21041a;

    /* renamed from: b */
    public int f21042b;

    /* renamed from: c */
    public int f21043c;

    /* renamed from: d */
    public int f21044d = 0;

    public C6804s(byte[] bArr, int i, int i2) {
        this.f21041a = bArr;
        this.f21043c = i;
        this.f21042b = i2;
        mo23008a();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f21042b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo23008a() {
        /*
            r2 = this;
            int r0 = r2.f21043c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f21042b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f21044d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            p583jk.C17875h.m44304o(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: p277ub.C6804s.mo23008a():void");
    }

    /* renamed from: b */
    public final boolean mo23009b(int i) {
        int i2 = this.f21043c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f21044d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f21042b) {
                int i6 = this.f21042b;
            } else if (mo23015h(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f21042b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo23010c() {
        boolean z;
        int i = this.f21043c;
        int i2 = this.f21044d;
        int i3 = 0;
        while (this.f21043c < this.f21042b && !mo23011d()) {
            i3++;
        }
        if (this.f21043c == this.f21042b) {
            z = true;
        } else {
            z = false;
        }
        this.f21043c = i;
        this.f21044d = i2;
        if (z || !mo23009b((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final boolean mo23011d() {
        boolean z;
        if ((this.f21041a[this.f21043c] & (RecyclerView.C1119a0.FLAG_IGNORE >> this.f21044d)) != 0) {
            z = true;
        } else {
            z = false;
        }
        mo23016i();
        return z;
    }

    /* renamed from: e */
    public final int mo23012e(int i) {
        int i2;
        int i3;
        this.f21044d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f21044d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f21044d = i5;
            byte[] bArr = this.f21041a;
            int i6 = this.f21043c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo23015h(i6 + 1)) {
                i3 = 1;
            }
            this.f21043c = i6 + i3;
        }
        byte[] bArr2 = this.f21041a;
        int i7 = this.f21043c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f21044d = 0;
            if (!mo23015h(i7 + 1)) {
                i3 = 1;
            }
            this.f21043c = i7 + i3;
        }
        mo23008a();
        return i8;
    }

    /* renamed from: f */
    public final int mo23013f() {
        int i = 0;
        int i2 = 0;
        while (!mo23011d()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo23012e(i2);
        }
        return i3 + i;
    }

    /* renamed from: g */
    public final int mo23014g() {
        int i;
        int f = mo23013f();
        if (f % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((f + 1) / 2) * i;
    }

    /* renamed from: h */
    public final boolean mo23015h(int i) {
        if (2 <= i && i < this.f21042b) {
            byte[] bArr = this.f21041a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: i */
    public final void mo23016i() {
        int i = 1;
        int i2 = this.f21044d + 1;
        this.f21044d = i2;
        if (i2 == 8) {
            this.f21044d = 0;
            int i3 = this.f21043c;
            if (mo23015h(i3 + 1)) {
                i = 2;
            }
            this.f21043c = i3 + i;
        }
        mo23008a();
    }

    /* renamed from: j */
    public final void mo23017j(int i) {
        int i2 = this.f21043c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f21043c = i4;
        int i5 = (i - (i3 * 8)) + this.f21044d;
        this.f21044d = i5;
        if (i5 > 7) {
            this.f21043c = i4 + 1;
            this.f21044d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f21043c) {
                mo23008a();
                return;
            } else if (mo23015h(i2)) {
                this.f21043c++;
                i2 += 2;
            }
        }
    }
}
