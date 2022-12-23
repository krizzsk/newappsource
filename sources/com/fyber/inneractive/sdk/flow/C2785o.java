package com.fyber.inneractive.sdk.flow;

import com.fyber.inneractive.sdk.config.global.C2666s;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.IAlog;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.o */
public class C2785o implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ String f9626a;

    /* renamed from: b */
    public final /* synthetic */ InneractiveAdRequest f9627b;

    /* renamed from: c */
    public final /* synthetic */ C3648e f9628c;

    /* renamed from: d */
    public final /* synthetic */ C2780m f9629d;

    public C2785o(C2780m mVar, String str, InneractiveAdRequest inneractiveAdRequest, C3648e eVar) {
        this.f9629d = mVar;
        this.f9626a = str;
        this.f9627b = inneractiveAdRequest;
        this.f9628c = eVar;
    }

    public void run() {
        IAlog.m9902a("Firing Event 803 - Stack trace - %s", this.f9626a);
        C2922o oVar = C2922o.IA_AD_DESTROYED_WITHOUT_SHOW;
        InneractiveAdRequest inneractiveAdRequest = this.f9627b;
        C3648e eVar = this.f9628c;
        C2780m mVar = this.f9629d;
        JSONArray a = C2666s.m6733a(mVar.f9616h, mVar.f9613e);
        C2926q.C2927a aVar = new C2926q.C2927a(eVar);
        aVar.f10041b = oVar;
        aVar.f10040a = inneractiveAdRequest;
        aVar.f10043d = a;
        JSONObject jSONObject = new JSONObject();
        String str = this.f9626a;
        try {
            jSONObject.put("stack_trace", str);
        } catch (Exception unused) {
            IAlog.m9906e("Got exception adding param to json object: %s, %s", "stack_trace", str);
        }
        aVar.f10045f.put(jSONObject);
        aVar.mo13717a((String) null);
    }
}
