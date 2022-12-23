package p302wa;

import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;

/* renamed from: wa.d */
public final class C7011d implements C5750t {

    /* renamed from: a */
    public final C7008b f21814a;

    /* renamed from: b */
    public final int f21815b;

    /* renamed from: c */
    public final long f21816c;

    /* renamed from: d */
    public final long f21817d;

    /* renamed from: e */
    public final long f21818e;

    public C7011d(C7008b bVar, int i, long j, long j2) {
        this.f21814a = bVar;
        this.f21815b = i;
        this.f21816c = j;
        long j3 = (j2 - j) / ((long) bVar.f21809d);
        this.f21817d = j3;
        this.f21818e = mo23261a(j3);
    }

    /* renamed from: a */
    public final long mo23261a(long j) {
        return C6774a0.m15939A(j * ((long) this.f21815b), 1000000, (long) this.f21814a.f21808c);
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        long h = C6774a0.m15948h((((long) this.f21814a.f21808c) * j) / (((long) this.f21815b) * 1000000), 0, this.f21817d - 1);
        long j2 = (((long) this.f21814a.f21809d) * h) + this.f21816c;
        long a = mo23261a(h);
        C5753u uVar = new C5753u(a, j2);
        if (a >= j || h == this.f21817d - 1) {
            return new C5750t.C5751a(uVar, uVar);
        }
        long j3 = h + 1;
        return new C5750t.C5751a(uVar, new C5753u(mo23261a(j3), (((long) this.f21814a.f21809d) * j3) + this.f21816c));
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f21818e;
    }
}
