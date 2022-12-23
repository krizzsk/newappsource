package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18379a;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.b */
public final class C20853b extends C17449c<C18379a> {
    public C20853b(C20531d dVar) {
        super(dVar, C18379a.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        C18379a aVar = (C18379a) cVar;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "username", aVar.f46847b);
        C20528a.m48237t(jSONObject, "password", aVar.f46848c);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C18379a aVar = new C18379a();
        aVar.f46847b = C20528a.m48234o("username", jSONObject);
        aVar.f46848c = C20528a.m48234o("password", jSONObject);
        return aVar;
    }
}
