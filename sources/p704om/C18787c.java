package p704om;

import ac0.C7557a;
import android.content.Context;
import com.cubic.umo.p045ad.ext.types.UMOAdKitError;
import com.masabi.justride.sdk.jobs.purchase.payment.OrderProgressStore;
import com.umo.ads.p342c.zzd;
import hi0.C23562t;
import mc0.C12909a;
import mc0.C12912d;
import mf0.C24362h;
import nc0.C12954d;
import p043ch.qos.logback.classic.Logger;
import p066e0.C4419c0;
import p389bl.C13640f;
import p583jk.C17884p;
import p584jl.C17885a;
import p846un.C19960b;
import uh0.C25081h;
import vb0.C13197a;
import vb0.C13198b;
import vb0.C13199c;
import vb0.C13200d;
import vb0.C13201e;
import wb0.C13233c;
import yb0.C13304h;
import zb0.C13370d;
import zb0.C13375g;

/* renamed from: om.c */
public final class C18787c implements C13304h.C13305a {

    /* renamed from: a */
    public final Object f47816a;

    /* renamed from: b */
    public final Object f47817b;

    /* renamed from: c */
    public final Object f47818c;

    /* renamed from: d */
    public final Object f47819d;

    /* renamed from: e */
    public final Object f47820e;

    public /* synthetic */ C18787c(C13197a aVar, C13198b bVar, C13199c cVar, C13200d dVar, C13201e eVar) {
        C24362h.m61211f(aVar, "displayListener");
        C24362h.m61211f(bVar, "fetchListener");
        C24362h.m61211f(cVar, "interactionListener");
        C24362h.m61211f(dVar, "internalBrowserListener");
        C24362h.m61211f(eVar, "richMediaListener");
        this.f47816a = aVar;
        this.f47817b = bVar;
        this.f47818c = cVar;
        this.f47819d = dVar;
        this.f47820e = eVar;
    }

    /* renamed from: a */
    public final void mo40214a(String str, C12909a aVar) {
        ((C13198b) this.f47817b).mo40077a(str, aVar);
    }

    /* renamed from: b */
    public final void mo51267b(String str, String str2) {
        C24362h.m61211f(str, "spotId");
        C24362h.m61211f(str2, "bannerData");
        C12912d q = C13233c.m33348q(str);
        if (q != null) {
            String D = C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(C25081h.m62833D(str2, "&amp;", "&", false), "&lt;", "<", false), "&gt;", ">", false), "&quot;", "\"", false), "&apos;", "'", false);
            C13304h hVar = new C13304h(this, C13233c.m33332a(q), C13233c.m33340i());
            C13370d dVar = hVar.f33025d;
            if (dVar != null) {
                dVar.mo40254f();
            }
            hVar.f33025d = new C13370d(str, hVar);
            if (!hVar.mo40213h(D, (C23562t) null, false)) {
                C13304h.m33568d(hVar, UMOAdKitError.AD_RESPONSE_PROCESSING_ERROR, 2);
            }
        }
    }

    /* renamed from: c */
    public final void mo40215c(String str, UMOAdKitError uMOAdKitError, zzd zzd) {
        C24362h.m61211f(uMOAdKitError, "akError");
        C24362h.m61211f(zzd, "vastError");
        ((C13198b) this.f47817b).mo40078b(str, uMOAdKitError);
    }

    /* renamed from: d */
    public final void mo51268d(String str, C12909a aVar) {
        String str2;
        C24362h.m61211f(str, "spotId");
        C13640f fVar = new C13640f(str, (C13197a) this.f47816a, (C13198b) this.f47817b, (C13199c) this.f47818c, (C13200d) this.f47819d, (C13201e) this.f47820e);
        int ordinal = aVar.f31947b.ordinal();
        if (ordinal == 3) {
            Context context = C13233c.f32842a;
            C12912d q = C13233c.m33348q((String) fVar.f33655b);
            if (q != null) {
                String str3 = (String) fVar.f33655b;
                if (C12954d.m32800c(str3)) {
                    str2 = C17885a.m44403H0(str3);
                } else {
                    str2 = "";
                }
                if (C13233c.m33334c((String) fVar.f33655b) == null) {
                    C7557a.f23040a.mo6667d(C24362h.m61216k(str2, "Invalid Banner Ad Container View"));
                    ((C13197a) fVar.f33656c).mo39578v((String) fVar.f33655b, UMOAdKitError.INVALID_AD_VIEW);
                    return;
                }
                Logger logger = C7557a.f23040a;
                StringBuilder d0 = C17884p.m44363d0("Rendering VAST Video Ad in Banner Slot", str2, ": ");
                d0.append(aVar.f31950e);
                logger.mo6672i(d0.toString());
                C13233c.f32843b.post(new C4419c0(5, fVar, aVar, q));
            }
        } else if (ordinal != 4) {
            fVar.mo40524d(UMOAdKitError.AD_TYPE_UNSUPPORTED);
        } else {
            Context context2 = C13233c.f32842a;
            if (!new C13375g((String) fVar.f33655b, fVar).mo40258a(aVar, C13233c.m33332a(C13233c.m33348q((String) fVar.f33655b)), C13233c.m33340i())) {
                fVar.mo40524d(UMOAdKitError.AD_PLAY_FAILED);
            }
        }
    }

    public /* synthetic */ C18787c(C18786b bVar, C18791g gVar, OrderProgressStore orderProgressStore, C19960b bVar2, String str) {
        this.f47816a = bVar;
        this.f47817b = gVar;
        this.f47818c = orderProgressStore;
        this.f47819d = bVar2;
        this.f47820e = str;
    }
}
