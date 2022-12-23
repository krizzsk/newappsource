package p582jj;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20147d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.d */
public final class C17859d extends C20528a<C20147d> {
    public C17859d(C20531d dVar) {
        super(dVar, C20147d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20147d(C20528a.m48234o(AppsFlyerProperties.CURRENCY_CODE, jSONObject), C20528a.m48233n("lowerLimit", jSONObject).longValue(), C20528a.m48233n("upperLimit", jSONObject).longValue());
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20147d dVar = (C20147d) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, AppsFlyerProperties.CURRENCY_CODE, dVar.f51134a);
        C20528a.m48237t(jSONObject, "lowerLimit", Long.valueOf(dVar.f51135b));
        C20528a.m48237t(jSONObject, "upperLimit", Long.valueOf(dVar.f51136c));
        return jSONObject;
    }
}
