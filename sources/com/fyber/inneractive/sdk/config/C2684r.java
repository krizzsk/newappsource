package com.fyber.inneractive.sdk.config;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import com.fyber.inneractive.sdk.util.C3712m0;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.r */
public class C2684r implements C3712m0.C3713a {

    /* renamed from: a */
    public Integer f9367a = null;

    /* renamed from: b */
    public UnitDisplayType f9368b;

    /* renamed from: c */
    public Boolean f9369c;

    /* renamed from: d */
    public Integer f9370d;

    /* renamed from: a */
    public JSONObject mo13189a() {
        JSONObject jSONObject = new JSONObject();
        C3712m0.m9974a(jSONObject, "refresh", this.f9367a);
        C3712m0.m9974a(jSONObject, "unitDisplayType", this.f9368b);
        C3712m0.m9974a(jSONObject, "close", this.f9369c);
        C3712m0.m9974a(jSONObject, "hideDelay", this.f9370d);
        return jSONObject;
    }
}
