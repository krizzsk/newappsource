package p606kj;

import org.json.JSONObject;
import p705on.C18810p;
import p752qn.C19145c;
import p752qn.C19148f;
import p891wk.C20355j;
import p891wk.C20365t;
import p891wk.C20367v;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.c */
public final class C18072c extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46234c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18072c(C20531d dVar, int i) {
        super(dVar, C19145c.class);
        this.f46234c = i;
        if (i == 1) {
            super(dVar, C20355j.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20367v.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46234c) {
            case 0:
                return new C19145c(C20528a.m48234o("name", jSONObject), C20528a.m48234o("symbology", jSONObject), Boolean.TRUE.equals(C20528a.m48229h("dynamic", jSONObject)));
            case 1:
                return new C20355j(C20528a.m48234o("groupId", jSONObject), C20528a.m48234o("partner", jSONObject), (C19148f) mo52728m(jSONObject, "refundAmount", C19148f.class), C20528a.m48234o("refundReason", jSONObject), C20528a.m48234o("svaId", jSONObject), (C18810p) mo52728m(jSONObject, "userIdentity", C18810p.class));
            default:
                C20367v vVar = new C20367v();
                vVar.f51642a = mo52727l(jSONObject, "ticketSyncData", C20365t.class);
                return vVar;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46234c) {
            case 0:
                C19145c cVar = (C19145c) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "name", cVar.f48685a);
                C20528a.m48237t(jSONObject, "symbology", cVar.f48686b);
                C20528a.m48237t(jSONObject, "dynamic", Boolean.valueOf(cVar.f48687c));
                return jSONObject;
            case 1:
                C20355j jVar = (C20355j) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "groupId", jVar.f51554a);
                C20528a.m48237t(jSONObject2, "partner", jVar.f51555b);
                mo52730s(jSONObject2, "refundAmount", jVar.f51556c);
                C20528a.m48237t(jSONObject2, "refundReason", jVar.f51557d);
                C20528a.m48237t(jSONObject2, "svaId", jVar.f51558e);
                mo52730s(jSONObject2, "userIdentity", jVar.f51559f);
                return jSONObject2;
            default:
                JSONObject jSONObject3 = new JSONObject();
                mo52729r(jSONObject3, "ticketSyncData", ((C20367v) obj).f51642a);
                return jSONObject3;
        }
    }
}
