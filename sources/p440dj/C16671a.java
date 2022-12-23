package p440dj;

import com.appsflyer.ServerParameters;
import com.masabi.justride.sdk.exception.config.SdkConfigurationException;
import org.json.JSONException;
import org.json.JSONObject;
import p726pk.C18928a;
import p913xi.C20528a;
import p913xi.C20531d;

/* renamed from: dj.a */
public final class C16671a extends C20528a<C18928a> {
    public C16671a(C20531d dVar) {
        super(dVar, C18928a.class);
    }

    /* renamed from: d */
    public final Object mo40384d(JSONObject jSONObject) throws JSONException {
        Class<String> cls = String.class;
        try {
            String o = C20528a.m48234o("reportingChannel", jSONObject);
            if (o == null) {
                o = C20528a.m48234o("partner", jSONObject);
            }
            C18928a.C18929a aVar = new C18928a.C18929a();
            aVar.f48192a = C20528a.m48234o(ServerParameters.BRAND, jSONObject);
            aVar.f48193b = C20528a.m48234o("environment", jSONObject);
            aVar.f48194c = C20528a.m48234o(LinksConfiguration.KEY_HOSTNAME, jSONObject);
            aVar.f48195d = mo52727l(jSONObject, "certificatePins", cls);
            aVar.f48196e = C20528a.m48234o("expiryDate", jSONObject);
            aVar.f48197f = C20528a.m48234o("minimumVersion", jSONObject);
            aVar.f48198g = mo52727l(jSONObject, "purchaseModes", cls);
            aVar.f48199h = mo52727l(jSONObject, "apiEntitlements", cls);
            aVar.f48200i = C20528a.m48234o("networkKey", jSONObject);
            aVar.f48201j = C20528a.m48234o("timeZone", jSONObject);
            aVar.f48202k = o;
            aVar.f48203l = C20528a.m48234o("trafficSource", jSONObject);
            aVar.f48204m = C20528a.m48234o("payzoneIIN", jSONObject);
            Boolean h = C20528a.m48229h("abtEnabled", jSONObject);
            Boolean bool = Boolean.TRUE;
            aVar.f48205n = bool.equals(h);
            aVar.f48206o = C20528a.m48234o("brandName", jSONObject);
            aVar.f48207p = C20528a.m48234o("applePayMerchantIdentifier", jSONObject);
            aVar.f48208q = C20528a.m48234o("countryCode", jSONObject);
            aVar.f48209r = bool.equals(C20528a.m48229h("geolocationEnabled", jSONObject));
            return aVar.mo51445a();
        } catch (SdkConfigurationException e) {
            StringBuilder k = C13555b.m33972k("Failed parsing SdkConfiguration: ");
            k.append(e.getMessage());
            throw new JSONException(k.toString());
        }
    }

    /* renamed from: f */
    public final JSONObject mo40385f(Object obj) throws JSONException {
        C18928a aVar = (C18928a) obj;
        JSONObject jSONObject = new JSONObject();
        C20528a.m48237t(jSONObject, ServerParameters.BRAND, aVar.f48174a);
        C20528a.m48237t(jSONObject, "environment", aVar.f48175b);
        C20528a.m48237t(jSONObject, "expiryDate", aVar.f48178e);
        C20528a.m48237t(jSONObject, LinksConfiguration.KEY_HOSTNAME, aVar.f48176c);
        C20528a.m48237t(jSONObject, "minimumVersion", aVar.f48179f);
        mo52729r(jSONObject, "certificatePins", aVar.f48177d);
        mo52729r(jSONObject, "purchaseModes", aVar.f48180g);
        C20528a.m48237t(jSONObject, "networkKey", aVar.f48182i);
        C20528a.m48237t(jSONObject, "timeZone", aVar.f48183j);
        C20528a.m48237t(jSONObject, "reportingChannel", aVar.f48184k);
        C20528a.m48237t(jSONObject, "trafficSource", aVar.f48185l);
        C20528a.m48237t(jSONObject, "payzoneIIN", aVar.f48186m);
        C20528a.m48237t(jSONObject, "abtEnabled", Boolean.valueOf(aVar.f48187n));
        C20528a.m48237t(jSONObject, "brandName", aVar.f48188o);
        C20528a.m48237t(jSONObject, "applePayMerchantIdentifier", aVar.f48189p);
        C20528a.m48237t(jSONObject, "countryCode", aVar.f48190q);
        C20528a.m48237t(jSONObject, "geolocationEnabled", Boolean.valueOf(aVar.f48191r));
        return jSONObject;
    }
}
