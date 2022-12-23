package p560ij;

import com.unity3d.ads.metadata.MediationMetaData;
import org.json.JSONObject;
import p843uk.C19930f0;
import p843uk.C19931g;
import p843uk.C19951u;
import p843uk.C19954x;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.h */
public final class C17609h extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45285c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17609h(C20531d dVar, int i) {
        super(dVar, C19931g.class);
        this.f45285c = i;
        if (i == 1) {
            super(dVar, C19951u.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19930f0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        switch (this.f45285c) {
            case 0:
                return new C19931g(C20528a.m48234o("md", jSONObject2), C20528a.m48234o("paReq", jSONObject2), C20528a.m48234o("termUrl", jSONObject2), C20528a.m48234o("url", jSONObject2), C20528a.m48234o(MediationMetaData.KEY_VERSION, jSONObject2));
            case 1:
                return new C19951u(C20528a.m48234o("label", jSONObject2), C20528a.m48234o("sessionId", jSONObject2), Boolean.TRUE.equals(C20528a.m48229h("supports3ds", jSONObject2)), C20528a.m48234o("type", jSONObject2), C20528a.m48234o("url", jSONObject2), C20528a.m48234o("billerId", jSONObject2), C20528a.m48234o("upc", jSONObject2), C20528a.m48233n("lowerLimit", jSONObject2), C20528a.m48233n("upperLimit", jSONObject2));
            default:
                return new C19930f0(C20528a.m48234o("error", jSONObject2), C20528a.m48234o("outcome", jSONObject2), C20528a.m48234o("purchaseId", jSONObject2), C20528a.m48234o("requestReference", jSONObject2), mo52727l(jSONObject2, "paymentReferences", C19954x.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45285c) {
            case 0:
                C19931g gVar = (C19931g) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "md", gVar.f50615a);
                C20528a.m48237t(jSONObject, "paReq", gVar.f50616b);
                C20528a.m48237t(jSONObject, "termUrl", gVar.f50617c);
                C20528a.m48237t(jSONObject, "url", gVar.f50618d);
                C20528a.m48237t(jSONObject, MediationMetaData.KEY_VERSION, gVar.f50619e);
                return jSONObject;
            case 1:
                C19951u uVar = (C19951u) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "supports3ds", Boolean.valueOf(uVar.f50698c));
                C20528a.m48237t(jSONObject2, "label", uVar.f50696a);
                C20528a.m48237t(jSONObject2, "sessionId", uVar.f50697b);
                C20528a.m48237t(jSONObject2, "type", uVar.f50699d);
                C20528a.m48237t(jSONObject2, "url", uVar.f50700e);
                C20528a.m48237t(jSONObject2, "billerId", uVar.f50701f);
                C20528a.m48237t(jSONObject2, "upc", uVar.f50702g);
                C20528a.m48237t(jSONObject2, "lowerLimit", uVar.f50703h);
                C20528a.m48237t(jSONObject2, "upperLimit", uVar.f50704i);
                return jSONObject2;
            default:
                C19930f0 f0Var = (C19930f0) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "error", f0Var.f50610a);
                C20528a.m48237t(jSONObject3, "outcome", f0Var.f50611b);
                mo52729r(jSONObject3, "paymentReferences", f0Var.f50612c);
                C20528a.m48237t(jSONObject3, "purchaseId", f0Var.f50613d);
                C20528a.m48237t(jSONObject3, "requestReference", f0Var.f50614e);
                return jSONObject3;
        }
    }
}
