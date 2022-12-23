package p515gm;

import com.google.android.play.core.assetpacks.C14307q0;
import com.google.android.play.core.assetpacks.C14314s;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import java.util.HashMap;
import p258t4.C6589c;
import p411cm.C13843a;
import p411cm.C13849f;
import p443dm.C16681f;
import p468en.C16842b;
import p469eo.C16846b;
import p490fl.C17036d;
import p493fo.C17048b;
import p540hn.C17461b;
import p609km.C18095a;
import p726pk.C18928a;
import p751qm.C19142b;
import p845um.C19958a;
import p846un.C19960b;
import p869vm.C20160a;
import p913xi.C20531d;
import p916xl.C20536b;

/* renamed from: gm.b */
public final class C17206b extends C17048b {

    /* renamed from: c */
    public C18928a f44490c;

    public C17206b(C18928a aVar) {
        this.f44490c = aVar;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        Class cls = C20531d.class;
        Class cls2 = C17461b.class;
        Class cls3 = C17036d.class;
        C18095a aVar = new C18095a((C17036d) bVar.mo49505a(cls3, (String) null), (C17461b) bVar.mo49505a(cls2, (String) null));
        C17048b.m42897b(hashMap, aVar, C18095a.class, (String) null);
        C17205a aVar2 = new C17205a((C13843a) bVar.mo49505a(C13843a.class, (String) null), (C13849f.C13850a) bVar.mo49505a(C13849f.C13850a.class, (String) null), (C16842b) bVar.mo49505a(C16842b.class, (String) null), this.f44490c.f48176c);
        C17048b.m42897b(hashMap, aVar2, C17205a.class, (String) null);
        C16681f fVar = new C16681f((Object) aVar2, (Object) aVar, (Object) (C20531d) bVar.mo49505a(cls, (String) null), (Object) this.f44490c.f48174a);
        C17048b.m42897b(hashMap, fVar, C16681f.class, (String) null);
        C17048b.m42897b(hashMap, new C14314s((Object) fVar, (Object) (GetTicketJob) bVar.mo49505a(GetTicketJob.class, (String) null), (Object) new C6589c()), C14314s.class, (String) null);
        C19142b bVar2 = (C19142b) bVar.mo49505a(C19142b.class, (String) null);
        C20531d dVar = (C20531d) bVar.mo49505a(cls, (String) null);
        C20160a aVar3 = (C20160a) bVar.mo49505a(C20160a.class, (String) null);
        C20536b bVar3 = (C20536b) bVar.mo49505a(C20536b.class, (String) null);
        String str = this.f44490c.f48174a;
        C19958a aVar4 = new C19958a();
        C17048b.m42897b(hashMap, aVar4, C19958a.class, (String) null);
        C17048b.m42897b(hashMap, new C14307q0(aVar4, (C17461b) bVar.mo49505a(cls2, (String) null), (C17036d) bVar.mo49505a(cls3, (String) null), (C19960b) bVar.mo49505a(C19960b.class, (String) null)), C14307q0.class, (String) null);
    }
}
