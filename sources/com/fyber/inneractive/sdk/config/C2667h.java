package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.h */
public class C2667h {

    /* renamed from: a */
    public final Map<String, String> f9334a = new HashMap();

    /* renamed from: b */
    public final Map<String, C2633g> f9335b = new HashMap();

    /* renamed from: a */
    public static C2667h m6742a(JSONObject jSONObject) {
        C2667h hVar = new C2667h();
        JSONObject optJSONObject = jSONObject.optJSONObject("params");
        JSONObject optJSONObject2 = jSONObject.optJSONObject("overrides");
        JSONArray names = optJSONObject.names();
        for (int i = 0; i < names.length(); i++) {
            String optString = names.optString(i, (String) null);
            String optString2 = optJSONObject.optString(optString, (String) null);
            if (!(optString == null || optString2 == null)) {
                hVar.f9334a.put(optString, optString2);
            }
        }
        if (optJSONObject2 != null) {
            JSONArray names2 = optJSONObject2.names();
            for (int i2 = 0; i2 < names2.length(); i2++) {
                String optString3 = names2.optString(i2, (String) null);
                JSONObject optJSONObject3 = optJSONObject2.optJSONObject(optString3);
                if (!(optString3 == null || optJSONObject3 == null)) {
                    hVar.f9335b.put(optString3, new C2633g(optJSONObject3));
                }
            }
        }
        return hVar;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C2667h.class != obj.getClass()) {
            return false;
        }
        C2667h hVar = (C2667h) obj;
        if (!this.f9334a.equals(hVar.f9334a) || !this.f9335b.equals(hVar.f9335b)) {
            return false;
        }
        return true;
    }

    public int hashCode() {
        return this.f9334a.hashCode();
    }

    /* renamed from: a */
    public int mo13271a(String str, int i, int i2) {
        String num = Integer.toString(i);
        if (this.f9334a.containsKey(str)) {
            num = this.f9334a.get(str);
        }
        try {
            i = Integer.parseInt(num);
        } catch (Throwable unused) {
        }
        return Math.max(i, i2);
    }

    /* renamed from: a */
    public boolean mo13273a(String str, boolean z) {
        String bool = Boolean.toString(z);
        if (this.f9334a.containsKey(str)) {
            bool = this.f9334a.get(str);
        }
        try {
            return Boolean.parseBoolean(bool);
        } catch (Throwable unused) {
            return z;
        }
    }

    /* renamed from: a */
    public C2632f mo13272a(String str) {
        C2633g gVar;
        String str2 = IAConfigManager.f9202J.f9216d;
        if (this.f9335b.containsKey(str2)) {
            gVar = this.f9335b.get(str2);
        } else {
            gVar = new C2633g();
        }
        gVar.getClass();
        return gVar.f9287a.containsKey(str) ? gVar.f9287a.get(str) : new C2632f();
    }
}
