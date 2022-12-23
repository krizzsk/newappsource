package p988j$.util.concurrent;

/* renamed from: j$.util.concurrent.q */
class C25902q {

    /* renamed from: a */
    C25898m[] f64565a;

    /* renamed from: b */
    C25898m f64566b = null;

    /* renamed from: c */
    C25901p f64567c;

    /* renamed from: d */
    C25901p f64568d;

    /* renamed from: e */
    int f64569e;

    /* renamed from: f */
    int f64570f;

    /* renamed from: g */
    int f64571g;

    /* renamed from: h */
    final int f64572h;

    C25902q(C25898m[] mVarArr, int i, int i2, int i3) {
        this.f64565a = mVarArr;
        this.f64572h = i;
        this.f64569e = i2;
        this.f64570f = i2;
        this.f64571g = i3;
    }

    /* access modifiers changed from: package-private */
    /* renamed from: d */
    public final C25898m mo83979d() {
        C25898m mVar;
        C25898m[] mVarArr;
        int length;
        int i;
        C25901p pVar;
        C25898m mVar2 = this.f64566b;
        if (mVar2 != null) {
            mVar2 = mVar2.f64560d;
        }
        while (mVar == null) {
            if (this.f64570f >= this.f64571g || (mVarArr = this.f64565a) == null || (length = mVarArr.length) <= (i = this.f64569e) || i < 0) {
                this.f64566b = null;
                return null;
            }
            C25898m tabAt = ConcurrentHashMap.tabAt(mVarArr, i);
            if (tabAt == null || tabAt.f64557a >= 0) {
                mVar = tabAt;
            } else if (tabAt instanceof C25893h) {
                this.f64565a = ((C25893h) tabAt).f64550e;
                C25901p pVar2 = this.f64568d;
                if (pVar2 != null) {
                    this.f64568d = pVar2.f64564d;
                } else {
                    pVar2 = new C25901p();
                }
                pVar2.f64563c = mVarArr;
                pVar2.f64561a = length;
                pVar2.f64562b = i;
                pVar2.f64564d = this.f64567c;
                this.f64567c = pVar2;
                mVar = null;
            } else {
                mVar = tabAt instanceof C25903r ? ((C25903r) tabAt).f64576f : null;
            }
            if (this.f64567c != null) {
                while (true) {
                    pVar = this.f64567c;
                    if (pVar == null) {
                        break;
                    }
                    int i2 = this.f64569e;
                    int i3 = pVar.f64561a;
                    int i4 = i2 + i3;
                    this.f64569e = i4;
                    if (i4 < length) {
                        break;
                    }
                    this.f64569e = pVar.f64562b;
                    this.f64565a = pVar.f64563c;
                    pVar.f64563c = null;
                    C25901p pVar3 = pVar.f64564d;
                    pVar.f64564d = this.f64568d;
                    this.f64567c = pVar3;
                    this.f64568d = pVar;
                    length = i3;
                }
                if (pVar == null) {
                    int i5 = this.f64569e + this.f64572h;
                    this.f64569e = i5;
                    if (i5 >= length) {
                        int i6 = this.f64570f + 1;
                        this.f64570f = i6;
                        this.f64569e = i6;
                    }
                }
            } else {
                int i7 = i + this.f64572h;
                this.f64569e = i7;
                if (i7 >= length) {
                    int i8 = this.f64570f + 1;
                    this.f64570f = i8;
                    this.f64569e = i8;
                }
            }
        }
        this.f64566b = mVar;
        return mVar;
    }
}
