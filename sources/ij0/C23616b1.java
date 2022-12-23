package ij0;

import kj0.C23811f;

/* renamed from: ij0.b1 */
public final class C23616b1 implements C23666r0 {

    /* renamed from: a */
    public final C23639i1 f59701a;

    /* renamed from: b */
    public final C23811f f59702b;

    /* renamed from: c */
    public final Class f59703c;

    public C23616b1(C23639i1 i1Var, C23811f fVar) {
        this.f59703c = fVar.getType();
        this.f59701a = i1Var;
        this.f59702b = fVar;
    }

    /* renamed from: a */
    public final boolean mo58773a() {
        return this.f59702b.mo5645a();
    }

    /* renamed from: b */
    public final Object mo58774b(Object obj) {
        C23811f fVar = this.f59702b;
        if (fVar != null) {
            fVar.setValue(obj);
        }
        return obj;
    }

    public final Object getInstance() throws Exception {
        if (this.f59702b.mo5645a()) {
            return this.f59702b.getValue();
        }
        Object instance = this.f59701a.mo58817c(this.f59703c).getInstance();
        C23811f fVar = this.f59702b;
        if (fVar != null) {
            fVar.setValue(instance);
        }
        return instance;
    }

    public final Class getType() {
        return this.f59703c;
    }
}
