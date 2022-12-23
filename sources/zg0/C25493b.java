package zg0;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.builtins.C23872e;
import lf0.C24236l;
import lh0.C24307v;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25485t;

/* renamed from: zg0.b */
public class C25493b extends C25498g<List<? extends C25498g<?>>> {

    /* renamed from: b */
    public final C24236l<C25485t, C24307v> f63771b;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C25493b(List<? extends C25498g<?>> list, C24236l<? super C25485t, ? extends C24307v> lVar) {
        super(list);
        C24362h.m61211f(list, "value");
        C24362h.m61211f(lVar, "computeType");
        this.f63771b = lVar;
    }

    /* renamed from: a */
    public final C24307v mo62745a(C25485t tVar) {
        boolean z;
        C24362h.m61211f(tVar, "module");
        C24307v invoke = this.f63771b.invoke(tVar);
        if (!C23867c.m58687z(invoke)) {
            C25437e o = invoke.mo60411O0().mo53460o();
            if (o == null || C23867c.m58684s(o) == null) {
                z = false;
            } else {
                z = true;
            }
            if (!z && !C23867c.m58672C(invoke, C23872e.C23873a.f60355U.mo61589i()) && !C23867c.m58672C(invoke, C23872e.C23873a.f60356V.mo61589i()) && !C23867c.m58672C(invoke, C23872e.C23873a.f60357W.mo61589i())) {
                C23867c.m58672C(invoke, C23872e.C23873a.f60358X.mo61589i());
            }
        }
        return invoke;
    }
}
