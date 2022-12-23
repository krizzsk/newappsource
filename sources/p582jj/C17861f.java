package p582jj;

import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20146c;
import p867vk.C20149f;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.f */
public final class C17861f extends C20528a<C20149f> {
    public C17861f(C20531d dVar) {
        super(dVar, C20149f.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20149f((C20146c) mo52728m(jSONObject, "primary", C20146c.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "primary", ((C20149f) obj).f51141a);
        return jSONObject;
    }
}
