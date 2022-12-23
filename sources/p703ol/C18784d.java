package p703ol;

import p364al.C13483d;
import p364al.C13487h;
import p610kn.C18108b;
import p725pj.C18926a;
import p794sj.C19466c;

/* renamed from: ol.d */
public final class C18784d implements C13483d<C18108b> {

    /* renamed from: a */
    public final C18781a f47811a;

    /* renamed from: b */
    public final C18782b f47812b;

    public C18784d(C18781a aVar, C18782b bVar) {
        this.f47811a = aVar;
        this.f47812b = bVar;
    }

    /* renamed from: C */
    public final C13487h<C18108b> mo40394C() {
        C13487h<String> a = this.f47811a.mo51264a();
        if (a.mo40399a()) {
            return new C13487h<>(null, new C19466c(a.f33366b));
        }
        C13487h<String> C = this.f47812b.mo40394C();
        if (C.mo40399a()) {
            return new C13487h<>(null, new C19466c(C.f33366b));
        }
        String str = (String) a.f33365a;
        if (str == null) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(new C18108b(str, (String) C.f33365a), (C18926a) null);
    }
}
