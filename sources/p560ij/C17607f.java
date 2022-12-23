package p560ij;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p752qn.C19148f;
import p819tk.C19687d;
import p843uk.C19929f;
import p913xi.C20531d;

/* renamed from: ij.f */
public final class C17607f extends C17450d<C19929f> {
    public C17607f(C20531d dVar) {
        super(dVar, C19929f.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "transactionFee", ((C19929f) dVar).f50609d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C19929f((C19148f) mo52728m(jSONObject, "transactionFee", C19148f.class));
    }
}
