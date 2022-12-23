package wh0;

import p001a0.C0017h;

/* renamed from: wh0.n0 */
public final class C25199n0 implements C25217t0 {

    /* renamed from: b */
    public final boolean f63474b;

    public C25199n0(boolean z) {
        this.f63474b = z;
    }

    /* renamed from: d */
    public final C25182h1 mo61756d() {
        return null;
    }

    public final boolean isActive() {
        return this.f63474b;
    }

    public final String toString() {
        String str;
        StringBuilder k = C13555b.m33972k("Empty{");
        if (this.f63474b) {
            str = "Active";
        } else {
            str = "New";
        }
        return C0017h.m57N(k, str, '}');
    }
}
