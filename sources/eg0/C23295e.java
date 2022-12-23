package eg0;

import eg0.C23293d;
import ih0.C23603a;
import ih0.C23606c;
import java.io.InputStream;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import mf0.C24361g;
import mf0.C24362h;
import og0.C24592g;
import qg0.C24753j;
import ug0.C25065b;
import ug0.C25066c;
import uh0.C25081h;

/* renamed from: eg0.e */
public final class C23295e implements C24753j {

    /* renamed from: a */
    public final ClassLoader f59076a;

    /* renamed from: b */
    public final C23606c f59077b = new C23606c();

    public C23295e(ClassLoader classLoader) {
        this.f59076a = classLoader;
    }

    /* renamed from: a */
    public final InputStream mo58426a(C25066c cVar) {
        C24362h.m61211f(cVar, "packageFqName");
        if (!cVar.mo61587h(C23872e.f60329h)) {
            return null;
        }
        C23606c cVar2 = this.f59077b;
        C23603a.f59679m.getClass();
        String a = C23603a.m57789a(cVar);
        cVar2.getClass();
        return C23606c.m57791a(a);
    }

    /* renamed from: b */
    public final C24753j.C24754a.C24756b mo58427b(C24592g gVar) {
        C24362h.m61211f(gVar, "javaClass");
        C25066c f = gVar.mo59474f();
        if (f == null) {
            return null;
        }
        String b = f.mo61580b();
        C24362h.m61210e(b, "javaClass.fqName?.asString() ?: return null");
        return mo58429d(b);
    }

    /* renamed from: c */
    public final C24753j.C24754a mo58428c(C25065b bVar) {
        C24362h.m61211f(bVar, "classId");
        String b = bVar.mo61576i().mo61580b();
        C24362h.m61210e(b, "relativeClassName.asString()");
        String E = C25081h.m62834E(b, '.', '$');
        if (!bVar.mo61574h().mo61582d()) {
            E = bVar.mo61574h() + '.' + E;
        }
        return mo58429d(E);
    }

    /* renamed from: d */
    public final C24753j.C24754a.C24756b mo58429d(String str) {
        C23293d a;
        Class t0 = C24361g.m61188t0(this.f59076a, str);
        if (t0 == null || (a = C23293d.C23294a.m57365a(t0)) == null) {
            return null;
        }
        return new C24753j.C24754a.C24756b(a);
    }
}
