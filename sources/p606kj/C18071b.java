package p606kj;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p657mn.C18406b;
import p752qn.C19143a;
import p752qn.C19148f;
import p752qn.C19149g;
import p891wk.C20354i;
import p891wk.C20357l;
import p891wk.C20363r;
import p891wk.C20365t;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.b */
public final class C18071b extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46233c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18071b(C20531d dVar, int i) {
        super(dVar, C19143a.class);
        this.f46233c = i;
        if (i == 1) {
            super(dVar, C20354i.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20365t.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        switch (this.f46233c) {
            case 0:
                return new C19143a(C20528a.m48232k("activationsUsed", jSONObject2), C20528a.m48232k("maxActivations", jSONObject2), C20528a.m48232k("activationDuration", jSONObject2), C20528a.m48230i("firstActivated", jSONObject2), C20528a.m48230i("activationStart", jSONObject2), C20528a.m48230i("activationEnd", jSONObject2), (C18406b) mo52728m(jSONObject2, "activationDisclaimer", C18406b.class), Boolean.TRUE.equals(C20528a.m48229h("eligibleForImplicitActivation", jSONObject2)));
            case 1:
                Class<C19148f> cls = C19148f.class;
                return new C20354i(C20528a.m48234o("groupId", jSONObject2), mo52727l(jSONObject2, "tickets", C20357l.class), (C19148f) mo52728m(jSONObject2, "purchasePrice", cls), mo52727l(jSONObject2, "adjustments", C19149g.class), (C19148f) mo52728m(jSONObject2, "refundableValue", cls), C20528a.m48234o("subBrandId", jSONObject2), C20528a.m48234o("externalProductReference", jSONObject2), C20528a.m48232k(InAppPurchaseMetaData.KEY_PRODUCT_ID, jSONObject2), C20528a.m48234o("purchaseChannel", jSONObject2), C20528a.m48234o("purchasePartner", jSONObject2));
            default:
                return new C20365t(mo52727l(jSONObject2, "activationStarts", Long.class), mo52727l(jSONObject2, "activations", C20363r.class), C20528a.m48234o("eTicketNumber", jSONObject2), C20528a.m48234o("state", jSONObject2), C20528a.m48232k("uses", jSONObject2));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        String str;
        switch (this.f46233c) {
            case 0:
                C19143a aVar = (C19143a) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "activationsUsed", aVar.f48670a);
                C20528a.m48237t(jSONObject, "maxActivations", aVar.f48671b);
                C20528a.m48237t(jSONObject, "activationDuration", aVar.f48672c);
                C20528a.m48236q(jSONObject, "firstActivated", aVar.f48673d);
                C20528a.m48236q(jSONObject, "activationStart", aVar.f48674e);
                C20528a.m48236q(jSONObject, "activationEnd", aVar.f48675f);
                C18406b bVar = aVar.f48676g;
                if (bVar != null) {
                    String str2 = bVar.f46928a;
                    String str3 = null;
                    if (str2 != null) {
                        str = str2.replace("\n", "\\n");
                    } else {
                        str = null;
                    }
                    String str4 = bVar.f46929b;
                    if (str4 != null) {
                        str3 = str4.replace("\n", "\\n");
                    }
                    mo52730s(jSONObject, "activationDisclaimer", new C18406b(str, str3));
                }
                C20528a.m48237t(jSONObject, "eligibleForImplicitActivation", Boolean.valueOf(aVar.f48677h));
                return jSONObject;
            case 1:
                C20354i iVar = (C20354i) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "groupId", iVar.f51544a);
                mo52729r(jSONObject2, "tickets", iVar.f51545b);
                mo52730s(jSONObject2, "purchasePrice", iVar.f51546c);
                mo52729r(jSONObject2, "adjustments", iVar.f51547d);
                mo52730s(jSONObject2, "refundableValue", iVar.f51548e);
                C20528a.m48237t(jSONObject2, "subBrandId", iVar.f51549f);
                C20528a.m48237t(jSONObject2, "externalProductReference", iVar.f51550g);
                C20528a.m48237t(jSONObject2, InAppPurchaseMetaData.KEY_PRODUCT_ID, iVar.f51551h);
                C20528a.m48237t(jSONObject2, "purchaseChannel", iVar.f51552i);
                C20528a.m48237t(jSONObject2, "purchasePartner", iVar.f51553j);
                return jSONObject2;
            default:
                C20365t tVar = (C20365t) obj;
                JSONObject jSONObject3 = new JSONObject();
                mo52729r(jSONObject3, "activationStarts", tVar.f51636a);
                mo52729r(jSONObject3, "activations", tVar.f51637b);
                C20528a.m48237t(jSONObject3, "eTicketNumber", tVar.f51638c);
                C20528a.m48237t(jSONObject3, "state", tVar.f51639d);
                C20528a.m48237t(jSONObject3, "uses", tVar.f51640e);
                return jSONObject3;
        }
    }
}
