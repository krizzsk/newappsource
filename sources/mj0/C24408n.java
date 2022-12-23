package mj0;

import ij0.C23644k0;

/* renamed from: mj0.n */
public final class C24408n implements C24411q {

    /* renamed from: a */
    public C24413s f61768a = new C24413s();

    /* renamed from: b */
    public C24411q f61769b;

    /* renamed from: c */
    public C24412r f61770c = new C24412r();

    /* renamed from: d */
    public C24395a f61771d = new C24395a(this);

    public C24408n(C23644k0 k0Var) {
        this.f61769b = k0Var;
    }

    /* renamed from: a */
    public final C24415u mo58820a(Class cls) throws Exception {
        C24415u a = this.f61769b.mo58820a(cls);
        if (a != null) {
            return a;
        }
        if (cls.isArray()) {
            return this.f61771d.mo58820a(cls);
        }
        if (cls.isPrimitive()) {
            return this.f61768a.mo58820a(cls);
        }
        return this.f61770c.mo58820a(cls);
    }
}
