package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18388j;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.k */
public final class C20862k extends C17449c<C18388j> {
    public C20862k(C20531d dVar) {
        super(dVar, C18388j.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        C18388j jVar = (C18388j) cVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "username", jVar.f46868b);
        C20528a.m48237t(jSONObject, "password", jVar.f46869c);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C18388j jVar = new C18388j();
        jVar.f46868b = C20528a.m48234o("username", jSONObject);
        jVar.f46869c = C20528a.m48234o("password", jSONObject);
        return jVar;
    }
}
