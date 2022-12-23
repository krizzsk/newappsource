package p536hj;

import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19691h;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.h */
public final class C17454h extends C20528a<C19691h> {
    public C17454h(C20531d dVar) {
        super(dVar, C19691h.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        C19691h hVar = new C19691h();
        hVar.f49982a = C20528a.m48234o("appId", jSONObject);
        hVar.f49983b = C20528a.m48234o("appVersion", jSONObject);
        hVar.f49984c = C20528a.m48234o("brandId", jSONObject);
        hVar.f49985d = C20528a.m48234o("buildStage", jSONObject);
        hVar.f49986e = C20528a.m48234o("clientId", jSONObject);
        hVar.f49987f = C20528a.m48234o("deviceId", jSONObject);
        hVar.f49988g = C20528a.m48234o("deviceModel", jSONObject);
        hVar.f49989h = C20528a.m48234o("locale", jSONObject);
        hVar.f49990i = C20528a.m48234o("platformName", jSONObject);
        hVar.f49991j = C20528a.m48234o("sdkVersion", jSONObject);
        hVar.f49992k = C20528a.m48234o("sessionToken", jSONObject);
        hVar.f49993l = C20528a.m48234o("timestampUTC", jSONObject);
        hVar.f49994m = C20528a.m48234o("timeZone", jSONObject);
        hVar.f49995n = C20528a.m48234o("userAgent", jSONObject);
        hVar.f49996o = C20528a.m48234o("reportingChannel", jSONObject);
        return hVar;
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19691h hVar = (C19691h) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "appId", hVar.f49982a);
        C20528a.m48237t(jSONObject, "appVersion", hVar.f49983b);
        C20528a.m48237t(jSONObject, "brandId", hVar.f49984c);
        C20528a.m48237t(jSONObject, "buildStage", hVar.f49985d);
        C20528a.m48237t(jSONObject, "clientId", hVar.f49986e);
        C20528a.m48237t(jSONObject, "deviceId", hVar.f49987f);
        C20528a.m48237t(jSONObject, "deviceModel", hVar.f49988g);
        C20528a.m48237t(jSONObject, "locale", hVar.f49989h);
        C20528a.m48237t(jSONObject, "platformName", hVar.f49990i);
        C20528a.m48237t(jSONObject, "sdkVersion", hVar.f49991j);
        C20528a.m48237t(jSONObject, "sessionToken", hVar.f49992k);
        C20528a.m48237t(jSONObject, "timestampUTC", hVar.f49993l);
        C20528a.m48237t(jSONObject, "timeZone", hVar.f49994m);
        C20528a.m48237t(jSONObject, "userAgent", hVar.f49995n);
        C20528a.m48237t(jSONObject, "reportingChannel", hVar.f49996o);
        return jSONObject;
    }
}
