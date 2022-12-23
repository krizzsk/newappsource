package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginRequest;
import java.util.ArrayList;
import p875vs.C20228e;
import v40.C25754i;

/* renamed from: h60.k0 */
public final class C17329k0 extends C13778r<C17329k0, C17332l0, MVPaymentRegistrationExternalAccountLoginRequest> {
    public C17329k0(C13752e eVar, String str, String str2, ArrayList arrayList) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_external_account_connect, C17332l0.class);
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C20228e(20));
        RO mVPaymentRegistrationExternalAccountLoginRequest = new MVPaymentRegistrationExternalAccountLoginRequest();
        mVPaymentRegistrationExternalAccountLoginRequest.paymentContext = str;
        mVPaymentRegistrationExternalAccountLoginRequest.f27535id = str2;
        mVPaymentRegistrationExternalAccountLoginRequest.inputFieldsValues = c;
        this.f33922v = mVPaymentRegistrationExternalAccountLoginRequest;
    }
}
