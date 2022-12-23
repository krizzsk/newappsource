package p702ok;

import org.json.JSONException;
import org.json.JSONObject;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ok.f */
public final class C18780f extends C20528a<C18779e> {
    public C18780f(C20531d dVar) {
        super(dVar, C18779e.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18779e(jSONObject.getString("lastModified"), jSONObject.getLong("lastChecked"));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18779e eVar = (C18779e) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "lastModified", eVar.f47805a);
        C20528a.m48237t(jSONObject, "lastChecked", Long.valueOf(eVar.f47806b));
        return jSONObject;
    }
}
