package p988j$.time.chrono;

import p988j$.time.C25782a;
import p988j$.time.C25829q;
import p988j$.time.temporal.C25830a;
import p988j$.time.temporal.C25841l;
import p988j$.time.temporal.C25842m;
import p988j$.time.temporal.C25844o;
import p988j$.time.temporal.C25847r;

/* renamed from: j$.time.chrono.d */
public abstract /* synthetic */ class C25788d {
    /* renamed from: a */
    public static int m64416a(C25790f fVar, C25842m mVar) {
        if (!(mVar instanceof C25830a)) {
            return C25782a.m64407b(fVar, mVar);
        }
        int i = C25789e.f64329a[((C25830a) mVar).ordinal()];
        if (i != 1) {
            C25829q qVar = (C25829q) fVar;
            return i != 2 ? qVar.mo83762p().mo83601b(mVar) : qVar.mo83759j().mo83654j();
        }
        throw new C25847r("Invalid field 'InstantSeconds' for get() method, use getLong() instead");
    }

    /* renamed from: b */
    public static C25791g m64417b(C25841l lVar) {
        if (lVar != null) {
            C25791g gVar = (C25791g) lVar.mo83606h(C25844o.m64619a());
            return gVar != null ? gVar : C25792h.f64330a;
        }
        throw new NullPointerException("temporal");
    }
}
