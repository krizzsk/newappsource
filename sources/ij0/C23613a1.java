package ij0;

import kj0.C23811f;
import lj0.C24331h;
import org.simpleframework.xml.core.InstantiationException;
import p069e3.C4544g;

/* renamed from: ij0.a1 */
public final class C23613a1 extends C23617c {
    public C23613a1(C23639i1 i1Var, C4544g gVar) {
        super(i1Var, gVar);
    }

    /* renamed from: e */
    public final C23666r0 mo58750e(C24331h hVar) throws Exception {
        C23811f a = mo58824a(hVar);
        Class b = mo58825b();
        if (a != null) {
            return new C23616b1(this.f59804a, a);
        }
        if (C23653n0.m58000c(b)) {
            return this.f59804a.mo58817c(b);
        }
        throw new InstantiationException("Cannot instantiate %s for %s", b, this.f59807d);
    }
}
