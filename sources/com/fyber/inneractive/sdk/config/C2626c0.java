package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.Vendor;
import com.fyber.inneractive.sdk.util.C3712m0;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.c0 */
public class C2626c0 implements C3712m0.C3713a {

    /* renamed from: a */
    public Integer f9268a = 50;

    /* renamed from: b */
    public Integer f9269b = 50;

    /* renamed from: c */
    public Set<Vendor> f9270c = null;

    /* renamed from: a */
    public JSONObject mo13189a() {
        JSONObject jSONObject = new JSONObject();
        C3712m0.m9974a(jSONObject, "pausePct", this.f9268a);
        C3712m0.m9974a(jSONObject, "playPct", this.f9269b);
        JSONArray jSONArray = new JSONArray();
        Set<Vendor> set = this.f9270c;
        if (set != null) {
            for (Vendor next : set) {
                if (next != null) {
                    jSONArray.put(next);
                }
            }
        }
        C3712m0.m9974a(jSONObject, "vendor", jSONArray);
        return jSONObject;
    }

    /* renamed from: b */
    public Integer mo13203b() {
        return this.f9269b;
    }

    /* renamed from: c */
    public Set<Vendor> mo13204c() {
        return this.f9270c;
    }
}
