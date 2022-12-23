package p582jj;

import org.json.JSONException;
import org.json.JSONObject;
import p657mn.C18405a;
import p705on.C18810p;
import p843uk.C19947q;
import p867vk.C20152i;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: jj.i */
public final class C17864i extends C20528a<C20152i> {
    public C17864i(C20531d dVar) {
        super(dVar, C20152i.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C20152i((C18405a) mo52728m(jSONObject, "amount", C18405a.class), mo52727l(jSONObject, "payments", C19947q.class), C20528a.m48234o("reason", jSONObject), C20528a.m48234o("requestReference", jSONObject), C20528a.m48234o("ledgerPosition", jSONObject), C20528a.m48234o("svaId", jSONObject), (C18810p) mo52728m(jSONObject, "userIdentity", C18810p.class));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C20152i iVar = (C20152i) obj;
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "amount", iVar.f51146a);
        mo52729r(jSONObject, "payments", iVar.f51147b);
        C20528a.m48237t(jSONObject, "reason", iVar.f51148c);
        C20528a.m48237t(jSONObject, "ledgerPosition", iVar.f51150e);
        C20528a.m48237t(jSONObject, "requestReference", iVar.f51149d);
        C20528a.m48237t(jSONObject, "svaId", iVar.f51151f);
        mo52730s(jSONObject, "userIdentity", iVar.f51152g);
        return jSONObject;
    }
}
