package com.fyber.inneractive.sdk.config;

import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.config.global.C2659l;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2899f;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2936u;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;

/* renamed from: com.fyber.inneractive.sdk.config.p */
public class C2682p implements C2936u<C2659l> {

    /* renamed from: a */
    public final /* synthetic */ IAConfigManager f9357a;

    public C2682p(IAConfigManager iAConfigManager) {
        this.f9357a = iAConfigManager;
    }

    /* renamed from: a */
    public void mo13154a(Object obj, Exception exc, boolean z) {
        C2659l lVar = (C2659l) obj;
        if (lVar != null) {
            IAlog.m9902a("calling mergeRemoteFeaturesConfig fromCache: %b", Boolean.valueOf(z));
            this.f9357a.f9238z.f9288a = lVar;
        } else if (exc == null) {
        } else {
            if (exc instanceof C2899f) {
                IAlog.m9902a("remote features config not modified", new Object[0]);
                return;
            }
            IAlog.m9902a("Config manager: Error getting or parsing remote config. Resetting configurable features", new Object[0]);
            IAConfigManager iAConfigManager = this.f9357a;
            IAConfigManager iAConfigManager2 = IAConfigManager.f9202J;
            iAConfigManager.getClass();
            new C2926q.C2927a(C2922o.FATAL_FEATURES_CONFIG_ERROR, (InneractiveAdRequest) null, (C3648e) null, (JSONArray) null).mo13716a("exception", exc.getClass().getName(), InAppMessageBase.MESSAGE, exc.getLocalizedMessage()).mo13717a((String) null);
        }
    }
}
