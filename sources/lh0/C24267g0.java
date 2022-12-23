package lh0;

import cf0.C21136j;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.collections.C23825c;
import kotlin.collections.C23826d;
import mf0.C24362h;
import zf0.C25446h0;
import zf0.C25448i0;

/* renamed from: lh0.g0 */
public final class C24267g0 {

    /* renamed from: a */
    public final C24267g0 f61561a;

    /* renamed from: b */
    public final C25446h0 f61562b;

    /* renamed from: c */
    public final List<C24281l0> f61563c;

    /* renamed from: d */
    public final Map<C25448i0, C24281l0> f61564d;

    /* renamed from: lh0.g0$a */
    public static final class C24268a {
        /* renamed from: a */
        public static C24267g0 m60826a(C24267g0 g0Var, C25446h0 h0Var, List list) {
            C24362h.m61211f(h0Var, "typeAliasDescriptor");
            C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
            List<C25448i0> parameters = h0Var.mo53481j().getParameters();
            C24362h.m61210e(parameters, "typeAliasDescriptor.typeConstructor.parameters");
            ArrayList arrayList = new ArrayList(C21136j.m49436X(parameters, 10));
            for (C25448i0 a : parameters) {
                arrayList.add(a.mo53407a());
            }
            return new C24267g0(g0Var, h0Var, list, C23826d.m58536a0(C23825c.m58505Q0(arrayList, list)));
        }
    }

    public C24267g0(C24267g0 g0Var, C25446h0 h0Var, List list, Map map) {
        this.f61561a = g0Var;
        this.f61562b = h0Var;
        this.f61563c = list;
        this.f61564d = map;
    }

    /* renamed from: a */
    public final boolean mo60426a(C25446h0 h0Var) {
        C24362h.m61211f(h0Var, "descriptor");
        if (!C24362h.m61206a(this.f61562b, h0Var)) {
            C24267g0 g0Var = this.f61561a;
            return g0Var == null ? false : g0Var.mo60426a(h0Var);
        }
    }
}
