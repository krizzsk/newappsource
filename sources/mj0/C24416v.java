package mj0;

import ij0.C23644k0;
import org.simpleframework.xml.util.ConcurrentCache;

/* renamed from: mj0.v */
public final class C24416v {

    /* renamed from: a */
    public final ConcurrentCache f61775a = new ConcurrentCache();

    /* renamed from: b */
    public final ConcurrentCache f61776b = new ConcurrentCache();

    /* renamed from: c */
    public final C24408n f61777c;

    public C24416v(C23644k0 k0Var) {
        this.f61777c = new C24408n(k0Var);
    }

    /* renamed from: a */
    public final C24415u mo60539a(Class cls) throws Exception {
        if (this.f61776b.containsKey(cls)) {
            return null;
        }
        C24415u uVar = (C24415u) this.f61775a.get(cls);
        if (uVar != null) {
            return uVar;
        }
        C24415u a = this.f61777c.mo58820a(cls);
        if (a != null) {
            this.f61775a.put(cls, a);
        } else {
            this.f61776b.put(cls, this);
        }
        return a;
    }
}
