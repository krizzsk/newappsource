package p560ij;

import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p657mn.C18406b;
import p705on.C18804k;
import p705on.C18810p;
import p752qn.C19148f;
import p843uk.C19917a;
import p843uk.C19918a0;
import p843uk.C19919b;
import p843uk.C19934h0;
import p843uk.C19940k0;
import p843uk.C19943m;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.b */
public final class C17603b extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45281c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17603b(C20531d dVar, int i) {
        super(dVar, C19919b.class);
        this.f45281c = i;
        if (i == 1) {
            super(dVar, C19943m.class);
        } else if (i == 2) {
            super(dVar, C19918a0.class);
        } else if (i != 3) {
        } else {
            super(dVar, C19940k0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        Class<C19148f> cls = C19148f.class;
        Class<String> cls2 = String.class;
        switch (this.f45281c) {
            case 0:
                return new C19919b(mo52727l(jSONObject2, "supported3dsVersions", cls2));
            case 1:
                return new C19943m(C20528a.m48234o("cardholderName", jSONObject2), C20528a.m48234o("cardNumber", jSONObject2), C20528a.m48234o("expiryDate", jSONObject2), C20528a.m48234o("securityCode", jSONObject2), (C19917a) mo52728m(jSONObject2, "address", C19917a.class), C20528a.m48229h("shouldSave", jSONObject2).booleanValue());
            case 2:
                Class<C18406b> cls3 = C18406b.class;
                Class<Integer> cls4 = Integer.class;
                return new C19918a0(C20528a.m48229h("accountRequired", jSONObject2), mo52727l(jSONObject2, "availableViaStationIds", cls4), C20528a.m48234o("externalProductReference", jSONObject2), C20528a.m48234o("fareType", jSONObject2), (C18406b) mo52728m(jSONObject2, "helpText", cls3), C20528a.m48232k("id", jSONObject2), C20528a.m48234o("journeyId", jSONObject2), C20528a.m48232k("maxQuantity", jSONObject2), C20528a.m48234o("name", jSONObject2), (C19148f) mo52728m(jSONObject2, InAppPurchaseMetaData.KEY_PRICE, cls), (C18406b) mo52728m(jSONObject2, "purchaseDisclaimer", cls3), mo52727l(jSONObject2, "requiredIdentityInformation", C19934h0.class), C20528a.m48232k("riderType", jSONObject2), C20528a.m48234o("subBrandId", jSONObject2), C20528a.m48232k("tariffVersion", jSONObject2), C20528a.m48232k("transactionFee", jSONObject2), mo52727l(jSONObject2, "requiresFeature", cls2), C20528a.m48234o("strapline", jSONObject2), mo52727l(jSONObject2, "symbolIds", cls2), mo52727l(jSONObject2, "transportModes", cls4));
            default:
                return new C19940k0(C20528a.m48234o("ledgerPosition", jSONObject2), (C19148f) mo52728m(jSONObject2, InAppPurchaseMetaData.KEY_PRICE, cls), (C18804k) mo52728m(jSONObject2, "productItems", C18804k.class), C20528a.m48234o("reason", jSONObject2), C20528a.m48234o("svaId", jSONObject2), (C18810p) mo52728m(jSONObject2, "userIdentity", C18810p.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45281c) {
            case 0:
                JSONObject jSONObject = new JSONObject();
                mo52729r(jSONObject, "supported3dsVersions", ((C19919b) obj).f50589a);
                return jSONObject;
            case 1:
                C19943m mVar = (C19943m) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "cardholderName", mVar.f50656a);
                C20528a.m48237t(jSONObject2, "cardNumber", mVar.f50657b);
                C20528a.m48237t(jSONObject2, "expiryDate", mVar.f50658c);
                C20528a.m48237t(jSONObject2, "securityCode", mVar.f50659d);
                mo52730s(jSONObject2, "address", mVar.f50660e);
                C20528a.m48237t(jSONObject2, "shouldSave", Boolean.valueOf(mVar.f50661f));
                return jSONObject2;
            case 2:
                C19918a0 a0Var = (C19918a0) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "accountRequired", a0Var.f50569a);
                mo52729r(jSONObject3, "availableViaStationIds", a0Var.f50570b);
                C20528a.m48237t(jSONObject3, "externalProductReference", a0Var.f50571c);
                C20528a.m48237t(jSONObject3, "fareType", a0Var.f50572d);
                mo52730s(jSONObject3, "helpText", a0Var.f50573e);
                C20528a.m48237t(jSONObject3, "id", a0Var.f50574f);
                C20528a.m48237t(jSONObject3, "journeyId", a0Var.f50575g);
                C20528a.m48237t(jSONObject3, "maxQuantity", a0Var.f50576h);
                C20528a.m48237t(jSONObject3, "name", a0Var.f50577i);
                mo52730s(jSONObject3, InAppPurchaseMetaData.KEY_PRICE, a0Var.f50578j);
                mo52730s(jSONObject3, "purchaseDisclaimer", a0Var.f50579k);
                mo52729r(jSONObject3, "requiredIdentityInformation", a0Var.f50580l);
                C20528a.m48237t(jSONObject3, "riderType", a0Var.f50581m);
                C20528a.m48237t(jSONObject3, "subBrandId", a0Var.f50582n);
                C20528a.m48237t(jSONObject3, "tariffVersion", a0Var.f50583o);
                C20528a.m48237t(jSONObject3, "transactionFee", a0Var.f50584p);
                mo52729r(jSONObject3, "requiresFeature", a0Var.f50585q);
                C20528a.m48237t(jSONObject3, "strapline", a0Var.f50586r);
                mo52729r(jSONObject3, "symbolIds", a0Var.f50587s);
                mo52729r(jSONObject3, "transportModes", a0Var.f50588t);
                return jSONObject3;
            default:
                C19940k0 k0Var = (C19940k0) obj;
                JSONObject jSONObject4 = new JSONObject();
                C20528a.m48237t(jSONObject4, "ledgerPosition", k0Var.f50647a);
                mo52730s(jSONObject4, InAppPurchaseMetaData.KEY_PRICE, k0Var.f50648b);
                mo52730s(jSONObject4, "productItems", k0Var.f50649c);
                C20528a.m48237t(jSONObject4, "reason", k0Var.f50650d);
                C20528a.m48237t(jSONObject4, "svaId", k0Var.f50651e);
                mo52730s(jSONObject4, "userIdentity", k0Var.f50652f);
                return jSONObject4;
        }
    }
}
