package h60;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.moovit.payment.registration.PaymentRegistrationInstructions;
import com.tranzmate.moovit.protocol.payments.MVAlternateAuthProviderResponse;
import i60.C17559a;
import java.io.IOException;
import org.apache.thrift.TBase;
import p810sz.C19617r;

/* renamed from: h60.h */
public final class C17319h extends C17301b<C17316g, C17319h, MVAlternateAuthProviderResponse> {

    /* renamed from: m */
    public C17559a f44705m;

    public C17319h() {
        super(MVAlternateAuthProviderResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        PaymentRegistrationInstructions paymentRegistrationInstructions;
        C17316g gVar = (C17316g) aVar;
        MVAlternateAuthProviderResponse mVAlternateAuthProviderResponse = (MVAlternateAuthProviderResponse) tBase;
        C19617r rVar = C17353s0.f44739a;
        String str = mVAlternateAuthProviderResponse.accountId;
        boolean z = mVAlternateAuthProviderResponse.isMigratedUser;
        if (mVAlternateAuthProviderResponse.mo29505h()) {
            paymentRegistrationInstructions = C17353s0.m43400n(mVAlternateAuthProviderResponse.missingSteps);
        } else {
            paymentRegistrationInstructions = null;
        }
        this.f44705m = new C17559a(AccountAuthType.EXTERNAL, str, z, paymentRegistrationInstructions);
    }
}
