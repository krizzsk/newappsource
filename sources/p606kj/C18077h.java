package p606kj;

import java.util.ArrayList;
import org.json.JSONObject;
import p891wk.C20351f;
import p891wk.C20360o;
import p891wk.C20370y;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.h */
public final class C18077h extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46238c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18077h(C20531d dVar, int i) {
        super(dVar, C20351f.class);
        this.f46238c = i;
        if (i == 1) {
            super(dVar, C20360o.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20370y.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46238c) {
            case 0:
                ArrayList l = mo52727l(jSONObject, "ticketIds", String.class);
                return new C20351f(jSONObject.optInt("ticketStorageVersion", 0), jSONObject.optLong("lastSynchronisationTimestamp", 0), l, C20528a.m48234o("lastSynchronisationSessionToken", jSONObject));
            case 1:
                return new C20360o(C20528a.m48234o("colour", jSONObject), C20528a.m48229h("unsyncedActivationEnabled", jSONObject), C20528a.m48233n("recentActivationDurationInSeconds", jSONObject));
            default:
                C20370y yVar = new C20370y();
                yVar.f51647a = C20528a.m48234o("payload", jSONObject);
                yVar.f51648b = C20528a.m48234o("encodingType", jSONObject);
                yVar.f51649c = C20528a.m48234o("encodingFormat", jSONObject);
                yVar.f51650d = C20528a.m48234o("symbology", jSONObject);
                yVar.f51651e = C20528a.m48229h("primary", jSONObject);
                yVar.f51652f = C20528a.m48229h("dynamic", jSONObject);
                yVar.f51653g = C20528a.m48234o("name", jSONObject);
                return yVar;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46238c) {
            case 0:
                C20351f fVar = (C20351f) obj;
                JSONObject jSONObject = new JSONObject();
                mo52729r(jSONObject, "ticketIds", fVar.f51528a);
                C20528a.m48237t(jSONObject, "ticketStorageVersion", Integer.valueOf(fVar.f51529b));
                C20528a.m48237t(jSONObject, "lastSynchronisationSessionToken", fVar.f51530c);
                C20528a.m48237t(jSONObject, "lastSynchronisationTimestamp", Long.valueOf(fVar.f51531d));
                return jSONObject;
            case 1:
                C20360o oVar = (C20360o) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "colour", oVar.f51573a);
                C20528a.m48237t(jSONObject2, "unsyncedActivationEnabled", oVar.f51574b);
                C20528a.m48237t(jSONObject2, "recentActivationDurationInSeconds", oVar.f51575c);
                return jSONObject2;
            default:
                C20370y yVar = (C20370y) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "payload", yVar.f51647a);
                C20528a.m48237t(jSONObject3, "encodingType", yVar.f51648b);
                C20528a.m48237t(jSONObject3, "encodingFormat", yVar.f51649c);
                C20528a.m48237t(jSONObject3, "symbology", yVar.f51650d);
                C20528a.m48237t(jSONObject3, "primary", yVar.f51651e);
                C20528a.m48237t(jSONObject3, "dynamic", yVar.f51652f);
                C20528a.m48237t(jSONObject3, "name", yVar.f51653g);
                return jSONObject3;
        }
    }
}
