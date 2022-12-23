package lh0;

import java.util.Map;
import mf0.C24362h;

/* renamed from: lh0.j0 */
public final class C24276j0 extends C24278k0 {

    /* renamed from: c */
    public final /* synthetic */ Map<C24274i0, C24281l0> f61569c;

    /* renamed from: d */
    public final /* synthetic */ boolean f61570d;

    public C24276j0(Map<C24274i0, ? extends C24281l0> map, boolean z) {
        this.f61569c = map;
        this.f61570d = z;
    }

    /* renamed from: a */
    public final boolean mo60433a() {
        return this.f61570d;
    }

    /* renamed from: e */
    public final boolean mo60435e() {
        return this.f61569c.isEmpty();
    }

    /* renamed from: g */
    public final C24281l0 mo60418g(C24274i0 i0Var) {
        C24362h.m61211f(i0Var, LinksConfiguration.KEY_KEY);
        return this.f61569c.get(i0Var);
    }
}
