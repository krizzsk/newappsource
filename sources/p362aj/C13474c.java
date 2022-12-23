package p362aj;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p678nk.C18572b;
import p819tk.C19687d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: aj.c */
public final class C13474c extends C17450d<C18572b> {
    public C13474c(C20531d dVar) {
        super(dVar, C18572b.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "appId", ((C18572b) dVar).f47272d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        return new C18572b(C20528a.m48234o("appId", jSONObject));
    }
}
