package com.fyber.inneractive.sdk.config;

import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.g */
public class C2633g {

    /* renamed from: a */
    public final Map<String, C2632f> f9287a = new HashMap();

    public C2633g() {
    }

    /* renamed from: a */
    public final void mo13229a(JSONObject jSONObject) {
        JSONArray names;
        if (jSONObject != null) {
            JSONArray names2 = jSONObject.names();
            for (int i = 0; i < names2.length(); i++) {
                String optString = names2.optString(i, (String) null);
                JSONObject optJSONObject = jSONObject.optJSONObject(optString);
                C2632f fVar = new C2632f();
                if (!(optJSONObject == null || (names = optJSONObject.names()) == null)) {
                    for (int i2 = 0; i2 < names.length(); i2++) {
                        String optString2 = names.optString(i2, (String) null);
                        String optString3 = optJSONObject.optString(optString2, (String) null);
                        if (!(optString2 == null || optString3 == null)) {
                            fVar.f9286a.put(optString2, optString3);
                        }
                    }
                }
                this.f9287a.put(optString, fVar);
            }
        }
    }

    public C2633g(JSONObject jSONObject) {
        mo13229a(jSONObject);
    }
}
