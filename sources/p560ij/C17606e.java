package p560ij;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p819tk.C19686c;
import p843uk.C19926e;
import p843uk.C19941l;
import p913xi.C20531d;

/* renamed from: ij.e */
public final class C17606e extends C17449c<C19926e> {
    public C17606e(C20531d dVar) {
        super(dVar, C19926e.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "products", ((C19926e) cVar).f50606b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C19926e(mo52727l(jSONObject, "products", C19941l.class));
    }
}
