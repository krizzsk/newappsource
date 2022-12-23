package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p536hj.C17450d;
import p654mk.C18387i;
import p654mk.C18390l;
import p819tk.C19687d;
import p913xi.C20531d;

/* renamed from: zi.j */
public final class C20861j extends C17450d<C18387i> {
    public C20861j(C20531d dVar) {
        super(dVar, C18387i.class);
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        mo52730s(jSONObject, "entitlement", ((C18387i) dVar).f46867d);
        return jSONObject;
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) throws JSONException {
        C18387i iVar = new C18387i();
        iVar.f46867d = (C18390l) mo52728m(jSONObject, "entitlement", C18390l.class);
        return iVar;
    }
}
