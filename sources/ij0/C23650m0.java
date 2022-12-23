package ij0;

import lj0.C24330g;
import org.simpleframework.xml.core.C24664u;
import org.simpleframework.xml.util.LimitedCache;
import p069e3.C4544g;

/* renamed from: ij0.m0 */
public final class C23650m0 {

    /* renamed from: a */
    public final LimitedCache f59798a = new LimitedCache();

    /* renamed from: b */
    public final C24330g f59799b;

    /* renamed from: c */
    public final Class f59800c;

    public C23650m0(C23675u uVar, C24664u uVar2) {
        this.f59799b = uVar2.f62448h;
        this.f59800c = uVar.getType();
    }

    /* renamed from: a */
    public final C23647l0 mo58822a(String str) throws Exception {
        C23647l0 l0Var = (C23647l0) this.f59798a.get(str);
        if (l0Var != null) {
            return l0Var;
        }
        C23626e1 e1Var = new C23626e1(str, new C4544g(this.f59800c, 6), this.f59799b);
        LimitedCache limitedCache = this.f59798a;
        if (limitedCache != null) {
            limitedCache.put(str, e1Var);
        }
        return e1Var;
    }
}
