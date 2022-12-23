package p560ij;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p819tk.C19686c;
import p843uk.C19920b0;
import p843uk.C19933h;
import p913xi.C20531d;

/* renamed from: ij.n */
public final class C17615n extends C17449c<C19920b0> {
    public C17615n(C20531d dVar) {
        super(dVar, C19920b0.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "criteria", ((C19920b0) cVar).f50590b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        return new C19920b0((C19933h) mo52728m(jSONObject, "criteria", C19933h.class));
    }
}
