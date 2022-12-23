package h60;

import c70.C13752e;
import c70.C13778r;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsRequest;
import v40.C25754i;

/* renamed from: h60.o0 */
public final class C17341o0 extends C13778r<C17341o0, C17344p0, MVMissingPaymentRegistrationStepsRequest> {

    /* renamed from: w */
    public final String f44726w;

    public C17341o0(C13752e eVar, String str) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_missing_steps, C17344p0.class);
        this.f44726w = str;
        RO mVMissingPaymentRegistrationStepsRequest = new MVMissingPaymentRegistrationStepsRequest();
        mVMissingPaymentRegistrationStepsRequest.paymentContext = str;
        this.f33922v = mVMissingPaymentRegistrationStepsRequest;
    }
}
