package p728pm;

import androidx.lifecycle.C1042u;
import com.google.android.material.internal.C14080o;
import com.google.android.play.core.assetpacks.C14248b1;
import com.masabi.justride.sdk.jobs.ticket.get.C14659a;
import com.masabi.justride.sdk.jobs.ticket.get.GetTicketJob;
import java.util.HashMap;
import java.util.List;
import p066e0.C4436j0;
import p090g1.C4745d;
import p092g3.C4752a;
import p120i5.C5282c;
import p258t4.C6587a;
import p332z4.C7469h;
import p366an.C13498d;
import p366an.C13499e;
import p370ar.C13506a;
import p391bn.C13644a;
import p406cg.C13815e;
import p412cn.C13851a;
import p413co.C13867m;
import p413co.C13868n;
import p445do.C16690b;
import p469eo.C16846b;
import p490fl.C17037e;
import p493fo.C17048b;
import p583jk.C17873f;
import p583jk.C17880m;
import p583jk.C17883o;
import p584jl.C17886b;
import p626lf.C18201b;
import p659mp.C18416b;
import p703ol.C18781a;
import p704om.C18788d;
import p727pl.C18932b;
import p751qm.C19142b;
import p772rl.C19287b;
import p773rm.C19288a;
import p773rm.C19289b;
import p773rm.C19290c;
import p797sm.C19479a;
import p797sm.C19480b;
import p797sm.C19483d;
import p797sm.C19486g;
import p797sm.C19492m;
import p821tm.C19695b;
import p821tm.C19697c;
import p821tm.C19698d;
import p821tm.C19699e;
import p821tm.C19701f;
import p821tm.C19704h;
import p821tm.C19707k;
import p821tm.C19708l;
import p821tm.C19709m;
import p821tm.C19710n;
import p821tm.C19712p;
import p821tm.C19714r;
import p841ui.C19915a;
import p868vl.C20154a;
import p869vm.C20160a;
import p893wm.C20374a;
import p893wm.C20375b;
import p893wm.C20376c;
import p913xi.C20531d;
import p916xl.C20536b;
import p917xm.C20537a;
import p917xm.C20538b;
import p939yl.C20740a;
import p940ym.C20745a;
import p964zm.C20876b;
import w10.C20268a;

/* renamed from: pm.c */
public final class C18935c extends C17048b {

    /* renamed from: c */
    public C18932b f48222c;

    /* renamed from: d */
    public C18933a f48223d;

    /* renamed from: e */
    public C20268a f48224e;

    /* renamed from: f */
    public C20160a f48225f;

    /* renamed from: g */
    public C19709m f48226g;

    /* renamed from: h */
    public C1042u f48227h;

    /* renamed from: i */
    public final String f48228i;

    public C18935c(String str) {
        this.f48228i = str;
    }

    /* renamed from: c */
    public final void mo40403c(C16846b bVar, HashMap hashMap) {
        C16846b bVar2 = bVar;
        HashMap hashMap2 = hashMap;
        Class cls = C13868n.class;
        Class cls2 = Integer.class;
        Class cls3 = C20876b.class;
        Class cls4 = C13851a.class;
        Class<C20154a> cls5 = C20154a.class;
        Class<C17883o> cls6 = C17883o.class;
        Class cls7 = C20531d.class;
        Class cls8 = C20536b.class;
        Class cls9 = C16690b.class;
        Class cls10 = C17873f.class;
        C18416b bVar3 = new C18416b();
        C17048b.m42897b(hashMap2, bVar3, C18416b.class, (String) null);
        C17048b.m42896a(hashMap2, mo51451g(bVar));
        if (this.f48227h == null) {
            this.f48227h = new C1042u((Object) (C13868n) bVar2.mo49505a(cls, (String) null));
        }
        C17048b.m42896a(hashMap2, this.f48227h);
        C17048b.m42896a(hashMap2, mo51449e(bVar));
        C4752a aVar = new C4752a((Object) (C13868n) bVar2.mo49505a(cls, (String) null));
        Class<C20154a> cls11 = cls5;
        C17048b.m42897b(hashMap2, aVar, C4752a.class, (String) null);
        Class<C17883o> cls12 = cls6;
        C19142b bVar4 = new C19142b(aVar, (C17873f) bVar2.mo49505a(cls10, (String) null), mo51449e(bVar));
        C17048b.m42897b(hashMap2, bVar4, C19142b.class, (String) null);
        C18788d dVar = new C18788d(bVar3, (C16690b) bVar2.mo49505a(cls9, (String) null), (C17873f) bVar2.mo49505a(cls10, (String) null), this.f48228i);
        C17048b.m42897b(hashMap2, dVar, C18788d.class, (String) null);
        C20745a aVar2 = new C20745a(dVar, (C16690b) bVar2.mo49505a(cls9, (String) null));
        C17048b.m42897b(hashMap2, aVar2, C20745a.class, (String) null);
        C18788d dVar2 = dVar;
        C20374a aVar3 = new C20374a((C16690b) bVar2.mo49505a(cls9, (String) null), aVar2, (C20536b) bVar2.mo49505a(cls8, (String) null), (C20740a) bVar2.mo49505a(C20740a.class, (String) null));
        C17048b.m42897b(hashMap2, aVar3, C20374a.class, (String) null);
        C19709m mVar = new C19709m((C13868n) bVar2.mo49505a(cls, (String) null), (C20531d) bVar2.mo49505a(cls7, (String) null), 0);
        C14659a.C14660a aVar4 = new C14659a.C14660a((C13867m) bVar2.mo49505a(C13867m.class, (String) null), (C20531d) bVar2.mo49505a(cls7, (String) null));
        C17048b.m42897b(hashMap2, aVar4, C14659a.C14660a.class, (String) null);
        C19710n nVar = new C19710n((C19287b) bVar2.mo49505a(C19287b.class, (String) null));
        Class cls13 = cls7;
        GetTicketJob getTicketJob = new GetTicketJob(aVar2, mVar, aVar3, aVar4, (C13851a) bVar2.mo49505a(cls4, (String) null), new C13506a(5), new C17886b(), new C6587a(), new C6587a(), new C13815e(), new C19695b(), new C18201b(), nVar, (C17037e) bVar2.mo49505a(C17037e.class, (String) null), (C18781a) bVar2.mo49505a(C18781a.class, (String) null));
        C17048b.m42897b(hashMap2, getTicketJob, GetTicketJob.class, (String) null);
        C13498d dVar3 = new C13498d();
        C17048b.m42897b(hashMap2, dVar3, C13498d.class, (String) null);
        C14248b1 b1Var = new C14248b1(getTicketJob, (C20536b) bVar2.mo49505a(cls8, (String) null));
        C17048b.m42897b(hashMap2, b1Var, C14248b1.class, (String) null);
        C7469h hVar = new C7469h((C17873f) bVar2.mo49505a(cls10, (String) null), b1Var, mo51449e(bVar));
        C17048b.m42897b(hashMap2, hVar, C7469h.class, (String) null);
        C17048b.m42897b(hashMap2, new C20537a((C17873f) bVar2.mo49505a(cls10, (String) null), (C13851a) bVar2.mo49505a(cls4, (String) null), b1Var, mo51449e(bVar), (C20876b) bVar2.mo49505a(cls3, (String) null), (C20536b) bVar2.mo49505a(cls8, (String) null), (Integer) bVar2.mo49505a(cls2, "supportedTicketStorageVersion")), C20537a.class, (String) null);
        C17048b.m42896a(hashMap2, mo51450f(bVar));
        C17048b.m42897b(hashMap2, new C20538b.C20539a(mo51450f(bVar), (C13644a.C13645a) bVar2.mo49505a(C13644a.C13645a.class, (String) null), bVar4, mo51451g(bVar), (Integer) bVar2.mo49505a(cls2, "supportedTicketStorageVersion"), (C20876b) bVar2.mo49505a(cls3, (String) null)), C20538b.C20539a.class, (String) null);
        C17048b.m42897b(hashMap2, new C4745d((Object) (C19915a) bVar2.mo49505a(C19915a.class, (String) null)), C4745d.class, (String) null);
        C19714r rVar = new C19714r();
        C17048b.m42897b(hashMap2, rVar, C19714r.class, (String) null);
        C19707k kVar = new C19707k(rVar);
        C17048b.m42897b(hashMap2, kVar, C19707k.class, (String) null);
        Class cls14 = cls9;
        C17048b.m42897b(hashMap2, new C20375b((C16690b) bVar2.mo49505a(cls14, (String) null)), C20375b.class, (String) null);
        C17048b.m42897b(hashMap2, new C20376c.C20377a((C16690b) bVar2.mo49505a(cls14, (String) null)), C20376c.C20377a.class, (String) null);
        C19288a aVar5 = new C19288a((C19483d) bVar2.mo49505a(C19483d.class, "AvailableTicketsCompositeStrategyFactory"), (C19492m) bVar2.mo49505a(C19479a.class, (String) null));
        C17048b.m42897b(hashMap2, aVar5, C19288a.class, (String) null);
        C19289b bVar5 = new C19289b((C19492m) bVar2.mo49505a(C19486g.class, (String) null));
        C17048b.m42897b(hashMap2, bVar5, C19289b.class, (String) null);
        C19290c cVar = new C19290c((List) bVar2.mo49505a(List.class, "supportedFeatureList"));
        C17048b.m42897b(hashMap2, cVar, C19290c.class, (String) null);
        C19708l lVar = new C19708l(hVar, cVar);
        C17048b.m42897b(hashMap2, lVar, C19708l.class, (String) null);
        C17048b.m42897b(hashMap2, new C19699e.C19700a(lVar, aVar5, kVar, (C19480b) bVar2.mo49505a(C19480b.class, (String) null)), C19699e.C19700a.class, (String) null);
        C17048b.m42897b(hashMap2, new C19701f(lVar, bVar5, kVar), C19701f.class, (String) null);
        Class<C17883o> cls15 = cls12;
        C14080o oVar = new C14080o((Object) (C17883o) bVar2.mo49505a(cls15, (String) null));
        C17048b.m42897b(hashMap2, oVar, C14080o.class, (String) null);
        C19712p pVar = new C19712p(oVar, (C17880m) bVar2.mo49505a(C17880m.class, (String) null), (C17883o) bVar2.mo49505a(cls15, (String) null), aVar2, (C17873f) bVar2.mo49505a(cls10, (String) null));
        C17048b.m42897b(hashMap2, pVar, C19712p.class, (String) null);
        Class<C20154a> cls16 = cls11;
        C17048b.m42897b(hashMap2, new C5282c((Object) getTicketJob, (Object) (C20154a) bVar2.mo49505a(cls16, (String) null), (Object) pVar), C5282c.class, (String) null);
        C17048b.m42897b(hashMap2, new C19704h(), C19704h.class, (String) null);
        C19697c cVar2 = new C19697c(lVar, pVar);
        C17048b.m42897b(hashMap2, cVar2, C19697c.class, (String) null);
        C17048b.m42897b(hashMap2, new C19698d((C20154a) bVar2.mo49505a(cls16, (String) null), cVar2), C19698d.class, (String) null);
        C4436j0 j0Var = new C4436j0((Object) (C17883o) bVar2.mo49505a(cls15, (String) null));
        C17048b.m42897b(hashMap2, j0Var, C4436j0.class, (String) null);
        C17048b.m42897b(hashMap2, new C13499e.C13500a(getTicketJob, oVar, dVar2, j0Var, (C20154a) bVar2.mo49505a(cls16, (String) null), dVar3), C13499e.C13500a.class, (String) null);
        C17048b.m42897b(hashMap2, new C1042u((Object) (C20531d) bVar2.mo49505a(cls13, (String) null)), C1042u.class, (String) null);
    }

    /* renamed from: e */
    public final C18933a mo51449e(C16846b bVar) {
        Class cls = C20531d.class;
        Class cls2 = C13868n.class;
        if (this.f48223d == null) {
            if (this.f48222c == null) {
                this.f48222c = new C18932b((C13868n) bVar.mo49505a(cls2, (String) null), (C20531d) bVar.mo49505a(cls, (String) null));
            }
            C18932b bVar2 = this.f48222c;
            if (this.f48226g == null) {
                this.f48226g = new C19709m((C13868n) bVar.mo49505a(cls2, (String) null), (C20531d) bVar.mo49505a(cls, (String) null), 1);
            }
            this.f48223d = new C18933a(bVar2, this.f48226g, (C16690b) bVar.mo49505a(C16690b.class, (String) null), (C17873f) bVar.mo49505a(C17873f.class, (String) null));
        }
        return this.f48223d;
    }

    /* renamed from: f */
    public final C20268a mo51450f(C16846b bVar) {
        if (this.f48224e == null) {
            this.f48224e = new C20268a(4, (C13867m) bVar.mo49505a(C13867m.class, (String) null), (C20531d) bVar.mo49505a(C20531d.class, (String) null));
        }
        return this.f48224e;
    }

    /* renamed from: g */
    public final C20160a mo51451g(C16846b bVar) {
        if (this.f48225f == null) {
            if (this.f48227h == null) {
                this.f48227h = new C1042u((Object) (C13868n) bVar.mo49505a(C13868n.class, (String) null));
            }
            this.f48225f = new C20160a(this.f48227h, (C17873f) bVar.mo49505a(C17873f.class, (String) null), mo51449e(bVar), mo51450f(bVar), (C20536b) bVar.mo49505a(C20536b.class, (String) null));
        }
        return this.f48225f;
    }
}
