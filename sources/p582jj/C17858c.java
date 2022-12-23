package p582jj;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20146c;
import p867vk.C20151h;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.c */
public final class C17858c extends C20528a<C20146c> {
    public C17858c(C20531d dVar) {
        super(dVar, C20146c.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20146c(C20528a.m48233n("amount", jSONObject).longValue(), C20528a.m48234o(AppsFlyerProperties.CURRENCY_CODE, jSONObject), (C20151h) mo52728m(jSONObject, "topupRestrictions", C20151h.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20146c cVar = (C20146c) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "amount", Long.valueOf(cVar.f51131a));
        C20528a.m48237t(jSONObject, AppsFlyerProperties.CURRENCY_CODE, cVar.f51132b);
        mo52730s(jSONObject, "topupRestrictions", cVar.f51133c);
        return jSONObject;
    }
}
