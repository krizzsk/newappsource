package lh0;

import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import mf0.C24362h;

/* renamed from: lh0.e0 */
public final class C24263e0 extends C24257c {

    /* renamed from: f */
    public final C24274i0 f61553f;

    /* renamed from: g */
    public final MemberScope f61554g;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C24263e0(C24274i0 i0Var, boolean z, C24274i0 i0Var2) {
        super(i0Var, z);
        C24362h.m61211f(i0Var, "originalTypeVariable");
        C24362h.m61211f(i0Var2, "constructor");
        this.f61553f = i0Var2;
        this.f61554g = i0Var.mo53458m().mo59383f().mo59564o();
    }

    /* renamed from: O0 */
    public final C24274i0 mo60411O0() {
        return this.f61553f;
    }

    /* renamed from: X0 */
    public final C24263e0 mo60417X0(boolean z) {
        return new C24263e0(this.f61545c, z, this.f61553f);
    }

    /* renamed from: o */
    public final MemberScope mo59564o() {
        return this.f61554g;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Stub (BI): ");
        k.append(this.f61545c);
        if (this.f61546d) {
            str = "?";
        } else {
            str = "";
        }
        k.append(str);
        return k.toString();
    }
}
