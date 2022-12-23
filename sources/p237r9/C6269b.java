package p237r9;

import p001a0.C0016g;

/* renamed from: r9.b */
public final class C6269b {

    /* renamed from: a */
    public final String f19742a;

    public C6269b(String str) {
        if (str != null) {
            this.f19742a = str;
            return;
        }
        throw new NullPointerException("name is null");
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C6269b)) {
            return false;
        }
        return this.f19742a.equals(((C6269b) obj).f19742a);
    }

    public final int hashCode() {
        return this.f19742a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C0016g.m31o(C13555b.m33972k("Encoding{name=\""), this.f19742a, "\"}");
    }
}
