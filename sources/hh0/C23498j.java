package hh0;

import ce0.C21100e;
import java.util.Iterator;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;
import zf0.C25486u;
import zf0.C25487v;

/* renamed from: hh0.j */
public final class C23498j implements C23490e {

    /* renamed from: a */
    public final C25487v f59340a;

    public C23498j(C25487v vVar) {
        C24362h.m61211f(vVar, "packageFragmentProvider");
        this.f59340a = vVar;
    }

    /* renamed from: a */
    public final C23489d mo58605a(C25065b bVar) {
        C23489d a;
        C24362h.m61211f(bVar, "classId");
        C25487v vVar = this.f59340a;
        C25066c h = bVar.mo61574h();
        C24362h.m61210e(h, "classId.packageFqName");
        Iterator it = C21100e.m49366t0(vVar, h).iterator();
        while (it.hasNext()) {
            C25486u uVar = (C25486u) it.next();
            if ((uVar instanceof C23499k) && (a = ((C23499k) uVar).mo58616l0().mo58605a(bVar)) != null) {
                return a;
            }
        }
        return null;
    }
}
