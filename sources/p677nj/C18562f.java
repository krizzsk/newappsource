package p677nj;

import java.util.HashMap;
import p469eo.C16846b;
import p493fo.C17048b;
import p583jk.C17876i;
import p677nj.C18563g;
import p918xn.C20542a;

/* renamed from: nj.f */
public final class C18562f extends C17048b {

    /* renamed from: c */
    public C18563g.C18564a f47248c;

    /* renamed from: d */
    public C18570m f47249d;

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        if (this.f47248c == null) {
            this.f47248c = new C18563g.C18564a();
        }
        C17048b.m42896a(hashMap, this.f47248c);
        if (this.f47249d == null) {
            C20542a aVar = (C20542a) bVar.mo49505a(C20542a.class, (String) null);
            if (this.f47248c == null) {
                this.f47248c = new C18563g.C18564a();
            }
            this.f47249d = new C18570m(aVar, this.f47248c, (C17876i) bVar.mo49505a(C17876i.class, (String) null));
        }
        C17048b.m42896a(hashMap, this.f47249d);
    }
}
