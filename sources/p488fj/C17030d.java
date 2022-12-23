package p488fj;

import org.json.JSONException;
import org.json.JSONObject;
import p771rk.C19284c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: fj.d */
public final class C17030d extends C20528a<C19284c> {
    public C17030d(C20531d dVar) {
        super(dVar, C19284c.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19284c(C20528a.m48234o("deviceType", jSONObject), mo52727l(jSONObject, "fareBlockIds", Integer.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19284c cVar = (C19284c) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "deviceType", cVar.f49023a);
        mo52729r(jSONObject, "fareBlockIds", cVar.f49024b);
        return jSONObject;
    }
}
