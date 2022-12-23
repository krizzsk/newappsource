package p977zz;

import p583jk.C17884p;

/* renamed from: zz.i0 */
public final class C20944i0<F, S> {

    /* renamed from: a */
    public final F f52692a;

    /* renamed from: b */
    public final S f52693b;

    public C20944i0(F f, S s) {
        this.f52692a = f;
        this.f52693b = s;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20944i0)) {
            return false;
        }
        C20944i0 i0Var = (C20944i0) obj;
        if (!C20975x0.m49118e(this.f52692a, i0Var.f52692a) || !C20975x0.m49118e(this.f52693b, i0Var.f52693b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return C17884p.m44333D(C17884p.m44335F(this.f52692a), C17884p.m44335F(this.f52693b));
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("(");
        k.append(this.f52692a);
        k.append(", ");
        return C16530d.m42015h(k, this.f52693b, ")");
    }
}
