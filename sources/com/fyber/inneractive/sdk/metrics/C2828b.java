package com.fyber.inneractive.sdk.metrics;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.response.C3648e;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3714n;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.metrics.b */
public class C2828b<T extends C3648e> extends C2827a {

    /* renamed from: g */
    public static final String f9710g = String.valueOf(24);

    /* renamed from: h */
    public static final String f9711h = String.valueOf(3);

    /* renamed from: i */
    public static final String f9712i = String.valueOf(24);

    /* renamed from: j */
    public static final String f9713j = String.valueOf(3);

    /* renamed from: b */
    public final String f9714b;

    /* renamed from: c */
    public final UnitDisplayType f9715c;

    /* renamed from: d */
    public final T f9716d;

    /* renamed from: e */
    public final InneractiveAdRequest f9717e;

    /* renamed from: f */
    public final JSONArray f9718f;

    /* renamed from: com.fyber.inneractive.sdk.metrics.b$a */
    public class C2829a implements Runnable {

        /* renamed from: a */
        public final /* synthetic */ C2833f f9719a;

        /* renamed from: b */
        public final /* synthetic */ Map f9720b;

        public C2829a(C2833f fVar, Map map) {
            this.f9719a = fVar;
            this.f9720b = map;
        }

        public void run() {
            UnitDisplayType unitDisplayType;
            String str;
            int i;
            int i2;
            IAlog.m9902a("MetricCreativeReporter: sendMetricEvent()", new Object[0]);
            C2828b bVar = C2828b.this;
            if (bVar.f9714b != null && (unitDisplayType = bVar.f9715c) != null) {
                UnitDisplayType unitDisplayType2 = UnitDisplayType.BANNER;
                if (unitDisplayType == unitDisplayType2 || unitDisplayType == UnitDisplayType.MRECT || unitDisplayType.isFullscreenUnit()) {
                    IAlog.m9902a("MetricCreativeReporter: sendMetricEvent(), collectorData: data: %s", this.f9719a.toString());
                    UnitDisplayType unitDisplayType3 = C2828b.this.f9715c;
                    if (unitDisplayType3 == unitDisplayType2 || unitDisplayType3 == UnitDisplayType.MRECT) {
                        IAConfigManager iAConfigManager = IAConfigManager.f9202J;
                        C2667h hVar = iAConfigManager.f9234v.f9337b;
                        String str2 = C2828b.f9710g;
                        if (hVar.f9334a.containsKey("ad_metrics_interval_banner")) {
                            str2 = hVar.f9334a.get("ad_metrics_interval_banner");
                        }
                        C2667h hVar2 = iAConfigManager.f9234v.f9337b;
                        String str3 = C2828b.f9711h;
                        if (hVar2.f9334a.containsKey("ad_metrics_limit_banner")) {
                            str3 = hVar2.f9334a.get("ad_metrics_limit_banner");
                        }
                        i2 = C3727s.m9986a(str2, 24);
                        i = C3727s.m9986a(str3, 3);
                        str = "LastSentMetricsBanner";
                    } else {
                        IAConfigManager iAConfigManager2 = IAConfigManager.f9202J;
                        C2667h hVar3 = iAConfigManager2.f9234v.f9337b;
                        String str4 = C2828b.f9712i;
                        if (hVar3.f9334a.containsKey("ad_metrics_interval_interstitial")) {
                            str4 = hVar3.f9334a.get("ad_metrics_interval_interstitial");
                        }
                        C2667h hVar4 = iAConfigManager2.f9234v.f9337b;
                        String str5 = C2828b.f9713j;
                        if (hVar4.f9334a.containsKey("ad_metrics_limit_interstitial")) {
                            str5 = hVar4.f9334a.get("ad_metrics_limit_interstitial");
                        }
                        i2 = C3727s.m9986a(str4, 24);
                        i = C3727s.m9986a(str5, 3);
                        str = "LastSentMetricsInterstitial";
                    }
                    Application application = C3707l.f12893a;
                    if (application != null) {
                        SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                        JSONArray jSONArray = new JSONArray();
                        try {
                            jSONArray = new JSONArray(sharedPreferences.getString(str, "[]"));
                        } catch (JSONException unused) {
                        }
                        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                        C2828b bVar2 = C2828b.this;
                        bVar2.getClass();
                        if (IAConfigManager.f9202J.f9234v.f9337b.mo13273a(bVar2.f9709a, false) && !C2827a.m7026a(i2, i, jSONArray, copyOnWriteArrayList)) {
                            copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                            C2828b bVar3 = C2828b.this;
                            InneractiveAdRequest inneractiveAdRequest = bVar3.f9717e;
                            T t = bVar3.f9716d;
                            Map map = this.f9720b;
                            try {
                                C2924p pVar = C2924p.METRIC_MEASUREMENTS_EVENT;
                                JSONArray jSONArray2 = bVar3.f9718f;
                                C2926q.C2927a aVar = new C2926q.C2927a(t);
                                aVar.f10042c = pVar;
                                aVar.f10040a = inneractiveAdRequest;
                                aVar.f10043d = jSONArray2;
                                JSONObject jSONObject = new JSONObject();
                                for (String str6 : map.keySet()) {
                                    Object obj = map.get(str6);
                                    try {
                                        jSONObject.put(str6, obj);
                                    } catch (Exception unused2) {
                                        IAlog.m9906e("Got exception adding param to json object: %s, %s", str6, obj);
                                    }
                                }
                                aVar.f10045f.put(jSONObject);
                                aVar.mo13717a((String) null);
                            } catch (Exception unused3) {
                            }
                        }
                        sharedPreferences.edit().putString(str, new JSONArray(copyOnWriteArrayList).toString()).apply();
                        return;
                    }
                    return;
                }
                IAlog.m9902a("Unit display type %s is not supported for metric event", C2828b.this.f9715c.value());
            }
        }
    }

    public C2828b(T t, InneractiveAdRequest inneractiveAdRequest, String str, UnitDisplayType unitDisplayType, JSONArray jSONArray) {
        super("send_metric_report");
        this.f9716d = t;
        this.f9717e = inneractiveAdRequest;
        this.f9714b = str;
        this.f9715c = unitDisplayType;
        this.f9718f = jSONArray;
    }

    /* renamed from: a */
    public void mo13618a() {
        C2830c cVar = C2830c.f9722c;
        C2833f a = cVar.mo13620a(this.f9714b);
        Map<String, Long> j = a.mo13630j();
        if (!a.mo13621a()) {
            IAlog.m9902a("MetricCreativeReporter: Metric data not valid, data: %s", cVar.mo13620a(this.f9714b).toString());
            return;
        }
        cVar.f9723a.remove(this.f9714b);
        C3714n.m9976a(new C2829a(a, j));
    }
}
