package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationStepsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.p0 */
public final class C17344p0 extends C13780t<C17341o0, C17344p0, MVMissingPaymentRegistrationStepsResponse> {

    /* renamed from: m */
    public PaymentRegistrationInstructions f44729m;

    public C17344p0() {
        super(MVMissingPaymentRegistrationStepsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        C17341o0 o0Var = (C17341o0) aVar;
        MVMissingPaymentRegistrationStepsResponse mVMissingPaymentRegistrationStepsResponse = (MVMissingPaymentRegistrationStepsResponse) tBase;
        if (mVMissingPaymentRegistrationStepsResponse.mo30056f()) {
            paymentRegistrationInstructions = C17353s0.m43400n(mVMissingPaymentRegistrationStepsResponse.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        this.f44729m = paymentRegistrationInstructions;
    }
}
