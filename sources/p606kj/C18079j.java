package p606kj;

import com.appsflyer.AppsFlyerProperties;
import org.json.JSONObject;
import p752qn.C19148f;
import p752qn.C19151i;
import p795sk.C19468a;
import p891wk.C20363r;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.j */
public final class C18079j extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46240c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18079j(C20531d dVar, int i) {
        super(dVar, C19148f.class);
        this.f46240c = i;
        if (i == 1) {
            super(dVar, C20363r.class);
        } else if (i != 2) {
        } else {
            super(dVar, C19151i.class);
        }
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        switch (this.f46240c) {
            case 0:
                return new C19148f(C20528a.m48234o(AppsFlyerProperties.CURRENCY_CODE, jSONObject), C20528a.m48232k("amount", jSONObject));
            case 1:
                return new C20363r(C20528a.m48233n("activationStart", jSONObject).longValue(), (C19468a) mo52728m(jSONObject, "geolocation", C19468a.class));
            default:
                return new C19151i(C20528a.m48229h("isUsagePeriodTicket", jSONObject).booleanValue(), C20528a.m48229h("isInUsagePeriod", jSONObject).booleanValue(), C20528a.m48233n("effectiveDurationMillis", jSONObject).longValue(), C20528a.m48230i("expiryTimeMillis", jSONObject), C20528a.m48229h("isDurationWarningNeeded", jSONObject).booleanValue(), C20528a.m48229h("isUseItOrLoseItWarningNeeded", jSONObject).booleanValue());
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46240c) {
            case 0:
                C19148f fVar = (C19148f) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "amount", fVar.f48695b);
                C20528a.m48237t(jSONObject, AppsFlyerProperties.CURRENCY_CODE, fVar.f48694a);
                return jSONObject;
            case 1:
                C20363r rVar = (C20363r) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "activationStart", Long.valueOf(rVar.f51621a));
                mo52730s(jSONObject2, "geolocation", rVar.f51622b);
                return jSONObject2;
            default:
                C19151i iVar = (C19151i) obj;
                JSONObject jSONObject3 = new JSONObject();
                C20528a.m48237t(jSONObject3, "isUsagePeriodTicket", Boolean.valueOf(iVar.f48734a));
                C20528a.m48237t(jSONObject3, "isInUsagePeriod", Boolean.valueOf(iVar.f48735b));
                C20528a.m48237t(jSONObject3, "effectiveDurationMillis", Long.valueOf(iVar.f48736c));
                C20528a.m48236q(jSONObject3, "expiryTimeMillis", iVar.f48737d);
                C20528a.m48237t(jSONObject3, "isDurationWarningNeeded", Boolean.valueOf(iVar.f48738e));
                C20528a.m48237t(jSONObject3, "isUseItOrLoseItWarningNeeded", Boolean.valueOf(iVar.f48739f));
                return jSONObject3;
        }
    }
}
