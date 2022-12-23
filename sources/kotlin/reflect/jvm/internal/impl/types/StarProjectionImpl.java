package kotlin.reflect.jvm.internal.impl.types;

import bf0.C21049c;
import kotlin.C23812a;
import kotlin.LazyThreadSafetyMode;
import lh0.C24281l0;
import lh0.C24283m0;
import lh0.C24307v;
import mf0.C24362h;
import mh0.C24378d;
import zf0.C25448i0;

public final class StarProjectionImpl extends C24283m0 {

    /* renamed from: a */
    public final C25448i0 f61340a;

    /* renamed from: b */
    public final C21049c f61341b = C23812a.m58431a(LazyThreadSafetyMode.PUBLICATION, new StarProjectionImpl$_type$2(this));

    public StarProjectionImpl(C25448i0 i0Var) {
        C24362h.m61211f(i0Var, "typeParameter");
        this.f61340a = i0Var;
    }

    /* renamed from: a */
    public final boolean mo60240a() {
        return true;
    }

    /* renamed from: b */
    public final Variance mo60241b() {
        return Variance.OUT_VARIANCE;
    }

    /* renamed from: c */
    public final C24281l0 mo60242c(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    public final C24307v getType() {
        return (C24307v) this.f61341b.getValue();
    }
}
