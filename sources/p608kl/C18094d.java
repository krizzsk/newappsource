package p608kl;

import p364al.C13487h;
import p466el.C16838a;
import p490fl.C17037e;
import p586jn.C17900f;
import p610kn.C18107a;
import p725pj.C18926a;
import p770rj.C19281c;
import p870vn.C20169i;
import p870vn.C20170j;

/* renamed from: kl.d */
public final class C18094d {

    /* renamed from: a */
    public final C18092b f46255a;

    /* renamed from: b */
    public final C17037e f46256b;

    /* renamed from: c */
    public final C16838a f46257c;

    /* renamed from: d */
    public final C20169i f46258d;

    public C18094d(C18092b bVar, C17037e eVar, C16838a aVar, C20169i iVar) {
        this.f46255a = bVar;
        this.f46256b = eVar;
        this.f46257c = aVar;
        this.f46258d = iVar;
    }

    /* renamed from: a */
    public final C13487h<Void> mo50541a(String str) {
        synchronized (this.f46255a.f46253e) {
            C13487h<C18107a> a = this.f46255a.mo50540a();
            if (a.mo40399a()) {
                C13487h<Void> hVar = new C13487h<>(null, new C19281c(a.f33366b, C19281c.f49009g, "Delete failed"));
                return hVar;
            }
            C18107a aVar = (C18107a) a.f33365a;
            if (aVar != null) {
                if (aVar.f46300a.equals(str)) {
                    C13487h<C17900f> a2 = this.f46256b.mo49646a();
                    if (a2.mo40399a()) {
                        C13487h<Void> hVar2 = new C13487h<>(null, new C19281c(a2.f33366b, C19281c.f49009g, "Delete failed"));
                        return hVar2;
                    }
                    C17900f fVar = (C17900f) a2.f33365a;
                    C13487h<Void> a3 = this.f46257c.mo49502a();
                    if (a3.mo40399a()) {
                        C13487h<Void> hVar3 = new C13487h<>(null, a3.f33366b);
                        return hVar3;
                    }
                    this.f46258d.mo52410a(new C20170j(fVar));
                    C13487h<Void> hVar4 = new C13487h<>(null, (C18926a) null);
                    return hVar4;
                }
            }
            C13487h<Void> hVar5 = new C13487h<>(null, (C18926a) null);
            return hVar5;
        }
    }
}
