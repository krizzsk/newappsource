package p732pq;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.driverconnection.MVNotifyDriverResponse;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: pq.q */
public final class C18957q extends C13780t<C18956p, C18957q, MVNotifyDriverResponse> {

    /* renamed from: m */
    public PaymentRegistrationInstructions f48269m = null;

    public C18957q() {
        super(MVNotifyDriverResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        C18956p pVar = (C18956p) aVar;
        MVNotifyDriverResponse mVNotifyDriverResponse = (MVNotifyDriverResponse) tBase;
        if (mVNotifyDriverResponse.mo27156f()) {
            paymentRegistrationInstructions = C17353s0.m43400n(mVNotifyDriverResponse.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        this.f48269m = paymentRegistrationInstructions;
    }
}
