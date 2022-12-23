package h60;

import c70.C13746a;
import c70.C13780t;
import ce0.C21100e;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVGenerateExternalAuthenticationinfoResponse;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.f0 */
public final class C17314f0 extends C13780t<C17311e0, C17314f0, MVGenerateExternalAuthenticationinfoResponse> {

    /* renamed from: m */
    public String f44697m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f44698n;

    public C17314f0() {
        super(MVGenerateExternalAuthenticationinfoResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        String str;
        boolean z2;
        boolean z3;
        C17311e0 e0Var = (C17311e0) aVar;
        MVGenerateExternalAuthenticationinfoResponse mVGenerateExternalAuthenticationinfoResponse = (MVGenerateExternalAuthenticationinfoResponse) tBase;
        F f = mVGenerateExternalAuthenticationinfoResponse.setField_;
        F f2 = MVGenerateExternalAuthenticationinfoResponse._Fields.JWT;
        boolean z4 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        PaymentRegistrationInstructions paymentRegistrationInstructions = null;
        if (!z) {
            str = null;
        } else if (f == f2) {
            str = (String) mVGenerateExternalAuthenticationinfoResponse.value_;
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'jwt' because union is currently set to ");
            k.append(MVGenerateExternalAuthenticationinfoResponse.m24303k((MVGenerateExternalAuthenticationinfoResponse._Fields) mVGenerateExternalAuthenticationinfoResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f44697m = str;
        F f3 = MVGenerateExternalAuthenticationinfoResponse._Fields.MISSING_STEPS;
        if (f == f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (f == f3) {
                paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVGenerateExternalAuthenticationinfoResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
                k2.append(MVGenerateExternalAuthenticationinfoResponse.m24303k((MVGenerateExternalAuthenticationinfoResponse._Fields) mVGenerateExternalAuthenticationinfoResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        this.f44698n = paymentRegistrationInstructions;
        if (this.f44697m == null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (paymentRegistrationInstructions != null) {
            z4 = false;
        }
        if (z3 == z4) {
            throw new BadResponseException("Only one of token/missingSteps must be set!");
        }
    }

    public C17314f0(String str) {
        super(MVGenerateExternalAuthenticationinfoResponse.class);
        C21100e.m49373x(str, FirebaseMessagingService.EXTRA_TOKEN);
        this.f44697m = str;
    }
}
