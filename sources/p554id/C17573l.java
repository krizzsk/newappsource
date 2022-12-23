package p554id;

/* renamed from: id.l */
public final class C17573l {

    /* renamed from: a */
    public final C17576o f45196a = new C17576o();

    /* renamed from: a */
    public final void mo50024a(Exception exc) {
        C17576o oVar = this.f45196a;
        synchronized (oVar.f45198a) {
            if (!oVar.f45200c) {
                oVar.f45200c = true;
                oVar.f45202e = exc;
                oVar.f45199b.mo50023b(oVar);
            }
        }
    }

    /* renamed from: b */
    public final void mo50025b(Object obj) {
        C17576o oVar = this.f45196a;
        synchronized (oVar.f45198a) {
            if (!oVar.f45200c) {
                oVar.f45200c = true;
                oVar.f45201d = obj;
                oVar.f45199b.mo50023b(oVar);
            }
        }
    }
}
