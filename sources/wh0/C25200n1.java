package wh0;

import bf0.C21050d;
import mf0.C24368m;
import p584jl.C17885a;
import wh0.C25163c1;

/* renamed from: wh0.n1 */
public final class C25200n1<T> extends C25158b1 {

    /* renamed from: f */
    public final C25192l<T> f63475f;

    public C25200n1(C25163c1.C25164a aVar) {
        this.f63475f = aVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo61759q((Throwable) obj);
        return C21050d.f52856a;
    }

    /* renamed from: q */
    public final void mo61759q(Throwable th) {
        Object d0 = mo61758r().mo61779d0();
        if (d0 instanceof C25219u) {
            this.f63475f.resumeWith(C17885a.m44400G(((C25219u) d0).f63493a));
        } else {
            this.f63475f.resumeWith(C24368m.m61234j(d0));
        }
    }
}
