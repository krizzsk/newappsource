package p820tl;

import androidx.appcompat.app.C0262r;
import com.android.billingclient.api.C1963s;
import com.google.android.play.core.assetpacks.C14343z0;
import java.util.HashMap;
import mf0.C24362h;
import p069e3.C4544g;
import p208p6.C6094b;
import p247s6.C6478c;
import p389bl.C13642h;
import p466el.C16838a;
import p469eo.C16846b;
import p493fo.C17048b;
import p516gn.C17207a;
import p517go.C17209a;
import p517go.C17210b;
import p517go.C17211c;
import p583jk.C17873f;
import p585jm.C17891e;
import p679nl.C18575a;
import p704om.C18789e;
import p772rl.C19287b;
import p796sl.C19477g;
import p796sl.C19478h;
import p844ul.C19957a;
import p868vl.C20154a;
import p894wn.C20379b;
import p916xl.C20536b;
import p917xm.C20541d;

/* renamed from: tl.a */
public final class C19693a extends C17048b {

    /* renamed from: c */
    public final /* synthetic */ int f50003c;

    public /* synthetic */ C19693a(int i) {
        this.f50003c = i;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        Class cls = C17211c.class;
        switch (this.f50003c) {
            case 0:
                Class cls2 = C20154a.class;
                C20536b bVar2 = (C20536b) bVar.mo49505a(C20536b.class, (String) null);
                C19957a aVar = new C19957a((C19287b) bVar.mo49505a(C19287b.class, (String) null), (C20541d) bVar.mo49505a(C20541d.class, (String) null), (C19478h) bVar.mo49505a(C19478h.class, (String) null), (C19477g) bVar.mo49505a(C19477g.class, (String) null), (C17207a) bVar.mo49505a(C17207a.class, (String) null), (C17873f) bVar.mo49505a(C17873f.class, (String) null), (C13642h) bVar.mo49505a(C13642h.class, (String) null), (C20379b) bVar.mo49505a(C20379b.class, (String) null), (C20154a) bVar.mo49505a(cls2, (String) null));
                C6094b bVar3 = new C6094b((C18575a) bVar.mo49505a(C18575a.class, (String) null), (C16838a) bVar.mo49505a(C16838a.class, (String) null), (C20154a) bVar.mo49505a(cls2, (String) null));
                C17048b.m42897b(hashMap, aVar, C19957a.class, (String) null);
                C17048b.m42897b(hashMap, bVar3, C6094b.class, (String) null);
                return;
            case 1:
                Class cls3 = C17891e.class;
                C24362h.m61211f(bVar, "serviceLocator");
                C0262r rVar = new C0262r(new C4544g((C17891e) bVar.mo49505a(cls3, (String) null), 5), 11);
                C6478c cVar = new C6478c((C17211c) bVar.mo49505a(cls, (String) null), rVar);
                Object a = bVar.mo49505a(C18789e.class, (String) null);
                C24362h.m61210e(a, "serviceLocator.get(GetTo…oInternalJob::class.java)");
                C14343z0 z0Var = new C14343z0((C18789e) a, rVar);
                Object a2 = bVar.mo49505a(cls, (String) null);
                C24362h.m61210e(a2, "serviceLocator.get(TopUpInfoCache::class.java)");
                Object a3 = bVar.mo49505a(cls3, (String) null);
                C24362h.m61210e(a3, "serviceLocator.get(GooglePayFactory::class.java)");
                C1963s sVar = new C1963s((C17211c) a2, (C17891e) a3);
                C17048b.m42897b(hashMap, cVar, C6478c.class, (String) null);
                C17048b.m42897b(hashMap, z0Var, C14343z0.class, (String) null);
                C17048b.m42897b(hashMap, sVar, C1963s.class, (String) null);
                return;
            default:
                C17048b.m42897b(hashMap, new C17210b(), C17210b.class, (String) null);
                C17048b.m42897b(hashMap, new C17209a(), C17209a.class, (String) null);
                C17048b.m42897b(hashMap, new C17211c(), cls, (String) null);
                return;
        }
    }
}
