package h60;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.tranzmate.moovit.protocol.payments.MVPaymentRegistrationExternalAccountLoginResponse;
import i60.C17559a;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.l0 */
public final class C17332l0 extends C17301b<C17329k0, C17332l0, MVPaymentRegistrationExternalAccountLoginResponse> {

    /* renamed from: m */
    public C17559a f44722m;

    public C17332l0() {
        super(MVPaymentRegistrationExternalAccountLoginResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17559a aVar2;
        C17329k0 k0Var = (C17329k0) aVar;
        MVPaymentRegistrationExternalAccountLoginResponse mVPaymentRegistrationExternalAccountLoginResponse = (MVPaymentRegistrationExternalAccountLoginResponse) tBase;
        if (mVPaymentRegistrationExternalAccountLoginResponse.mo30311f()) {
            aVar2 = C17353s0.m43394h(AccountAuthType.EXTERNAL, mVPaymentRegistrationExternalAccountLoginResponse.accountInfo);
        } else {
            aVar2 = null;
        }
        this.f44722m = aVar2;
    }
}
