package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p654mk.C18393o;
import p654mk.C18394p;
import p819tk.C19687d;
import p913xi.C20531d;

/* renamed from: zi.p */
public final class C20867p extends C17450d<C18394p> {
    public C20867p(C20531d dVar) {
        super(dVar, C18394p.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "restrictions", ((C18394p) dVar).f46895d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C18394p(mo52727l(jSONObject, "restrictions", C18393o.class));
    }
}
