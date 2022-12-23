package h60;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.tranzmate.moovit.protocol.payments.MVEmailCodeVerificationResponse;
import i60.C17559a;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.h0 */
public final class C17320h0 extends C17301b<C17317g0, C17320h0, MVEmailCodeVerificationResponse> {

    /* renamed from: m */
    public C17559a f44706m;

    public C17320h0() {
        super(MVEmailCodeVerificationResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17559a aVar2;
        C17317g0 g0Var = (C17317g0) aVar;
        MVEmailCodeVerificationResponse mVEmailCodeVerificationResponse = (MVEmailCodeVerificationResponse) tBase;
        if (mVEmailCodeVerificationResponse.mo29820f()) {
            aVar2 = C17353s0.m43394h(AccountAuthType.EMAIL, mVEmailCodeVerificationResponse.accountInfo);
        } else {
            aVar2 = null;
        }
        this.f44706m = aVar2;
    }
}
