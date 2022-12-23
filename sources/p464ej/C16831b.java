package p464ej;

import org.json.JSONException;
import org.json.JSONObject;
import p749qk.C19131a;
import p749qk.C19132b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ej.b */
public final class C16831b extends C20528a<C19132b> {
    public C16831b(C20531d dVar) {
        super(dVar, C19132b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C19132b(C20528a.m48234o("_index", jSONObject), C20528a.m48234o("stackTrace", jSONObject), C20528a.m48234o("domain", jSONObject), C20528a.m48232k("code", jSONObject).intValue(), C20528a.m48233n("deviceTimestamp", jSONObject).longValue(), C20528a.m48234o("reference", jSONObject), (C19131a) mo52728m(jSONObject, "environmentDetails", C19131a.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19132b bVar = (C19132b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "_index", bVar.f48645a);
        C20528a.m48237t(jSONObject, "stackTrace", bVar.f48646b);
        C20528a.m48237t(jSONObject, "domain", bVar.f48647c);
        C20528a.m48237t(jSONObject, "code", Integer.valueOf(bVar.f48648d));
        C20528a.m48237t(jSONObject, "deviceTimestamp", Long.valueOf(bVar.f48649e));
        C20528a.m48237t(jSONObject, "reference", bVar.f48650f);
        mo52730s(jSONObject, "environmentDetails", bVar.f48651g);
        return jSONObject;
    }
}
