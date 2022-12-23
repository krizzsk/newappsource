package wh0;

import bf0.C21050d;
import bi0.C21066e;

/* renamed from: wh0.n */
public final class C25198n extends C25236z0 {

    /* renamed from: f */
    public final C25192l<?> f63473f;

    public C25198n(C25192l<?> lVar) {
        this.f63473f = lVar;
    }

    public final /* bridge */ /* synthetic */ Object invoke(Object obj) {
        mo61759q((Throwable) obj);
        return C21050d.f52856a;
    }

    /* renamed from: q */
    public final void mo61759q(Throwable th) {
        boolean z;
        C25192l<?> lVar = this.f63473f;
        Throwable r = lVar.mo61796r(mo61758r());
        if (!lVar.mo61839w()) {
            z = false;
        } else {
            z = ((C21066e) lVar.f63466e).mo53199o(r);
        }
        if (!z) {
            lVar.mo61824m(r);
            if (!lVar.mo61839w()) {
                lVar.mo61832p();
            }
        }
    }
}
