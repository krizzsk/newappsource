package p560ij;

import com.appsflyer.ServerParameters;
import com.google.firebase.messaging.FirebaseMessagingService;
import org.json.JSONObject;
import p752qn.C19148f;
import p843uk.C19917a;
import p843uk.C19936i0;
import p843uk.C19938j0;
import p843uk.C19944n;
import p843uk.C19946p;
import p843uk.C19955y;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.a */
public final class C17602a extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45280c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17602a(C20531d dVar, int i) {
        super(dVar, C19917a.class);
        this.f45280c = i;
        if (i == 1) {
            super(dVar, C19944n.class);
        } else if (i == 2) {
            super(dVar, C19955y.class);
        } else if (i != 3) {
        } else {
            super(dVar, C19936i0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        switch (this.f45280c) {
            case 0:
                return new C19917a(C20528a.m48234o("postCode", jSONObject2));
            case 1:
                return new C19944n(C20528a.m48234o("cardholderName", jSONObject2), C20528a.m48234o("firstSix", jSONObject2), C20528a.m48234o("lastFour", jSONObject2), C20528a.m48234o("approvalCode", jSONObject2));
            case 2:
                return new C19955y((C19148f) mo52728m(jSONObject2, "amount", C19148f.class), C20528a.m48234o("backAccountNumber", jSONObject2), C20528a.m48234o("cardType", jSONObject2), C20528a.m48234o("fundingSource", jSONObject2), C20528a.m48234o("merchantReference", jSONObject2), (C19944n) mo52728m(jSONObject2, "newCard", C19944n.class), (C19946p) mo52728m(jSONObject2, "pay3dsChallengeResponse", C19946p.class), C20528a.m48234o("postCode", jSONObject2), C20528a.m48234o("pspReference", jSONObject2), C20528a.m48234o("pspType", jSONObject2), (C19938j0) mo52728m(jSONObject2, "savedCard", C19938j0.class), C20528a.m48234o(ServerParameters.STATUS, jSONObject2));
            default:
                return new C19936i0(C20528a.m48234o(FirebaseMessagingService.EXTRA_TOKEN, jSONObject2), C20528a.m48234o("securityCode", jSONObject2));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45280c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "postCode", ((C19917a) obj).f50568a);
                return jSONObject;
            case 1:
                C19944n nVar = (C19944n) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "cardholderName", nVar.f50662a);
                C20528a.m48237t(jSONObject2, "firstSix", nVar.f50663b);
                C20528a.m48237t(jSONObject2, "lastFour", nVar.f50664c);
                C20528a.m48237t(jSONObject2, "approvalCode", nVar.f50665d);
                return jSONObject2;
            case 2:
                C19955y yVar = (C19955y) obj;
                JSONObject jSONObject3 = new JSONObject();
                mo52730s(jSONObject3, "amount", yVar.f50726a);
                mo52730s(jSONObject3, "newCard", yVar.f50731f);
                mo52730s(jSONObject3, "pay3dsChallengeResponse", yVar.f50732g);
                mo52730s(jSONObject3, "savedCard", yVar.f50736k);
                C20528a.m48237t(jSONObject3, "backAccountNumber", yVar.f50727b);
                C20528a.m48237t(jSONObject3, "cardType", yVar.f50728c);
                C20528a.m48237t(jSONObject3, "fundingSource", yVar.f50729d);
                C20528a.m48237t(jSONObject3, "merchantReference", yVar.f50730e);
                C20528a.m48237t(jSONObject3, "postCode", yVar.f50733h);
                C20528a.m48237t(jSONObject3, "pspReference", yVar.f50734i);
                C20528a.m48237t(jSONObject3, "pspType", yVar.f50735j);
                C20528a.m48237t(jSONObject3, ServerParameters.STATUS, yVar.f50737l);
                return jSONObject3;
            default:
                C19936i0 i0Var = (C19936i0) obj;
                JSONObject jSONObject4 = new JSONObject();
                C20528a.m48237t(jSONObject4, FirebaseMessagingService.EXTRA_TOKEN, i0Var.f50629a);
                C20528a.m48237t(jSONObject4, "securityCode", i0Var.f50630b);
                return jSONObject4;
        }
    }
}
