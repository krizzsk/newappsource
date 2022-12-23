package p251sa;

import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;

/* renamed from: sa.f */
public final class C6499f implements C6497e {

    /* renamed from: a */
    public final long[] f20278a;

    /* renamed from: b */
    public final long[] f20279b;

    /* renamed from: c */
    public final long f20280c;

    /* renamed from: d */
    public final long f20281d;

    public C6499f(long[] jArr, long[] jArr2, long j, long j2) {
        this.f20278a = jArr;
        this.f20279b = jArr2;
        this.f20280c = j;
        this.f20281d = j2;
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        int e = C6774a0.m15945e(this.f20278a, j, true);
        long[] jArr = this.f20278a;
        long j2 = jArr[e];
        long[] jArr2 = this.f20279b;
        C5753u uVar = new C5753u(j2, jArr2[e]);
        if (j2 >= j || e == jArr.length - 1) {
            return new C5750t.C5751a(uVar, uVar);
        }
        int i = e + 1;
        return new C5750t.C5751a(uVar, new C5753u(jArr[i], jArr2[i]));
    }

    /* renamed from: d */
    public final long mo22596d() {
        return this.f20281d;
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: f */
    public final long mo22597f(long j) {
        return this.f20278a[C6774a0.m15945e(this.f20279b, j, true)];
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f20280c;
    }
}
