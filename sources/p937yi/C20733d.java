package p937yi;

import org.json.JSONException;
import org.json.JSONObject;
import p631lk.C18235c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: yi.d */
public final class C20733d extends C20528a<C18235c> {
    public C20733d(C20531d dVar) {
        super(dVar, C18235c.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18235c(C20528a.m48233n("issueVersion", jSONObject).longValue(), C20528a.m48234o("tokenId", jSONObject), C20528a.m48234o("travelEligibility", jSONObject), C20528a.m48234o("payloadData", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18235c cVar = (C18235c) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "tokenId", cVar.f46518a);
        C20528a.m48237t(jSONObject, "issueVersion", Long.valueOf(cVar.f46519b));
        C20528a.m48237t(jSONObject, "travelEligibility", cVar.f46520c);
        C20528a.m48237t(jSONObject, "payloadData", cVar.f46521d);
        return jSONObject;
    }
}
