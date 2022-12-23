package p606kj;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17449c;
import p819tk.C19686c;
import p891wk.C20358m;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.m */
public final class C18082m extends C17449c<C20358m> {
    public C18082m(C20531d dVar) {
        super(dVar, C20358m.class);
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "eTicketNumber", ((C20358m) cVar).f51566b);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) throws JSONException {
        C20358m mVar = new C20358m();
        mVar.f51566b = C20528a.m48234o("eTicketNumber", jSONObject);
        return mVar;
    }
}
