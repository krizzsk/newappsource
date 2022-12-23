package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18382d;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.e */
public final class C20856e extends C17449c<C18382d> {
    public C20856e(C20531d dVar) {
        super(dVar, C18382d.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        C18382d dVar = (C18382d) cVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "oldPassword", dVar.f46855b);
        C20528a.m48237t(jSONObject, "newPassword", dVar.f46856c);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C18382d(C20528a.m48234o("oldPassword", jSONObject), C20528a.m48234o("newPassword", jSONObject));
    }
}
