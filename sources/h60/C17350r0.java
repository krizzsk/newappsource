package h60;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationVerificationResponse;
import i60.C17559a;
import java.io.IOException;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: h60.r0 */
public final class C17350r0 extends C17301b<C17347q0, C17350r0, MVPaymentRegistrationVerificationResponse> {

    /* renamed from: m */
    public boolean f44737m;

    /* renamed from: n */
    public C17559a f44738n;

    public C17350r0() {
        super(MVPaymentRegistrationVerificationResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        C17347q0 q0Var = (C17347q0) aVar;
        MVPaymentRegistrationVerificationResponse mVPaymentRegistrationVerificationResponse = (MVPaymentRegistrationVerificationResponse) tBase;
        this.f44737m = mVPaymentRegistrationVerificationResponse.isAccountExist;
        C19617r rVar = C17353s0.f44739a;
        String str = mVPaymentRegistrationVerificationResponse.accountId;
        boolean z = mVPaymentRegistrationVerificationResponse.isMigratedUser;
        if (mVPaymentRegistrationVerificationResponse.mo30401i()) {
            paymentRegistrationInstructions = C17353s0.m43400n(mVPaymentRegistrationVerificationResponse.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        this.f44738n = new C17559a(AccountAuthType.PHONE, str, z, paymentRegistrationInstructions);
    }
}
