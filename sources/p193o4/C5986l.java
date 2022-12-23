package p193o4;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p001a0.C0016g;
import p070e4.C4549d;
import p168m4.C5684b;
import p271u4.C6693d;
import p296w4.C6992h;

/* renamed from: o4.l */
public final class C5986l extends C6693d implements C5985k {

    /* renamed from: e */
    public HashMap<C5979e, List<C5684b>> f19146e = new HashMap<>();

    public C5986l(C4549d dVar) {
        mo20064b(dVar);
    }

    /* renamed from: m */
    public final void mo21978m(C5979e eVar, String str) {
        C5684b bVar;
        try {
            bVar = (C5684b) C6992h.m16473b(str, C5684b.class, this.f20771c);
        } catch (Exception e) {
            mo21727f("Could not instantiate class [" + str + "]", e);
            bVar = null;
        }
        if (bVar != null) {
            mo21979n(eVar, bVar);
        }
    }

    /* renamed from: n */
    public final void mo21979n(C5979e eVar, C5684b bVar) {
        bVar.mo20064b(this.f20771c);
        List list = this.f19146e.get(eVar);
        if (list == null) {
            list = new ArrayList();
            this.f19146e.put(eVar, list);
        }
        list.add(bVar);
    }

    public final String toString() {
        StringBuilder t = C0016g.m36t("SimpleRuleStore ( ", "rules = ");
        t.append(this.f19146e);
        t.append("  ");
        t.append(" )");
        return t.toString();
    }
}
