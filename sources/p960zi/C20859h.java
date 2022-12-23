package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18385g;
import p654mk.C18386h;
import p819tk.C19686c;
import p913xi.C20531d;

/* renamed from: zi.h */
public final class C20859h extends C17449c<C18385g> {
    public C20859h(C20531d dVar) {
        super(dVar, C18385g.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "details", ((C18385g) cVar).f46863b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C18385g((C18386h) mo52728m(jSONObject, "details", C18386h.class));
    }
}
