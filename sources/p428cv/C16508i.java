package p428cv;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.payment.MVCardDetails;
import com.tranzmate.moovit.protocol.payment.MVSetPaymentMethodTokenRequest;

/* renamed from: cv.i */
public final class C16508i extends C13778r<C16508i, C16509j, MVSetPaymentMethodTokenRequest> {
    public C16508i(C13752e eVar, String str, boolean z, String str2, String str3, String str4, String str5) {
        super(eVar, R.string.server_path_app_server_secured_url, R.string.api_path_update_payment_method_token, C16509j.class);
        str3 = str3 == null ? "0000" : str3;
        str4 = str4 == null ? "" : str4;
        str5 = str5 == null ? "" : str5;
        MVCardDetails mVCardDetails = new MVCardDetails();
        mVCardDetails.cardLastFourDigits = str3;
        mVCardDetails.cardMonthExpiration = str4;
        mVCardDetails.cardYearExpiration = str5;
        mVCardDetails.cvv = null;
        RO mVSetPaymentMethodTokenRequest = new MVSetPaymentMethodTokenRequest();
        mVSetPaymentMethodTokenRequest.paymentMethodToken = str;
        mVSetPaymentMethodTokenRequest.cardDetails = mVCardDetails;
        mVSetPaymentMethodTokenRequest.customerId = str2;
        mVSetPaymentMethodTokenRequest.makeDefaultPaymentMethod = z;
        mVSetPaymentMethodTokenRequest.mo29253k();
        this.f33922v = mVSetPaymentMethodTokenRequest;
    }
}
