package p606kj;

import org.json.JSONException;
import org.json.JSONObject;
import p752qn.C19146d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.e */
public final class C18074e extends C20528a<C19146d> {
    public C18074e(C20531d dVar) {
        super(dVar, C19146d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19146d(C20528a.m48234o("fareType", jSONObject), C20528a.m48234o("name", jSONObject), C20528a.m48234o("productStrapline", jSONObject), C20528a.m48232k("size", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19146d dVar = (C19146d) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "size", dVar.f48691d);
        C20528a.m48237t(jSONObject, "fareType", dVar.f48688a);
        C20528a.m48237t(jSONObject, "name", dVar.f48689b);
        C20528a.m48237t(jSONObject, "productStrapline", dVar.f48690c);
        return jSONObject;
    }
}
