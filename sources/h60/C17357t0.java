package h60;

import c00.C13720d;
import c00.C13722f;
import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationInputRequest;
import java.util.ArrayList;
import p638lr.C18267n;
import v40.C25754i;

/* renamed from: h60.t0 */
public final class C17357t0 extends C13778r<C17357t0, C17360u0, MVPaymentRegistrationInputRequest> {
    public C17357t0(C13752e eVar, String str, String str2, ArrayList arrayList) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_input_step_completed, C17360u0.class);
        ArrayList c = C13720d.m34273c(arrayList, (C13722f) null, new C18267n(21));
        RO mVPaymentRegistrationInputRequest = new MVPaymentRegistrationInputRequest();
        mVPaymentRegistrationInputRequest.paymentContext = str;
        mVPaymentRegistrationInputRequest.f27550id = str2;
        mVPaymentRegistrationInputRequest.inputFieldsValues = c;
        this.f33922v = mVPaymentRegistrationInputRequest;
    }
}
