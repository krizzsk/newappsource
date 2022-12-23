package lh0;

import ag0.C20989e;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mf0.C24362h;

/* renamed from: lh0.m */
public final class C24282m extends C24287o0 {

    /* renamed from: d */
    public static final /* synthetic */ int f61573d = 0;

    /* renamed from: b */
    public final C24287o0 f61574b;

    /* renamed from: c */
    public final C24287o0 f61575c;

    public C24282m(C24287o0 o0Var, C24287o0 o0Var2) {
        this.f61574b = o0Var;
        this.f61575c = o0Var2;
    }

    /* renamed from: a */
    public final boolean mo60433a() {
        return this.f61574b.mo60433a() || this.f61575c.mo60433a();
    }

    /* renamed from: b */
    public final boolean mo60439b() {
        return this.f61574b.mo60439b() || this.f61575c.mo60439b();
    }

    /* renamed from: c */
    public final C20989e mo60434c(C20989e eVar) {
        C24362h.m61211f(eVar, "annotations");
        return this.f61575c.mo60434c(this.f61574b.mo60434c(eVar));
    }

    /* renamed from: d */
    public final C24281l0 mo59555d(C24307v vVar) {
        C24281l0 d = this.f61574b.mo59555d(vVar);
        return d == null ? this.f61575c.mo59555d(vVar) : d;
    }

    /* renamed from: f */
    public final C24307v mo60436f(C24307v vVar, Variance variance) {
        C24362h.m61211f(vVar, "topLevelType");
        C24362h.m61211f(variance, "position");
        return this.f61575c.mo60436f(this.f61574b.mo60436f(vVar, variance), variance);
    }
}
