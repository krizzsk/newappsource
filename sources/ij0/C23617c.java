package ij0;

import androidx.appcompat.app.C0262r;
import kj0.C23811f;
import lj0.C24331h;
import org.simpleframework.xml.core.ElementException;
import org.simpleframework.xml.core.InstantiationException;
import p069e3.C4544g;

/* renamed from: ij0.c */
public class C23617c extends C23653n0 {

    /* renamed from: e */
    public final /* synthetic */ int f59704e;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23617c(C23639i1 i1Var, C4544g gVar, int i) {
        super(i1Var, gVar);
        this.f59704e = i;
    }

    /* renamed from: d */
    public final Class mo58777d() throws Exception {
        Class b = mo58825b();
        if (b.isArray()) {
            return b.getComponentType();
        }
        throw new InstantiationException("The %s not an array for %s", b, this.f59807d);
    }

    /* renamed from: e */
    public C23666r0 mo58750e(C24331h hVar) {
        switch (this.f59704e) {
            case 0:
                C0262r position = hVar.getPosition();
                C23811f a = mo58824a(hVar);
                if (a != null) {
                    Class type = a.getType();
                    Class d = mo58777d();
                    if (d.isAssignableFrom(type)) {
                        return new C23620d(a);
                    }
                    throw new InstantiationException("Array of type %s cannot hold %s for %s", d, type, this.f59807d);
                }
                throw new ElementException("Array length required for %s at %s", this.f59807d, position);
            default:
                C23811f a2 = mo58824a(hVar);
                Class b = mo58825b();
                if (a2 == null) {
                    return this.f59804a.mo58817c(b);
                }
                return new C23616b1(this.f59804a, a2);
        }
    }

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C23617c(C23639i1 i1Var, C4544g gVar) {
        super(i1Var, gVar);
        this.f59704e = 1;
    }
}
