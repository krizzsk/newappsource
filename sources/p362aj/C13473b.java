package p362aj;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p678nk.C18571a;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: aj.b */
public final class C13473b extends C17449c<C18571a> {
    public C13473b(C20531d dVar) {
        super(dVar, C18571a.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        C18571a aVar = (C18571a) cVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "appId", aVar.f47271c);
        C20528a.m48237t(jSONObject, "password", aVar.f47270b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C18571a aVar = new C18571a();
        aVar.f47271c = C20528a.m48234o("appId", jSONObject);
        aVar.f47270b = C20528a.m48234o("password", jSONObject);
        return aVar;
    }
}
