package cg0;

import eh0.C23303c;
import eh0.C23306d;
import eh0.C23311g;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import kotlin.reflect.jvm.internal.impl.descriptors.impl.C23909c;
import lf0.C24236l;
import mf0.C24361g;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25442g;
import zf0.C25485t;
import zf0.C25489x;

/* renamed from: cg0.i0 */
public final class C21176i0 extends C23311g {

    /* renamed from: b */
    public final C25485t f53079b;

    /* renamed from: c */
    public final C25066c f53080c;

    public C21176i0(C23909c cVar, C25066c cVar2) {
        C24362h.m61211f(cVar, "moduleDescriptor");
        C24362h.m61211f(cVar2, "fqName");
        this.f53079b = cVar;
        this.f53080c = cVar2;
    }

    /* renamed from: e */
    public final Collection<C25442g> mo53492e(C23306d dVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        if (!dVar.mo58439a(C23306d.f59093h)) {
            return EmptyList.f60173b;
        }
        if (this.f53080c.mo61582d() && dVar.f59105a.contains(C23303c.C23305b.f59087a)) {
            return EmptyList.f60173b;
        }
        Collection<C25066c> n = this.f53079b.mo59461n(this.f53080c, lVar);
        ArrayList arrayList = new ArrayList(n.size());
        for (C25066c f : n) {
            C25069e f2 = f.mo61585f();
            C24362h.m61210e(f2, "subFqName.shortName()");
            if (lVar.invoke(f2).booleanValue()) {
                C25489x xVar = null;
                if (!f2.f63264c) {
                    C25489x k0 = this.f53079b.mo59458k0(this.f53080c.mo61581c(f2));
                    if (!k0.isEmpty()) {
                        xVar = k0;
                    }
                }
                C24361g.m61168j(xVar, arrayList);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        return EmptySet.f60175b;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("subpackages of ");
        k.append(this.f53080c);
        k.append(" from ");
        k.append(this.f53079b);
        return k.toString();
    }
}
