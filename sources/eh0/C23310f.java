package eh0;

import com.appboy.models.outgoing.FacebookUser;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.incremental.components.NoLookupLocation;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import ug0.C25069e;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25440f;
import zf0.C25442g;
import zf0.C25446h0;

/* renamed from: eh0.f */
public final class C23310f extends C23311g {

    /* renamed from: b */
    public final MemberScope f59111b;

    public C23310f(MemberScope memberScope) {
        C24362h.m61211f(memberScope, "workerScope");
        this.f59111b = memberScope;
    }

    /* renamed from: a */
    public final Set<C25069e> mo53530a() {
        return this.f59111b.mo53530a();
    }

    /* renamed from: d */
    public final Set<C25069e> mo53533d() {
        return this.f59111b.mo53533d();
    }

    /* renamed from: e */
    public final Collection mo53492e(C23306d dVar, C24236l lVar) {
        C23306d dVar2;
        C24362h.m61211f(dVar, "kindFilter");
        C24362h.m61211f(lVar, "nameFilter");
        int i = C23306d.f59097l & dVar.f59106b;
        if (i == 0) {
            dVar2 = null;
        } else {
            dVar2 = new C23306d(i, dVar.f59105a);
        }
        if (dVar2 == null) {
            return EmptyList.f60173b;
        }
        Collection<C25442g> e = this.f59111b.mo53492e(dVar2, lVar);
        ArrayList arrayList = new ArrayList();
        for (T next : e) {
            if (next instanceof C25440f) {
                arrayList.add(next);
            }
        }
        return arrayList;
    }

    /* renamed from: f */
    public final Set<C25069e> mo53493f() {
        return this.f59111b.mo53493f();
    }

    /* renamed from: g */
    public final C25437e mo58433g(C25069e eVar, NoLookupLocation noLookupLocation) {
        C25432c cVar;
        C24362h.m61211f(eVar, "name");
        C24362h.m61211f(noLookupLocation, FacebookUser.LOCATION_OUTER_OBJECT_KEY);
        C25437e g = this.f59111b.mo58433g(eVar, noLookupLocation);
        if (g == null) {
            return null;
        }
        if (g instanceof C25432c) {
            cVar = (C25432c) g;
        } else {
            cVar = null;
        }
        if (cVar != null) {
            return cVar;
        }
        if (g instanceof C25446h0) {
            return (C25446h0) g;
        }
        return null;
    }

    public final String toString() {
        return C24362h.m61216k(this.f59111b, "Classes from ");
    }
}
