package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p654mk.C18390l;
import p654mk.C18397s;
import p819tk.C19687d;
import p913xi.C20531d;

/* renamed from: zi.r */
public final class C20869r extends C17450d<C18397s> {
    public C20869r(C20531d dVar) {
        super(dVar, C18397s.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "entitlement", ((C18397s) dVar).f46900d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C18397s((C18390l) mo52728m(jSONObject, "entitlement", C18390l.class));
    }
}
