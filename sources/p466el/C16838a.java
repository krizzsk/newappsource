package p466el;

import ce0.C21100e;
import p364al.C13487h;
import p389bl.C13639e;
import p413co.C13868n;
import p413co.C13872r;
import p608kl.C18092b;
import p725pj.C18926a;
import p751qm.C19141a;
import p770rj.C19281c;

/* renamed from: el.a */
public final class C16838a {

    /* renamed from: a */
    public final C13868n f43822a;

    /* renamed from: b */
    public final C19141a f43823b;

    /* renamed from: c */
    public final C13639e f43824c;

    /* renamed from: d */
    public final C18092b f43825d;

    public C16838a(C13868n nVar, C19141a aVar, C13639e eVar, C18092b bVar) {
        this.f43822a = nVar;
        this.f43823b = aVar;
        this.f43824c = eVar;
        this.f43825d = bVar;
    }

    /* renamed from: b */
    public static C13487h m42630b(C18926a aVar) {
        return new C13487h(null, new C19281c(aVar, C19281c.f49009g, "Delete failed"));
    }

    /* renamed from: a */
    public final C13487h<Void> mo49502a() {
        C13487h e;
        C13487h<Void> C = this.f43823b.mo40394C();
        if (C.mo40399a()) {
            return m42630b(C.f33366b);
        }
        C13487h<Void> a = this.f43824c.mo40523a();
        if (a.mo40399a()) {
            return m42630b(a.f33366b);
        }
        synchronized (this.f43825d.f46253e) {
            C13872r<Void> a2 = this.f43822a.mo40784a(C21100e.m49327V(), "account.txt");
            if (a2.mo40817a()) {
                C13487h<Void> b = m42630b(a2.f34120b);
                return b;
            }
            C18092b bVar = this.f43825d;
            synchronized (bVar.f46253e) {
                e = bVar.f46252d.mo42865e();
                if (!e.mo40399a()) {
                    bVar.f46254f = null;
                }
            }
            if (e.mo40399a()) {
                C13487h<Void> b2 = m42630b(e.f33366b);
                return b2;
            }
            C13487h<Void> hVar = new C13487h<>(null, (C18926a) null);
            return hVar;
        }
    }
}
