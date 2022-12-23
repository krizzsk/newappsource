package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3712m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.w */
public class C2700w implements C3712m0.C3713a {

    /* renamed from: a */
    public UnitDisplayType f9419a;

    /* renamed from: a */
    public JSONObject mo13189a() {
        JSONObject jSONObject = new JSONObject();
        C3712m0.m9974a(jSONObject, "unitDisplayType", this.f9419a);
        return jSONObject;
    }
}
