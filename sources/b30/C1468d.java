package b30;

import a30.C0071c;
import a30.C0075g;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.appboy.models.outgoing.TwitterUser;
import com.appsflyer.AppsFlyerProperties;
import com.moovit.commons.request.ServerException;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.ticketingV2.MVBuyParams;
import com.tranzmate.moovit.protocol.ticketingV2.MVExternalPaymentV2Request;
import com.tranzmate.moovit.protocol.ticketingV2.MVMasabiBuyRequest;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;
import com.usebutton.sdk.internal.models.Widget;
import java.io.IOException;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import p705on.C18794b;
import p705on.C18795c;
import p705on.C18800h;
import p705on.C18810p;
import p752qn.C19148f;

/* renamed from: b30.d */
public final class C1468d extends C13778r<C1468d, C1469e, MVExternalPaymentV2Request> {

    /* renamed from: w */
    public final String f5338w;

    /* renamed from: x */
    public final C18794b f5339x;

    /* renamed from: y */
    public final C0071c f5340y;

    /* renamed from: z */
    public final CurrencyAmount f5341z;

    public C1468d(C13752e eVar, String str, C18794b bVar, C0071c cVar, CurrencyAmount currencyAmount) {
        super(eVar, C0075g.server_path_app_server_secured_url, C0075g.api_path_masabi_purchase, C1469e.class);
        C21100e.m49373x(bVar, "externalPaymentRequest");
        this.f5339x = bVar;
        C21100e.m49373x(str, "paymentContext");
        this.f5338w = str;
        this.f5340y = cVar;
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        this.f5341z = currencyAmount;
    }

    /* renamed from: O */
    public static JSONArray m3885O(C18795c cVar, C0071c cVar2) throws JSONException {
        long intValue = (long) cVar.f47846c.f48695b.intValue();
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("postCode", "{{  credit_card_zip  }}");
        JSONObject jSONObject2 = new JSONObject();
        jSONObject2.put("cardholderName", "{{  credit_card_first_name  }} {{  credit_card_last_name  }}");
        jSONObject2.put("cardNumber", "{{  credit_card_number  }}");
        jSONObject2.put("expiryDate", "{{#format_date}}%m%y,{{ credit_card_expiration_date }}{{/format_date}}");
        jSONObject2.put("securityCode", cVar2.f150a);
        jSONObject2.put("address", jSONObject);
        jSONObject2.put("shouldSave", false);
        JSONObject jSONObject3 = new JSONObject();
        jSONObject3.put("amount", intValue);
        jSONObject3.put(Widget.VIEW_TYPE_CARD, jSONObject2);
        JSONArray jSONArray = new JSONArray();
        jSONArray.put(jSONObject3);
        return jSONArray;
    }

    /* renamed from: P */
    public static JSONObject m3886P(C18795c cVar) throws JSONException {
        JSONObject jSONObject = new JSONObject();
        List<C18800h> list = cVar.f47847d.f47895c;
        JSONArray jSONArray = new JSONArray();
        for (C18800h next : list) {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("journeyId", next.f47869b);
            jSONObject2.put("quantity", next.f47870c);
            jSONObject2.put("productRef", next.f47868a);
            jSONArray.put(jSONObject2);
        }
        jSONObject.put("orderItems", jSONArray);
        Integer num = cVar.f47847d.f47896d;
        if (num != null) {
            jSONObject.put("originId", num);
        }
        Integer num2 = cVar.f47847d.f47894b;
        if (num2 != null) {
            jSONObject.put("destinationId", num2);
        }
        return jSONObject;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        MVPaymentProvider mVPaymentProvider;
        C18794b bVar = this.f5339x;
        C0071c cVar = this.f5340y;
        String str = bVar.f47842c;
        String str2 = bVar.f47841b;
        try {
            C18795c cVar2 = bVar.f47840a;
            C18810p pVar = cVar2.f47844a;
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("appId", pVar.f47916a);
            jSONObject.put("accountId", pVar.f47917b);
            C19148f fVar = cVar2.f47846c;
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("amount", fVar.f48695b);
            jSONObject2.put(AppsFlyerProperties.CURRENCY_CODE, fVar.f48694a);
            JSONObject P = m3886P(cVar2);
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.put("userIdentity", jSONObject);
            jSONObject3.put("requestReference", cVar2.f47845b);
            jSONObject3.put("amount", jSONObject2);
            jSONObject3.put(TwitterUser.DESCRIPTION_KEY, "");
            jSONObject3.put("products", P);
            if (cVar != null) {
                jSONObject3.put("payments", m3885O(cVar2, cVar));
            }
            String replace = jSONObject3.toString().replace("\\/", "/");
            MVMasabiBuyRequest mVMasabiBuyRequest = new MVMasabiBuyRequest();
            mVMasabiBuyRequest.paymentAuthorisationToken = str;
            mVMasabiBuyRequest.fullBrandId = str2;
            mVMasabiBuyRequest.body = replace;
            MVBuyParams mVBuyParams = new MVBuyParams();
            mVBuyParams.setField_ = MVBuyParams._Fields.MASABI;
            mVBuyParams.value_ = mVMasabiBuyRequest;
            MVCurrencyAmount p = C13749c.m34330p(this.f5341z);
            String str3 = this.f5338w;
            RO mVExternalPaymentV2Request = new MVExternalPaymentV2Request();
            mVExternalPaymentV2Request.paymentContext = str3;
            mVExternalPaymentV2Request.params = mVBuyParams;
            mVExternalPaymentV2Request.usedSecondaryPaymentMethod = false;
            mVExternalPaymentV2Request.mo32393k();
            mVExternalPaymentV2Request.price = p;
            C0071c cVar3 = this.f5340y;
            if (!(cVar3 == null || (mVPaymentProvider = cVar3.f151b) == null)) {
                mVExternalPaymentV2Request.paymentProvider = mVPaymentProvider;
            }
            this.f33922v = mVExternalPaymentV2Request;
            super.mo5818H();
        } catch (JSONException e) {
            throw new IOException("Could not parse JsonObject", e);
        }
    }
}
