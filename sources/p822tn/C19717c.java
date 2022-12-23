package p822tn;

import com.masabi.justride.sdk.crypto.KeyStorageAES;
import com.masabi.justride.sdk.platform.geolocation.AndroidGeolocationService;
import hi0.C23540g;
import hi0.C23566v;
import ii0.C23610d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.concurrent.TimeUnit;
import p030bo.C13646a;
import p030bo.C13648b;
import p030bo.C13649c;
import p258t4.C6589c;
import p364al.C13480a;
import p367ao.C13501a;
import p413co.C13852a;
import p413co.C13854c;
import p413co.C13856d;
import p413co.C13858f;
import p413co.C13867m;
import p413co.C13868n;
import p413co.C13869o;
import p413co.C13870p;
import p413co.C13871q;
import p413co.C13873s;
import p469eo.C16846b;
import p493fo.C17048b;
import p583jk.C17873f;
import p677nj.C18554a;
import p677nj.C18556b;
import p677nj.C18558c;
import p726pk.C18928a;
import p846un.C19959a;
import p846un.C19961c;
import p868vl.C20154a;
import p870vn.C20164d;
import p870vn.C20169i;
import p894wn.C20379b;
import p918xn.C20542a;
import p918xn.C20543b;
import p918xn.C20545d;
import p918xn.C20546e;
import p941yn.C20746a;
import ri0.C24831c;

/* renamed from: tn.c */
public abstract class C19717c extends C17048b {
    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C16846b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        Class cls = C17873f.class;
        C19715a aVar = (C19715a) this;
        if (aVar.f50125e == null) {
            aVar.f50125e = new C6589c();
        }
        C6589c cVar = aVar.f50125e;
        if (aVar.f50127g == null) {
            C23566v.C23568b bVar3 = new C23566v.C23568b();
            List<String> list = aVar.f50123c.f48177d;
            ArrayList arrayList = new ArrayList();
            Iterator<String> it = list.iterator();
            while (true) {
                if (!it.hasNext()) {
                    bVar3.f59617p = new C23540g(new LinkedHashSet(arrayList), (C24831c) null);
                    TimeUnit timeUnit = TimeUnit.SECONDS;
                    bVar3.mo58716b(60, timeUnit);
                    bVar3.mo58717c(60, timeUnit);
                    bVar3.f59600A = C23610d.m57795c(60, timeUnit);
                    bVar3.f59624w = false;
                    ((C20545d) bVar2.mo49505a(C20545d.class, (String) null)).getClass();
                    aVar.f50127g = new C13646a(new C23566v(bVar3), new C13649c.C13650a((C17873f) bVar2.mo49505a(cls, (String) null)));
                    break;
                }
                String str = aVar.f50123c.f48176c;
                String[] strArr = {C25541a.m63881k("sha256/", it.next())};
                if (str != null) {
                    for (int i = 0; i < 1; i++) {
                        arrayList.add(new C23540g.C23541a(str, strArr[i]));
                    }
                } else {
                    throw new NullPointerException("pattern == null");
                }
            }
        }
        C13646a aVar2 = aVar.f50127g;
        if (aVar.f50126f == null) {
            C18928a aVar3 = aVar.f50123c;
            aVar.f50126f = new C20543b(aVar.f50124d, (C20542a) bVar2.mo49505a(C20542a.class, (String) null), aVar3.f48174a, aVar3.f48175b);
        }
        C20543b bVar4 = aVar.f50126f;
        C13852a aVar4 = new C13852a(aVar.mo52064e(bVar2));
        C13868n e = mo52064e(bVar);
        if (aVar.f50129i == null) {
            aVar.f50129i = new C13480a();
        }
        C13480a aVar5 = aVar.f50129i;
        if (aVar.f50130j == null) {
            aVar.f50130j = new C20164d();
        }
        C20164d dVar = aVar.f50130j;
        if (aVar.f50131k == null) {
            aVar.f50131k = new C13854c((KeyStorageAES) bVar2.mo49505a(KeyStorageAES.class, (String) null), (C18558c.C18559a) bVar2.mo49505a(C18558c.C18559a.class, (String) null), (C18556b.C18557a) bVar2.mo49505a(C18556b.C18557a.class, (String) null), (C18554a.C18555a) bVar2.mo49505a(C18554a.C18555a.class, (String) null), (C17873f) bVar2.mo49505a(cls, (String) null));
        }
        C13854c cVar2 = aVar.f50131k;
        if (aVar.f50132l == null) {
            aVar.f50132l = new C19961c();
        }
        C19961c cVar3 = aVar.f50132l;
        C13858f fVar = new C13858f((C17873f) bVar2.mo49505a(cls, (String) null));
        C13856d dVar2 = new C13856d((C13873s) bVar2.mo49505a(C13873s.class, (String) null), (C17873f) bVar2.mo49505a(cls, (String) null));
        AndroidGeolocationService androidGeolocationService = new AndroidGeolocationService(aVar.f50124d.getApplicationContext(), ((C20154a) bVar2.mo49505a(C20154a.class, (String) null)).f51162c);
        C17048b.m42897b(hashMap2, cVar, C13501a.class, (String) null);
        C17048b.m42896a(hashMap2, cVar);
        C17048b.m42897b(hashMap2, aVar2, C13648b.class, (String) null);
        C17048b.m42896a(hashMap2, aVar2);
        C17048b.m42897b(hashMap2, bVar4, C20546e.class, (String) null);
        C17048b.m42896a(hashMap2, bVar4);
        C17048b.m42897b(hashMap2, aVar4, C13867m.class, (String) null);
        C17048b.m42897b(hashMap2, aVar4, C13852a.class, (String) null);
        C17048b.m42897b(hashMap2, e, C13868n.class, (String) null);
        C17048b.m42896a(hashMap2, e);
        C17048b.m42897b(hashMap2, aVar5, C20746a.class, (String) null);
        C17048b.m42896a(hashMap2, aVar5);
        C17048b.m42897b(hashMap2, dVar, C20169i.class, (String) null);
        C17048b.m42896a(hashMap2, dVar);
        C17048b.m42897b(hashMap2, cVar2, C13869o.class, (String) null);
        C17048b.m42896a(hashMap2, cVar2);
        C17048b.m42897b(hashMap2, cVar3, C19959a.class, (String) null);
        C17048b.m42896a(hashMap2, cVar3);
        C13858f fVar2 = fVar;
        C17048b.m42897b(hashMap2, fVar2, C13871q.class, (String) null);
        C17048b.m42897b(hashMap2, fVar2, C13858f.class, (String) null);
        C17048b.m42897b(hashMap2, dVar2, C13870p.class, (String) null);
        C17048b.m42897b(hashMap2, dVar2, C13856d.class, (String) null);
        C17048b.m42897b(hashMap2, androidGeolocationService, C20379b.class, (String) null);
        C17048b.m42897b(hashMap2, androidGeolocationService, AndroidGeolocationService.class, (String) null);
    }

    /* renamed from: e */
    public abstract C13868n mo52064e(C16846b bVar);
}
