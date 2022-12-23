package com.fyber.inneractive.sdk.p048dv.handler;

import android.os.Bundle;
import com.appboy.models.InAppMessageBase;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2922o;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.IAlog;
import com.google.ads.mediation.admob.AdMobAdapter;
import com.google.android.gms.ads.AdFormat;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.query.QueryInfo;
import com.google.android.gms.ads.query.QueryInfoGenerationCallback;
import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.dv.handler.b */
public class C2723b implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ AdFormat f9447a;

    /* renamed from: b */
    public final /* synthetic */ C2725c f9448b;

    /* renamed from: com.fyber.inneractive.sdk.dv.handler.b$a */
    public class C2724a extends QueryInfoGenerationCallback {
        public C2724a() {
        }

        public void onFailure(String str) {
            String str2;
            C2723b bVar = C2723b.this;
            C2725c cVar = bVar.f9448b;
            if (!cVar.f9451b) {
                AdFormat adFormat = bVar.f9447a;
                IAlog.m9902a(String.format("Firing Event 1000 - Fetch error DV - msg  %s", new Object[]{str}), new Object[0]);
                C2926q.C2927a aVar = new C2926q.C2927a(C2922o.FETCH_TOKEN_DV_ERROR, (InneractiveAdRequest) null, (C3648e) null, (JSONArray) null);
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put(InAppMessageBase.MESSAGE, str);
                } catch (Exception unused) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", InAppMessageBase.MESSAGE, str);
                }
                try {
                    str2 = MobileAds.getVersionString();
                } catch (Exception unused2) {
                    str2 = "na";
                }
                try {
                    jSONObject.put(MediationMetaData.KEY_VERSION, str2);
                } catch (Exception unused3) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", MediationMetaData.KEY_VERSION, str2);
                }
                String name = adFormat.name();
                try {
                    jSONObject.put("adFormat", name);
                } catch (Exception unused4) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", "adFormat", name);
                }
                Integer valueOf = Integer.valueOf(cVar.f9453d);
                try {
                    jSONObject.put("success_count", valueOf);
                } catch (Exception unused5) {
                    IAlog.m9906e("Got exception adding param to json object: %s, %s", "success_count", valueOf);
                }
                aVar.f10045f.put(jSONObject);
                aVar.mo13717a((String) null);
                boolean unused6 = C2723b.this.f9448b.f9451b = true;
            }
        }

        public void onSuccess(QueryInfo queryInfo) {
            IAlog.m9902a("DVHanlder - %s - put query: %s", C2723b.this.f9447a.toString(), queryInfo.getQuery());
            synchronized (C2723b.this.f9448b.f9452c) {
                C2723b bVar = C2723b.this;
                C2725c cVar = bVar.f9448b;
                cVar.f9453d++;
                cVar.f9450a.put(bVar.f9447a, queryInfo);
            }
        }
    }

    public C2723b(C2725c cVar, AdFormat adFormat) {
        this.f9448b = cVar;
        this.f9447a = adFormat;
    }

    public void run() {
        try {
            Bundle bundle = new Bundle();
            bundle.putString("query_info_type", "requester_type_3");
            QueryInfo.generate(C3707l.f12893a, this.f9447a, new AdRequest.Builder().setRequestAgent(String.format("FyberMarketplace-v%s", new Object[]{"8.1.5"})).addNetworkExtrasBundle(AdMobAdapter.class, bundle).build(), new C2724a());
        } catch (Throwable unused) {
        }
    }
}
