package androidx.recyclerview.widget;

/* renamed from: androidx.recyclerview.widget.d */
public final class C1169d implements C1241u {

    /* renamed from: a */
    public final C1241u f4443a;

    /* renamed from: b */
    public int f4444b = 0;

    /* renamed from: c */
    public int f4445c = -1;

    /* renamed from: d */
    public int f4446d = -1;

    /* renamed from: e */
    public Object f4447e = null;

    public C1169d(C1241u uVar) {
        this.f4443a = uVar;
    }

    /* renamed from: a */
    public final void mo5011a(int i, int i2) {
        int i3;
        if (this.f4444b == 1 && i >= (i3 = this.f4445c)) {
            int i4 = this.f4446d;
            if (i <= i3 + i4) {
                this.f4446d = i4 + i2;
                this.f4445c = Math.min(i, i3);
                return;
            }
        }
        mo5021e();
        this.f4445c = i;
        this.f4446d = i2;
        this.f4444b = 1;
    }

    /* renamed from: b */
    public final void mo5012b(int i, int i2) {
        int i3;
        if (this.f4444b != 2 || (i3 = this.f4445c) < i || i3 > i + i2) {
            mo5021e();
            this.f4445c = i;
            this.f4446d = i2;
            this.f4444b = 2;
            return;
        }
        this.f4446d += i2;
        this.f4445c = i;
    }

    /* renamed from: c */
    public final void mo5013c(int i, int i2, Object obj) {
        int i3;
        if (this.f4444b == 3) {
            int i4 = this.f4445c;
            int i5 = this.f4446d;
            if (i <= i4 + i5 && (i3 = i + i2) >= i4 && this.f4447e == obj) {
                this.f4445c = Math.min(i, i4);
                this.f4446d = Math.max(i5 + i4, i3) - this.f4445c;
                return;
            }
        }
        mo5021e();
        this.f4445c = i;
        this.f4446d = i2;
        this.f4447e = obj;
        this.f4444b = 3;
    }

    /* renamed from: d */
    public final void mo5014d(int i, int i2) {
        mo5021e();
        this.f4443a.mo5014d(i, i2);
    }

    /* renamed from: e */
    public final void mo5021e() {
        int i = this.f4444b;
        if (i != 0) {
            if (i == 1) {
                this.f4443a.mo5011a(this.f4445c, this.f4446d);
            } else if (i == 2) {
                this.f4443a.mo5012b(this.f4445c, this.f4446d);
            } else if (i == 3) {
                this.f4443a.mo5013c(this.f4445c, this.f4446d, this.f4447e);
            }
            this.f4447e = null;
            this.f4444b = 0;
        }
    }
}
