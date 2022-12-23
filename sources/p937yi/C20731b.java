package p937yi;

import org.json.JSONException;
import org.json.JSONObject;
import p631lk.C18233a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: yi.b */
public final class C20731b extends C20528a<C18233a> {
    public C20731b(C20531d dVar) {
        super(dVar, C18233a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18233a(C20528a.m48229h("svaLinked", jSONObject).booleanValue(), C20528a.m48234o("tokenId", jSONObject), C20528a.m48234o("travelEligibility", jSONObject), C20528a.m48234o("mediaType", jSONObject), C20528a.m48234o("inventoryControlNumber", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18233a aVar = (C18233a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "tokenId", aVar.f46511a);
        C20528a.m48237t(jSONObject, "travelEligibility", aVar.f46512b);
        C20528a.m48237t(jSONObject, "mediaType", aVar.f46513c);
        C20528a.m48237t(jSONObject, "inventoryControlNumber", aVar.f46514d);
        C20528a.m48237t(jSONObject, "svaLinked", Boolean.valueOf(aVar.f46515e));
        return jSONObject;
    }
}
