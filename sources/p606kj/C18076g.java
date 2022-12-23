package p606kj;

import org.json.JSONObject;
import p891wk.C20349d;
import p891wk.C20359n;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.g */
public final class C18076g extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46237c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18076g(C20531d dVar, int i) {
        super(dVar, C20349d.class);
        this.f46237c = i;
        if (i != 1) {
        } else {
            super(dVar, C20359n.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46237c) {
            case 0:
                return new C20349d(C20528a.m48234o("GENDER", jSONObject), C20528a.m48234o("PROOF_ID", jSONObject));
            default:
                C20359n nVar = new C20359n();
                nVar.f51567a = C20528a.m48232k("originId", jSONObject);
                nVar.f51568b = C20528a.m48232k("destinationId", jSONObject);
                nVar.f51571e = mo52727l(jSONObject, "availableViaStationIds", Integer.class);
                return nVar;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46237c) {
            case 0:
                C20349d dVar = (C20349d) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "GENDER", dVar.f51525a);
                C20528a.m48237t(jSONObject, "PROOF_ID", dVar.f51526b);
                return jSONObject;
            default:
                C20359n nVar = (C20359n) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "originId", nVar.f51567a);
                C20528a.m48237t(jSONObject2, "destinationId", nVar.f51568b);
                mo52729r(jSONObject2, "availableViaStationIds", nVar.f51571e);
                return jSONObject2;
        }
    }
}
