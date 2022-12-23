package p464ej;

import org.json.JSONException;
import org.json.JSONObject;
import p749qk.C19132b;
import p749qk.C19133c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ej.c */
public final class C16832c extends C20528a<C19133c> {
    public C16832c(C20531d dVar) {
        super(dVar, C19133c.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19133c(mo52727l(jSONObject, "errors", C19132b.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "errors", ((C19133c) obj).f48652a);
        return jSONObject;
    }
}
