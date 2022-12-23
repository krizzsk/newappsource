package p387bj;

import java.util.ArrayList;
import org.json.JSONException;
import org.json.JSONObject;
import p702ok.C18776b;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: bj.a */
public final class C13631a extends C20528a<C18776b> {
    public C13631a(C20531d dVar) {
        super(dVar, C18776b.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        Integer k = C20528a.m48232k("id", jSONObject);
        String o = C20528a.m48234o("name", jSONObject);
        String o2 = C20528a.m48234o("subBrand", jSONObject);
        ArrayList l = mo52727l(jSONObject, "stations", Integer.class);
        Boolean h = C20528a.m48229h("ignoreForReachability", jSONObject);
        Boolean h2 = C20528a.m48229h("virtualLine", jSONObject);
        if (o2 == null) {
            o2 = "";
        }
        String str = o2;
        Boolean bool = Boolean.TRUE;
        return new C18776b(k, o, l, str, bool.equals(h), bool.equals(h2));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18776b bVar = (C18776b) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "id", bVar.f47786a);
        C20528a.m48237t(jSONObject, "name", bVar.f47787b);
        C20528a.m48237t(jSONObject, "subBrand", bVar.f47789d);
        mo52729r(jSONObject, "stations", bVar.f47788c);
        C20528a.m48237t(jSONObject, "ignoreForReachability", Boolean.valueOf(bVar.f47790e));
        C20528a.m48237t(jSONObject, "virtualLine", Boolean.valueOf(bVar.f47791f));
        return jSONObject;
    }
}
