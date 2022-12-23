package p560ij;

import com.appboy.models.outgoing.TwitterUser;
import org.json.JSONObject;
import p705on.C18804k;
import p705on.C18810p;
import p752qn.C19148f;
import p843uk.C19925d0;
import p843uk.C19947q;
import p843uk.C19948r;
import p843uk.C19950t;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.m */
public final class C17614m extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45289c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17614m(C20531d dVar, int i) {
        super(dVar, C19948r.class);
        this.f45289c = i;
        if (i != 1) {
        } else {
            super(dVar, C19925d0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45289c) {
            case 0:
                return new C19948r(mo52727l(jSONObject, "items", C19950t.class));
            default:
                return new C19925d0((C19148f) mo52728m(jSONObject, "amount", C19148f.class), C20528a.m48234o(TwitterUser.DESCRIPTION_KEY, jSONObject), mo52727l(jSONObject, "payments", C19947q.class), (C18804k) mo52728m(jSONObject, "products", C18804k.class), C20528a.m48234o("requestReference", jSONObject), (C18810p) mo52728m(jSONObject, "userIdentity", C18810p.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45289c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                mo52729r(jSONObject, "items", ((C19948r) obj).f50681a);
                return jSONObject;
            default:
                C19925d0 d0Var = (C19925d0) obj;
                JSONObject jSONObject2 = new JSONObject();
                mo52730s(jSONObject2, "userIdentity", d0Var.f50605f);
                C20528a.m48237t(jSONObject2, "requestReference", d0Var.f50604e);
                mo52730s(jSONObject2, "amount", d0Var.f50600a);
                C20528a.m48237t(jSONObject2, TwitterUser.DESCRIPTION_KEY, d0Var.f50601b);
                mo52729r(jSONObject2, "payments", d0Var.f50602c);
                mo52730s(jSONObject2, "products", d0Var.f50603d);
                return jSONObject2;
        }
    }
}
