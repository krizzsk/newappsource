package p289va;

import androidx.recyclerview.widget.RecyclerView;
import p173ma.C5737j;
import p277ub.C6774a0;
import p277ub.C6803r;
import p277ub.C6812y;
import p289va.C6896d0;

/* renamed from: va.y */
public final class C6930y implements C6896d0 {

    /* renamed from: a */
    public final C6929x f21591a;

    /* renamed from: b */
    public final C6803r f21592b = new C6803r(32);

    /* renamed from: c */
    public int f21593c;

    /* renamed from: d */
    public int f21594d;

    /* renamed from: e */
    public boolean f21595e;

    /* renamed from: f */
    public boolean f21596f;

    public C6930y(C6929x xVar) {
        this.f21591a = xVar;
    }

    /* renamed from: a */
    public final void mo23147a(C6812y yVar, C5737j jVar, C6896d0.C6900d dVar) {
        this.f21591a.mo23145a(yVar, jVar, dVar);
        this.f21596f = true;
    }

    /* renamed from: b */
    public final void mo23148b(int i, C6803r rVar) {
        boolean z;
        int i2;
        boolean z2;
        if ((i & 1) != 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            i2 = rVar.f21039b + rVar.mo22997p();
        } else {
            i2 = -1;
        }
        if (this.f21596f) {
            if (z) {
                this.f21596f = false;
                rVar.mo23007z(i2);
                this.f21594d = 0;
            } else {
                return;
            }
        }
        while (true) {
            int i3 = rVar.f21040c;
            int i4 = rVar.f21039b;
            if (i3 - i4 > 0) {
                int i5 = this.f21594d;
                if (i5 < 3) {
                    if (i5 == 0) {
                        int p = rVar.mo22997p();
                        rVar.mo23007z(rVar.f21039b - 1);
                        if (p == 255) {
                            this.f21596f = true;
                            return;
                        }
                    }
                    int min = Math.min(rVar.f21040c - rVar.f21039b, 3 - this.f21594d);
                    rVar.mo22983b(this.f21594d, min, this.f21592b.f21038a);
                    int i6 = this.f21594d + min;
                    this.f21594d = i6;
                    if (i6 == 3) {
                        this.f21592b.mo23007z(0);
                        this.f21592b.mo23006y(3);
                        this.f21592b.mo22981A(1);
                        int p2 = this.f21592b.mo22997p();
                        int p3 = this.f21592b.mo22997p();
                        if ((p2 & RecyclerView.C1119a0.FLAG_IGNORE) != 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        this.f21595e = z2;
                        int i7 = (((p2 & 15) << 8) | p3) + 3;
                        this.f21593c = i7;
                        byte[] bArr = this.f21592b.f21038a;
                        if (bArr.length < i7) {
                            this.f21592b.mo22982a(Math.min(4098, Math.max(i7, bArr.length * 2)));
                        }
                    }
                } else {
                    int min2 = Math.min(i3 - i4, this.f21593c - i5);
                    rVar.mo22983b(this.f21594d, min2, this.f21592b.f21038a);
                    int i8 = this.f21594d + min2;
                    this.f21594d = i8;
                    int i9 = this.f21593c;
                    if (i8 != i9) {
                        continue;
                    } else {
                        if (this.f21595e) {
                            byte[] bArr2 = this.f21592b.f21038a;
                            int i11 = -1;
                            for (int i12 = 0; i12 < i9; i12++) {
                                i11 = C6774a0.f20968j[((i11 >>> 24) ^ (bArr2[i12] & 255)) & 255] ^ (i11 << 8);
                            }
                            int i13 = C6774a0.f20959a;
                            if (i11 != 0) {
                                this.f21596f = true;
                                return;
                            }
                            this.f21592b.mo23006y(this.f21593c - 4);
                        } else {
                            this.f21592b.mo23006y(i9);
                        }
                        this.f21592b.mo23007z(0);
                        this.f21591a.mo23146b(this.f21592b);
                        this.f21594d = 0;
                    }
                }
            } else {
                return;
            }
        }
    }

    /* renamed from: c */
    public final void mo23149c() {
        this.f21596f = true;
    }
}
