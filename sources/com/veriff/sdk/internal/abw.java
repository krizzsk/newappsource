package com.veriff.sdk.internal;

final class abw {

    /* renamed from: a */
    public final byte[] f53596a;

    /* renamed from: b */
    public int f53597b;

    /* renamed from: c */
    public int f53598c;

    /* renamed from: d */
    public boolean f53599d;

    /* renamed from: e */
    public boolean f53600e;

    /* renamed from: f */
    public abw f53601f;

    /* renamed from: g */
    public abw f53602g;

    public abw() {
        this.f53596a = new byte[8192];
        this.f53600e = true;
        this.f53599d = false;
    }

    /* renamed from: a */
    public final abw mo53984a() {
        this.f53599d = true;
        return new abw(this.f53596a, this.f53597b, this.f53598c, true, false);
    }

    /* renamed from: b */
    public final abw mo53988b() {
        abw abw;
        abw abw2 = this.f53601f;
        if (abw2 != this) {
            abw = abw2;
        } else {
            abw = null;
        }
        abw abw3 = this.f53602g;
        abw3.f53601f = abw2;
        this.f53601f.f53602g = abw3;
        this.f53601f = null;
        this.f53602g = null;
        return abw;
    }

    /* renamed from: c */
    public final void mo53989c() {
        int i;
        abw abw = this.f53602g;
        if (abw == this) {
            throw new IllegalStateException();
        } else if (abw.f53600e) {
            int i2 = this.f53598c - this.f53597b;
            int i3 = 8192 - abw.f53598c;
            if (abw.f53599d) {
                i = 0;
            } else {
                i = abw.f53597b;
            }
            if (i2 <= i3 + i) {
                mo53987a(abw, i2);
                mo53988b();
                abx.m50590a(this);
            }
        }
    }

    /* renamed from: a */
    public final abw mo53986a(abw abw) {
        abw.f53602g = this;
        abw.f53601f = this.f53601f;
        this.f53601f.f53602g = abw;
        this.f53601f = abw;
        return abw;
    }

    public abw(byte[] bArr, int i, int i2, boolean z, boolean z2) {
        this.f53596a = bArr;
        this.f53597b = i;
        this.f53598c = i2;
        this.f53599d = z;
        this.f53600e = z2;
    }

    /* renamed from: a */
    public final abw mo53985a(int i) {
        abw abw;
        if (i <= 0 || i > this.f53598c - this.f53597b) {
            throw new IllegalArgumentException();
        }
        if (i >= 1024) {
            abw = mo53984a();
        } else {
            abw = abx.m50589a();
            System.arraycopy(this.f53596a, this.f53597b, abw.f53596a, 0, i);
        }
        abw.f53598c = abw.f53597b + i;
        this.f53597b += i;
        this.f53602g.mo53986a(abw);
        return abw;
    }

    /* renamed from: a */
    public final void mo53987a(abw abw, int i) {
        if (abw.f53600e) {
            int i2 = abw.f53598c;
            if (i2 + i > 8192) {
                if (!abw.f53599d) {
                    int i3 = abw.f53597b;
                    if ((i2 + i) - i3 <= 8192) {
                        byte[] bArr = abw.f53596a;
                        System.arraycopy(bArr, i3, bArr, 0, i2 - i3);
                        abw.f53598c -= abw.f53597b;
                        abw.f53597b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            System.arraycopy(this.f53596a, this.f53597b, abw.f53596a, abw.f53598c, i);
            abw.f53598c += i;
            this.f53597b += i;
            return;
        }
        throw new IllegalArgumentException();
    }
}
