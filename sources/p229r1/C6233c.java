package p229r1;

/* renamed from: r1.c */
public final class C6233c<F, S> {

    /* renamed from: a */
    public final F f19679a;

    /* renamed from: b */
    public final S f19680b;

    public C6233c(F f, S s) {
        this.f19679a = f;
        this.f19680b = s;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C6233c)) {
            return false;
        }
        C6233c cVar = (C6233c) obj;
        if (!C6232b.m14816a(cVar.f19679a, this.f19679a) || !C6232b.m14816a(cVar.f19680b, this.f19680b)) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        F f = this.f19679a;
        int i = 0;
        int hashCode = f == null ? 0 : f.hashCode();
        S s = this.f19680b;
        if (s != null) {
            i = s.hashCode();
        }
        return hashCode ^ i;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("Pair{");
        k.append(this.f19679a);
        k.append(" ");
        return C16530d.m42015h(k, this.f19680b, "}");
    }
}
