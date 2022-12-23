package p751qm;

import ce0.C21100e;
import p364al.C13483d;
import p364al.C13487h;
import p413co.C13868n;
import p413co.C13872r;
import p441dk.C16672a;
import p725pj.C18926a;

/* renamed from: qm.a */
public final class C19141a implements C13483d<Void> {

    /* renamed from: a */
    public final C13868n f48666a;

    public C19141a(C13868n nVar) {
        this.f48666a = nVar;
    }

    /* renamed from: C */
    public final C13487h<Void> mo40394C() {
        C13872r<Void> f = this.f48666a.mo40789f(C21100e.m49347j0());
        if (!f.mo40817a()) {
            return new C13487h<>(null, (C18926a) null);
        }
        return new C13487h<>(null, new C16672a(f.f34120b, C16672a.f43405h, "Deleting ticket from local file storage failed"));
    }
}
