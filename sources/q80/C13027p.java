package q80;

import c70.C13746a;
import c70.C13749c;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.paymentmethod.PurchaseVerificationType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResponse;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueResult;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationType;
import f90.C12639a;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: q80.p */
public final class C13027p extends C13780t<C13026o, C13027p, MVPurchaseStoreValueResponse> {

    /* renamed from: m */
    public C12639a f32232m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f32233n;

    /* renamed from: o */
    public PurchaseVerificationType f32234o;

    public C13027p() {
        super(MVPurchaseStoreValueResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        boolean z2;
        PurchaseVerificationType purchaseVerificationType;
        C13026o oVar = (C13026o) aVar;
        MVPurchaseStoreValueResponse mVPurchaseStoreValueResponse = (MVPurchaseStoreValueResponse) tBase;
        F f = mVPurchaseStoreValueResponse.setField_;
        F f2 = MVPurchaseStoreValueResponse._Fields.MISSING_STEPS;
        boolean z3 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        C12639a aVar2 = null;
        if (!z) {
            paymentRegistrationInstructions = null;
        } else if (f == f2) {
            paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVPurchaseStoreValueResponse.value_);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
            k.append(MVPurchaseStoreValueResponse.m28126k((MVPurchaseStoreValueResponse._Fields) mVPurchaseStoreValueResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f32233n = paymentRegistrationInstructions;
        F f3 = mVPurchaseStoreValueResponse.setField_;
        F f4 = MVPurchaseStoreValueResponse._Fields.VERIFICATION_TYPE;
        if (f3 == f4) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            purchaseVerificationType = null;
        } else if (f3 == f4) {
            purchaseVerificationType = C13036y.m32957i((MVPurchaseVerifacationType) mVPurchaseStoreValueResponse.value_);
        } else {
            StringBuilder k2 = C13555b.m33972k("Cannot get field 'verificationType' because union is currently set to ");
            k2.append(MVPurchaseStoreValueResponse.m28126k((MVPurchaseStoreValueResponse._Fields) mVPurchaseStoreValueResponse.setField_).f63355a);
            throw new RuntimeException(k2.toString());
        }
        this.f32234o = purchaseVerificationType;
        F f5 = mVPurchaseStoreValueResponse.setField_;
        F f6 = MVPurchaseStoreValueResponse._Fields.STORED_VALUE;
        if (f5 != f6) {
            z3 = false;
        }
        if (z3) {
            if (f5 == f6) {
                MVPurchaseStoreValueResult mVPurchaseStoreValueResult = (MVPurchaseStoreValueResult) mVPurchaseStoreValueResponse.value_;
                C19617r rVar = C13036y.f32248a;
                aVar2 = new C12639a(new ServerId(mVPurchaseStoreValueResult.providerId), mVPurchaseStoreValueResult.agencyKey, C13749c.m34318d(mVPurchaseStoreValueResult.amount), mVPurchaseStoreValueResult.isStoredValueToppedUp);
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'storedValue' because union is currently set to ");
                k3.append(MVPurchaseStoreValueResponse.m28126k((MVPurchaseStoreValueResponse._Fields) mVPurchaseStoreValueResponse.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        }
        this.f32232m = aVar2;
    }
}
