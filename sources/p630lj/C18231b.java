package p630lj;

import com.appsflyer.ServerParameters;
import com.appsflyer.share.Constants;
import org.json.JSONException;
import org.json.JSONObject;
import p774rn.C19292b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: lj.b */
public final class C18231b extends C20528a<C19292b> {
    public C18231b(C20531d dVar) {
        super(dVar, C19292b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19292b(C20528a.m48234o("id", jSONObject), C20528a.m48233n(ServerParameters.TIMESTAMP_KEY, jSONObject), C20528a.m48232k(Constants.URL_CAMPAIGN, jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19292b bVar = (C19292b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, Constants.URL_CAMPAIGN, bVar.f49049c);
        C20528a.m48237t(jSONObject, "id", bVar.f49047a);
        C20528a.m48237t(jSONObject, ServerParameters.TIMESTAMP_KEY, bVar.f49048b);
        return jSONObject;
    }
}
