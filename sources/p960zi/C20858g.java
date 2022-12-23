package p960zi;

import com.appboy.models.outgoing.TwitterUser;
import org.json.JSONObject;
import p654mk.C18384f;
import p654mk.C18392n;
import p654mk.C18393o;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.g */
public final class C20858g extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f52602c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20858g(C20531d dVar, int i) {
        super(dVar, C18384f.class);
        this.f52602c = i;
        if (i != 1) {
        } else {
            super(dVar, C18393o.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f52602c) {
            case 0:
                C18384f fVar = new C18384f();
                fVar.f46858a = C20528a.m48234o("assignedDeviceName", jSONObject);
                fVar.f46859b = C20528a.m48232k("remainingChanges", jSONObject);
                fVar.f46860c = C20528a.m48234o("assignedDeviceAppId", jSONObject);
                fVar.f46861d = C20528a.m48232k("nextChangeAvailableInDays", jSONObject);
                fVar.f46862e = (C18392n) mo52728m(jSONObject, "policy", C18392n.class);
                return fVar;
            default:
                return new C18393o(C20528a.m48232k("id", jSONObject), C20528a.m48234o("name", jSONObject), C20528a.m48234o("displayName", jSONObject), C20528a.m48234o(TwitterUser.DESCRIPTION_KEY, jSONObject), C20528a.m48232k("entitlementDurationDays", jSONObject), C20528a.m48229h("proofRequired", jSONObject).booleanValue(), C20528a.m48229h("selfServiceSignUpPermitted", jSONObject).booleanValue());
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f52602c) {
            case 0:
                C18384f fVar = (C18384f) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "assignedDeviceName", fVar.f46858a);
                C20528a.m48237t(jSONObject, "remainingChanges", fVar.f46859b);
                C20528a.m48237t(jSONObject, "assignedDeviceAppId", fVar.f46860c);
                C20528a.m48237t(jSONObject, "nextChangeAvailableInDays", fVar.f46861d);
                mo52730s(jSONObject, "policy", fVar.f46862e);
                return jSONObject;
            default:
                C18393o oVar = (C18393o) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "id", oVar.f46888a);
                C20528a.m48237t(jSONObject2, "name", oVar.f46889b);
                C20528a.m48237t(jSONObject2, "displayName", oVar.f46890c);
                C20528a.m48237t(jSONObject2, TwitterUser.DESCRIPTION_KEY, oVar.f46891d);
                C20528a.m48237t(jSONObject2, "entitlementDurationDays", oVar.f46892e);
                C20528a.m48237t(jSONObject2, "proofRequired", Boolean.valueOf(oVar.f46893f));
                C20528a.m48237t(jSONObject2, "selfServiceSignUpPermitted", Boolean.valueOf(oVar.f46894g));
                return jSONObject2;
        }
    }
}
