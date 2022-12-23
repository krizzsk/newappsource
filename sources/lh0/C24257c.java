package lh0;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.c */
public abstract class C24257c extends C24312z {

    /* renamed from: c */
    public final C24274i0 f61545c;

    /* renamed from: d */
    public final boolean f61546d;

    /* renamed from: e */
    public final MemberScope f61547e;

    public C24257c(C24274i0 i0Var, boolean z) {
        C24362h.m61211f(i0Var, "originalTypeVariable");
        this.f61545c = i0Var;
        this.f61546d = z;
        this.f61547e = C24289p.m60912b(C24362h.m61216k(i0Var, "Scope for stub type: "));
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return EmptyList.f60173b;
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return this.f61546d;
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return this;
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z == this.f61546d) {
            return this;
        }
        return mo60417X0(z);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return this;
    }

    /* renamed from: X0 */
    public abstract C24263e0 mo60417X0(boolean z);

    public final C20989e getAnnotations() {
        return C20989e.C20990a.f52739a;
    }

    /* renamed from: o */
    public MemberScope mo59564o() {
        return this.f61547e;
    }
}
