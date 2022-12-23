package p536hj;

import com.appboy.models.InAppMessageBase;
import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19684a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.a */
public final class C17447a extends C20528a<C19684a> {
    public C17447a(C20531d dVar) {
        super(dVar, C19684a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19684a(C20528a.m48234o("errorCode", jSONObject), C20528a.m48234o(InAppMessageBase.MESSAGE, jSONObject), C20528a.m48234o("moreInfo", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19684a aVar = (C19684a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "errorCode", aVar.f49969a);
        C20528a.m48237t(jSONObject, InAppMessageBase.MESSAGE, aVar.f49970b);
        C20528a.m48237t(jSONObject, "moreInfo", aVar.f49971c);
        return jSONObject;
    }
}
