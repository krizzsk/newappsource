package lh0;

import java.util.List;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.t0 */
public final class C24304t0 extends C24286o {

    /* renamed from: h */
    public final String f61603h;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24304t0(String str, List list, MemberScope memberScope, C24274i0 i0Var, boolean z) {
        super(i0Var, memberScope, list, z, 16);
        C24362h.m61211f(str, "presentableName");
        C24362h.m61211f(i0Var, "constructor");
        C24362h.m61211f(memberScope, "memberScope");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        this.f61603h = str;
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

    /* renamed from: V0 */
    public final C24312z mo59559S0(boolean z) {
        String str = this.f61603h;
        C24274i0 i0Var = this.f61579c;
        return new C24304t0(str, this.f61581e, this.f61580d, i0Var, z);
    }

    /* renamed from: X0 */
    public final String mo60443X0() {
        return this.f61603h;
    }

    /* renamed from: Y0 */
    public final C24286o mo60444Y0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }
}
