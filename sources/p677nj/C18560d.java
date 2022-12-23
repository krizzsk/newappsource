package p677nj;

import com.masabi.justride.sdk.crypto.KeyStorageAES;
import java.util.HashMap;
import p413co.C13859g;
import p469eo.C16846b;
import p493fo.C17048b;
import p677nj.C18554a;
import p677nj.C18556b;
import p677nj.C18558c;
import p916xl.C20536b;
import p918xn.C20545d;

/* renamed from: nj.d */
public final class C18560d extends C17048b {

    /* renamed from: c */
    public C18554a.C18555a f47243c;

    /* renamed from: d */
    public C18556b.C18557a f47244d;

    /* renamed from: e */
    public KeyStorageAES f47245e;

    /* renamed from: f */
    public C18568k f47246f;

    /* renamed from: g */
    public C18569l f47247g;

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        Class cls = C13859g.class;
        Class cls2 = C18558c.C18559a.class;
        if (this.f47243c == null) {
            this.f47243c = new C18554a.C18555a();
        }
        C17048b.m42896a(hashMap, this.f47243c);
        if (this.f47244d == null) {
            this.f47244d = new C18556b.C18557a();
        }
        C17048b.m42896a(hashMap, this.f47244d);
        if (this.f47245e == null) {
            this.f47245e = new KeyStorageAES((C18558c.C18559a) bVar.mo49505a(cls2, (String) null), (C13859g) bVar.mo49505a(cls, (String) null), (C18566i) bVar.mo49505a(C18566i.class, (String) null), (C20545d) bVar.mo49505a(C20545d.class, (String) null), (C20536b) bVar.mo49505a(C20536b.class, (String) null));
        }
        C17048b.m42896a(hashMap, this.f47245e);
        if (this.f47246f == null) {
            this.f47246f = new C18568k(this.f47245e, (C13859g) bVar.mo49505a(cls, (String) null));
        }
        C17048b.m42896a(hashMap, this.f47246f);
        if (this.f47247g == null) {
            C13859g gVar = (C13859g) bVar.mo49505a(cls, (String) null);
            if (this.f47246f == null) {
                this.f47246f = new C18568k(this.f47245e, (C13859g) bVar.mo49505a(cls, (String) null));
            }
            C18568k kVar = this.f47246f;
            C18558c.C18559a aVar = (C18558c.C18559a) bVar.mo49505a(cls2, (String) null);
            if (this.f47243c == null) {
                this.f47243c = new C18554a.C18555a();
            }
            C18554a.C18555a aVar2 = this.f47243c;
            if (this.f47244d == null) {
                this.f47244d = new C18556b.C18557a();
            }
            this.f47247g = new C18569l(gVar, kVar, aVar, aVar2, this.f47244d);
        }
        C17048b.m42896a(hashMap, this.f47247g);
    }
}
