package p364al;

import java.util.Iterator;

/* renamed from: al.j */
public final class C13489j<S> implements C13488i<S> {

    /* renamed from: a */
    public final C13491k<S> f33367a;

    /* renamed from: al.j$a */
    public static class C13490a {
    }

    public C13489j(C13491k<S> kVar) {
        this.f33367a = kVar;
    }

    /* renamed from: a */
    public final void mo40393a(C13487h<S> hVar) {
        C13491k<S> kVar = this.f33367a;
        synchronized (kVar) {
            Iterator it = kVar.f33371d.iterator();
            while (it.hasNext()) {
                C13488i iVar = (C13488i) it.next();
                if (iVar != null) {
                    iVar.mo40393a(hVar);
                }
            }
            kVar.f33371d.clear();
        }
    }
}
