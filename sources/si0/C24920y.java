package si0;

import cf0.C21132f;
import mf0.C24362h;

/* renamed from: si0.y */
public final class C24920y {

    /* renamed from: a */
    public final byte[] f62991a;

    /* renamed from: b */
    public int f62992b;

    /* renamed from: c */
    public int f62993c;

    /* renamed from: d */
    public boolean f62994d;

    /* renamed from: e */
    public boolean f62995e;

    /* renamed from: f */
    public C24920y f62996f;

    /* renamed from: g */
    public C24920y f62997g;

    public C24920y() {
        this.f62991a = new byte[8192];
        this.f62995e = true;
        this.f62994d = false;
    }

    /* renamed from: a */
    public final C24920y mo61475a() {
        C24920y yVar = this.f62996f;
        if (yVar == this) {
            yVar = null;
        }
        C24920y yVar2 = this.f62997g;
        C24362h.m61208c(yVar2);
        yVar2.f62996f = this.f62996f;
        C24920y yVar3 = this.f62996f;
        C24362h.m61208c(yVar3);
        yVar3.f62997g = this.f62997g;
        this.f62996f = null;
        this.f62997g = null;
        return yVar;
    }

    /* renamed from: b */
    public final void mo61476b(C24920y yVar) {
        yVar.f62997g = this;
        yVar.f62996f = this.f62996f;
        C24920y yVar2 = this.f62996f;
        C24362h.m61208c(yVar2);
        yVar2.f62997g = yVar;
        this.f62996f = yVar;
    }

    /* renamed from: c */
    public final C24920y mo61477c() {
        this.f62994d = true;
        return new C24920y(this.f62991a, this.f62992b, this.f62993c, true);
    }

    /* renamed from: d */
    public final void mo61478d(C24920y yVar, int i) {
        if (yVar.f62995e) {
            int i2 = yVar.f62993c;
            int i3 = i2 + i;
            if (i3 > 8192) {
                if (!yVar.f62994d) {
                    int i4 = yVar.f62992b;
                    if (i3 - i4 <= 8192) {
                        byte[] bArr = yVar.f62991a;
                        C21132f.m49429L0(0, bArr, i4, bArr, i2);
                        yVar.f62993c -= yVar.f62992b;
                        yVar.f62992b = 0;
                    } else {
                        throw new IllegalArgumentException();
                    }
                } else {
                    throw new IllegalArgumentException();
                }
            }
            byte[] bArr2 = this.f62991a;
            byte[] bArr3 = yVar.f62991a;
            int i5 = yVar.f62993c;
            int i6 = this.f62992b;
            C21132f.m49429L0(i5, bArr2, i6, bArr3, i6 + i);
            yVar.f62993c += i;
            this.f62992b += i;
            return;
        }
        throw new IllegalStateException("only owner can write".toString());
    }

    public C24920y(byte[] bArr, int i, int i2, boolean z) {
        C24362h.m61211f(bArr, "data");
        this.f62991a = bArr;
        this.f62992b = i;
        this.f62993c = i2;
        this.f62994d = z;
        this.f62995e = false;
    }
}
