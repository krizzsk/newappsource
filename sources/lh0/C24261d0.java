package lh0;

import java.util.ArrayList;
import java.util.List;
import mf0.C24362h;
import zf0.C25437e;
import zf0.C25448i0;

/* renamed from: lh0.d0 */
public final class C24261d0 extends C24278k0 {

    /* renamed from: c */
    public final /* synthetic */ List<C24274i0> f61551c;

    public C24261d0(ArrayList arrayList) {
        this.f61551c = arrayList;
    }

    /* renamed from: g */
    public final C24281l0 mo60418g(C24274i0 i0Var) {
        C24362h.m61211f(i0Var, LinksConfiguration.KEY_KEY);
        if (!this.f61551c.contains(i0Var)) {
            return null;
        }
        C25437e o = i0Var.mo53460o();
        if (o != null) {
            return C24299r0.m60981m((C25448i0) o);
        }
        throw new NullPointerException("null cannot be cast to non-null type org.jetbrains.kotlin.descriptors.TypeParameterDescriptor");
    }
}
