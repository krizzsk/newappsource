package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVPTBGetBitConsentStatusResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.p */
public final class C17343p extends C13780t<C17334m, C17343p, MVPTBGetBitConsentStatusResponse> {

    /* renamed from: m */
    public boolean f44727m;

    /* renamed from: n */
    public PaymentRegistrationInstructions f44728n;

    public C17343p() {
        super(MVPTBGetBitConsentStatusResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        C17334m mVar = (C17334m) aVar;
        MVPTBGetBitConsentStatusResponse mVPTBGetBitConsentStatusResponse = (MVPTBGetBitConsentStatusResponse) tBase;
        this.f44727m = mVPTBGetBitConsentStatusResponse.isConnected;
        if (mVPTBGetBitConsentStatusResponse.mo30073g()) {
            paymentRegistrationInstructions = C17353s0.m43400n(mVPTBGetBitConsentStatusResponse.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        this.f44728n = paymentRegistrationInstructions;
    }
}
