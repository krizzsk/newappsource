package yg0;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lh0.C24274i0;
import lh0.C24281l0;
import lh0.C24289p;
import lh0.C24306u0;
import lh0.C24307v;
import lh0.C24312z;
import mf0.C24362h;
import mh0.C24378d;
import oh0.C24613b;

/* renamed from: yg0.a */
public final class C25301a extends C24312z implements C24613b {

    /* renamed from: c */
    public final C24281l0 f63604c;

    /* renamed from: d */
    public final C25302b f63605d;

    /* renamed from: e */
    public final boolean f63606e;

    /* renamed from: f */
    public final C20989e f63607f;

    public C25301a(C24281l0 l0Var, C25302b bVar, boolean z, C20989e eVar) {
        C24362h.m61211f(l0Var, "typeProjection");
        C24362h.m61211f(bVar, "constructor");
        C24362h.m61211f(eVar, "annotations");
        this.f63604c = l0Var;
        this.f63605d = bVar;
        this.f63606e = z;
        this.f63607f = eVar;
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return EmptyList.f60173b;
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return this.f63605d;
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return this.f63606e;
    }

    /* renamed from: Q0 */
    public final C24307v mo59558Q0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24281l0 c = this.f63604c.mo60242c(dVar);
        C24362h.m61210e(c, "typeProjection.refine(kotlinTypeRefiner)");
        return new C25301a(c, this.f63605d, this.f63606e, this.f63607f);
    }

    /* renamed from: S0 */
    public final C24306u0 mo59559S0(boolean z) {
        if (z == this.f63606e) {
            return this;
        }
        return new C25301a(this.f63604c, this.f63605d, z, this.f63607f);
    }

    /* renamed from: T0 */
    public final C24306u0 mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        C24281l0 c = this.f63604c.mo60242c(dVar);
        C24362h.m61210e(c, "typeProjection.refine(kotlinTypeRefiner)");
        return new C25301a(c, this.f63605d, this.f63606e, this.f63607f);
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return new C25301a(this.f63604c, this.f63605d, this.f63606e, eVar);
    }

    /* renamed from: V0 */
    public final C24312z mo60403V0(boolean z) {
        if (z == this.f63606e) {
            return this;
        }
        return new C25301a(this.f63604c, this.f63605d, z, this.f63607f);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return new C25301a(this.f63604c, this.f63605d, this.f63606e, eVar);
    }

    public final C20989e getAnnotations() {
        return this.f63607f;
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return C24289p.m60913c("No member resolution should be done on captured type, it used only during constraint system resolution", true);
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Captured(");
        k.append(this.f63604c);
        k.append(')');
        if (this.f63606e) {
            str = "?";
        } else {
            str = "";
        }
        k.append(str);
        return k.toString();
    }
}
