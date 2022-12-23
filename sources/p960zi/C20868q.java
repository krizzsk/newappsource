package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18396r;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.q */
public final class C20868q extends C17449c<C18396r> {
    public C20868q(C20531d dVar) {
        super(dVar, C18396r.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        C18396r rVar = (C18396r) cVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "entitlementId", rVar.f46897b);
        C20528a.m48237t(jSONObject, "enabled", rVar.f46898c);
        C20528a.m48237t(jSONObject, "proofId", rVar.f46899d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C18396r(Integer.valueOf(jSONObject.getInt("entitlementId")), Boolean.valueOf(jSONObject.getBoolean("enabled")), jSONObject.getString("proofId"));
    }
}
