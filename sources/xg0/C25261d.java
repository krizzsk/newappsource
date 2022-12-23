package xg0;

import kotlin.reflect.jvm.internal.impl.descriptors.C23900c;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import ug0.C25066c;
import ug0.C25069e;
import zf0.C25429a0;
import zf0.C25432c;
import zf0.C25437e;
import zf0.C25442g;
import zf0.C25454l0;
import zf0.C25481p;
import zf0.C25491z;

/* renamed from: xg0.d */
public final class C25261d {

    /* renamed from: a */
    public static final /* synthetic */ int f63537a = 0;

    static {
        new C25066c("kotlin.jvm.JvmInline");
    }

    /* renamed from: a */
    public static final boolean m63406a(C23900c cVar) {
        C24362h.m61211f(cVar, "<this>");
        if (cVar instanceof C25429a0) {
            C25491z Y = ((C25429a0) cVar).mo53426Y();
            C24362h.m61210e(Y, "correspondingProperty");
            if (m63409d(Y)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: b */
    public static final boolean m63407b(C25442g gVar) {
        C24362h.m61211f(gVar, "<this>");
        if (gVar instanceof C25432c) {
            C25432c cVar = (C25432c) gVar;
            if (cVar.mo53519w() || cVar.mo53512o0()) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: c */
    public static final boolean m63408c(C24307v vVar) {
        C25437e o = vVar.mo60411O0().mo53460o();
        if (o == null) {
            return false;
        }
        return m63407b(o);
    }

    /* renamed from: d */
    public static final boolean m63409d(C25454l0 l0Var) {
        C25432c cVar;
        C25481p<C24312z> v;
        if (l0Var.mo53423R() == null) {
            C25442g b = l0Var.mo53399b();
            C25069e eVar = null;
            if (b instanceof C25432c) {
                cVar = (C25432c) b;
            } else {
                cVar = null;
            }
            if (!(cVar == null || (v = cVar.mo53518v()) == null)) {
                eVar = v.f63768a;
            }
            if (C24362h.m61206a(eVar, l0Var.getName())) {
                return true;
            }
        }
        return false;
    }
}
