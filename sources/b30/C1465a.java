package b30;

import a30.C0075g;
import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.ticketingV2.MVAddExternalPaymentRequest;
import com.unity3d.ads.metadata.InAppPurchaseMetaData;

/* renamed from: b30.a */
public final class C1465a extends C13778r<C1465a, C1466b, MVAddExternalPaymentRequest> {
    public C1465a(C13752e eVar, String str, CurrencyAmount currencyAmount) {
        super(eVar, C0075g.server_path_app_server_secured_url, C0075g.api_path_add_masabi_purchase, C1466b.class);
        C21100e.m49373x(str, "paymentContext");
        C21100e.m49373x(currencyAmount, InAppPurchaseMetaData.KEY_PRICE);
        MVCurrencyAmount p = C13749c.m34330p(currencyAmount);
        RO mVAddExternalPaymentRequest = new MVAddExternalPaymentRequest();
        mVAddExternalPaymentRequest.paymentContext = str;
        mVAddExternalPaymentRequest.price = p;
        this.f33922v = mVAddExternalPaymentRequest;
    }
}
