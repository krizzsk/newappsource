package com.fyber.inneractive.sdk.config.global;

import com.fyber.inneractive.sdk.util.IAlog;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.global.l */
public class C2659l {

    /* renamed from: a */
    public final Map<String, C2664q> f9325a = new HashMap();

    /* renamed from: a */
    public C2664q mo13257a(String str) {
        return this.f9325a.get(str);
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2659l.class != obj.getClass()) {
            return false;
        }
        return this.f9325a.equals(((C2659l) obj).f9325a);
    }

    public int hashCode() {
        return this.f9325a.hashCode();
    }

    public String toString() {
        return String.format("remoteConfig - features: %s", new Object[]{this.f9325a.values()});
    }

    /* renamed from: a */
    public static C2659l m6707a(JSONObject jSONObject) throws Exception {
        C2659l lVar = new C2659l();
        JSONArray optJSONArray = jSONObject.optJSONArray("features");
        char c = 0;
        int i = 0;
        while (i < optJSONArray.length()) {
            JSONObject jSONObject2 = optJSONArray.getJSONObject(i);
            C2664q qVar = new C2664q();
            qVar.f9328b = jSONObject2.getString("id");
            JSONObject optJSONObject = jSONObject2.optJSONObject("params");
            if (optJSONObject != null) {
                qVar.f9327a = new C2662o(optJSONObject);
            } else {
                Object[] objArr = new Object[1];
                objArr[c] = qVar.f9328b;
                IAlog.m9902a("RemoteFeature fromJson. feature %s has no params!", objArr);
            }
            JSONArray optJSONArray2 = jSONObject2.optJSONArray("experiments");
            if (optJSONArray2 != null) {
                for (int i2 = 0; i2 < optJSONArray2.length(); i2++) {
                    JSONObject jSONObject3 = optJSONArray2.getJSONObject(i2);
                    C2635b bVar = new C2635b();
                    bVar.f9290a = jSONObject3.getString("id");
                    bVar.f9291b = jSONObject3.optInt("perc", 10);
                    JSONArray jSONArray = jSONObject3.getJSONArray("variants");
                    for (int i3 = 0; i3 < jSONArray.length(); i3++) {
                        JSONObject jSONObject4 = jSONArray.getJSONObject(i3);
                        C2658k kVar = new C2658k();
                        kVar.f9323b = jSONObject4.getString("id");
                        kVar.f9324c = jSONObject4.getInt("perc");
                        JSONObject optJSONObject2 = jSONObject4.optJSONObject("params");
                        if (optJSONObject2 != null) {
                            kVar.f9327a = new C2662o(optJSONObject2);
                        }
                        bVar.f9292c.add(kVar);
                    }
                    C2635b.m6672a(bVar, jSONObject3.optJSONObject("include"), true);
                    C2635b.m6672a(bVar, jSONObject3.optJSONObject("exclude"), false);
                    qVar.f9329c.put(bVar.f9290a, bVar);
                }
            }
            lVar.f9325a.put(qVar.f9328b, qVar);
            i++;
            c = 0;
        }
        return lVar;
    }
}
