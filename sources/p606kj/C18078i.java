package p606kj;

import com.appsflyer.ServerParameters;
import com.google.ads.mediation.unity.UnityMediationAdapter;
import java.math.BigDecimal;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p634ln.C18247a;
import p752qn.C19147e;
import p891wk.C20360o;
import p891wk.C20371z;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: kj.i */
public final class C18078i extends C20528a {

    /* renamed from: c */
    public final /* synthetic */ int f46239c;

    /* JADX INFO: super call moved to the top of the method (can break code semantics) */
    public C18078i(C20531d dVar, int i) {
        super(dVar, C19147e.class);
        this.f46239c = i;
        if (i == 1) {
            super(dVar, C18247a.class);
        } else if (i != 2) {
        } else {
            super(dVar, C20371z.class);
        }
    }

    /* renamed from: u */
    public static HashMap m44746u(String str, JSONObject jSONObject) throws JSONException {
        if (!jSONObject.has(str)) {
            return null;
        }
        JSONObject jSONObject2 = jSONObject.getJSONObject(str);
        HashMap hashMap = new HashMap();
        Iterator<String> keys = jSONObject2.keys();
        while (keys.hasNext()) {
            String next = keys.next();
            hashMap.put(next, jSONObject2.get(next));
        }
        return hashMap;
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) {
        JSONObject jSONObject2 = jSONObject;
        switch (this.f46239c) {
            case 0:
                return new C19147e(C20528a.m48234o("maskedPan", jSONObject2), C20528a.m48234o("paymentCardType", jSONObject2));
            case 1:
                Integer k = C20528a.m48232k("stationId", jSONObject2);
                String o = C20528a.m48234o("name", jSONObject2);
                String o2 = C20528a.m48234o("shortName", jSONObject2);
                String o3 = C20528a.m48234o("longName", jSONObject2);
                String o4 = C20528a.m48234o(UnityMediationAdapter.KEY_PLACEMENT_ID, jSONObject2);
                String o5 = C20528a.m48234o("subBrand", jSONObject2);
                BigDecimal g = C20528a.m48228g(ServerParameters.LAT_KEY, jSONObject2);
                BigDecimal g2 = C20528a.m48228g(ServerParameters.LON_KEY, jSONObject2);
                Boolean bool = Boolean.TRUE;
                return new C18247a(k, o, o2, o3, o4, o5, g, g2, bool.equals(C20528a.m48229h("hidden", jSONObject2)), bool.equals(C20528a.m48229h("important", jSONObject2)));
            default:
                return new C20371z(m44746u("ticketHeights", jSONObject2), C20528a.m48234o("visualValidationDateTimeFormat", jSONObject2), C20528a.m48234o("visualValidationDateTimeFormatLine1", jSONObject2), C20528a.m48234o("visualValidationDateTimeFormatLine2", jSONObject2), C20528a.m48234o("productNameBackgroundColour", jSONObject2), C20528a.m48234o("recentActivationIndicatorBackgroundColour", jSONObject2), C20528a.m48233n("recentActivationIndicatorDurationInSeconds", jSONObject2), (C20360o) mo52728m(jSONObject2, "selectedForValidationConfig", C20360o.class), m44746u("secondaryBarcodeNames", jSONObject2), C20528a.m48234o("defaultLayoutPreset", jSONObject2), C20528a.m48234o("activateTicketButtonBackgroundColour", jSONObject2), C20528a.m48231j("activateTicketButtonCornerRadius", jSONObject2), C20528a.m48234o("fullScreenBackgroundColour", jSONObject2), C20528a.m48234o("navigationButtonsTintColour", jSONObject2), C20528a.m48234o("dismissButtonTintColour", jSONObject2), C20528a.m48229h("hideTicketPrice", jSONObject2));
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) {
        switch (this.f46239c) {
            case 0:
                C19147e eVar = (C19147e) obj;
                JSONObject jSONObject = new JSONObject();
                C20528a.m48237t(jSONObject, "maskedPan", eVar.f48692a);
                C20528a.m48237t(jSONObject, "paymentCardType", eVar.f48693b);
                return jSONObject;
            case 1:
                C18247a aVar = (C18247a) obj;
                JSONObject jSONObject2 = new JSONObject();
                C20528a.m48237t(jSONObject2, "stationId", aVar.f46552a);
                C20528a.m48237t(jSONObject2, "name", aVar.f46553b);
                C20528a.m48237t(jSONObject2, "shortName", aVar.f46554c);
                C20528a.m48237t(jSONObject2, "longName", aVar.f46555d);
                C20528a.m48237t(jSONObject2, UnityMediationAdapter.KEY_PLACEMENT_ID, aVar.f46556e);
                C20528a.m48237t(jSONObject2, "subBrand", aVar.f46557f);
                C20528a.m48237t(jSONObject2, ServerParameters.LAT_KEY, aVar.f46558g);
                C20528a.m48237t(jSONObject2, ServerParameters.LON_KEY, aVar.f46559h);
                C20528a.m48237t(jSONObject2, "hidden", Boolean.valueOf(aVar.f46560i));
                C20528a.m48237t(jSONObject2, "important", Boolean.valueOf(aVar.f46561j));
                return jSONObject2;
            default:
                C20371z zVar = (C20371z) obj;
                JSONObject jSONObject3 = new JSONObject();
                Map<String, Integer> map = zVar.f51654a;
                if (map == null) {
                    jSONObject3.put("ticketHeights", (Object) null);
                } else {
                    jSONObject3.put("ticketHeights", new JSONObject(map));
                }
                C20528a.m48237t(jSONObject3, "visualValidationDateTimeFormat", zVar.f51655b);
                C20528a.m48237t(jSONObject3, "visualValidationDateTimeFormatLine1", zVar.f51656c);
                C20528a.m48237t(jSONObject3, "visualValidationDateTimeFormatLine2", zVar.f51657d);
                C20528a.m48237t(jSONObject3, "productNameBackgroundColour", zVar.f51658e);
                C20528a.m48237t(jSONObject3, "recentActivationIndicatorBackgroundColour", zVar.f51659f);
                C20528a.m48237t(jSONObject3, "recentActivationIndicatorDurationInSeconds", zVar.f51660g);
                mo52730s(jSONObject3, "selectedForValidationConfig", zVar.f51661h);
                Map<String, String> map2 = zVar.f51662i;
                if (map2 == null) {
                    jSONObject3.put("secondaryBarcodeNames", (Object) null);
                } else {
                    jSONObject3.put("secondaryBarcodeNames", new JSONObject(map2));
                }
                C20528a.m48237t(jSONObject3, "defaultLayoutPreset", zVar.f51663j);
                C20528a.m48237t(jSONObject3, "activateTicketButtonBackgroundColour", zVar.f51664k);
                C20528a.m48237t(jSONObject3, "activateTicketButtonCornerRadius", zVar.f51665l);
                C20528a.m48237t(jSONObject3, "fullScreenBackgroundColour", zVar.f51666m);
                C20528a.m48237t(jSONObject3, "navigationButtonsTintColour", zVar.f51667n);
                C20528a.m48237t(jSONObject3, "dismissButtonTintColour", zVar.f51668o);
                C20528a.m48237t(jSONObject3, "hideTicketPrice", zVar.f51669p);
                return jSONObject3;
        }
    }
}
