package p536hj;

import org.json.JSONException;
import org.json.JSONObject;
import p819tk.C19692i;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: hj.i */
public final class C17455i extends C20528a<C19692i> {
    public C17455i(C20531d dVar) {
        super(dVar, C19692i.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        C19692i iVar = new C19692i();
        iVar.f49997a = C20528a.m48234o("appId", jSONObject);
        iVar.f50000d = C20528a.m48234o("brandId", jSONObject);
        iVar.f50001e = C20528a.m48233n("timestamp", jSONObject);
        iVar.f50002f = C20528a.m48229h("isUpdateReady", jSONObject);
        iVar.f49998b = C20528a.m48234o("sessionToken", jSONObject);
        iVar.f49999c = C20528a.m48233n("sessionTokenExpiry", jSONObject);
        return iVar;
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C19692i iVar = (C19692i) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "appId", iVar.f49997a);
        C20528a.m48237t(jSONObject, "brandId", iVar.f50000d);
        C20528a.m48237t(jSONObject, "timestamp", iVar.f50001e);
        C20528a.m48237t(jSONObject, "isUpdateReady", iVar.f50002f);
        C20528a.m48237t(jSONObject, "sessionToken", iVar.f49998b);
        C20528a.m48237t(jSONObject, "sessionTokenExpiry", iVar.f49999c);
        return jSONObject;
    }
}
