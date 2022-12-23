package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18383e;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.f */
public final class C20857f extends C17449c<C18383e> {
    public C20857f(C20531d dVar) {
        super(dVar, C18383e.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "username", ((C18383e) cVar).f46857b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C18383e eVar = new C18383e();
        eVar.f46857b = C20528a.m48234o("username", jSONObject);
        return eVar;
    }
}
