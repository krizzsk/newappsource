package p585jm;

import java.util.HashMap;
import mf0.C24362h;
import p434dd.C16545c;
import p469eo.C16846b;
import p493fo.C17048b;
import p609km.C18102f;

/* renamed from: jm.b */
public final class C17888b extends C17048b {

    /* renamed from: c */
    public final String f45895c;

    /* renamed from: d */
    public final String f45896d;

    public C17888b(String str, String str2) {
        C24362h.m61211f(str2, "brandName");
        this.f45895c = str;
        this.f45896d = str2;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C24362h.m61211f(bVar, "serviceLocator");
        C17892f fVar = new C17892f();
        C17891e eVar = new C17891e(this.f45895c, this.f45896d, fVar);
        C17894h hVar = new C17894h(eVar);
        C17890d dVar = new C17890d(hVar);
        Object a = bVar.mo49505a(C17889c.class, (String) null);
        C24362h.m61210e(a, "serviceLocator.get(FinaliseOrderJob::class.java)");
        C17887a aVar = new C17887a((C17889c) a, dVar);
        Object a2 = bVar.mo49505a(C18102f.class, (String) null);
        C24362h.m61210e(a2, "serviceLocator.get(GetFi…rByIdUseCase::class.java)");
        C16545c cVar = new C16545c((C18102f) a2, dVar);
        C17048b.m42897b(hashMap, fVar, C17892f.class, (String) null);
        C17048b.m42897b(hashMap, eVar, C17891e.class, (String) null);
        C17048b.m42897b(hashMap, hVar, C17894h.class, (String) null);
        C17048b.m42897b(hashMap, aVar, C17887a.class, (String) null);
        C17048b.m42897b(hashMap, cVar, C16545c.class, (String) null);
    }
}
