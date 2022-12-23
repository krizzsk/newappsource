package p653mj;

import org.json.JSONException;
import org.json.JSONObject;
import p913xi.C20528a;
import p913xi.C20531d;
import p938yk.C20739d;

/* renamed from: mj.c */
public final class C18377c extends C20528a<C20739d> {
    public C18377c(C20531d dVar) {
        super(dVar, C20739d.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20739d(C20528a.m48234o("jwtToken", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "jwtToken", ((C20739d) obj).f52338a);
        return jSONObject;
    }
}
