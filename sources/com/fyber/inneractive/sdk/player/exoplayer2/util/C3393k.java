package com.fyber.inneractive.sdk.player.exoplayer2.util;

import java.nio.charset.Charset;
import p001a0.C0016g;

/* renamed from: com.fyber.inneractive.sdk.player.exoplayer2.util.k */
public final class C3393k {

    /* renamed from: a */
    public byte[] f12121a;

    /* renamed from: b */
    public int f12122b;

    /* renamed from: c */
    public int f12123c;

    public C3393k() {
    }

    /* renamed from: a */
    public void mo14540a(byte[] bArr, int i) {
        this.f12121a = bArr;
        this.f12123c = i;
        this.f12122b = 0;
    }

    /* renamed from: b */
    public int mo14542b() {
        byte[] bArr = this.f12121a;
        if (bArr == null) {
            return 0;
        }
        return bArr.length;
    }

    /* renamed from: c */
    public void mo14545c(int i) {
        mo14540a(mo14542b() < i ? new byte[i] : this.f12121a, i);
    }

    /* renamed from: d */
    public void mo14547d(int i) {
        C3380a.m8505a(i >= 0 && i <= this.f12121a.length);
        this.f12123c = i;
    }

    /* renamed from: e */
    public void mo14549e(int i) {
        C3380a.m8505a(i >= 0 && i <= this.f12123c);
        this.f12122b = i;
    }

    /* renamed from: f */
    public void mo14551f(int i) {
        mo14549e(this.f12122b + i);
    }

    /* renamed from: g */
    public int mo14552g() {
        int e = mo14548e();
        if (e >= 0) {
            return e;
        }
        throw new IllegalStateException(C16759e.m42349e("Top bit not zero: ", e));
    }

    /* renamed from: h */
    public int mo14553h() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        this.f12122b = i2 + 1;
        return ((bArr[i2] & 255) << 8) | (bArr[i] & 255);
    }

    /* renamed from: i */
    public long mo14554i() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        int i5 = i4 + 1;
        int i6 = i5 + 1;
        int i7 = i6 + 1;
        int i8 = i7 + 1;
        this.f12122b = i8 + 1;
        return ((((long) bArr[i]) & 255) << 56) | ((((long) bArr[i2]) & 255) << 48) | ((((long) bArr[i3]) & 255) << 40) | ((((long) bArr[i4]) & 255) << 32) | ((((long) bArr[i5]) & 255) << 24) | ((((long) bArr[i6]) & 255) << 16) | ((((long) bArr[i7]) & 255) << 8) | (((long) bArr[i8]) & 255);
    }

    /* renamed from: j */
    public String mo14555j() {
        if (mo14537a() == 0) {
            return null;
        }
        int i = this.f12122b;
        while (i < this.f12123c && this.f12121a[i] != 0) {
            i++;
        }
        byte[] bArr = this.f12121a;
        int i2 = this.f12122b;
        String str = new String(bArr, i2, i - i2);
        this.f12122b = i;
        if (i < this.f12123c) {
            this.f12122b = i + 1;
        }
        return str;
    }

    /* renamed from: k */
    public int mo14556k() {
        return (mo14557l() << 21) | (mo14557l() << 14) | (mo14557l() << 7) | mo14557l();
    }

    /* renamed from: l */
    public int mo14557l() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        this.f12122b = i + 1;
        return bArr[i] & 255;
    }

    /* renamed from: m */
    public long mo14558m() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f12122b = i4 + 1;
        return ((((long) bArr[i]) & 255) << 24) | ((((long) bArr[i2]) & 255) << 16) | ((((long) bArr[i3]) & 255) << 8) | (((long) bArr[i4]) & 255);
    }

    /* renamed from: n */
    public int mo14559n() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 16) | ((bArr[i2] & 255) << 8);
        this.f12122b = i3 + 1;
        return (bArr[i3] & 255) | b;
    }

    /* renamed from: o */
    public int mo14560o() {
        int c = mo14544c();
        if (c >= 0) {
            return c;
        }
        throw new IllegalStateException(C16759e.m42349e("Top bit not zero: ", c));
    }

    /* renamed from: p */
    public long mo14561p() {
        long i = mo14554i();
        if (i >= 0) {
            return i;
        }
        throw new IllegalStateException(C0016g.m29l("Top bit not zero: ", i));
    }

    /* renamed from: q */
    public int mo14562q() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        this.f12122b = i2 + 1;
        return (bArr[i2] & 255) | ((bArr[i] & 255) << 8);
    }

    /* renamed from: r */
    public void mo14563r() {
        this.f12122b = 0;
        this.f12123c = 0;
    }

    public C3393k(int i) {
        this.f12121a = new byte[i];
        this.f12123c = i;
    }

    /* renamed from: b */
    public String mo14543b(int i) {
        String str = new String(this.f12121a, this.f12122b, i, Charset.defaultCharset());
        this.f12122b += i;
        return str;
    }

    /* renamed from: c */
    public int mo14544c() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = ((bArr[i] & 255) << 24) | ((bArr[i2] & 255) << 16);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 8);
        this.f12122b = i4 + 1;
        return (bArr[i4] & 255) | b2;
    }

    /* renamed from: f */
    public long mo14550f() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        int i4 = i3 + 1;
        this.f12122b = i4 + 1;
        return (((long) bArr[i]) & 255) | ((((long) bArr[i2]) & 255) << 8) | ((((long) bArr[i3]) & 255) << 16) | ((((long) bArr[i4]) & 255) << 24);
    }

    /* renamed from: d */
    public String mo14546d() {
        if (mo14537a() == 0) {
            return null;
        }
        int i = this.f12122b;
        while (i < this.f12123c && !C3406u.m8600b((int) this.f12121a[i])) {
            i++;
        }
        int i2 = this.f12122b;
        if (i - i2 >= 3) {
            byte[] bArr = this.f12121a;
            if (bArr[i2] == -17 && bArr[i2 + 1] == -69 && bArr[i2 + 2] == -65) {
                this.f12122b = i2 + 3;
            }
        }
        byte[] bArr2 = this.f12121a;
        int i3 = this.f12122b;
        String str = new String(bArr2, i3, i - i3);
        this.f12122b = i;
        int i4 = this.f12123c;
        if (i == i4) {
            return str;
        }
        byte[] bArr3 = this.f12121a;
        if (bArr3[i] == 13) {
            int i5 = i + 1;
            this.f12122b = i5;
            if (i5 == i4) {
                return str;
            }
        }
        int i6 = this.f12122b;
        if (bArr3[i6] == 10) {
            this.f12122b = i6 + 1;
        }
        return str;
    }

    /* renamed from: e */
    public int mo14548e() {
        byte[] bArr = this.f12121a;
        int i = this.f12122b;
        int i2 = i + 1;
        int i3 = i2 + 1;
        byte b = (bArr[i] & 255) | ((bArr[i2] & 255) << 8);
        int i4 = i3 + 1;
        byte b2 = b | ((bArr[i3] & 255) << 16);
        this.f12122b = i4 + 1;
        return ((bArr[i4] & 255) << 24) | b2;
    }

    /* renamed from: a */
    public int mo14537a() {
        return this.f12123c - this.f12122b;
    }

    public C3393k(byte[] bArr) {
        this.f12121a = bArr;
        this.f12123c = bArr.length;
    }

    /* renamed from: a */
    public void mo14539a(C3392j jVar, int i) {
        mo14541a(jVar.f12117a, 0, i);
        jVar.mo14534b(0);
    }

    /* renamed from: a */
    public void mo14541a(byte[] bArr, int i, int i2) {
        System.arraycopy(this.f12121a, this.f12122b, bArr, i, i2);
        this.f12122b += i2;
    }

    public C3393k(byte[] bArr, int i) {
        this.f12121a = bArr;
        this.f12123c = i;
    }

    /* renamed from: a */
    public String mo14538a(int i) {
        if (i == 0) {
            return "";
        }
        int i2 = this.f12122b;
        int i3 = (i2 + i) - 1;
        String str = new String(this.f12121a, i2, (i3 >= this.f12123c || this.f12121a[i3] != 0) ? i : i - 1);
        this.f12122b += i;
        return str;
    }
}
