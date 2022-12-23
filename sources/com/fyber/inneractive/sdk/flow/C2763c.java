package com.fyber.inneractive.sdk.flow;

import com.appboy.models.InAppMessageBase;
import com.appboy.models.outgoing.TwitterUser;
import com.fyber.inneractive.sdk.config.C2618a;
import com.fyber.inneractive.sdk.config.C2703z;
import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.external.InneractiveErrorCode;
import com.fyber.inneractive.sdk.external.InneractiveInfrastructureError;
import com.fyber.inneractive.sdk.flow.C2776j;
import com.fyber.inneractive.sdk.interfaces.C2809a;
import com.fyber.inneractive.sdk.metrics.C2830c;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.network.C2931r;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Arrays;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.c */
public abstract class C2763c<Response extends C3648e, Content extends C2776j> implements C2809a {

    /* renamed from: a */
    public InneractiveAdRequest f9547a;

    /* renamed from: b */
    public Response f9548b;

    /* renamed from: c */
    public Content f9549c;

    /* renamed from: d */
    public C2809a.C2810a f9550d;

    /* renamed from: e */
    public C2703z f9551e;

    /* renamed from: f */
    public C2666s f9552f;

    /* renamed from: g */
    public boolean f9553g = false;

    /* renamed from: a */
    public void mo13515a() {
        this.f9547a = null;
        this.f9548b = null;
        this.f9549c = null;
        this.f9550d = null;
        this.f9551e = null;
    }

    /* renamed from: b */
    public abstract String mo13296b();

    /* renamed from: c */
    public C2703z mo13519c() {
        InneractiveAdRequest inneractiveAdRequest = this.f9547a;
        return inneractiveAdRequest == null ? this.f9551e : inneractiveAdRequest.getSelectedUnitConfig();
    }

    /* renamed from: d */
    public void mo13520d() {
        String str;
        InneractiveAdRequest inneractiveAdRequest = this.f9547a;
        if (inneractiveAdRequest != null) {
            C2830c.f9722c.mo13620a(inneractiveAdRequest.f9541b).mo13629i();
        } else {
            Response response = this.f9548b;
            if (!(response == null || (str = response.f12768z) == null)) {
                C2830c.f9722c.mo13620a(str).mo13629i();
            }
        }
        C2809a.C2810a aVar = this.f9550d;
        if (aVar != null) {
            aVar.mo13527a();
        }
    }

    /* renamed from: e */
    public abstract void mo13297e();

    /* renamed from: a */
    public void mo13516a(InneractiveAdRequest inneractiveAdRequest, C3648e eVar, C2666s sVar, C2809a.C2810a aVar) {
        this.f9547a = inneractiveAdRequest;
        this.f9548b = eVar;
        this.f9550d = aVar;
        this.f9552f = sVar;
        if (inneractiveAdRequest == null) {
            this.f9551e = C2618a.m6642b(eVar.f12755m);
        }
        try {
            mo13297e();
        } catch (Throwable th) {
            IAlog.m9906e("Failed to start ContentLoader", IAlog.m9899a((Object) this));
            C2931r.m7254a(th, inneractiveAdRequest, eVar);
            mo13518a(new InneractiveInfrastructureError(InneractiveErrorCode.SDK_INTERNAL_ERROR));
        }
    }

    /* renamed from: a */
    public void mo13517a(InneractiveError inneractiveError) {
        C3714n.m9976a(new C2760a(new C2762b(this.f9548b, this.f9547a, mo13296b(), this.f9552f.mo13268c()), inneractiveError));
    }

    /* renamed from: a */
    public void mo13518a(InneractiveInfrastructureError inneractiveInfrastructureError) {
        Content content;
        String str;
        if (this.f9550d != null) {
            InneractiveAdRequest inneractiveAdRequest = this.f9547a;
            Response response = this.f9548b;
            if (inneractiveInfrastructureError.getErrorCode().getMetricable() == InneractiveErrorCode.Metricable.INCLUDED_IN_FAILED_METRICS && ((content = this.f9549c) == null || content.mo13299d() || this.f9549c.isVideoAd())) {
                IAlog.m9902a("Firing Event 801 - AdLoadFailed - errorCode - %s", inneractiveInfrastructureError.getErrorCode());
                if (inneractiveInfrastructureError.getCause() != null) {
                    str = Arrays.toString(inneractiveInfrastructureError.getCause().getStackTrace());
                } else {
                    str = C3727s.m9988a(7, 6);
                }
                C2666s sVar = this.f9552f;
                JSONArray c = sVar == null ? null : sVar.mo13268c();
                C2922o oVar = C2922o.IA_AD_LOAD_FAILED;
                C2926q.C2927a aVar = new C2926q.C2927a(response);
                aVar.f10041b = oVar;
                aVar.f10040a = inneractiveAdRequest;
                aVar.f10043d = c;
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
            this.f9550d.mo13529a(inneractiveInfrastructureError);
        }
    }
}
