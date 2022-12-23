package wh0;

import bf0.C21050d;
import lf0.C24236l;

/* renamed from: wh0.v0 */
public final class C25223v0 extends C25183i {

    /* renamed from: b */
    public final C24236l<Throwable, C21050d> f63498b;

    public C25223v0(C24236l<? super Throwable, C21050d> lVar) {
        this.f63498b = lVar;
    }

    /* renamed from: a */
    public final void mo60339a(Throwable th) {
        this.f63498b.invoke(th);
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo60339a((Throwable) obj);
        return C21050d.f52856a;
    }

    public final String toString() {
        StringBuilder k = C13555b.m33972k("InvokeOnCancel[");
        k.append(this.f63498b.getClass().getSimpleName());
        k.append('@');
        k.append(C25154a0.m63137b(this));
        k.append(']');
        return k.toString();
    }
}
