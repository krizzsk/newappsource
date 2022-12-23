package qg0;

import kotlin.NoWhenBranchMatchedException;
import mf0.C24362h;
import p001a0.C0017h;
import tg0.C24985d;

/* renamed from: qg0.n */
public final class C24763n {

    /* renamed from: a */
    public final String f62663a;

    /* renamed from: qg0.n$a */
    public static final class C24764a {
        /* renamed from: a */
        public static C24763n m62299a(C24985d dVar) {
            if (dVar instanceof C24985d.C24987b) {
                String c = dVar.mo61532c();
                String b = dVar.mo61531b();
                C24362h.m61211f(c, "name");
                C24362h.m61211f(b, "desc");
                return new C24763n(C24362h.m61216k(b, c));
            } else if (dVar instanceof C24985d.C24986a) {
                String c2 = dVar.mo61532c();
                String b2 = dVar.mo61531b();
                C24362h.m61211f(c2, "name");
                C24362h.m61211f(b2, "desc");
                return new C24763n(c2 + '#' + b2);
            } else {
                throw new NoWhenBranchMatchedException();
            }
        }
    }

    public C24763n(String str) {
        this.f62663a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C24763n) && C24362h.m61206a(this.f62663a, ((C24763n) obj).f62663a);
    }

    public final int hashCode() {
        return this.f62663a.hashCode();
    }

    public final String toString() {
        return C0017h.m57N(C13555b.m33972k("MemberSignature(signature="), this.f62663a, ')');
    }
}
