package p937yi;

import org.json.JSONException;
import org.json.JSONObject;
import p631lk.C18234b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: yi.c */
public final class C20732c extends C20528a<C18234b> {
    public C20732c(C20531d dVar) {
        super(dVar, C18234b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18234b(C20528a.m48234o("inventoryControlNumber", jSONObject), C20528a.m48234o("verificationCode", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18234b bVar = (C18234b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "inventoryControlNumber", bVar.f46516a);
        C20528a.m48237t(jSONObject, "verificationCode", bVar.f46517b);
        return jSONObject;
    }
}
