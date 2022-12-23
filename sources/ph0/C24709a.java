package ph0;

import mf0.C24362h;

/* renamed from: ph0.a */
public final class C24709a<T> {

    /* renamed from: a */
    public final T f62556a;

    /* renamed from: b */
    public final T f62557b;

    public C24709a(T t, T t2) {
        this.f62556a = t;
        this.f62557b = t2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24709a)) {
            return false;
        }
        C24709a aVar = (C24709a) obj;
        return C24362h.m61206a(this.f62556a, aVar.f62556a) && C24362h.m61206a(this.f62557b, aVar.f62557b);
    }

    public final int hashCode() {
        T t = this.f62556a;
        int i = 0;
        int hashCode = (t == null ? 0 : t.hashCode()) * 31;
        T t2 = this.f62557b;
        if (t2 != null) {
            i = t2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("ApproximationBounds(lower=");
        k.append(this.f62556a);
        k.append(", upper=");
        k.append(this.f62557b);
        k.append(')');
        return k.toString();
    }
}
