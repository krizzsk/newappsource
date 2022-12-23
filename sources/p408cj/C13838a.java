package p408cj;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;
import p657mn.C18405a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: cj.a */
public final class C13838a extends C20528a<C18405a> {
    public C13838a(C20531d dVar) {
        super(dVar, C18405a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18405a(C20528a.m48233n("amount", jSONObject).longValue(), C20528a.m48234o(AppsFlyerProperties.CURRENCY_CODE, jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18405a aVar = (C18405a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "amount", Long.valueOf(aVar.f46926a));
        C20528a.m48237t(jSONObject, AppsFlyerProperties.CURRENCY_CODE, aVar.f46927b);
        return jSONObject;
    }
}
