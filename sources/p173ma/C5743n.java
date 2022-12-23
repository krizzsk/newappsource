package p173ma;

import p173ma.C5744o;
import p173ma.C5750t;
import p277ub.C6774a0;
import p583jk.C17875h;

/* renamed from: ma.n */
public final class C5743n implements C5750t {

    /* renamed from: a */
    public final C5744o f18600a;

    /* renamed from: b */
    public final long f18601b;

    public C5743n(C5744o oVar, long j) {
        this.f18600a = oVar;
        this.f18601b = j;
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        long j2;
        C17875h.m44306q(this.f18600a.f18612k);
        C5744o oVar = this.f18600a;
        C5744o.C5745a aVar = oVar.f18612k;
        long[] jArr = aVar.f18614a;
        long[] jArr2 = aVar.f18615b;
        int e = C6774a0.m15945e(jArr, C6774a0.m15948h((((long) oVar.f18606e) * j) / 1000000, 0, oVar.f18611j - 1), false);
        long j3 = 0;
        if (e == -1) {
            j2 = 0;
        } else {
            j2 = jArr[e];
        }
        if (e != -1) {
            j3 = jArr2[e];
        }
        int i = this.f18600a.f18606e;
        long j4 = (j2 * 1000000) / ((long) i);
        long j5 = this.f18601b;
        C5753u uVar = new C5753u(j4, j3 + j5);
        if (j4 == j || e == jArr.length - 1) {
            return new C5750t.C5751a(uVar, uVar);
        }
        int i2 = e + 1;
        return new C5750t.C5751a(uVar, new C5753u((jArr[i2] * 1000000) / ((long) i), j5 + jArr2[i2]));
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f18600a.mo21597c();
    }
}
