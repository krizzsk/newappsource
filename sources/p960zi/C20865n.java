package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p678nk.C18574d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.n */
public final class C20865n extends C20528a<C18574d> {
    public C20865n(C20531d dVar) {
        super(dVar, C18574d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18574d(C20528a.m48234o("accountId", jSONObject), C20528a.m48234o("sessionToken", jSONObject), C20528a.m48234o("username", jSONObject), C20528a.m48234o("emailAddress", jSONObject), C20528a.m48233n("sessionTokenExpiry", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18574d dVar = (C18574d) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "sessionTokenExpiry", dVar.f47279c);
        C20528a.m48237t(jSONObject, "accountId", dVar.f47277a);
        C20528a.m48237t(jSONObject, "sessionToken", dVar.f47278b);
        C20528a.m48237t(jSONObject, "username", dVar.f47280d);
        C20528a.m48237t(jSONObject, "emailAddress", dVar.f47281e);
        return jSONObject;
    }
}
