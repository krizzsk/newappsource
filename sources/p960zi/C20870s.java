package p960zi;

import ce0.C21100e;
import org.json.JSONException;
import org.json.JSONObject;
import p586jn.C17900f;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.s */
public final class C20870s extends C20528a<C17900f> {
    public C20870s(C20531d dVar) {
        super(dVar, C17900f.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        return new C17900f(C20528a.m48234o("username", jSONObject), C20528a.m48234o("accountId", jSONObject), C20528a.m48234o("emailAddress", jSONObject));
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        String str;
        C17900f fVar = (C17900f) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "username", fVar.f45941c);
        C20528a.m48237t(jSONObject, "accountId", fVar.f45939a);
        if (C21100e.m49352m0(fVar.f45940b)) {
            str = fVar.f45941c;
        } else {
            str = fVar.f45940b;
        }
        C20528a.m48237t(jSONObject, "emailAddress", str);
        return jSONObject;
    }
}
