package eg0;

import fg0.C23376t;
import hg0.C23465g;
import kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure.C23912a;
import mf0.C24361g;
import mf0.C24362h;
import ug0.C25065b;
import ug0.C25066c;
import uh0.C25081h;

/* renamed from: eg0.c */
public final class C23292c implements C23465g {

    /* renamed from: a */
    public final ClassLoader f59073a;

    public C23292c(ClassLoader classLoader) {
        this.f59073a = classLoader;
    }

    /* renamed from: a */
    public final C23376t mo58415a(C25066c cVar) {
        C24362h.m61211f(cVar, "fqName");
        return new C23376t(cVar);
    }

    /* renamed from: b */
    public final void mo58416b(C25066c cVar) {
        C24362h.m61211f(cVar, "packageFqName");
    }

    /* renamed from: c */
    public final C23912a mo58417c(C23465g.C23466a aVar) {
        C25065b bVar = aVar.f59247a;
        C25066c h = bVar.mo61574h();
        C24362h.m61210e(h, "classId.packageFqName");
        String b = bVar.mo61576i().mo61580b();
        C24362h.m61210e(b, "classId.relativeClassName.asString()");
        String E = C25081h.m62834E(b, '.', '$');
        if (!h.mo61582d()) {
            E = h.mo61580b() + '.' + E;
        }
        Class t0 = C24361g.m61188t0(this.f59073a, E);
        if (t0 != null) {
            return new C23912a(t0);
        }
        return null;
    }
}
