package p960zi;

import org.json.JSONObject;
import p536hj.C17449c;
import p654mk.C18386h;
import p654mk.C18395q;
import p654mk.C18396r;
import p819tk.C19686c;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: zi.i */
public final class C20860i extends C17449c {

    /* renamed from: c */
    public final /* synthetic */ int f52603c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C20860i(C20531d dVar, int i) {
        super(dVar, C18386h.class);
        this.f52603c = i;
        if (i != 1) {
        } else {
            super(dVar, C18395q.class);
        }
    }

    /* renamed from: u */
    public final JSONObject mo40386u(C19686c cVar) {
        switch (this.f52603c) {
            case 0:
                C18386h hVar = (C18386h) cVar;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "productRestrictionName", hVar.f46864b);
                C20528a.m48237t(jSONObject, "riderTypeRestrictionId", hVar.f46865c);
                C20528a.m48237t(jSONObject, "proofId", hVar.f46866d);
                return jSONObject;
            default:
                JSONObject jSONObject2 = new JSONObject();
                mo52730s(jSONObject2, "details", ((C18395q) cVar).f46896b);
                return jSONObject2;
        }
    }

    /* renamed from: v */
    public final C19686c mo40387v(JSONObject jSONObject) {
        switch (this.f52603c) {
            case 0:
                C18386h hVar = new C18386h();
                hVar.f46864b = jSONObject.getString("productRestrictionName");
                hVar.f46865c = C20528a.m48232k("riderTypeRestrictionId", jSONObject);
                hVar.f46866d = jSONObject.getString("proofId");
                return hVar;
            default:
                return new C18395q((C18396r) mo52728m(jSONObject, "details", C18396r.class));
        }
    }
}
