package p653mj;

import org.json.JSONException;
import org.json.JSONObject;
import p913xi.C20528a;
import p913xi.C20531d;
import p938yk.C20737b;

/* renamed from: mj.a */
public final class C18375a extends C20528a<C20737b> {
    public C18375a(C20531d dVar) {
        super(dVar, C20737b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20737b(C20528a.m48234o("service", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "service", ((C20737b) obj).f52336a);
        return jSONObject;
    }
}
