package p582jj;

import org.json.JSONException;
import org.json.JSONObject;
import p867vk.C20145b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.b */
public final class C17857b extends C20528a<C20145b> {
    public C17857b(C20531d dVar) {
        super(dVar, C20145b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20145b(C20528a.m48234o("barcode", jSONObject), C20528a.m48233n("expirationDate", jSONObject).longValue());
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20145b bVar = (C20145b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "barcode", bVar.f51129a);
        C20528a.m48237t(jSONObject, "expirationDate", Long.valueOf(bVar.f51130b));
        return jSONObject;
    }
}
