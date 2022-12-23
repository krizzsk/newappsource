package com.fyber.inneractive.sdk.player.exoplayer2.util;

import androidx.recyclerview.widget.RecyclerView;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.l */
public final class C3394l {

    /* renamed from: a */
    public byte[] f12124a;

    /* renamed from: b */
    public int f12125b;

    /* renamed from: c */
    public int f12126c;

    /* renamed from: d */
    public int f12127d;

    public C3394l(byte[] bArr, int i, int i2) {
        mo14565a(bArr, i, i2);
    }

    /* renamed from: a */
    public void mo14565a(byte[] bArr, int i, int i2) {
        this.f12124a = bArr;
        this.f12126c = i;
        this.f12125b = i2;
        this.f12127d = 0;
        mo14564a();
    }

    /* renamed from: b */
    public int mo14567b(int i) {
        int i2;
        int i3;
        this.f12127d += i;
        int i4 = 0;
        while (true) {
            i2 = this.f12127d;
            i3 = 2;
            if (i2 <= 8) {
                break;
            }
            int i5 = i2 - 8;
            this.f12127d = i5;
            byte[] bArr = this.f12124a;
            int i6 = this.f12126c;
            i4 |= (bArr[i6] & 255) << i5;
            if (!mo14570c(i6 + 1)) {
                i3 = 1;
            }
            this.f12126c = i6 + i3;
        }
        byte[] bArr2 = this.f12124a;
        int i7 = this.f12126c;
        int i8 = (-1 >>> (32 - i)) & (i4 | ((bArr2[i7] & 255) >> (8 - i2)));
        if (i2 == 8) {
            this.f12127d = 0;
            if (!mo14570c(i7 + 1)) {
                i3 = 1;
            }
            this.f12126c = i7 + i3;
        }
        mo14564a();
        return i8;
    }

    /* renamed from: c */
    public boolean mo14569c() {
        boolean z = (this.f12124a[this.f12126c] & (RecyclerView.C1119a0.FLAG_IGNORE >> this.f12127d)) != 0;
        mo14574f();
        return z;
    }

    /* renamed from: d */
    public void mo14572d(int i) {
        int i2 = this.f12126c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        this.f12126c = i4;
        int i5 = (i - (i3 * 8)) + this.f12127d;
        this.f12127d = i5;
        if (i5 > 7) {
            this.f12126c = i4 + 1;
            this.f12127d = i5 - 8;
        }
        while (true) {
            i2++;
            if (i2 > this.f12126c) {
                mo14564a();
                return;
            } else if (mo14570c(i2)) {
                this.f12126c++;
                i2 += 2;
            }
        }
    }

    /* renamed from: e */
    public int mo14573e() {
        int i;
        int d = mo14571d();
        if (d % 2 == 0) {
            i = -1;
        } else {
            i = 1;
        }
        return ((d + 1) / 2) * i;
    }

    /* renamed from: f */
    public void mo14574f() {
        int i = 1;
        int i2 = this.f12127d + 1;
        this.f12127d = i2;
        if (i2 == 8) {
            this.f12127d = 0;
            int i3 = this.f12126c;
            if (mo14570c(i3 + 1)) {
                i = 2;
            }
            this.f12126c = i3 + i;
        }
        mo14564a();
    }

    /* renamed from: c */
    public final boolean mo14570c(int i) {
        if (2 <= i && i < this.f12125b) {
            byte[] bArr = this.f12124a;
            return bArr[i] == 3 && bArr[i + -2] == 0 && bArr[i - 1] == 0;
        }
    }

    /* renamed from: a */
    public boolean mo14566a(int i) {
        int i2 = this.f12126c;
        int i3 = i / 8;
        int i4 = i2 + i3;
        int i5 = (this.f12127d + i) - (i3 * 8);
        if (i5 > 7) {
            i4++;
            i5 -= 8;
        }
        while (true) {
            i2++;
            if (i2 > i4 || i4 >= this.f12125b) {
                int i6 = this.f12125b;
            } else if (mo14570c(i2)) {
                i4++;
                i2 += 2;
            }
        }
        int i62 = this.f12125b;
        if (i4 < i62) {
            return true;
        }
        if (i4 == i62 && i5 == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public boolean mo14568b() {
        int i = this.f12126c;
        int i2 = this.f12127d;
        int i3 = 0;
        while (this.f12126c < this.f12125b && !mo14569c()) {
            i3++;
        }
        boolean z = this.f12126c == this.f12125b;
        this.f12126c = i;
        this.f12127d = i2;
        if (z || !mo14566a((i3 * 2) + 1)) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    public final int mo14571d() {
        int i = 0;
        int i2 = 0;
        while (!mo14569c()) {
            i2++;
        }
        int i3 = (1 << i2) - 1;
        if (i2 > 0) {
            i = mo14567b(i2);
        }
        return i3 + i;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:2:0x0004, code lost:
        r1 = r2.f12125b;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo14564a() {
        /*
            r2 = this;
            int r0 = r2.f12126c
            if (r0 < 0) goto L_0x0010
            int r1 = r2.f12125b
            if (r0 < r1) goto L_0x000e
            if (r0 != r1) goto L_0x0010
            int r0 = r2.f12127d
            if (r0 != 0) goto L_0x0010
        L_0x000e:
            r0 = 1
            goto L_0x0011
        L_0x0010:
            r0 = 0
        L_0x0011:
            com.fyber.inneractive.sdk.player.exoplayer2.util.C3380a.m8507b(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fyber.inneractive.sdk.player.exoplayer2.util.C3394l.mo14564a():void");
    }
}
