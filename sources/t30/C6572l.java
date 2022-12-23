package t30;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.network.model.ServerId;
import com.moovit.payment.account.deposit.DepositInstructions;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResponse;
import com.tranzmate.moovit.protocol.micromobility.MVMicroMobilityPurchaseConfirmationResult;
import com.tranzmate.moovit.protocol.payments.MVDepositInstructions;
import com.tranzmate.moovit.protocol.payments.MVMissingPaymentRegistrationSteps;
import h60.C17353s0;
import java.io.IOException;
import java.net.HttpURLConnection;
import org.apache.thrift.TBase;

/* renamed from: t30.l */
public final class C6572l extends C13780t<C6571k, C6572l, MVMicroMobilityPurchaseConfirmationResponse> {

    /* renamed from: m */
    public ServerId f20387m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f20388n;

    /* renamed from: o */
    public DepositInstructions f20389o;

    /* renamed from: p */
    public boolean f20390p;

    public C6572l() {
        super(MVMicroMobilityPurchaseConfirmationResponse.class);
    }

    /* renamed from: l */
    public final void mo22675l(C13746a aVar, HttpURLConnection httpURLConnection, TBase tBase) throws IOException, BadResponseException, ServerException {
        boolean z;
        ServerId serverId;
        boolean z2;
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        boolean z3;
        C6571k kVar = (C6571k) aVar;
        MVMicroMobilityPurchaseConfirmationResponse mVMicroMobilityPurchaseConfirmationResponse = (MVMicroMobilityPurchaseConfirmationResponse) tBase;
        F f = mVMicroMobilityPurchaseConfirmationResponse.setField_;
        F f2 = MVMicroMobilityPurchaseConfirmationResponse._Fields.RESULT;
        boolean z4 = true;
        if (f == f2) {
            z = true;
        } else {
            z = false;
        }
        DepositInstructions depositInstructions = null;
        if (!z) {
            serverId = null;
        } else if (f == f2) {
            serverId = new ServerId(((MVMicroMobilityPurchaseConfirmationResult) mVMicroMobilityPurchaseConfirmationResponse.value_).rideId);
        } else {
            StringBuilder k = C13555b.m33972k("Cannot get field 'result' because union is currently set to ");
            k.append(MVMicroMobilityPurchaseConfirmationResponse.m22837k((MVMicroMobilityPurchaseConfirmationResponse._Fields) mVMicroMobilityPurchaseConfirmationResponse.setField_).f63355a);
            throw new RuntimeException(k.toString());
        }
        this.f20387m = serverId;
        F f3 = MVMicroMobilityPurchaseConfirmationResponse._Fields.MISSING_STEPS;
        if (f == f3) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            paymentRegistrationInstructions = null;
        } else if (f == f3) {
            paymentRegistrationInstructions = C17353s0.m43400n((MVMissingPaymentRegistrationSteps) mVMicroMobilityPurchaseConfirmationResponse.value_);
        } else {
            StringBuilder k2 = C13555b.m33972k("Cannot get field 'missingSteps' because union is currently set to ");
            k2.append(MVMicroMobilityPurchaseConfirmationResponse.m22837k((MVMicroMobilityPurchaseConfirmationResponse._Fields) mVMicroMobilityPurchaseConfirmationResponse.setField_).f63355a);
            throw new RuntimeException(k2.toString());
        }
        this.f20388n = paymentRegistrationInstructions;
        F f4 = mVMicroMobilityPurchaseConfirmationResponse.setField_;
        F f5 = MVMicroMobilityPurchaseConfirmationResponse._Fields.DEPOSIT_INSTRUCTIONS;
        if (f4 == f5) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            if (f4 == f5) {
                depositInstructions = C17353s0.m43391e((MVDepositInstructions) mVMicroMobilityPurchaseConfirmationResponse.value_);
            } else {
                StringBuilder k3 = C13555b.m33972k("Cannot get field 'depositInstructions' because union is currently set to ");
                k3.append(MVMicroMobilityPurchaseConfirmationResponse.m22837k((MVMicroMobilityPurchaseConfirmationResponse._Fields) mVMicroMobilityPurchaseConfirmationResponse.setField_).f63355a);
                throw new RuntimeException(k3.toString());
            }
        }
        this.f20389o = depositInstructions;
        if (this.f20387m == null && this.f20388n == null && depositInstructions == null) {
            throw new BadResponseException("ride id, missing steps or deposit instructions must be initialized!");
        }
        if (!(kVar.mo52624A() && this.f20388n == null && this.f20389o == null)) {
            z4 = false;
        }
        this.f20390p = z4;
    }
}
