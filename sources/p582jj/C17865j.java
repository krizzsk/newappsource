package p582jj;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONException;
import org.json.JSONObject;
import p843uk.C19954x;
import p867vk.C20153j;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.j */
public final class C17865j extends C20528a<C20153j> {
    public C17865j(C20531d dVar) {
        super(dVar, C20153j.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20153j(C20528a.m48232k("balance", jSONObject), C20528a.m48234o("error", jSONObject), C20528a.m48234o("outcome", jSONObject), C20528a.m48234o(AppsFlyerProperties.CURRENCY_CODE, jSONObject), mo52727l(jSONObject, "paymentReferences", C19954x.class), C20528a.m48234o("purchaseId", jSONObject), C20528a.m48234o("requestReference", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20153j jVar = (C20153j) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "balance", jVar.f51153a);
        C20528a.m48237t(jSONObject, "error", jVar.f51154b);
        C20528a.m48237t(jSONObject, "outcome", jVar.f51155c);
        C20528a.m48237t(jSONObject, AppsFlyerProperties.CURRENCY_CODE, jVar.f51156d);
        mo52729r(jSONObject, "paymentReferences", jVar.f51157e);
        C20528a.m48237t(jSONObject, "purchaseId", jVar.f51158f);
        C20528a.m48237t(jSONObject, "requestReference", jVar.f51159g);
        return jSONObject;
    }
}
