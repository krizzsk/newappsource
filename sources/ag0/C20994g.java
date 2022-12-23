package ag0;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import lf0.C24236l;
import lh0.C24297q0;
import mf0.C24362h;
import ug0.C25066c;

/* renamed from: ag0.g */
public final class C20994g implements C20989e {

    /* renamed from: b */
    public final C20989e f52741b;

    /* renamed from: c */
    public final C24236l<C25066c, Boolean> f52742c;

    public C20994g(C20989e eVar, C24297q0 q0Var) {
        this.f52741b = eVar;
        this.f52742c = q0Var;
    }

    /* renamed from: b1 */
    public final boolean mo53070b1(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        if (this.f52742c.invoke(cVar).booleanValue()) {
            return this.f52741b.mo53070b1(cVar);
        }
        return false;
    }

    /* renamed from: c */
    public final C20986c mo53071c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        if (this.f52742c.invoke(cVar).booleanValue()) {
            return this.f52741b.mo53071c(cVar);
        }
        return null;
    }

    public final boolean isEmpty() {
        boolean z;
        C20989e<C20986c> eVar = this.f52741b;
        if (!(eVar instanceof Collection) || !((Collection) eVar).isEmpty()) {
            for (C20986c f : eVar) {
                C25066c f2 = f.mo53066f();
                if (f2 == null || !this.f52742c.invoke(f2).booleanValue()) {
                    z = false;
                    continue;
                } else {
                    z = true;
                    continue;
                }
                if (z) {
                    return true;
                }
            }
        }
        return false;
    }

    public final Iterator<C20986c> iterator() {
        boolean z;
        C20989e eVar = this.f52741b;
        ArrayList arrayList = new ArrayList();
        for (Object next : eVar) {
            C25066c f = ((C20986c) next).mo53066f();
            if (f == null || !this.f52742c.invoke(f).booleanValue()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return arrayList.iterator();
    }
}
