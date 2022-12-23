package com.fyber.inneractive.sdk.cache.session;

import com.fyber.inneractive.sdk.cache.session.enums.C2608b;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.cache.session.f */
public class C2610f {

    /* renamed from: a */
    public HashMap<C2608b, C2606e> f9200a = new C2611a(this);

    /* renamed from: com.fyber.inneractive.sdk.cache.session.f$a */
    public class C2611a extends HashMap<C2608b, C2606e> {
        public C2611a(C2610f fVar) {
            for (C2608b bVar : C2608b.values()) {
                if (bVar != C2608b.NONE) {
                    put(bVar, new C2606e());
                }
            }
        }
    }

    /* renamed from: a */
    public JSONObject mo13181a() {
        String str;
        JSONObject jSONObject = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            for (Map.Entry next : this.f9200a.entrySet()) {
                C2608b bVar = (C2608b) next.getKey();
                try {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.put("type", bVar.f9197a.value());
                    if (bVar.name().toLowerCase().contains("video")) {
                        str = "video";
                    } else {
                        str = "display";
                    }
                    jSONObject2.put("subType", str);
                    jSONObject2.put("session_data", ((C2606e) next.getValue()).mo13180a(true, true));
                    jSONArray.put(jSONObject2);
                } catch (Exception unused) {
                }
            }
            jSONObject.put("content", jSONArray);
        } catch (Exception unused2) {
        }
        return jSONObject;
    }
}
