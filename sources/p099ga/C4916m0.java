package p099ga;

import p100gb.C4987o;
import p277ub.C6774a0;

/* renamed from: ga.m0 */
public final class C4916m0 {

    /* renamed from: a */
    public final C4987o.C4988a f16623a;

    /* renamed from: b */
    public final long f16624b;

    /* renamed from: c */
    public final long f16625c;

    /* renamed from: d */
    public final long f16626d;

    /* renamed from: e */
    public final long f16627e;

    /* renamed from: f */
    public final boolean f16628f;

    /* renamed from: g */
    public final boolean f16629g;

    /* renamed from: h */
    public final boolean f16630h;

    public C4916m0(C4987o.C4988a aVar, long j, long j2, long j3, long j4, boolean z, boolean z2, boolean z3) {
        this.f16623a = aVar;
        this.f16624b = j;
        this.f16625c = j2;
        this.f16626d = j3;
        this.f16627e = j4;
        this.f16628f = z;
        this.f16629g = z2;
        this.f16630h = z3;
    }

    /* renamed from: a */
    public final C4916m0 mo20560a(long j) {
        if (j == this.f16625c) {
            return this;
        }
        return new C4916m0(this.f16623a, this.f16624b, j, this.f16626d, this.f16627e, this.f16628f, this.f16629g, this.f16630h);
    }

    /* renamed from: b */
    public final C4916m0 mo20561b(long j) {
        if (j == this.f16624b) {
            return this;
        }
        return new C4916m0(this.f16623a, j, this.f16625c, this.f16626d, this.f16627e, this.f16628f, this.f16629g, this.f16630h);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4916m0.class != obj.getClass()) {
            return false;
        }
        C4916m0 m0Var = (C4916m0) obj;
        if (this.f16624b == m0Var.f16624b && this.f16625c == m0Var.f16625c && this.f16626d == m0Var.f16626d && this.f16627e == m0Var.f16627e && this.f16628f == m0Var.f16628f && this.f16629g == m0Var.f16629g && this.f16630h == m0Var.f16630h && C6774a0.m15941a(this.f16623a, m0Var.f16623a)) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return ((((((((((((((this.f16623a.hashCode() + 527) * 31) + ((int) this.f16624b)) * 31) + ((int) this.f16625c)) * 31) + ((int) this.f16626d)) * 31) + ((int) this.f16627e)) * 31) + (this.f16628f ? 1 : 0)) * 31) + (this.f16629g ? 1 : 0)) * 31) + (this.f16630h ? 1 : 0);
    }
}
