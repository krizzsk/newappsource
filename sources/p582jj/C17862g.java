package p582jj;

import org.json.JSONException;
import org.json.JSONObject;
import p843uk.C19950t;
import p867vk.C20148e;
import p867vk.C20150g;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.g */
public final class C17862g extends C20528a<C20150g> {
    public C17862g(C20531d dVar) {
        super(dVar, C20150g.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20150g(mo52727l(jSONObject, "items", C19950t.class), (C20148e) mo52728m(jSONObject, "topupInfo", C20148e.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20150g gVar = (C20150g) obj;
        JSONObject jSONObject = new JSONObject();
        mo52729r(jSONObject, "items", gVar.f51142a);
        mo52730s(jSONObject, "topupInfo", gVar.f51143b);
        return jSONObject;
    }
}
