package p960zi;

import org.json.JSONObject;
import p536hj.C17450d;
import p654mk.C18380b;
import p654mk.C18381c;
import p654mk.C18390l;
import p654mk.C18391m;
import p819tk.C19687d;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.c */
public final class C20854c extends C17450d {

    /* renamed from: c */
    public final /* synthetic */ int f52600c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20854c(C20531d dVar, int i) {
        super(dVar, C18380b.class);
        this.f52600c = i;
        if (i != 1) {
        } else {
            super(dVar, C18391m.class);
        }
    }

    /* renamed from: u */
    public final JSONObject mo40388u(C19687d dVar) {
        switch (this.f52600c) {
            case 0:
                C18380b bVar = (C18380b) dVar;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "username", bVar.f46849d);
                C20528a.m48237t(jSONObject, "accountId", bVar.f46850e);
                C20528a.m48237t(jSONObject, "emailAddress", bVar.f46851f);
                mo52730s(jSONObject, "loginResult", bVar.f46852g);
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                mo52729r(jSONObject2, "entitlements", ((C18391m) dVar).f46885d);
                return jSONObject2;
        }
    }

    /* renamed from: v */
    public final C19687d mo40389v(JSONObject jSONObject) {
        switch (this.f52600c) {
            case 0:
                return new C18380b(C20528a.m48234o("username", jSONObject), C20528a.m48234o("accountId", jSONObject), C20528a.m48234o("emailAddress", jSONObject), (C18381c) mo52728m(jSONObject, "loginResult", C18381c.class));
            default:
                return new C18391m(mo52727l(jSONObject, "entitlements", C18390l.class));
        }
    }
}
