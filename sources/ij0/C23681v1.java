package ij0;

import lj0.C24331h;
import org.simpleframework.xml.core.C24641a;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.core.RootException;
import p069e3.C4544g;
import p258t4.C6587a;
import p583jk.C17884p;

/* renamed from: ij0.v1 */
public final class C23681v1 {

    /* renamed from: a */
    public final C23639i1 f59851a;

    /* renamed from: b */
    public final C6587a f59852b;

    public C23681v1(C23639i1 i1Var) {
        this.f59852b = ((C24664u) i1Var.f59777c).f62448h.f61633b;
        this.f59851a = i1Var;
    }

    /* renamed from: a */
    public final Object mo58874a(C24331h hVar, Class cls) throws Exception {
        C4544g gVar = new C4544g(cls, 6);
        if (cls != null) {
            Object b = new C24641a(this.f59851a, gVar).mo58816b(hVar);
            if (b == null) {
                return null;
            }
            Class<?> cls2 = b.getClass();
            if (((C24664u) this.f59851a.f59777c).mo61104f(cls2).getName() == null) {
                if (cls2.isArray()) {
                    cls2 = cls2.getComponentType();
                }
                String simpleName = cls2.getSimpleName();
                if (!cls2.isPrimitive()) {
                    C17884p.m44330A(simpleName);
                }
            }
            this.f59852b.getClass();
            return b;
        }
        throw new RootException(new Object[0]);
    }
}
