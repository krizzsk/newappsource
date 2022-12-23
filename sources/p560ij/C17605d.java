package p560ij;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p705on.C18810p;
import p843uk.C19924d;
import p843uk.C19931g;
import p843uk.C19946p;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.d */
public final class C17605d extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45283c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17605d(C20531d dVar, int i) {
        super(dVar, C19924d.class);
        this.f45283c = i;
        if (i == 1) {
            super(dVar, C19946p.class);
        } else if (i != 2) {
        } else {
            super(dVar, C18810p.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45283c) {
            case 0:
                return new C19924d(C20528a.m48234o("returnUrl", jSONObject), C20528a.m48234o("authenticationScript", jSONObject), C20528a.m48234o(InAppPurchaseMetaData.KEY_SIGNATURE, jSONObject));
            case 1:
                return new C19946p(C20528a.m48234o("challengeType", jSONObject), (C19931g) mo52728m(jSONObject, "challengeV1", C19931g.class), (C19924d) mo52728m(jSONObject, "authenticationChallenge", C19924d.class));
            default:
                return new C18810p(C20528a.m48234o("appId", jSONObject), C20528a.m48234o("accountId", jSONObject));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45283c) {
            case 0:
                C19924d dVar = (C19924d) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "returnUrl", dVar.f50597a);
                C20528a.m48237t(jSONObject, "authenticationScript", dVar.f50598b);
                C20528a.m48237t(jSONObject, InAppPurchaseMetaData.KEY_SIGNATURE, dVar.f50599c);
                return jSONObject;
            case 1:
                C19946p pVar = (C19946p) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "challengeType", pVar.f50674a);
                mo52730s(jSONObject2, "challengeV1", pVar.f50675b);
                mo52730s(jSONObject2, "authenticationChallenge", pVar.f50676c);
                return jSONObject2;
            default:
                C18810p pVar2 = (C18810p) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "appId", pVar2.f47916a);
                C20528a.m48237t(jSONObject3, "accountId", pVar2.f47917b);
                return jSONObject3;
        }
    }
}
