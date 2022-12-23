package p606kj;

import org.json.JSONObject;
import p891wk.C20346b;
import p891wk.C20352g;
import p891wk.C20356k;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.d */
public final class C18073d extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46235c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18073d(C20531d dVar, int i) {
        super(dVar, C20346b.class);
        this.f46235c = i;
        if (i != 1) {
        } else {
            super(dVar, C20356k.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46235c) {
            case 0:
                C20346b bVar = new C20346b();
                bVar.f51516a = C20528a.m48232k("size", jSONObject);
                bVar.f51517b = C20528a.m48234o("fareType", jSONObject);
                bVar.f51518c = C20528a.m48234o("name", jSONObject);
                bVar.f51519d = C20528a.m48234o("strapline", jSONObject);
                return bVar;
            default:
                return new C20356k(mo52727l(jSONObject, "refundedTickets", C20352g.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46235c) {
            case 0:
                C20346b bVar = (C20346b) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "size", bVar.f51516a);
                C20528a.m48237t(jSONObject, "fareType", bVar.f51517b);
                C20528a.m48237t(jSONObject, "name", bVar.f51518c);
                C20528a.m48237t(jSONObject, "strapline", bVar.f51519d);
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                mo52729r(jSONObject2, "refundedTickets", ((C20356k) obj).f51560a);
                return jSONObject2;
        }
    }
}
