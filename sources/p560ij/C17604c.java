package p560ij;

import com.appboy.models.outgoing.TwitterUser;
import org.json.JSONObject;
import p705on.C18800h;
import p705on.C18810p;
import p752qn.C19148f;
import p843uk.C19922c;
import p843uk.C19942l0;
import p843uk.C19947q;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.c */
public final class C17604c extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45282c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17604c(C20531d dVar, int i) {
        super(dVar, C19922c.class);
        this.f45282c = i;
        if (i == 1) {
            super(dVar, C18800h.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19942l0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45282c) {
            case 0:
                return new C19922c((C19148f) mo52728m(jSONObject, "amount", C19148f.class), C20528a.m48234o(TwitterUser.DESCRIPTION_KEY, jSONObject), mo52727l(jSONObject, "transactions", C19947q.class), C20528a.m48234o("requestReference", jSONObject), (C18810p) mo52728m(jSONObject, "userIdentity", C18810p.class));
            case 1:
                return new C18800h(C20528a.m48234o("productRef", jSONObject), C20528a.m48234o("journeyId", jSONObject), C20528a.m48232k("quantity", jSONObject), C20528a.m48232k("originId", jSONObject), C20528a.m48232k("destinationId", jSONObject));
            default:
                return new C19942l0(C20528a.m48234o("svaPurchaseId", jSONObject));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45282c) {
            case 0:
                C19922c cVar = (C19922c) obj;
                JSONObject jSONObject = new JSONObject();
                mo52729r(jSONObject, "transactions", cVar.f50593c);
                mo52730s(jSONObject, "amount", cVar.f50591a);
                mo52730s(jSONObject, "userIdentity", cVar.f50595e);
                C20528a.m48237t(jSONObject, TwitterUser.DESCRIPTION_KEY, cVar.f50592b);
                C20528a.m48237t(jSONObject, "requestReference", cVar.f50594d);
                return jSONObject;
            case 1:
                C18800h hVar = (C18800h) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "productRef", hVar.f47868a);
                C20528a.m48237t(jSONObject2, "journeyId", hVar.f47869b);
                C20528a.m48237t(jSONObject2, "quantity", hVar.f47870c);
                C20528a.m48237t(jSONObject2, "originId", hVar.f47871d);
                C20528a.m48237t(jSONObject2, "destinationId", hVar.f47872e);
                return jSONObject2;
            default:
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "svaPurchaseId", ((C19942l0) obj).f50655a);
                return jSONObject3;
        }
    }
}
