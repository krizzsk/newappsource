package p606kj;

import com.masabi.justride.sdk.internal.models.ticket.TicketState;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import org.json.JSONObject;
import p752qn.C19147e;
import p752qn.C19148f;
import p891wk.C20344a;
import p891wk.C20345a0;
import p891wk.C20346b;
import p891wk.C20347b0;
import p891wk.C20349d;
import p891wk.C20352g;
import p891wk.C20359n;
import p891wk.C20362q;
import p891wk.C20370y;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.k */
public final class C18080k extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46241c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18080k(C20531d dVar, int i) {
        super(dVar, C20352g.class);
        this.f46241c = i;
        if (i == 1) {
            super(dVar, C20362q.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20345a0.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        boolean z;
        Class<C20344a> cls = C20344a.class;
        switch (this.f46241c) {
            case 0:
                return new C20352g(C20528a.m48234o("id", jSONObject), (C20344a) mo52728m(jSONObject, "activationDetails", cls), jSONObject);
            case 1:
                Class<String> cls2 = String.class;
                Class<C19148f> cls3 = C19148f.class;
                Class<Integer> cls4 = Integer.class;
                C20362q qVar = new C20362q(C20528a.m48234o("id", jSONObject), (C19148f) mo52728m(jSONObject, InAppPurchaseMetaData.KEY_PRICE, cls3));
                qVar.f51595a = C20528a.m48234o("apiVersion", jSONObject);
                qVar.f51596b = (C20346b) mo52728m(jSONObject, "composite", C20346b.class);
                qVar.f51597c = C20528a.m48234o("groupId", jSONObject);
                qVar.f51598d = C20528a.m48234o("appId", jSONObject);
                qVar.f51599e = C20528a.m48234o("subBrandId", jSONObject);
                qVar.f51600f = mo52727l(jSONObject, "ticketSymbolIds", cls2);
                qVar.f51601g = C20528a.m48234o("ticketRegulations", jSONObject);
                qVar.f51602h = C20528a.m48234o("defaultValidationMethod", jSONObject);
                qVar.f51603i = C20528a.m48233n("selfServiceCancellationEndTimestamp", jSONObject);
                Boolean h = C20528a.m48229h("selfServiceRefundEnabled", jSONObject);
                if (h != null) {
                    z = h.booleanValue();
                } else {
                    z = false;
                }
                qVar.f51604j = Boolean.valueOf(z);
                qVar.f51605k = C20528a.m48232k("maxGroupSize", jSONObject);
                qVar.f51606l = (C20345a0) mo52728m(jSONObject, "validityPeriod", C20345a0.class);
                qVar.f51607m = (C20359n) mo52728m(jSONObject, "route", C20359n.class);
                qVar.f51608n = (C20344a) mo52728m(jSONObject, "activationDetails", cls);
                qVar.f51609o = C20528a.m48233n("purchasedTimestamp", jSONObject);
                qVar.f51610p = C20528a.m48232k(InAppPurchaseMetaData.KEY_PRODUCT_ID, jSONObject);
                qVar.f51612r = C20528a.m48234o("productName", jSONObject);
                qVar.f51613s = C20528a.m48234o("fareType", jSONObject);
                qVar.f51614t = C20528a.m48234o("payload", jSONObject);
                qVar.f51615u = mo52727l(jSONObject, "payloads", C20370y.class);
                qVar.f51616v = mo52727l(jSONObject, "visval", C20347b0.class);
                qVar.f51617w = mo52727l(jSONObject, "paymentCardInfo", C19147e.class);
                qVar.f51618x = C20528a.m48233n("finalizationTimestamp", jSONObject);
                qVar.f51620z = C20528a.m48232k("riderType", jSONObject);
                qVar.f51579A = C20528a.m48234o("externalTicketReference", jSONObject);
                qVar.f51580B = (C19148f) mo52728m(jSONObject, "priceIfBoughtAlone", cls3);
                qVar.f51583E = C20528a.m48232k("groupSortIndex", jSONObject);
                qVar.f51584F = mo52727l(jSONObject, "requiresFeature", cls2);
                qVar.f51585G = C20528a.m48234o("usagePeriodSpecification", jSONObject);
                qVar.f51582D = TicketState.parse(C20528a.m48234o("state", jSONObject));
                qVar.f51587I = C20528a.m48234o("ticketStrapline", jSONObject);
                qVar.f51588J = mo52727l(jSONObject, "transportModes", cls4);
                qVar.f51589K = mo52727l(jSONObject, "fareBlocks", cls4);
                qVar.f51590L = mo52727l(jSONObject, "transferTo", cls4);
                qVar.f51591M = (C20349d) mo52728m(jSONObject, "identityInformation", C20349d.class);
                qVar.f51593O = C20528a.m48234o("originalTicketNumber", jSONObject);
                qVar.f51594P = C20528a.m48234o("layoutPreset", jSONObject);
                return qVar;
            default:
                C20345a0 a0Var = new C20345a0();
                a0Var.f51514a = C20528a.m48233n("validFromTimestamp", jSONObject);
                a0Var.f51515b = C20528a.m48233n("validToTimestamp", jSONObject);
                return a0Var;
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46241c) {
            case 0:
                return ((C20352g) obj).f51534c;
            case 1:
                C20362q qVar = (C20362q) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "apiVersion", qVar.f51595a);
                mo52730s(jSONObject, "composite", qVar.f51596b);
                C20528a.m48237t(jSONObject, "groupId", qVar.f51597c);
                C20528a.m48237t(jSONObject, "appId", qVar.f51598d);
                C20528a.m48237t(jSONObject, "subBrandId", qVar.f51599e);
                mo52729r(jSONObject, "ticketSymbolIds", qVar.f51600f);
                C20528a.m48237t(jSONObject, "ticketRegulations", qVar.f51601g);
                C20528a.m48237t(jSONObject, "defaultValidationMethod", qVar.f51602h);
                C20528a.m48237t(jSONObject, "selfServiceCancellationEndTimestamp", qVar.f51603i);
                C20528a.m48237t(jSONObject, "selfServiceRefundEnabled", qVar.f51604j);
                C20528a.m48237t(jSONObject, "maxGroupSize", qVar.f51605k);
                mo52730s(jSONObject, "validityPeriod", qVar.f51606l);
                mo52730s(jSONObject, "route", qVar.f51607m);
                mo52730s(jSONObject, "activationDetails", qVar.f51608n);
                C20528a.m48237t(jSONObject, "purchasedTimestamp", qVar.f51609o);
                C20528a.m48237t(jSONObject, InAppPurchaseMetaData.KEY_PRODUCT_ID, qVar.f51610p);
                mo52730s(jSONObject, InAppPurchaseMetaData.KEY_PRICE, qVar.f51611q);
                C20528a.m48237t(jSONObject, "productName", qVar.f51612r);
                C20528a.m48237t(jSONObject, "fareType", qVar.f51613s);
                C20528a.m48237t(jSONObject, "payload", qVar.f51614t);
                mo52729r(jSONObject, "payloads", qVar.f51615u);
                mo52729r(jSONObject, "visval", qVar.f51616v);
                mo52729r(jSONObject, "paymentCardInfo", qVar.f51617w);
                C20528a.m48237t(jSONObject, "finalizationTimestamp", qVar.f51618x);
                C20528a.m48237t(jSONObject, "riderType", qVar.f51620z);
                C20528a.m48237t(jSONObject, "externalTicketReference", qVar.f51579A);
                mo52730s(jSONObject, "priceIfBoughtAlone", qVar.f51580B);
                C20528a.m48237t(jSONObject, "id", qVar.f51581C);
                C20528a.m48237t(jSONObject, "state", qVar.f51582D.getBrokerName());
                C20528a.m48237t(jSONObject, "groupSortIndex", qVar.f51583E);
                mo52729r(jSONObject, "requiresFeature", qVar.f51584F);
                C20528a.m48237t(jSONObject, "usagePeriodSpecification", qVar.f51585G);
                C20528a.m48237t(jSONObject, "ticketStrapline", qVar.f51587I);
                mo52729r(jSONObject, "transportModes", qVar.f51588J);
                mo52729r(jSONObject, "fareBlocks", qVar.f51588J);
                mo52729r(jSONObject, "transferTo", qVar.f51590L);
                mo52730s(jSONObject, "identityInformation", qVar.f51591M);
                C20528a.m48237t(jSONObject, "layoutPreset", qVar.f51594P);
                return jSONObject;
            default:
                C20345a0 a0Var = (C20345a0) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "validFromTimestamp", a0Var.f51514a);
                C20528a.m48237t(jSONObject2, "validToTimestamp", a0Var.f51515b);
                return jSONObject2;
        }
    }
}
