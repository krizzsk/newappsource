package com.fyber.inneractive.sdk.config.remote;

import com.fyber.inneractive.sdk.config.enums.UnitDisplayType;
import org.json.JSONObject;

/* renamed from: com.fyber.inneractive.sdk.config.remote.b */
public class C2686b {

    /* renamed from: a */
    public UnitDisplayType f9378a;

    /* renamed from: b */
    public Boolean f9379b;

    /* renamed from: c */
    public Integer f9380c;

    /* renamed from: d */
    public Integer f9381d;

    /* renamed from: a */
    public static C2686b m6758a(JSONObject jSONObject) {
        Boolean bool;
        Integer num = null;
        if (jSONObject == null) {
            return null;
        }
        C2686b bVar = new C2686b();
        Integer valueOf = Integer.valueOf(jSONObject.optInt("hide", Integer.MIN_VALUE));
        Integer valueOf2 = Integer.valueOf(jSONObject.optInt("refresh", Integer.MIN_VALUE));
        bVar.f9378a = UnitDisplayType.fromValue(jSONObject.optString("unitDisplayType"));
        if (jSONObject.has("close")) {
            bool = Boolean.valueOf(jSONObject.optBoolean("close", true));
        } else {
            bool = null;
        }
        bVar.f9379b = bool;
        if (valueOf.intValue() == Integer.MIN_VALUE) {
            valueOf = null;
        }
        bVar.f9381d = valueOf;
        if (valueOf2.intValue() != Integer.MIN_VALUE) {
            num = valueOf2;
        }
        bVar.f9380c = num;
        return bVar;
    }
}
