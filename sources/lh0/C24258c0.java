package lh0;

import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.c0 */
public final class C24258c0 extends C24283m0 {

    /* renamed from: a */
    public final C24312z f61548a;

    public C24258c0(C23867c cVar) {
        C24362h.m61211f(cVar, "kotlinBuiltIns");
        this.f61548a = cVar.mo59393p();
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
        return this.f61548a;
    }
}
