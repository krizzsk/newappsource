package lh0;

import ag0.C20989e;
import ce0.C21100e;
import cg0.C21180k0;
import com.google.android.play.core.appupdate.C14226d;
import kotlin.reflect.jvm.internal.impl.types.TypeCheckerState;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypePreparator;
import mf0.C24362h;
import mh0.C24378d;
import mh0.C24381f;
import mh0.C24385i;
import oh0.C24614c;
import p389bl.C13637c;
import p583jk.C17875h;
import p845um.C19958a;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: lh0.i */
public final class C24272i extends C24277k implements C24269h, C24614c {

    /* renamed from: c */
    public final C24312z f61566c;

    /* renamed from: d */
    public final boolean f61567d;

    /* renamed from: lh0.i$a */
    public static final class C24273a {
        /* renamed from: a */
        public static C24272i m60845a(C24306u0 u0Var, boolean z) {
            boolean z2;
            C21180k0 k0Var;
            C24362h.m61211f(u0Var, "type");
            if (u0Var instanceof C24272i) {
                return (C24272i) u0Var;
            }
            boolean z3 = false;
            if ((u0Var.mo60411O0() instanceof C24385i) || (u0Var.mo60411O0().mo53460o() instanceof C25448i0) || (u0Var instanceof C24381f) || (u0Var instanceof C24263e0)) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                if (u0Var instanceof C24263e0) {
                    z3 = C24299r0.m60975g(u0Var);
                } else {
                    C25437e o = u0Var.mo60411O0().mo53460o();
                    if (o instanceof C21180k0) {
                        k0Var = (C21180k0) o;
                    } else {
                        k0Var = null;
                    }
                    if (k0Var != null && !k0Var.f53087n) {
                        z3 = true;
                    }
                    if (z3) {
                        z3 = true;
                    } else if (!z || !(u0Var.mo60411O0().mo53460o() instanceof C25448i0)) {
                        z3 = !C13637c.m34081x(C17875h.m44309t(false, true, C14226d.f35756k, (KotlinTypePreparator) null, (C24378d) null, 24), C21100e.m49358p0(u0Var), TypeCheckerState.C24156a.C24158b.f61350a);
                    } else {
                        z3 = C24299r0.m60975g(u0Var);
                    }
                }
            }
            if (!z3) {
                return null;
            }
            if (u0Var instanceof C24298r) {
                C24298r rVar = (C24298r) u0Var;
                C24362h.m61206a(rVar.f61594c.mo60411O0(), rVar.f61595d.mo60411O0());
            }
            return new C24272i(C21100e.m49358p0(u0Var), z);
        }
    }

    public C24272i(C24312z zVar, boolean z) {
        this.f61566c = zVar;
        this.f61567d = z;
    }

    /* renamed from: A */
    public final boolean mo60427A() {
        if ((this.f61566c.mo60411O0() instanceof C24385i) || (this.f61566c.mo60411O0().mo53460o() instanceof C25448i0)) {
            return true;
        }
        return false;
    }

    /* renamed from: C */
    public final C24306u0 mo60428C(C24307v vVar) {
        C24362h.m61211f(vVar, "replacement");
        return C19958a.m47436k(vVar.mo60450R0(), this.f61567d);
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return false;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C24272i(this.f61566c.mo59561U0(eVar), this.f61567d);
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z) {
            return this.f61566c.mo59559S0(z);
        }
        return this;
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return new C24272i(this.f61566c.mo59561U0(eVar), this.f61567d);
    }

    /* renamed from: X0 */
    public final C24312z mo60405X0() {
        return this.f61566c;
    }

    /* renamed from: Z0 */
    public final C24277k mo60407Z0(C24312z zVar) {
        C24362h.m61211f(zVar, "delegate");
        return new C24272i(zVar, this.f61567d);
    }

    public final String toString() {
        return this.f61566c + " & Any";
    }
}
