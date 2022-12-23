package p606kj;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.masabi.justride.sdk.models.ticket.ValidationMethod;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p584jl.C17885a;
import p634ln.C18247a;
import p657mn.C18406b;
import p752qn.C19143a;
import p752qn.C19145c;
import p752qn.C19146d;
import p752qn.C19147e;
import p752qn.C19148f;
import p752qn.C19149g;
import p752qn.C19150h;
import p752qn.C19151i;
import p891wk.C20344a;
import p891wk.C20353h;
import p891wk.C20354i;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.a */
public final class C18070a extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46232c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18070a(C20531d dVar, int i) {
        super(dVar, C20344a.class);
        this.f46232c = i;
        if (i == 1) {
            super(dVar, C20353h.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19150h.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Class<C19148f> cls = C19148f.class;
        switch (this.f46232c) {
            case 0:
                C20344a aVar = new C20344a((C18406b) mo52728m(jSONObject2, "activationDisclaimer", C18406b.class), C20528a.m48232k("activationDurationMinutes", jSONObject2), C20528a.m48232k("activations", jSONObject2), Boolean.TRUE.equals(C20528a.m48229h("implicitActivation", jSONObject2)));
                aVar.f51509d = C20528a.m48233n("activationStartTimestamp", jSONObject2);
                aVar.f51511f = C20528a.m48233n("firstActivationTimestamp", jSONObject2);
                aVar.f51512g = C20528a.m48232k("maxActivations", jSONObject2);
                return aVar;
            case 1:
                return new C20353h(C20528a.m48234o("purchaseId", jSONObject2), (C19148f) mo52728m(jSONObject2, "purchasePrice", cls), (C19148f) mo52728m(jSONObject2, "refundAmount", cls), C20528a.m48229h("isFullRefunded", jSONObject2), C20528a.m48234o("userId", jSONObject2), mo52727l(jSONObject2, "refundGroups", C20354i.class), mo52727l(jSONObject2, "adjustments", C19149g.class), C20528a.m48234o("purchaseChannel", jSONObject2), C20528a.m48234o("purchasePartner", jSONObject2));
            default:
                Class<Integer> cls2 = Integer.class;
                Class<String> cls3 = String.class;
                Class<C18247a> cls4 = C18247a.class;
                return new C19150h(C20528a.m48234o("fareType", jSONObject2), C20528a.m48230i("finalisationDate", jSONObject2), C20528a.m48230i("expectedFinalisationDate", jSONObject2), C20528a.m48234o("productName", jSONObject2), C20528a.m48234o("state", jSONObject2), C20528a.m48234o("ticketId", jSONObject2), C20528a.m48234o("ticketStrapLine", jSONObject2), mo52727l(jSONObject2, "ticketSymbols", cls3), C20528a.m48234o("groupId", jSONObject2), C20528a.m48232k("groupSortIndex", jSONObject2), C20528a.m48230i("validFrom", jSONObject2), C20528a.m48230i("validTo", jSONObject2), C20528a.m48234o("productDisplayName", jSONObject2), C20528a.m48230i("purchasedDate", jSONObject2), (C19143a) mo52728m(jSONObject2, "activationSummary", C19143a.class), (C18247a) mo52728m(jSONObject2, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, cls4), mo52727l(jSONObject2, "viaStations", cls4), (C18247a) mo52728m(jSONObject2, "destination", cls4), (C19146d) mo52728m(jSONObject2, "compositeProduct", C19146d.class), (C19148f) mo52728m(jSONObject2, InAppPurchaseMetaData.KEY_PRICE, cls), C20528a.m48234o("formattedPrice", jSONObject2), mo52727l(jSONObject2, "paymentDetails", C19147e.class), C20528a.m48229h("selfServiceRefundEnabled", jSONObject2), mo52727l(jSONObject2, "requiresFeatures", cls3), C20528a.m48234o("regulations", jSONObject2), C20528a.m48234o("proofOfEntitlement", jSONObject2), C20528a.m48234o("subBrandId", jSONObject2), ValidationMethod.parse(C20528a.m48234o("defaultValidationMethod", jSONObject2)), C20528a.m48232k("riderType", jSONObject2), mo52727l(jSONObject2, "transportModes", cls2), mo52727l(jSONObject2, "availabelTransferModes", cls2), Boolean.TRUE.equals(C20528a.m48229h("selectedForValidation", jSONObject2)), mo52727l(jSONObject2, "barcodeSummaries", C19145c.class), C20528a.m48234o("externalTicketReference", jSONObject2), C20528a.m48234o("originalTicketId", jSONObject2), (C19151i) mo52728m(jSONObject2, "usagePeriodInfo", C19151i.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        String str;
        switch (this.f46232c) {
            case 0:
                C20344a aVar = (C20344a) obj;
                JSONObject jSONObject = new JSONObject();
                mo52730s(jSONObject, "activationDisclaimer", aVar.f51506a);
                C20528a.m48237t(jSONObject, "activationDurationMinutes", aVar.f51507b);
                C20528a.m48237t(jSONObject, "activationStartTimestamp", aVar.f51509d);
                C20528a.m48237t(jSONObject, "activations", aVar.f51510e);
                C20528a.m48237t(jSONObject, "firstActivationTimestamp", aVar.f51511f);
                C20528a.m48237t(jSONObject, "maxActivations", aVar.f51512g);
                C20528a.m48237t(jSONObject, "implicitActivation", Boolean.valueOf(aVar.f51508c));
                return jSONObject;
            case 1:
                C20353h hVar = (C20353h) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "purchaseId", hVar.f51535a);
                mo52730s(jSONObject2, "purchasePrice", hVar.f51536b);
                mo52730s(jSONObject2, "refundAmount", hVar.f51537c);
                C20528a.m48237t(jSONObject2, "isFullRefunded", hVar.f51538d);
                C20528a.m48237t(jSONObject2, "userId", hVar.f51539e);
                mo52729r(jSONObject2, "refundGroups", hVar.f51540f);
                mo52729r(jSONObject2, "adjustments", hVar.f51541g);
                C20528a.m48237t(jSONObject2, "purchaseChannel", hVar.f51542h);
                C20528a.m48237t(jSONObject2, "purchasePartner", hVar.f51543i);
                return jSONObject2;
            default:
                C19150h hVar2 = (C19150h) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "fareType", hVar2.f48708a);
                C20528a.m48236q(jSONObject3, "finalisationDate", C17885a.m44446k0(hVar2.f48709b));
                C20528a.m48236q(jSONObject3, "expectedFinalisationDate", C17885a.m44394D(hVar2.f48710c));
                C20528a.m48237t(jSONObject3, "productName", hVar2.f48711d);
                C20528a.m48237t(jSONObject3, "state", hVar2.f48712e);
                C20528a.m48237t(jSONObject3, "ticketId", hVar2.f48713f);
                C20528a.m48237t(jSONObject3, "ticketStrapLine", hVar2.f48714g);
                mo52729r(jSONObject3, "ticketSymbols", hVar2.f48715h);
                C20528a.m48237t(jSONObject3, "groupId", hVar2.f48716i);
                C20528a.m48237t(jSONObject3, "groupSortIndex", hVar2.f48717j);
                C20528a.m48236q(jSONObject3, "validFrom", C17885a.m44394D(hVar2.f48718k));
                C20528a.m48236q(jSONObject3, "validTo", C17885a.m44394D(hVar2.f48719l));
                C20528a.m48237t(jSONObject3, "productDisplayName", hVar2.f48720m);
                C20528a.m48236q(jSONObject3, "purchasedDate", C17885a.m44394D(hVar2.f48721n));
                mo52730s(jSONObject3, "activationSummary", hVar2.f48722o);
                mo52730s(jSONObject3, AppMeasurementSdk.ConditionalUserProperty.ORIGIN, hVar2.f48723p);
                mo52729r(jSONObject3, "viaStations", hVar2.f48724q);
                mo52730s(jSONObject3, "destination", hVar2.f48725r);
                mo52730s(jSONObject3, "compositeProduct", hVar2.f48726s);
                mo52730s(jSONObject3, InAppPurchaseMetaData.KEY_PRICE, hVar2.f48727t);
                C20528a.m48237t(jSONObject3, "formattedPrice", hVar2.f48728u);
                mo52729r(jSONObject3, "paymentDetails", hVar2.f48729v);
                C20528a.m48237t(jSONObject3, "selfServiceRefundEnabled", hVar2.f48730w);
                mo52729r(jSONObject3, "requiresFeatures", hVar2.f48731x);
                String str2 = hVar2.f48732y;
                if (str2 != null) {
                    str = str2.replace("\n", "\\n");
                } else {
                    str = null;
                }
                C20528a.m48237t(jSONObject3, "regulations", str);
                C20528a.m48237t(jSONObject3, "proofOfEntitlement", hVar2.f48733z);
                C20528a.m48237t(jSONObject3, "subBrandId", hVar2.f48698A);
                C20528a.m48237t(jSONObject3, "defaultValidationMethod", hVar2.f48699B.name());
                C20528a.m48237t(jSONObject3, "riderType", hVar2.f48700C);
                mo52729r(jSONObject3, "transportModes", hVar2.f48701D);
                mo52729r(jSONObject3, "availabelTransferModes", hVar2.f48702E);
                C20528a.m48237t(jSONObject3, "selectedForValidation", Boolean.valueOf(hVar2.f48703F));
                mo52729r(jSONObject3, "barcodeSummaries", hVar2.f48704G);
                C20528a.m48237t(jSONObject3, "externalTicketReference", hVar2.f48705H);
                C20528a.m48237t(jSONObject3, "originalTicketId", hVar2.f48706I);
                mo52730s(jSONObject3, "usagePeriodInfo", hVar2.f48707J);
                return jSONObject3;
        }
    }
}
