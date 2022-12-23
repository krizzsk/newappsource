package p606kj;

import org.json.JSONObject;
import p752qn.C19148f;
import p752qn.C19149g;
import p891wk.C20347b0;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.l */
public final class C18081l extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46242c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18081l(C20531d dVar, int i) {
        super(dVar, C19149g.class);
        this.f46242c = i;
        if (i != 1) {
        } else {
            super(dVar, C20347b0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46242c) {
            case 0:
                return new C19149g(C20528a.m48234o("reason", jSONObject), (C19148f) mo52728m(jSONObject, "amount", C19148f.class));
            default:
                C20347b0 b0Var = new C20347b0();
                b0Var.f51520a = C20528a.m48232k("starts", jSONObject);
                b0Var.f51521b = mo52727l(jSONObject, "seed", Integer.class);
                return b0Var;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46242c) {
            case 0:
                C19149g gVar = (C19149g) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "reason", gVar.f48696a);
                mo52730s(jSONObject, "amount", gVar.f48697b);
                return jSONObject;
            default:
                C20347b0 b0Var = (C20347b0) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "starts", b0Var.f51520a);
                mo52729r(jSONObject2, "seed", b0Var.f51521b);
                return jSONObject2;
        }
    }
}
