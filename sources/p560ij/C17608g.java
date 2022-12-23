package p560ij;

import org.json.JSONObject;
import p705on.C18793a;
import p705on.C18804k;
import p843uk.C19922c;
import p843uk.C19928e0;
import p843uk.C19950t;
import p843uk.C19951u;
import p843uk.C19953w;
import p867vk.C20149f;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.g */
public final class C17608g extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45284c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17608g(C20531d dVar, int i) {
        super(dVar, C18793a.class);
        this.f45284c = i;
        if (i == 1) {
            super(dVar, C19950t.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19928e0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        switch (this.f45284c) {
            case 0:
                return new C18793a(C20528a.m48234o("cardType", jSONObject2), C20528a.m48234o("expiryDate", jSONObject2), C20528a.m48234o("label", jSONObject2), C20528a.m48234o("lastFour", jSONObject2), C20528a.m48234o("savedToken", jSONObject2));
            case 1:
                Class<String> cls = String.class;
                Boolean bool = Boolean.TRUE;
                return new C19950t(Boolean.valueOf(bool.equals(C20528a.m48229h("ableToSave", jSONObject2))), bool.equals(C20528a.m48229h("supports3ds", jSONObject2)), mo52727l(jSONObject2, "cards", C18793a.class), mo52727l(jSONObject2, "items", C19951u.class), mo52727l(jSONObject2, "providers", C19953w.class), C20528a.m48234o("type", jSONObject2), (C20149f) mo52728m(jSONObject2, "pots", C20149f.class), C20528a.m48234o("healthStatus", jSONObject2), C20528a.m48234o("ledgerPosition", jSONObject2), C20528a.m48233n("minSplitAmount", jSONObject2), mo52727l(jSONObject2, "networks", cls), C20528a.m48234o("gateway", jSONObject2), C20528a.m48234o("gatewayMerchantId", jSONObject2), mo52727l(jSONObject2, "methods", cls));
            default:
                return new C19928e0((C19922c) mo52728m(jSONObject2, "auth3dsRequest", C19922c.class), (C18804k) mo52728m(jSONObject2, "products", C18804k.class));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45284c) {
            case 0:
                C18793a aVar = (C18793a) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "cardType", aVar.f47835a);
                C20528a.m48237t(jSONObject, "expiryDate", aVar.f47836b);
                C20528a.m48237t(jSONObject, "label", aVar.f47837c);
                C20528a.m48237t(jSONObject, "lastFour", aVar.f47838d);
                C20528a.m48237t(jSONObject, "savedToken", aVar.f47839e);
                return jSONObject;
            case 1:
                C19950t tVar = (C19950t) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "type", tVar.f50687f);
                mo52729r(jSONObject2, "cards", tVar.f50684c);
                mo52729r(jSONObject2, "items", tVar.f50685d);
                mo52729r(jSONObject2, "providers", tVar.f50686e);
                C20528a.m48237t(jSONObject2, "ableToSave", Boolean.valueOf(tVar.f50682a));
                C20528a.m48237t(jSONObject2, "supports3ds", Boolean.valueOf(tVar.f50683b));
                mo52730s(jSONObject2, "pots", tVar.f50688g);
                C20528a.m48237t(jSONObject2, "healthStatus", tVar.f50690i);
                C20528a.m48237t(jSONObject2, "ledgerPosition", tVar.f50691j);
                C20528a.m48237t(jSONObject2, "minSplitAmount", tVar.f50689h);
                mo52729r(jSONObject2, "networks", tVar.f50692k);
                C20528a.m48237t(jSONObject2, "gateway", tVar.f50693l);
                C20528a.m48237t(jSONObject2, "gatewayMerchantId", tVar.f50694m);
                mo52729r(jSONObject2, "methods", tVar.f50695n);
                return jSONObject2;
            default:
                C19928e0 e0Var = (C19928e0) obj;
                JSONObject jSONObject3 = new JSONObject();
                mo52730s(jSONObject3, "auth3dsRequest", e0Var.f50607a);
                mo52730s(jSONObject3, "products", e0Var.f50608b);
                return jSONObject3;
        }
    }
}
