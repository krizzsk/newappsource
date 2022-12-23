package p960zi;

import org.json.JSONObject;
import p654mk.C18381c;
import p654mk.C18384f;
import p678nk.C18573c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.d */
public final class C20855d extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f52601c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20855d(C20531d dVar, int i) {
        super(dVar, C18381c.class);
        this.f52601c = i;
        if (i != 1) {
        } else {
            super(dVar, C18573c.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f52601c) {
            case 0:
                C18381c cVar = new C18381c();
                cVar.f46853a = (C18384f) mo52728m(jSONObject, "additionalInfo", C18384f.class);
                cVar.f46854b = C20528a.m48234o("reason", jSONObject);
                return cVar;
            default:
                return new C18573c(C20528a.m48234o("appId", jSONObject), C20528a.m48234o("authToken", jSONObject), C20528a.m48234o("sessionToken", jSONObject), C20528a.m48229h("riderAcceptsDeviceSwitch", jSONObject));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f52601c) {
            case 0:
                C18381c cVar = (C18381c) obj;
                JSONObject jSONObject = new JSONObject();
                mo52730s(jSONObject, "additionalInfo", cVar.f46853a);
                C20528a.m48237t(jSONObject, "reason", cVar.f46854b);
                return jSONObject;
            default:
                C18573c cVar2 = (C18573c) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "riderAcceptsDeviceSwitch", cVar2.f47276d);
                C20528a.m48237t(jSONObject2, "appId", cVar2.f47274b);
                C20528a.m48237t(jSONObject2, "authToken", cVar2.f47275c);
                C20528a.m48237t(jSONObject2, "sessionToken", cVar2.f47273a);
                return jSONObject2;
        }
    }
}
