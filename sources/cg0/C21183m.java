package cg0;

import ce0.C21100e;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import kotlin.collections.C23825c;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25486u;
import zf0.C25487v;
import zf0.C25488w;

/* renamed from: cg0.m */
public final class C21183m implements C25488w {

    /* renamed from: a */
    public final List<C25487v> f53095a;

    /* renamed from: b */
    public final String f53096b;

    public C21183m(List<? extends C25487v> list, String str) {
        C24362h.m61211f(list, "providers");
        C24362h.m61211f(str, "debugName");
        this.f53095a = list;
        this.f53096b = str;
        list.size();
        C23825c.m58503O0(list).size();
    }

    /* renamed from: a */
    public final void mo53521a(C25066c cVar, ArrayList arrayList) {
        C24362h.m61211f(cVar, "fqName");
        for (C25487v A : this.f53095a) {
            C21100e.m49296A(A, cVar, arrayList);
        }
    }

    /* renamed from: b */
    public final List<C25486u> mo53522b(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        ArrayList arrayList = new ArrayList();
        for (C25487v A : this.f53095a) {
            C21100e.m49296A(A, cVar, arrayList);
        }
        return C23825c.m58499K0(arrayList);
    }

    /* renamed from: c */
    public final boolean mo53523c(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        List<C25487v> list = this.f53095a;
        if ((list instanceof Collection) && list.isEmpty()) {
            return true;
        }
        for (C25487v n0 : list) {
            if (!C21100e.m49354n0(n0, cVar)) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: n */
    public final Collection<C25066c> mo53524n(C25066c cVar, C24236l<? super C25069e, Boolean> lVar) {
        C24362h.m61211f(cVar, "fqName");
        C24362h.m61211f(lVar, "nameFilter");
        HashSet hashSet = new HashSet();
        for (C25487v n : this.f53095a) {
            hashSet.addAll(n.mo53524n(cVar, lVar));
        }
        return hashSet;
    }

    public final String toString() {
        return this.f53096b;
    }
}
