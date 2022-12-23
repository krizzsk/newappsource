package com.fyber.inneractive.sdk.bidder.adm;

import com.fyber.inneractive.sdk.bidder.adm.AdmParametersOuterClass$AdmParameters;
import com.fyber.inneractive.sdk.bidder.adm.C2583e;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.global.C2634a;
import com.fyber.inneractive.sdk.config.global.C2635b;
import com.fyber.inneractive.sdk.config.global.C2658k;
import com.fyber.inneractive.sdk.config.global.C2659l;
import com.fyber.inneractive.sdk.config.global.C2664q;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.config.global.features.C2644e;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.factories.C2754b;
import com.fyber.inneractive.sdk.flow.C2765e;
import com.fyber.inneractive.sdk.flow.C2768f;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.network.C2915m;
import com.fyber.inneractive.sdk.network.C2917n;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.response.C3644a;
import com.fyber.inneractive.sdk.response.C3645b;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.fyber.inneractive.sdk.bidder.adm.b */
public class C2580b implements C2936u<C3648e> {

    /* renamed from: a */
    public final /* synthetic */ C2583e.C2584a f9106a;

    /* renamed from: b */
    public final /* synthetic */ C2583e f9107b;

    public C2580b(C2583e eVar, C2583e.C2584a aVar) {
        this.f9107b = eVar;
        this.f9106a = aVar;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        int i;
        C2664q a;
        C2635b bVar;
        C2658k kVar;
        C2659l lVar;
        C2664q a2;
        C3648e eVar = (C3648e) obj;
        C3648e eVar2 = null;
        if (exc == null) {
            C2583e.C2584a aVar = this.f9106a;
            if (aVar != null) {
                C2780m.C2781a aVar2 = (C2780m.C2781a) aVar;
                C2666s sVar = new C2666s();
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters = aVar2.f9621a.f9110a;
                if (admParametersOuterClass$AdmParameters != null) {
                    List<AdmParametersOuterClass$AdmParameters.Experiment> abExperimentsList = admParametersOuterClass$AdmParameters.getAbExperimentsList();
                    C2634a aVar3 = IAConfigManager.f9202J.f9238z;
                    aVar3.getClass();
                    for (C2644e next : sVar.f9332c.values()) {
                        if (!(next == null || (lVar = aVar3.f9288a) == null || (a2 = lVar.mo13257a(next.f9302b)) == null)) {
                            next.f9327a = a2.f9327a;
                        }
                    }
                    if (abExperimentsList != null && abExperimentsList.size() > 0) {
                        C2634a aVar4 = IAConfigManager.f9202J.f9238z;
                        aVar4.f9289b = sVar;
                        for (C2644e next2 : sVar.f9332c.values()) {
                            for (AdmParametersOuterClass$AdmParameters.Experiment next3 : abExperimentsList) {
                                String identifier = next3.getIdentifier();
                                String variant = next3.getVariant();
                                C2659l lVar2 = aVar4.f9288a;
                                if (!(lVar2 == null || (a = lVar2.mo13257a(next2.f9302b)) == null || (bVar = a.f9329c.get(identifier)) == null)) {
                                    Iterator<C2658k> it = bVar.f9292c.iterator();
                                    while (true) {
                                        if (!it.hasNext()) {
                                            kVar = null;
                                            break;
                                        }
                                        kVar = it.next();
                                        if (kVar.f9323b.equals(variant)) {
                                            break;
                                        }
                                    }
                                    next2.f9303c.add(bVar);
                                    if (kVar != null) {
                                        next2.f9304d.put(bVar.f9290a, kVar);
                                    }
                                }
                            }
                        }
                    }
                }
                C2780m mVar = C2780m.this;
                C2768f fVar = mVar.f9620l;
                String str = mVar.f9609a;
                C2765e.C2767b bVar2 = mVar.f9612d;
                fVar.f9558e = null;
                fVar.f9557d = bVar2;
                if (IAConfigManager.m6637g()) {
                    fVar.f9559f = sVar;
                    C2917n nVar = new C2917n(fVar.f9558e, str, sVar, fVar);
                    fVar.f9560g = nVar;
                    nVar.mo13713a(eVar);
                    return;
                }
                IAConfigManager.addListener(fVar);
                IAConfigManager.m6631a();
            }
        } else if (this.f9106a != null) {
            C2583e eVar3 = this.f9107b;
            try {
                AdmParametersOuterClass$AdmParameters admParametersOuterClass$AdmParameters2 = eVar3.f9110a;
                if (admParametersOuterClass$AdmParameters2 != null) {
                    i = admParametersOuterClass$AdmParameters2.getAdType().mo13014a();
                } else {
                    i = AdmParametersOuterClass$AdmParameters.C2572a.UNRECOGNIZED.mo13014a();
                }
                C3644a a3 = C3644a.m9818a(i);
                if (a3 == null) {
                    a3 = C3644a.RETURNED_ADTYPE_MRAID;
                }
                C3645b a4 = C2754b.C2755a.f9535a.mo13508a(a3);
                if (a4 != null) {
                    a4.mo15290a((C2915m) null);
                    eVar3.mo13158a(a4);
                    eVar2 = a4.f12732a;
                } else {
                    IAlog.m9902a("failed parse adm network request with no input stream - received ad type %s does not have an appropriate parser", Integer.valueOf(i));
                }
            } catch (Exception e) {
                IAlog.m9901a("failed parse adm network request with no input stream", e, new Object[0]);
            }
            ((C2780m.C2781a) this.f9106a).mo13565a(exc, InneractiveErrorCode.CONNECTION_ERROR, eVar2);
        }
    }
}
