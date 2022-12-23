package p582jj;

import com.appsflyer.ServerParameters;
import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20148e;
import p867vk.C20149f;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.e */
public final class C17860e extends C20528a<C20148e> {
    public C17860e(C20531d dVar) {
        super(dVar, C20148e.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20148e((C20149f) mo52728m(jSONObject, "pots", C20149f.class), C20528a.m48234o("ledgerPosition", jSONObject), C20528a.m48234o("healthStatus", jSONObject), C20528a.m48234o(ServerParameters.STATUS, jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20148e eVar = (C20148e) obj;
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "pots", eVar.f51137a);
        C20528a.m48237t(jSONObject, "ledgerPosition", eVar.f51138b);
        C20528a.m48237t(jSONObject, "healthStatus", eVar.f51139c);
        C20528a.m48237t(jSONObject, ServerParameters.STATUS, eVar.f51140d);
        return jSONObject;
    }
}
