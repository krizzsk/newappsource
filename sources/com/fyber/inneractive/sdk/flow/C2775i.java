package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.measurement.C2816a;
import com.fyber.inneractive.sdk.measurement.C2820d;
import com.fyber.inneractive.sdk.measurement.C2823g;
import com.fyber.inneractive.sdk.measurement.C2824h;
import com.fyber.inneractive.sdk.measurement.C2825i;
import com.fyber.inneractive.sdk.measurement.C2826j;
import com.fyber.inneractive.sdk.model.vast.C2835b;
import com.fyber.inneractive.sdk.model.vast.C2850q;
import com.fyber.inneractive.sdk.player.C2945a;
import com.fyber.inneractive.sdk.player.C3423f;
import com.fyber.inneractive.sdk.player.C3428g;
import com.fyber.inneractive.sdk.player.C3430i;
import com.fyber.inneractive.sdk.response.C3650g;
import com.fyber.inneractive.sdk.response.C3652i;
import com.fyber.inneractive.sdk.util.IAlog;
import com.fyber.inneractive.sdk.web.C3762c;
import com.google.android.play.core.appupdate.C14226d;
import com.iab.omid.library.fyber.adsession.AdSessionContextType;
import com.iab.omid.library.fyber.adsession.CreativeType;
import com.iab.omid.library.fyber.adsession.ImpressionType;
import com.iab.omid.library.fyber.adsession.Owner;
import java.util.List;
import p699oh.C18748a;
import p699oh.C18749b;
import p699oh.C18750c;
import p699oh.C18751d;
import p699oh.C18752e;
import p699oh.C18753f;
import p699oh.C18754g;
import p723ph.C18923a;

/* renamed from: com.fyber.inneractive.sdk.flow.i */
public class C2775i extends C2763c<C3650g, C2807y> implements C3430i.C3432b {

    /* renamed from: h */
    public C3430i f9589h;

    public C2775i(String str) {
    }

    /* renamed from: a */
    public void mo13515a() {
        this.f9589h.mo14626a();
    }

    /* renamed from: b */
    public String mo13296b() {
        return "send_failed_vast_creatives";
    }

    /* renamed from: d */
    public void mo13520d() {
        super.mo13520d();
    }

    /* renamed from: e */
    public void mo13297e() {
        C2835b bVar;
        C18750c cVar;
        C2835b bVar2;
        IAlog.m9902a(IAlog.m9899a((Object) this) + "start called", new Object[0]);
        Content yVar = new C2807y(mo13519c(), this.f9552f, (C3650g) this.f9548b, this.f9547a);
        this.f9549c = yVar;
        C3650g gVar = (C3650g) this.f9548b;
        C3430i iVar = new C3430i(gVar, this.f9547a, yVar, this);
        this.f9589h = iVar;
        C2807y yVar2 = (C2807y) this.f9549c;
        yVar2.f9675g = iVar;
        yVar2.f9595f = this.f9553g;
        C18751d dVar = null;
        iVar.f12251e = null;
        if (!(gVar == null || (bVar2 = gVar.f12771C) == null)) {
            iVar.f12251e = bVar2.f9740d.poll();
        }
        if (iVar.f12251e == null) {
            iVar.mo14629b();
            C3430i.C3432b bVar3 = iVar.f12250d;
            InneractiveInfrastructureError inneractiveInfrastructureError = new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR);
            C2775i iVar2 = (C2775i) bVar3;
            iVar2.mo13517a((InneractiveError) inneractiveInfrastructureError);
            iVar2.mo13518a(inneractiveInfrastructureError);
            return;
        }
        iVar.mo14632e();
        C2945a.C2946a aVar = iVar.f12252f;
        if (aVar != null) {
            C3423f fVar = (C3423f) aVar;
            C2816a aVar2 = fVar.f10089h;
            if (aVar2 != null) {
                C2823g gVar2 = new C2823g();
                List<C2825i> list = fVar.f12240x.f9741e;
                C2807y yVar3 = fVar.f10087f;
                try {
                    CreativeType creativeType = CreativeType.VIDEO;
                    ImpressionType impressionType = ImpressionType.UNSPECIFIED;
                    Owner owner = Owner.NATIVE;
                    cVar = C18750c.m45764a(creativeType, impressionType, owner, owner);
                } catch (Throwable th) {
                    gVar2.mo13612a(th);
                }
                List<C18753f> a = gVar2.mo13611a(list);
                if (!(((C2820d) aVar2).f9682c == null || ((C2820d) aVar2).f9681b == null)) {
                    try {
                        C18752e eVar = ((C2820d) aVar2).f9682c;
                        String str = ((C2820d) aVar2).f9681b;
                        C14226d.m35346l0(eVar, "Partner is null");
                        C14226d.m35346l0(str, "OM SDK JS script content is null");
                        C14226d.m35346l0(a, "VerificationScriptResources is null");
                        dVar = new C18751d(eVar, (C3762c) null, str, a, AdSessionContextType.NATIVE);
                    } catch (Throwable th2) {
                        gVar2.mo13612a(th2);
                    }
                }
                C18754g b = C18749b.m45759b(cVar, dVar);
                gVar2.f9690a = b;
                gVar2.f9691b = C18748a.m45756a(b);
                gVar2.f9692c = C18923a.m46000a(gVar2.f9690a);
                gVar2.f9690a.mo51252e();
                gVar2.f9695f = yVar3;
                fVar.f10090i = gVar2;
                fVar.f10091j = new C3428g(gVar2);
            }
            if (fVar.f10090i == null && (bVar = fVar.f12240x) != null) {
                for (C2825i next : bVar.f9741e) {
                    C2826j jVar = C2826j.ERROR_DURING_RESOURCE_LOAD;
                    C2850q qVar = C2850q.EVENT_VERIFICATION_NOT_EXECUTED;
                    C3423f.m8636a((C3652i) new C2824h(next, next.mo13613a(qVar), jVar), qVar);
                }
            }
        }
        iVar.mo14631d();
    }
}
