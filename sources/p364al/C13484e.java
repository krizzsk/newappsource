package p364al;

import je0.C23716g;
import le0.C24224b;
import p725pj.C18927b;

/* renamed from: al.e */
public final class C13484e<S> implements C23716g<C13487h<S>> {

    /* renamed from: b */
    public final C13488i<S> f33361b;

    /* renamed from: c */
    public final C13485f f33362c;

    public C13484e(C13488i<S> iVar, C13485f fVar) {
        this.f33361b = iVar;
        this.f33362c = fVar;
    }

    /* renamed from: b */
    public final void mo40396b(C24224b bVar) {
        C13485f fVar = this.f33362c;
        synchronized (fVar) {
            fVar.f33363a.put(this, bVar);
        }
    }

    public final void onError(Throwable th) {
        C13485f fVar = this.f33362c;
        synchronized (fVar) {
            fVar.f33363a.remove(this);
        }
        this.f33361b.mo40393a(new C13487h(null, new C18927b(C13484e.class, th.getMessage())));
    }

    public final void onSuccess(Object obj) {
        C13487h hVar = (C13487h) obj;
        C13485f fVar = this.f33362c;
        synchronized (fVar) {
            fVar.f33363a.remove(this);
        }
        this.f33361b.mo40393a(hVar);
    }
}
