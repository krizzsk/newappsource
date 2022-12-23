package p582jj;

import com.appsflyer.AppsFlyerProperties;
import com.appsflyer.ServerParameters;
import org.json.JSONException;
import org.json.JSONObject;
import p705on.C18810p;
import p867vk.C20144a;
import p867vk.C20147d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.a */
public final class C17856a extends C20528a<C20144a> {
    public C17856a(C20531d dVar) {
        super(dVar, C20144a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20144a(C20528a.m48234o(ServerParameters.BRAND, jSONObject), C20528a.m48234o("requestReference", jSONObject), (C18810p) mo52728m(jSONObject, "userIdentity", C18810p.class), C20528a.m48234o("upc", jSONObject), C20528a.m48234o("billerId", jSONObject), (C20147d) mo52728m(jSONObject, "restrictions", C20147d.class), C20528a.m48234o(AppsFlyerProperties.USER_EMAIL, jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20144a aVar = (C20144a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, ServerParameters.BRAND, aVar.f51122a);
        C20528a.m48237t(jSONObject, "requestReference", aVar.f51123b);
        mo52730s(jSONObject, "userIdentity", aVar.f51124c);
        C20528a.m48237t(jSONObject, "upc", aVar.f51125d);
        C20528a.m48237t(jSONObject, "billerId", aVar.f51126e);
        mo52730s(jSONObject, "restrictions", aVar.f51127f);
        C20528a.m48237t(jSONObject, AppsFlyerProperties.USER_EMAIL, aVar.f51128g);
        return jSONObject;
    }
}
