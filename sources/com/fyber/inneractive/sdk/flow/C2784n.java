package com.fyber.inneractive.sdk.flow;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C2765e;
import com.fyber.inneractive.sdk.flow.C2780m;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.n */
public class C2784n implements C2765e.C2767b {

    /* renamed from: a */
    public final /* synthetic */ C2780m f9625a;

    public C2784n(C2780m mVar) {
        this.f9625a = mVar;
    }

    /* renamed from: a */
    public void mo13567a(InneractiveAdRequest inneractiveAdRequest, C3648e eVar, InneractiveInfrastructureError inneractiveInfrastructureError) {
        C2776j jVar;
        String str;
        if (this.f9625a.f9610b != null) {
            if (inneractiveInfrastructureError.getErrorCode().shouldSendTimeMetric()) {
                this.f9625a.mo13560a(inneractiveAdRequest, eVar);
            }
            C2780m mVar = this.f9625a;
            if (mVar.f9618j) {
                if (eVar == null && inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((jVar = mVar.f9613e) == null || jVar.mo13299d() || mVar.f9613e.isVideoAd())) {
                    IAlog.m9902a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                    if (inneractiveInfrastructureError.getCause() != null) {
                        str = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                    } else {
                        str = C3727s.m9988a(7, 6);
                    }
                    C2922o oVar = C2922o.IA_AD_LOAD_FAILED;
                    JSONArray a = C2666s.m6733a(mVar.f9616h, mVar.f9613e);
                    C2926q.C2927a aVar = new C2926q.C2927a((C3648e) null);
                    aVar.f10041b = oVar;
                    aVar.f10040a = inneractiveAdRequest;
                    aVar.f10043d = a;
                    JSONObject jSONObject = new JSONObject();
                    String inneractiveErrorCode = inneractiveInfrastructureError.getErrorCode().toString();
                    try {
                        jSONObject.put(InAppMessageBase.MESSAGE, inneractiveErrorCode);
                    } catch (Exception unused) {
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", InAppMessageBase.MESSAGE, inneractiveErrorCode);
                    }
                    try {
                        jSONObject.put(TwitterUser.DESCRIPTION_KEY, str);
                    } catch (Exception unused2) {
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", TwitterUser.DESCRIPTION_KEY, str);
                    }
                    String description = inneractiveInfrastructureError.description();
                    try {
                        jSONObject.put("extra_description", description);
                    } catch (Exception unused3) {
                        IAlog.m9906e("Got exception adding param to json object: %s, %s", "extra_description", description);
                    }
                    aVar.f10045f.put(jSONObject);
                    aVar.mo13717a((String) null);
                }
                C2780m mVar2 = this.f9625a;
                mVar2.f9610b.onInneractiveFailedAdRequest(mVar2, inneractiveInfrastructureError.getErrorCode());
                return;
            }
            C2780m.C2783c cVar = mVar.f9617i;
            if (cVar != null) {
                cVar.onAdRefreshFailed(mVar, inneractiveInfrastructureError.getErrorCode());
            }
        }
    }
}
