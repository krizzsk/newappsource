package mg0;

import cg0.C21174i;
import java.util.Set;
import kotlin.reflect.jvm.internal.impl.load.java.components.TypeUsage;
import kotlin.reflect.jvm.internal.impl.types.StarProjectionImpl;
import lh0.C24283m0;
import lh0.C24285n0;
import mf0.C24362h;
import p583jk.C17884p;
import p584jl.C17885a;
import ug0.C25066c;
import zf0.C25448i0;

/* renamed from: mg0.b */
public final class C24372b {

    /* renamed from: a */
    public static final C25066c f61711a = new C25066c("java.lang.Class");

    /* renamed from: a */
    public static final C24283m0 m61250a(C25448i0 i0Var, C24371a aVar) {
        C24362h.m61211f(i0Var, "typeParameter");
        C24362h.m61211f(aVar, "attr");
        if (aVar.f61706a == TypeUsage.SUPERTYPE) {
            return new C24285n0(C17885a.m44473y0(i0Var));
        }
        return new StarProjectionImpl(i0Var);
    }

    /* renamed from: b */
    public static C24371a m61251b(TypeUsage typeUsage, boolean z, C21174i iVar, int i) {
        if ((i & 1) != 0) {
            z = false;
        }
        Set set = null;
        if ((i & 2) != 0) {
            iVar = null;
        }
        C24362h.m61211f(typeUsage, "<this>");
        if (iVar != null) {
            set = C17884p.m44348S(iVar);
        }
        return new C24371a(typeUsage, z, set, 18);
    }
}
