package p606kj;

import com.appboy.Constants;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.ServerParameters;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p752qn.C19148f;
import p891wk.C20348c;
import p891wk.C20352g;
import p891wk.C20357l;
import p891wk.C20369x;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.f */
public final class C18075f extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46236c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18075f(C20531d dVar, int i) {
        super(dVar, C20348c.class);
        this.f46236c = i;
        if (i == 1) {
            super(dVar, C20357l.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20369x.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46236c) {
            case 0:
                return new C20348c(C20528a.m48232k(Constants.APPBOY_PUSH_ACCENT_KEY, jSONObject), C20528a.m48233n("ast", jSONObject), C20528a.m48233n("fat", jSONObject));
            case 1:
                return new C20357l(C20528a.m48234o("id", jSONObject), C20528a.m48234o("ticketState", jSONObject), C20528a.m48229h("refundable", jSONObject).booleanValue(), C20528a.m48234o(TwitterUser.DESCRIPTION_KEY, jSONObject), (C19148f) mo52728m(jSONObject, InAppPurchaseMetaData.KEY_PRICE, C19148f.class));
            default:
                C20369x xVar = new C20369x();
                xVar.f51644a = mo52727l(jSONObject, "ticketList", C20352g.class);
                xVar.f51645b = mo52727l(jSONObject, "ticketToDeletedIds", String.class);
                xVar.f51646c = C20528a.m48234o(ServerParameters.STATUS, jSONObject);
                return xVar;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46236c) {
            case 0:
                C20348c cVar = (C20348c) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, Constants.APPBOY_PUSH_ACCENT_KEY, cVar.f51522a);
                C20528a.m48237t(jSONObject, "ast", cVar.f51523b);
                C20528a.m48237t(jSONObject, "fat", cVar.f51524c);
                return jSONObject;
            case 1:
                C20357l lVar = (C20357l) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "id", lVar.f51561a);
                C20528a.m48237t(jSONObject2, "ticketState", lVar.f51562b);
                C20528a.m48237t(jSONObject2, "refundable", Boolean.valueOf(lVar.f51563c));
                C20528a.m48237t(jSONObject2, TwitterUser.DESCRIPTION_KEY, lVar.f51564d);
                mo52730s(jSONObject2, InAppPurchaseMetaData.KEY_PRICE, lVar.f51565e);
                return jSONObject2;
            default:
                C20369x xVar = (C20369x) obj;
                JSONObject jSONObject3 = new JSONObject();
                mo52729r(jSONObject3, "ticketList", xVar.f51644a);
                mo52729r(jSONObject3, "ticketToDeletedIds", xVar.f51645b);
                C20528a.m48237t(jSONObject3, ServerParameters.STATUS, xVar.f51646c);
                return jSONObject3;
        }
    }
}
