package p585jm;

import com.appsflyer.AppsFlyerProperties;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.models.Configuration;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Currency;
import java.util.List;
import mf0.C24362h;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p705on.C18796d;
import p705on.C18797e;
import p705on.C18803j;
import p752qn.C19148f;
import p843uk.C19937j;
import p843uk.C19939k;
import p843uk.C19952v;

/* renamed from: jm.d */
public final class C17890d {

    /* renamed from: a */
    public final C17894h f45908a;

    public C17890d(C17894h hVar) {
        this.f45908a = hVar;
    }

    /* renamed from: a */
    public final C18796d mo50440a(C19937j jVar) throws JSONException {
        Long l;
        C18797e eVar;
        C19937j jVar2 = jVar;
        C17894h hVar = this.f45908a;
        C19952v vVar = jVar2.f50634d;
        C24362h.m61210e(vVar, "finalisedOrderInternal.paymentOptions");
        C19148f fVar = jVar2.f50633c;
        C24362h.m61210e(fVar, "finalisedOrderInternal.paymentDue");
        Integer num = fVar.f48695b;
        C19148f fVar2 = jVar2.f50633c;
        C24362h.m61210e(fVar2, "finalisedOrderInternal.paymentDue");
        String str = fVar2.f48694a;
        C24362h.m61210e(str, "finalisedOrderInternal.paymentDue.currencyCode");
        hVar.getClass();
        C17891e eVar2 = hVar.f45913a;
        C19939k kVar = vVar.f50715k;
        if (num != null) {
            l = Long.valueOf((long) num.intValue());
        } else {
            l = null;
        }
        if (kVar == null) {
            eVar2.getClass();
        } else {
            String str2 = eVar2.f45909a;
            if (str2 != null) {
                C17892f fVar3 = eVar2.f45911c;
                List<String> list = kVar.f50645c;
                C24362h.m61210e(list, "googlePayPaymentOptionInternal.networks");
                List<String> list2 = kVar.f50646d;
                C24362h.m61210e(list2, "googlePayPaymentOptionInternal.methods");
                fVar3.getClass();
                JSONObject a = C17892f.m44505a(list, list2);
                JSONObject put = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                C24362h.m61210e(put, "JSONObject()\n           …put(\"apiVersionMinor\", 0)");
                String jSONObject = put.put("allowedPaymentMethods", new JSONArray().put(a)).toString();
                C24362h.m61210e(jSONObject, "getBaseRequest()\n       …              .toString()");
                C17892f fVar4 = eVar2.f45911c;
                String str3 = eVar2.f45910b;
                fVar4.getClass();
                C24362h.m61211f(str3, "brandName");
                JSONObject put2 = new JSONObject().put("type", "PAYMENT_GATEWAY").put(Configuration.KEY_PARAMETERS, new JSONObject().put("gateway", kVar.f50643a).put("gatewayMerchantId", kVar.f50644b));
                List<String> list3 = kVar.f50645c;
                C24362h.m61210e(list3, "googlePayPaymentOption.networks");
                List<String> list4 = kVar.f50646d;
                C24362h.m61210e(list4, "googlePayPaymentOption.methods");
                JSONObject put3 = C17892f.m44505a(list3, list4).put("tokenizationSpecification", put2);
                C24362h.m61210e(put3, "baseCardPaymentMethods\n …okenizationSpecification)");
                JSONObject put4 = new JSONObject().put("totalPriceStatus", "FINAL").put("countryCode", str2).put(AppsFlyerProperties.CURRENCY_CODE, str);
                if (l != null) {
                    long longValue = l.longValue();
                    Currency instance = Currency.getInstance(str);
                    C24362h.m61210e(instance, InAppPurchaseMetaData.KEY_CURRENCY);
                    String bigDecimal = new BigDecimal(BigInteger.valueOf(longValue), instance.getDefaultFractionDigits()).toString();
                    C24362h.m61210e(bigDecimal, "BigDecimal(amountUnscale…ractionDigits).toString()");
                    put4.put("totalPrice", bigDecimal);
                }
                JSONObject put5 = new JSONObject().put("merchantName", str3);
                JSONObject put6 = new JSONObject().put("apiVersion", 2).put("apiVersionMinor", 0);
                C24362h.m61210e(put6, "JSONObject()\n           …put(\"apiVersionMinor\", 0)");
                String jSONObject2 = put6.put("allowedPaymentMethods", new JSONArray().put(put3)).put("transactionInfo", put4).put("merchantInfo", put5).put("emailRequired", true).toString();
                C24362h.m61210e(jSONObject2, "getBaseRequest()\n       …              .toString()");
                eVar = new C18797e(jSONObject, jSONObject2);
                C19937j jVar3 = jVar;
                return new C18796d(jVar3.f50631a, jVar3.f50632b, jVar3.f50633c, new C18803j(vVar.f50708d, vVar.f50705a, vVar.f50706b, vVar.f50707c, vVar.f50709e, vVar.f50710f, vVar.f50711g, vVar.f50712h, vVar.f50713i, eVar), jVar3.f50635e, jVar3.f50636f, jVar3.f50637g, jVar3.f50638h);
            }
        }
        eVar = null;
        C19937j jVar32 = jVar;
        return new C18796d(jVar32.f50631a, jVar32.f50632b, jVar32.f50633c, new C18803j(vVar.f50708d, vVar.f50705a, vVar.f50706b, vVar.f50707c, vVar.f50709e, vVar.f50710f, vVar.f50711g, vVar.f50712h, vVar.f50713i, eVar), jVar32.f50635e, jVar32.f50636f, jVar32.f50637g, jVar32.f50638h);
    }
}
