package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p654mk.C18389k;
import p819tk.C19687d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.l */
public final class C20863l extends C17450d<C18389k> {
    public C20863l(C20531d dVar) {
        super(dVar, C18389k.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        C18389k kVar = (C18389k) dVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "accountId", kVar.f46871e);
        C20528a.m48237t(jSONObject, "username", kVar.f46870d);
        C20528a.m48237t(jSONObject, "emailAddress", kVar.f46872f);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C18389k(C20528a.m48234o("username", jSONObject), C20528a.m48234o("accountId", jSONObject), C20528a.m48234o("emailAddress", jSONObject));
    }
}
