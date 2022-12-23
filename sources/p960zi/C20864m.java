package p960zi;

import com.appsflyer.ServerParameters;
import org.json.JSONException;
import org.json.JSONObject;
import p584jl.C17885a;
import p654mk.C18390l;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.m */
public final class C20864m extends C20528a<C18390l> {
    public C20864m(C20531d dVar) {
        super(dVar, C18390l.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C18390l(C20528a.m48232k("id", jSONObject), C20528a.m48234o("appId", jSONObject), C20528a.m48234o("proofId", jSONObject), C20528a.m48230i("creationDateTime", jSONObject), C20528a.m48230i("expirationDateTime", jSONObject), C20528a.m48229h("enabled", jSONObject).booleanValue(), C20528a.m48234o("productRestrictionName", jSONObject), C20528a.m48232k("riderTypeRestrictionId", jSONObject), C20528a.m48234o("displayName", jSONObject), C20528a.m48234o(ServerParameters.STATUS, jSONObject), C20528a.m48234o("channel", jSONObject), C20528a.m48234o("displayStyle", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18390l lVar = (C18390l) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "id", lVar.f46873a);
        C20528a.m48237t(jSONObject, "appId", lVar.f46874b);
        C20528a.m48237t(jSONObject, "proofId", lVar.f46875c);
        C20528a.m48236q(jSONObject, "creationDateTime", C17885a.m44446k0(lVar.f46876d));
        C20528a.m48236q(jSONObject, "expirationDateTime", C17885a.m44446k0(lVar.f46877e));
        C20528a.m48237t(jSONObject, "enabled", Boolean.valueOf(lVar.f46878f));
        C20528a.m48237t(jSONObject, "productRestrictionName", lVar.f46879g);
        C20528a.m48237t(jSONObject, "riderTypeRestrictionId", lVar.f46880h);
        C20528a.m48237t(jSONObject, "displayName", lVar.f46881i);
        C20528a.m48237t(jSONObject, ServerParameters.STATUS, lVar.f46882j);
        C20528a.m48237t(jSONObject, "channel", lVar.f46883k);
        C20528a.m48237t(jSONObject, "displayStyle", lVar.f46884l);
        return jSONObject;
    }
}
