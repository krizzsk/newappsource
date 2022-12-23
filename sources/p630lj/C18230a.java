package p630lj;

import org.json.JSONException;
import org.json.JSONObject;
import p795sk.C19468a;
import p913xi.C20528a;
import p913xi.C20531d;
import p915xk.C20534a;

/* renamed from: lj.a */
public final class C18230a extends C20528a<C20534a> {
    public C18230a(C20531d dVar) {
        super(dVar, C20534a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20534a((C19468a) mo52728m(jSONObject, "geolocationData", C19468a.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "geolocationData", ((C20534a) obj).f51925a);
        return jSONObject;
    }
}
