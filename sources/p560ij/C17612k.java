package p560ij;

import com.appsflyer.ServerParameters;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p752qn.C19148f;
import p843uk.C19938j0;
import p843uk.C19941l;
import p843uk.C19944n;
import p843uk.C19954x;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: ij.k */
public final class C17612k extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f45288c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C17612k(C20531d dVar, int i) {
        super(dVar, C19941l.class);
        this.f45288c = i;
        if (i == 1) {
            super(dVar, C19954x.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19938j0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f45288c) {
            case 0:
                return new C19941l(C20528a.m48232k(InAppPurchaseMetaData.KEY_PRODUCT_ID, jSONObject), C20528a.m48232k("quantity", jSONObject));
            case 1:
                return new C19954x((C19148f) mo52728m(jSONObject, "amount", C19148f.class), C20528a.m48234o("merchantReference", jSONObject), (C19944n) mo52728m(jSONObject, "newCard", C19944n.class), C20528a.m48234o("pspReference", jSONObject), C20528a.m48234o("pspType", jSONObject), (C19938j0) mo52728m(jSONObject, "savedCard", C19938j0.class), C20528a.m48234o(ServerParameters.STATUS, jSONObject));
            default:
                return new C19938j0(C20528a.m48234o("approvalCode", jSONObject), C20528a.m48234o("cardholderName", jSONObject), C20528a.m48234o("lastFour", jSONObject));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f45288c) {
            case 0:
                C19941l lVar = (C19941l) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, InAppPurchaseMetaData.KEY_PRODUCT_ID, lVar.f50653a);
                C20528a.m48237t(jSONObject, "quantity", lVar.f50654b);
                return jSONObject;
            case 1:
                C19954x xVar = (C19954x) obj;
                JSONObject jSONObject2 = new JSONObject();
                mo52730s(jSONObject2, "amount", xVar.f50719a);
                C20528a.m48237t(jSONObject2, "merchantReference", xVar.f50720b);
                mo52730s(jSONObject2, "newCard", xVar.f50721c);
                C20528a.m48237t(jSONObject2, "pspReference", xVar.f50722d);
                C20528a.m48237t(jSONObject2, "pspType", xVar.f50723e);
                mo52730s(jSONObject2, "savedCard", xVar.f50724f);
                C20528a.m48237t(jSONObject2, ServerParameters.STATUS, xVar.f50725g);
                return jSONObject2;
            default:
                C19938j0 j0Var = (C19938j0) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "approvalCode", j0Var.f50640a);
                C20528a.m48237t(jSONObject3, "cardholderName", j0Var.f50641b);
                C20528a.m48237t(jSONObject3, "lastFour", j0Var.f50642c);
                return jSONObject3;
        }
    }
}
