package wh0;

import bf0.C21050d;

/* renamed from: wh0.l0 */
public final class C25193l0 extends C25183i {

    /* renamed from: b */
    public final C25190k0 f63469b;

    public C25193l0(C25190k0 k0Var) {
        this.f63469b = k0Var;
    }

    /* renamed from: a */
    public final void mo60339a(Throwable th) {
        this.f63469b.dispose();
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo60339a((Throwable) obj);
        return C21050d.f52856a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("DisposeOnCancel[");
        k.append(this.f63469b);
        k.append(']');
        return k.toString();
    }
}
