package lh0;

import ag0.C20989e;
import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import lh0.C24289p;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.a0 */
public final class C24254a0 extends C24312z {

    /* renamed from: c */
    public final C24274i0 f61538c;

    /* renamed from: d */
    public final List<C24281l0> f61539d;

    /* renamed from: e */
    public final boolean f61540e;

    /* renamed from: f */
    public final MemberScope f61541f;

    /* renamed from: g */
    public final C24236l<C24378d, C24312z> f61542g;

    public C24254a0(C24274i0 i0Var, List<? extends C24281l0> list, boolean z, MemberScope memberScope, C24236l<? super C24378d, ? extends C24312z> lVar) {
        C24362h.m61211f(i0Var, "constructor");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(memberScope, "memberScope");
        C24362h.m61211f(lVar, "refinedTypeFactory");
        this.f61538c = i0Var;
        this.f61539d = list;
        this.f61540e = z;
        this.f61541f = memberScope;
        this.f61542g = lVar;
        if (memberScope instanceof C24289p.C24292c) {
            throw new IllegalStateException("SimpleTypeImpl should not be created for error type: " + memberScope + 10 + i0Var);
        }
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return this.f61539d;
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return this.f61538c;
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return this.f61540e;
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24312z invoke = this.f61542g.invoke(dVar);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24312z invoke = this.f61542g.invoke(dVar);
        if (invoke == null) {
            return this;
        }
        return invoke;
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z == this.f61540e) {
            return this;
        }
        if (z) {
            return new C24310x(this);
        }
        return new C24309w(this);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        if (eVar.isEmpty()) {
            return this;
        }
        return new C24262e(this, eVar);
    }

    public final C20989e getAnnotations() {
        return C20989e.C20990a.f52739a;
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return this.f61541f;
    }
}
