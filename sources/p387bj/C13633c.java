package p387bj;

import org.json.JSONException;
import org.json.JSONObject;
import p702ok.C18776b;
import p702ok.C18777c;
import p702ok.C18778d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: bj.c */
public final class C13633c extends C20528a<C18778d> {
    public C13633c(C20531d dVar) {
        super(dVar, C18778d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18778d(mo52727l(jSONObject, "stations", C18777c.class), mo52727l(jSONObject, "lines", C18776b.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18778d dVar = (C18778d) obj;
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "stations", dVar.f47803a);
        mo52729r(jSONObject, "lines", dVar.f47804b);
        return jSONObject;
    }
}
