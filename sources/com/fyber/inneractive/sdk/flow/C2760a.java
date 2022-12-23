package com.fyber.inneractive.sdk.flow;

import android.app.Application;
import android.content.SharedPreferences;
import com.fyber.inneractive.sdk.config.C2667h;
import com.fyber.inneractive.sdk.config.IAConfigManager;
import com.fyber.inneractive.sdk.external.InneractiveAdRequest;
import com.fyber.inneractive.sdk.external.InneractiveError;
import com.fyber.inneractive.sdk.metrics.C2827a;
import com.fyber.inneractive.sdk.network.C2924p;
import com.fyber.inneractive.sdk.network.C2926q;
import com.fyber.inneractive.sdk.util.C3707l;
import com.fyber.inneractive.sdk.util.C3727s;
import com.fyber.inneractive.sdk.util.IAlog;
import com.usebutton.sdk.internal.api.burly.Burly;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArrayList;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.flow.a */
public class C2760a implements Runnable {

    /* renamed from: a */
    public final /* synthetic */ InneractiveError f9538a;

    /* renamed from: b */
    public final /* synthetic */ C2762b f9539b;

    public C2760a(C2762b bVar, InneractiveError inneractiveError) {
        this.f9539b = bVar;
        this.f9538a = inneractiveError;
    }

    public void run() {
        String str;
        String str2;
        T t = this.f9539b.f9544b;
        if (t != null && (str = t.f12750h) != null) {
            Map<String, String> map = t.f12758p;
            if (map != null || t.f12759q != null) {
                IAConfigManager iAConfigManager = IAConfigManager.f9202J;
                C2667h hVar = iAConfigManager.f9234v.f9337b;
                String str3 = C2762b.f9542e;
                if (hVar.f9334a.containsKey("max_failed_creatives_interval_hours")) {
                    str3 = hVar.f9334a.get("max_failed_creatives_interval_hours");
                }
                C2667h hVar2 = iAConfigManager.f9234v.f9337b;
                String str4 = C2762b.f9543f;
                if (hVar2.f9334a.containsKey("max_failed_creatives_per_interval")) {
                    str4 = hVar2.f9334a.get("max_failed_creatives_per_interval");
                }
                int a = C3727s.m9986a(str3, 24);
                int a2 = C3727s.m9986a(str4, 1);
                Application application = C3707l.f12893a;
                if (application != null) {
                    SharedPreferences sharedPreferences = application.getSharedPreferences("IAConfigPrefs", 0);
                    JSONArray jSONArray = new JSONArray();
                    try {
                        jSONArray = new JSONArray(sharedPreferences.getString(Burly.KEY_LT, "[]"));
                    } catch (JSONException unused) {
                    }
                    CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
                    C2762b bVar = this.f9539b;
                    bVar.getClass();
                    if (IAConfigManager.f9202J.f9234v.f9337b.mo13273a(bVar.f9709a, false) && !C2827a.m7026a(a, a2, jSONArray, copyOnWriteArrayList)) {
                        copyOnWriteArrayList.add(Long.valueOf(System.currentTimeMillis()));
                        if (map != null) {
                            try {
                                str2 = new JSONObject(map).toString();
                            } catch (Throwable unused2) {
                                str2 = "";
                            }
                        } else {
                            str2 = this.f9539b.f9544b.f12759q;
                        }
                        C2762b bVar2 = this.f9539b;
                        InneractiveAdRequest inneractiveAdRequest = bVar2.f9545c;
                        T t2 = bVar2.f9544b;
                        InneractiveError inneractiveError = this.f9538a;
                        JSONArray jSONArray2 = bVar2.f9546d;
                        C2924p pVar = C2924p.IA_AD_FAILURE_DATA;
                        C2926q.C2927a aVar = new C2926q.C2927a(t2);
                        aVar.f10042c = pVar;
                        aVar.f10040a = inneractiveAdRequest;
                        aVar.f10043d = jSONArray2;
                        JSONObject jSONObject = new JSONObject();
                        try {
                            jSONObject.put("raw_response", str);
                        } catch (Exception unused3) {
                            IAlog.m9906e("Got exception adding param to json object: %s, %s", "raw_response", str);
                        }
                        try {
                            jSONObject.put("headers", str2);
                        } catch (Exception unused4) {
                            IAlog.m9906e("Got exception adding param to json object: %s, %s", "headers", str2);
                        }
                        String description = inneractiveError.description();
                        try {
                            jSONObject.put("error_code", description);
                        } catch (Exception unused5) {
                            IAlog.m9906e("Got exception adding param to json object: %s, %s", "error_code", description);
                        }
                        aVar.f10045f.put(jSONObject);
                        aVar.mo13717a((String) null);
                    }
                    sharedPreferences.edit().putString(Burly.KEY_LT, new JSONArray(copyOnWriteArrayList).toString()).apply();
                }
            }
        }
    }
}
