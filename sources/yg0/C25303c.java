package yg0;

import java.util.Collection;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.builtins.C23867c;
import kotlin.reflect.jvm.internal.impl.types.Variance;
import kotlin.reflect.jvm.internal.impl.types.checker.NewCapturedTypeConstructor;
import lh0.C24281l0;
import lh0.C24307v;
import mf0.C24362h;
import p583jk.C17875h;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: yg0.c */
public final class C25303c implements C25302b {

    /* renamed from: a */
    public final C24281l0 f63608a;

    /* renamed from: b */
    public NewCapturedTypeConstructor f63609b;

    public C25303c(C24281l0 l0Var) {
        C24362h.m61211f(l0Var, "projection");
        this.f63608a = l0Var;
        l0Var.mo60241b();
        Variance variance = Variance.INVARIANT;
    }

    public final List<C25448i0> getParameters() {
        return EmptyList.f60173b;
    }

    public final C24281l0 getProjection() {
        return this.f63608a;
    }

    /* renamed from: m */
    public final C23867c mo53458m() {
        C23867c m = this.f63608a.getType().mo60411O0().mo53458m();
        C24362h.m61210e(m, "projection.type.constructor.builtIns");
        return m;
    }

    /* renamed from: n */
    public final Collection<C24307v> mo53459n() {
        Object obj;
        if (this.f63608a.mo60241b() == Variance.OUT_VARIANCE) {
            obj = this.f63608a.getType();
        } else {
            obj = mo53458m().mo59393p();
        }
        C24362h.m61210e(obj, "if (projection.projectio… builtIns.nullableAnyType");
        return C17875h.m44280D(obj);
    }

    /* renamed from: o */
    public final /* bridge */ /* synthetic */ C25437e mo53460o() {
        return null;
    }

    /* renamed from: p */
    public final boolean mo53461p() {
        return false;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("CapturedTypeConstructor(");
        k.append(this.f63608a);
        k.append(')');
        return k.toString();
    }
}
