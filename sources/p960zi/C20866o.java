package p960zi;

import org.json.JSONException;
import org.json.JSONObject;
import p654mk.C18392n;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.o */
public final class C20866o extends C20528a<C18392n> {
    public C20866o(C20531d dVar) {
        super(dVar, C18392n.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        C18392n nVar = new C18392n();
        nVar.f46887b = C20528a.m48232k("daysToCheck", jSONObject);
        nVar.f46886a = C20528a.m48232k("maximumTimes", jSONObject);
        return nVar;
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18392n nVar = (C18392n) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, "daysToCheck", nVar.f46887b);
        C20528a.m48237t(jSONObject, "maximumTimes", nVar.f46886a);
        return jSONObject;
    }
}
