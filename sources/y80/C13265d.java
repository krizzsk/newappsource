package y80;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import q80.C13036y;

/* renamed from: y80.d */
public final class C13265d extends C13780t<C13264c, C13265d, MVPurchaseCartResponse> {

    /* renamed from: m */
    public boolean f32915m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f32916n;

    /* renamed from: o */
    public PurchaseVerificationType f32917o;

    public C13265d() {
        super(MVPurchaseCartResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        boolean z2;
        C13264c cVar = (C13264c) aVar;
        MVPurchaseCartResponse mVPurchaseCartResponse = (MVPurchaseCartResponse) tBase;
        F f = mVPurchaseCartResponse.setField_;
        F f2 = MVPurchaseCartResponse._Fields.MISSING_STEPS;
        boolean z3 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        PurchaseVerificationType purchaseVerificationType = null;
        if (!z) {
            paymentRegistrationInstructions = null;
        } else if (f == f2) {
            paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVPurchaseCartResponse.value_);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
            k.append(MVPurchaseCartResponse.m27810k((MVPurchaseCartResponse._Fields) mVPurchaseCartResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f32916n = paymentRegistrationInstructions;
        F f3 = mVPurchaseCartResponse.setField_;
        F f4 = MVPurchaseCartResponse._Fields.VERIFICATION_TYPE;
        if (f3 == f4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (z2) {
            if (f3 == f4) {
                purchaseVerificationType = C13036y.m32957i((MVPurchaseVerifacationType) mVPurchaseCartResponse.value_);
            } else {
                StringBuilder k2 = C13555b.m33972k("Cannot get field 'verificationType' because union is currently set to ");
                k2.append(MVPurchaseCartResponse.m27810k((MVPurchaseCartResponse._Fields) mVPurchaseCartResponse.setField_).f63355a);
                throw new RuntimeException(k2.toString());
            }
        }
        this.f32917o = purchaseVerificationType;
        if (!(cVar.mo52624A() && this.f32916n == null && this.f32917o == null)) {
            z3 = false;
        }
        this.f32915m = z3;
    }
}
