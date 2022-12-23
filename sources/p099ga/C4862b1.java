package p099ga;

import p583jk.C17875h;

/* renamed from: ga.b1 */
public final class C4862b1 {

    /* renamed from: c */
    public static final C4862b1 f16296c;

    /* renamed from: a */
    public final long f16297a;

    /* renamed from: b */
    public final long f16298b;

    static {
        C4862b1 b1Var = new C4862b1(0, 0);
        new C4862b1(Long.MAX_VALUE, Long.MAX_VALUE);
        new C4862b1(Long.MAX_VALUE, 0);
        new C4862b1(0, Long.MAX_VALUE);
        f16296c = b1Var;
    }

    public C4862b1(long j, long j2) {
        boolean z;
        boolean z2 = true;
        if (j >= 0) {
            z = true;
        } else {
            z = false;
        }
        C17875h.m44301k(z);
        C17875h.m44301k(j2 < 0 ? false : z2);
        this.f16297a = j;
        this.f16298b = j2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4862b1.class != obj.getClass()) {
            return false;
        }
        C4862b1 b1Var = (C4862b1) obj;
        if (this.f16297a == b1Var.f16297a && this.f16298b == b1Var.f16298b) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (((int) this.f16297a) * 31) + ((int) this.f16298b);
    }
}
