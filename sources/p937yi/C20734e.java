package p937yi;

import org.json.JSONException;
import org.json.JSONObject;
import p631lk.C18233a;
import p631lk.C18236d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: yi.e */
public final class C20734e extends C20528a<C18236d> {
    public C20734e(C20531d dVar) {
        super(dVar, C18236d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        Class<C18233a> cls = C18233a.class;
        return new C18236d((C18233a) mo52728m(jSONObject, "primaryTapAndRideToken", cls), mo52727l(jSONObject, "tokens", cls));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18236d dVar = (C18236d) obj;
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "primaryTapAndRideToken", dVar.f46522a);
        mo52729r(jSONObject, "tokens", dVar.f46523b);
        return jSONObject;
    }
}
