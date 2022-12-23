package p560ij;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p819tk.C19687d;
import p843uk.C19918a0;
import p843uk.C19923c0;
import p913xi.C20531d;

/* renamed from: ij.o */
public final class C17616o extends C17450d<C19923c0> {
    public C17616o(C20531d dVar) {
        super(dVar, C19923c0.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "lookupData", ((C19923c0) dVar).f50596d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C19923c0(mo52727l(jSONObject, "lookupData", C19918a0.class));
    }
}
