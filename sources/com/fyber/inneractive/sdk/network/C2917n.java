package com.fyber.inneractive.sdk.network;

import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2702y;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2638e;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.ImpressionData;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.flow.C2760a;
import com.fyber.inneractive.sdk.flow.C2762b;
import com.fyber.inneractive.sdk.flow.C2763c;
import com.fyber.inneractive.sdk.flow.C2765e;
import com.fyber.inneractive.sdk.flow.C2784n;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.metrics.C2830c;
import com.fyber.inneractive.sdk.network.C2889b0;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.FileNotFoundException;

/* renamed from: com.fyber.inneractive.sdk.network.n */
public class C2917n {

    /* renamed from: a */
    public InneractiveAdRequest f9969a;

    /* renamed from: b */
    public C2666s f9970b;

    /* renamed from: c */
    public C2920c f9971c;

    /* renamed from: d */
    public final String f9972d;

    /* renamed from: e */
    public volatile boolean f9973e = false;

    /* renamed from: f */
    public final C2893c0 f9974f;

    /* renamed from: com.fyber.inneractive.sdk.network.n$a */
    public class C2918a implements C2936u<C3648e> {
        public C2918a() {
        }

        /* renamed from: a */
        public void mo13154a(Object obj, Exception exc, boolean z) {
            InneractiveErrorCode inneractiveErrorCode;
            C3648e eVar = (C3648e) obj;
            if (exc == null) {
                C2917n.this.mo13713a(eVar);
                return;
            }
            C2917n.this.getClass();
            if (exc instanceof C2921n0) {
                if (((C2921n0) exc).f9977a == 204) {
                    inneractiveErrorCode = InneractiveErrorCode.NO_FILL;
                } else {
                    inneractiveErrorCode = InneractiveErrorCode.SERVER_INTERNAL_ERROR;
                }
            } else if (exc instanceof FileNotFoundException) {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            } else if (exc instanceof C2944z) {
                inneractiveErrorCode = InneractiveErrorCode.SERVER_INVALID_RESPONSE;
            } else {
                inneractiveErrorCode = InneractiveErrorCode.CONNECTION_ERROR;
            }
            C2917n nVar = C2917n.this;
            if (nVar.f9971c != null) {
                if (nVar.f9973e) {
                    IAlog.m9905d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                } else {
                    nVar.mo13712a(inneractiveErrorCode, eVar);
                }
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$b */
    public class C2919b implements C2889b0.C2890a {
        public C2919b() {
        }

        /* renamed from: a */
        public void mo13155a(String str) {
            str.getClass();
            char c = 65535;
            switch (str.hashCode()) {
                case -1392135285:
                    if (str.equals("sdkInitNetworkRequest")) {
                        c = 0;
                        break;
                    }
                    break;
                case 740780854:
                    if (str.equals("sdkGotServerResponse")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1745989196:
                    if (str.equals("sdkParsedResponse")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    C2830c.f9722c.mo13620a(C2917n.this.f9972d).mo13626f();
                    return;
                case 1:
                    C2830c.f9722c.mo13620a(C2917n.this.f9972d).mo13627g();
                    return;
                case 2:
                    C2830c.f9722c.mo13620a(C2917n.this.f9972d).mo13624d();
                    return;
                default:
                    return;
            }
        }
    }

    /* renamed from: com.fyber.inneractive.sdk.network.n$c */
    public interface C2920c {
    }

    public C2917n(InneractiveAdRequest inneractiveAdRequest, String str, C2666s sVar, C2920c cVar) {
        this.f9969a = inneractiveAdRequest;
        this.f9972d = str;
        this.f9971c = cVar;
        this.f9970b = sVar;
        this.f9974f = new C2893c0(new C2918a(), inneractiveAdRequest, sVar);
        mo13711a();
    }

    /* renamed from: a */
    public void mo13711a() {
        this.f9974f.f9903d = new C2919b();
    }

    /* renamed from: a */
    public void mo13712a(InneractiveErrorCode inneractiveErrorCode, C3648e eVar) {
        C2920c cVar;
        if (!this.f9973e && (cVar = this.f9971c) != null) {
            ((C2765e) cVar).mo13528a(this.f9969a, eVar, inneractiveErrorCode);
        }
    }

    /* renamed from: a */
    public void mo13713a(C3648e eVar) {
        InneractiveErrorCode inneractiveErrorCode;
        if (this.f9971c != null) {
            if (this.f9973e) {
                IAlog.m9905d("IARemoteAdFetcher: ignoring response. Previous request was cancelled", new Object[0]);
                return;
            }
            C2702y b = C2618a.m6642b(eVar.f12755m);
            InneractiveAdRequest inneractiveAdRequest = this.f9969a;
            if (inneractiveAdRequest != null) {
                inneractiveAdRequest.setSelectedUnitConfig(b);
            }
            C2638e eVar2 = new C2638e();
            ImpressionData impressionData = eVar.f12760r;
            C2809a aVar = null;
            eVar2.f9296a = impressionData != null ? impressionData.getDemandId() : null;
            try {
                eVar2.f9297b = Long.valueOf(IAConfigManager.f9202J.f9216d);
            } catch (NumberFormatException unused) {
                IAlog.m9902a("invalid publisherId", new Object[0]);
            }
            C2666s sVar = this.f9970b;
            if (sVar != null) {
                sVar.mo13266a(eVar2);
            }
            if (b == null) {
                inneractiveErrorCode = InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH;
            } else {
                inneractiveErrorCode = eVar.mo13327a(this.f9969a, this.f9970b);
            }
            if (inneractiveErrorCode == null) {
                C2920c cVar = this.f9971c;
                InneractiveAdRequest inneractiveAdRequest2 = this.f9969a;
                C2765e eVar3 = (C2765e) cVar;
                C2666s sVar2 = eVar3.f9559f;
                IAlog.m9905d("%sonAdDataAvailable: got response data: %s", eVar3.mo13523d(), eVar);
                C3644a a = C3644a.m9818a(eVar.f12749g);
                C2754b.C2756b bVar = C2754b.C2755a.f9535a.f9534a.get(a);
                if (bVar != null) {
                    aVar = bVar.mo13317a();
                }
                eVar3.f9556c = aVar;
                if (aVar == null) {
                    IAlog.m9906e("%sonAdDataAvailable: Cannot find content handler for ad type: %s", eVar3.mo13523d(), a);
                    C2765e.C2767b bVar2 = eVar3.f9557d;
                    if (bVar2 != null) {
                        ((C2784n) bVar2).mo13567a(inneractiveAdRequest2, eVar, new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
                        return;
                    }
                    return;
                }
                IAlog.m9905d("%sonAdDataAvailable: found response loader: %s", eVar3.mo13523d(), eVar3.f9556c);
                ((C2763c) eVar3.f9556c).mo13516a(inneractiveAdRequest2, eVar, sVar2, eVar3);
                return;
            }
            if (b == null || inneractiveErrorCode == InneractiveErrorCode.ERROR_CONFIGURATION_MISMATCH) {
                IAlog.m9903b("%sGot configuration mismatch!", IAlog.m9899a((Object) this));
                IAConfigManager.m6631a();
            }
            C3644a a2 = C3644a.m9818a(eVar.f12749g);
            if (a2 != null) {
                C3714n.m9976a(new C2760a(new C2762b(eVar, this.f9969a, a2 == C3644a.RETURNED_ADTYPE_HTML ? "send_failed_display_creatives" : "send_failed_vast_creatives", this.f9970b.mo13268c()), new InneractiveInfrastructureError(inneractiveErrorCode, eVar.f12766x)));
            }
            mo13712a(inneractiveErrorCode, eVar);
        }
    }
}
