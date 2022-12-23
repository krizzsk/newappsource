package p464ej;

import org.json.JSONException;
import org.json.JSONObject;
import p749qk.C19131a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ej.a */
public final class C16830a extends C20528a<C19131a> {
    public C16830a(C20531d dVar) {
        super(dVar, C19131a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19131a(C20528a.m48234o("appId", jSONObject), C20528a.m48234o("appVersion", jSONObject), C20528a.m48234o("brandId", jSONObject), C20528a.m48234o("clientId", jSONObject), C20528a.m48234o("deviceModel", jSONObject), C20528a.m48234o("deviceId", jSONObject), C20528a.m48234o("platformName", jSONObject), C20528a.m48234o("reportingChannel", jSONObject), C20528a.m48234o("sdkVersion", jSONObject), C20528a.m48234o("timeZone", jSONObject), C20528a.m48234o("trafficSource", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19131a aVar = (C19131a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "appId", aVar.f48634a);
        C20528a.m48237t(jSONObject, "appVersion", aVar.f48635b);
        C20528a.m48237t(jSONObject, "brandId", aVar.f48636c);
        C20528a.m48237t(jSONObject, "clientId", aVar.f48637d);
        C20528a.m48237t(jSONObject, "deviceModel", aVar.f48638e);
        C20528a.m48237t(jSONObject, "deviceId", aVar.f48639f);
        C20528a.m48237t(jSONObject, "platformName", aVar.f48640g);
        C20528a.m48237t(jSONObject, "reportingChannel", aVar.f48641h);
        C20528a.m48237t(jSONObject, "sdkVersion", aVar.f48642i);
        C20528a.m48237t(jSONObject, "timeZone", aVar.f48643j);
        C20528a.m48237t(jSONObject, "trafficSource", aVar.f48644k);
        return jSONObject;
    }
}
