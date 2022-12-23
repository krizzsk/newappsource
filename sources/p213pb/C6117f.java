package p213pb;

import android.text.Layout;

/* renamed from: pb.f */
public final class C6117f {

    /* renamed from: a */
    public String f19447a;

    /* renamed from: b */
    public int f19448b;

    /* renamed from: c */
    public boolean f19449c;

    /* renamed from: d */
    public int f19450d;

    /* renamed from: e */
    public boolean f19451e;

    /* renamed from: f */
    public int f19452f = -1;

    /* renamed from: g */
    public int f19453g = -1;

    /* renamed from: h */
    public int f19454h = -1;

    /* renamed from: i */
    public int f19455i = -1;

    /* renamed from: j */
    public int f19456j = -1;

    /* renamed from: k */
    public float f19457k;

    /* renamed from: l */
    public String f19458l;

    /* renamed from: m */
    public int f19459m = -1;

    /* renamed from: n */
    public int f19460n = -1;

    /* renamed from: o */
    public Layout.Alignment f19461o;

    /* renamed from: p */
    public Layout.Alignment f19462p;

    /* renamed from: q */
    public int f19463q = -1;

    /* renamed from: r */
    public C6110b f19464r;

    /* renamed from: s */
    public float f19465s = Float.MAX_VALUE;

    /* renamed from: a */
    public final void mo22078a(C6117f fVar) {
        int i;
        Layout.Alignment alignment;
        Layout.Alignment alignment2;
        String str;
        if (fVar != null) {
            if (!this.f19449c && fVar.f19449c) {
                this.f19448b = fVar.f19448b;
                this.f19449c = true;
            }
            if (this.f19454h == -1) {
                this.f19454h = fVar.f19454h;
            }
            if (this.f19455i == -1) {
                this.f19455i = fVar.f19455i;
            }
            if (this.f19447a == null && (str = fVar.f19447a) != null) {
                this.f19447a = str;
            }
            if (this.f19452f == -1) {
                this.f19452f = fVar.f19452f;
            }
            if (this.f19453g == -1) {
                this.f19453g = fVar.f19453g;
            }
            if (this.f19460n == -1) {
                this.f19460n = fVar.f19460n;
            }
            if (this.f19461o == null && (alignment2 = fVar.f19461o) != null) {
                this.f19461o = alignment2;
            }
            if (this.f19462p == null && (alignment = fVar.f19462p) != null) {
                this.f19462p = alignment;
            }
            if (this.f19463q == -1) {
                this.f19463q = fVar.f19463q;
            }
            if (this.f19456j == -1) {
                this.f19456j = fVar.f19456j;
                this.f19457k = fVar.f19457k;
            }
            if (this.f19464r == null) {
                this.f19464r = fVar.f19464r;
            }
            if (this.f19465s == Float.MAX_VALUE) {
                this.f19465s = fVar.f19465s;
            }
            if (!this.f19451e && fVar.f19451e) {
                this.f19450d = fVar.f19450d;
                this.f19451e = true;
            }
            if (this.f19459m == -1 && (i = fVar.f19459m) != -1) {
                this.f19459m = i;
            }
        }
    }
}
