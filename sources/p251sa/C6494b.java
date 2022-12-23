package p251sa;

import p173ma.C5750t;
import p173ma.C5753u;
import p277ub.C6774a0;
import p277ub.C6790l;

/* renamed from: sa.b */
public final class C6494b implements C6497e {

    /* renamed from: a */
    public final long f20250a;

    /* renamed from: b */
    public final C6790l f20251b;

    /* renamed from: c */
    public final C6790l f20252c;

    /* renamed from: d */
    public long f20253d;

    public C6494b(long j, long j2, long j3) {
        this.f20253d = j;
        this.f20250a = j3;
        C6790l lVar = new C6790l();
        this.f20251b = lVar;
        C6790l lVar2 = new C6790l();
        this.f20252c = lVar2;
        lVar.mo22963a(0);
        lVar2.mo22963a(j2);
    }

    /* renamed from: a */
    public final boolean mo22598a(long j) {
        C6790l lVar = this.f20251b;
        if (j - lVar.mo22964b(lVar.f21001a - 1) < 100000) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final C5750t.C5751a mo21569c(long j) {
        int c = C6774a0.m15943c(this.f20251b, j);
        long b = this.f20251b.mo22964b(c);
        C5753u uVar = new C5753u(b, this.f20252c.mo22964b(c));
        if (b != j) {
            C6790l lVar = this.f20251b;
            if (c != lVar.f21001a - 1) {
                int i = c + 1;
                return new C5750t.C5751a(uVar, new C5753u(lVar.mo22964b(i), this.f20252c.mo22964b(i)));
            }
        }
        return new C5750t.C5751a(uVar, uVar);
    }

    /* renamed from: d */
    public final long mo22596d() {
        return this.f20250a;
    }

    /* renamed from: e */
    public final boolean mo21570e() {
        return true;
    }

    /* renamed from: f */
    public final long mo22597f(long j) {
        return this.f20251b.mo22964b(C6774a0.m15943c(this.f20252c, j));
    }

    /* renamed from: i */
    public final long mo21571i() {
        return this.f20253d;
    }
}
