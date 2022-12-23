package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.g */
public class C2691g {

    /* renamed from: a */
    public UnitDisplayType f9387a;

    /* renamed from: a */
    public static C2691g m6763a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        C2691g gVar = new C2691g();
        UnitDisplayType fromValue = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (fromValue == null) {
            return null;
        }
        gVar.f9387a = fromValue;
        return gVar;
    }
}
