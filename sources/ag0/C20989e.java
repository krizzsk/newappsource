package ag0;

import cf0.C21143q;
import java.util.Iterator;
import kotlin.collections.EmptyList;
import mf0.C24362h;
import nf0.C24497a;
import ug0.C25066c;

/* renamed from: ag0.e */
public interface C20989e extends Iterable<C20986c>, C24497a {

    /* renamed from: ag0.e$a */
    public static final class C20990a {

        /* renamed from: a */
        public static final C20991a f52739a = new C20991a();

        /* renamed from: ag0.e$a$a */
        public static final class C20991a implements C20989e {
            /* renamed from: b1 */
            public final boolean mo53070b1(C25066c cVar) {
                return C20992b.m49150b(this, cVar);
            }

            /* renamed from: c */
            public final C20986c mo53071c(C25066c cVar) {
                C24362h.m61211f(cVar, "fqName");
                return null;
            }

            public final boolean isEmpty() {
                return true;
            }

            public final Iterator<C20986c> iterator() {
                EmptyList.f60173b.getClass();
                return C21143q.f53000b;
            }

            public final String toString() {
                return "EMPTY";
            }
        }
    }

    /* renamed from: ag0.e$b */
    public static final class C20992b {
        /* renamed from: a */
        public static C20986c m49149a(C20989e eVar, C25066c cVar) {
            Object obj;
            C24362h.m61211f(eVar, "this");
            C24362h.m61211f(cVar, "fqName");
            Iterator it = eVar.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (C24362h.m61206a(((C20986c) obj).mo53066f(), cVar)) {
                    break;
                }
            }
            return (C20986c) obj;
        }

        /* renamed from: b */
        public static boolean m49150b(C20989e eVar, C25066c cVar) {
            C24362h.m61211f(eVar, "this");
            C24362h.m61211f(cVar, "fqName");
            return eVar.mo53071c(cVar) != null;
        }
    }

    /* renamed from: b1 */
    boolean mo53070b1(C25066c cVar);

    /* renamed from: c */
    C20986c mo53071c(C25066c cVar);

    boolean isEmpty();
}
