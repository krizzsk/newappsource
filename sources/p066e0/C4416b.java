package p066e0;

/* renamed from: e0.b */
public final class C4416b extends C4459w {

    /* renamed from: a */
    public final Object f15478a;

    public C4416b(Object obj) {
        this.f15478a = obj;
    }

    /* renamed from: a */
    public final Object mo19927a() {
        return this.f15478a;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C4459w) {
            return this.f15478a.equals(((C4459w) obj).mo19927a());
        }
        return false;
    }

    public final int hashCode() {
        return this.f15478a.hashCode() ^ 1000003;
    }

    public final String toString() {
        return C16530d.m42015h(C13555b.m33972k("Identifier{value="), this.f15478a, "}");
    }
}
