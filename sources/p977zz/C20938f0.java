package p977zz;

import p583jk.C17884p;

/* renamed from: zz.f0 */
public final class C20938f0<F, S> {

    /* renamed from: a */
    public F f52685a = null;

    /* renamed from: b */
    public S f52686b = null;

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20938f0)) {
            return false;
        }
        C20938f0 f0Var = (C20938f0) obj;
        if (!C20975x0.m49118e(this.f52685a, f0Var.f52685a) || !C20975x0.m49118e(this.f52686b, f0Var.f52686b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52685a), C17884p.m44335F(this.f52686b));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("(");
        k.append(this.f52685a);
        k.append(", ");
        return C16530d.m42015h(k, this.f52686b, ")");
    }
}
