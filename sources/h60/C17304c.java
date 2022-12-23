package h60;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.clearance.ClearanceProviderType;
import com.tranzmate.moovit.protocol.payments.MVAddCreditCardWebUrlRequest;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderType;
import v40.C25754i;

/* renamed from: h60.c */
public final class C17304c extends C13778r<C17304c, C17307d, MVAddCreditCardWebUrlRequest> {
    public C17304c(C13752e eVar, ClearanceProviderType clearanceProviderType, String str, String str2, String str3) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_get_add_credit_card_web_url, C17307d.class);
        C21100e.m49373x(str, "serverKey");
        C21100e.m49373x(str2, "successUrl");
        C21100e.m49373x(str3, "successUrl");
        C21100e.m49373x(clearanceProviderType, "type");
        MVClearanceProviderType q = C17353s0.m43403q(clearanceProviderType);
        RO mVAddCreditCardWebUrlRequest = new MVAddCreditCardWebUrlRequest();
        mVAddCreditCardWebUrlRequest.clearanceProvider = q;
        mVAddCreditCardWebUrlRequest.merchantIdentifier = str;
        mVAddCreditCardWebUrlRequest.completeUrl = str2;
        mVAddCreditCardWebUrlRequest.errorUrl = str3;
        this.f33922v = mVAddCreditCardWebUrlRequest;
    }
}
