package lh0;

import ag0.C20989e;
import java.util.List;
import kotlin.collections.C23825c;
import kotlin.collections.EmptyList;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import lf0.C24236l;
import mf0.C24362h;
import mh0.C24378d;

/* renamed from: lh0.o */
public class C24286o extends C24312z {

    /* renamed from: c */
    public final C24274i0 f61579c;

    /* renamed from: d */
    public final MemberScope f61580d;

    /* renamed from: e */
    public final List<C24281l0> f61581e;

    /* renamed from: f */
    public final boolean f61582f;

    /* renamed from: g */
    public final String f61583g;

    public C24286o() {
        throw null;
    }

    public C24286o(C24274i0 i0Var, MemberScope memberScope) {
        this(i0Var, memberScope, (List) null, false, 28);
    }

    public C24286o(C24274i0 i0Var, MemberScope memberScope, List<C24281l0> list, boolean z, int i) {
        list = (i & 4) != 0 ? EmptyList.f60173b : list;
        z = (i & 8) != 0 ? false : z;
        String str = (i & 16) != 0 ? "???" : null;
        C24362h.m61211f(i0Var, "constructor");
        C24362h.m61211f(memberScope, "memberScope");
        C24362h.m61211f(list, WidgetMessageParser.KEY_ARGUMENTS);
        C24362h.m61211f(str, "presentableName");
        this.f61579c = i0Var;
        this.f61580d = memberScope;
        this.f61581e = list;
        this.f61582f = z;
        this.f61583g = str;
    }

    /* renamed from: N0 */
    public final List<C24281l0> mo60410N0() {
        return this.f61581e;
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return this.f61579c;
    }

    /* renamed from: P0 */
    public final boolean mo60412P0() {
        return this.f61582f;
    }

    /* renamed from: U0 */
    public final C24306u0 mo59561U0(C20989e eVar) {
        return this;
    }

    /* renamed from: V0 */
    public C24312z mo60403V0(boolean z) {
        return new C24286o(this.f61579c, this.f61580d, this.f61581e, z, 16);
    }

    /* renamed from: W0 */
    public final C24312z mo60404W0(C20989e eVar) {
        C24362h.m61211f(eVar, "newAnnotations");
        return this;
    }

    /* renamed from: X0 */
    public String mo60443X0() {
        return this.f61583g;
    }

    /* renamed from: Y0 */
    public C24286o mo59560T0(C24378d dVar) {
        C24362h.m61211f(dVar, "kotlinTypeRefiner");
        return this;
    }

    public final C20989e getAnnotations() {
        return C20989e.C20990a.f52739a;
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return this.f61580d;
    }

    public final String toString() {
        String str;
        StringBuilder sb = new StringBuilder();
        sb.append(this.f61579c);
        if (this.f61581e.isEmpty()) {
            str = "";
        } else {
            str = C23825c.m58519p0(this.f61581e, ", ", "<", ">", -1, "...", (C24236l) null);
        }
        sb.append(str);
        return sb.toString();
    }
}
