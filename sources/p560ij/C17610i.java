package p560ij;

import java.util.Collections;
import java.util.List;
import org.json.JSONObject;
import p705on.C18800h;
import p705on.C18804k;
import p843uk.C19932g0;
import p843uk.C19933h;
import p843uk.C19935i;
import p843uk.C19955y;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.i */
public final class C17610i extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45286c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17610i(C20531d dVar, int i) {
        super(dVar, C19933h.class);
        this.f45286c = i;
        if (i == 1) {
            super(dVar, C18804k.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19932g0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45286c) {
            case 0:
                return new C19933h(mo52727l(jSONObject, "data", C19935i.class));
            case 1:
                Integer k = C20528a.m48232k("originId", jSONObject);
                Integer k2 = C20528a.m48232k("destinationId", jSONObject);
                List l = mo52727l(jSONObject, "orderItems", C18800h.class);
                if (l == null) {
                    l = Collections.emptyList();
                }
                return new C18804k(C20528a.m48234o("riderEmailAddress", jSONObject), C20528a.m48233n("effectivePurchaseDateUtc", jSONObject), k, k2, l);
            default:
                return new C19932g0(C20528a.m48234o("error", jSONObject), C20528a.m48234o("outcome", jSONObject), C20528a.m48234o("purchaseId", jSONObject), C20528a.m48234o("requestReference", jSONObject), mo52727l(jSONObject, "transactions", C19955y.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45286c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                mo52729r(jSONObject, "data", ((C19933h) obj).f50625a);
                return jSONObject;
            case 1:
                C18804k kVar = (C18804k) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "originId", kVar.f47896d);
                C20528a.m48237t(jSONObject2, "destinationId", kVar.f47894b);
                mo52729r(jSONObject2, "orderItems", kVar.f47895c);
                C20528a.m48237t(jSONObject2, "riderEmailAddress", kVar.f47897e);
                C20528a.m48237t(jSONObject2, "effectivePurchaseDateUtc", kVar.f47893a);
                return jSONObject2;
            default:
                C19932g0 g0Var = (C19932g0) obj;
                JSONObject jSONObject3 = new JSONObject();
                mo52729r(jSONObject3, "transactions", g0Var.f50622c);
                C20528a.m48237t(jSONObject3, "error", g0Var.f50620a);
                C20528a.m48237t(jSONObject3, "outcome", g0Var.f50621b);
                C20528a.m48237t(jSONObject3, "purchaseId", g0Var.f50623d);
                C20528a.m48237t(jSONObject3, "requestReference", g0Var.f50624e);
                return jSONObject3;
        }
    }
}
