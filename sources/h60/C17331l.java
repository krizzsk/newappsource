package h60;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.registration.AccountAuthType;
import com.tranzmate.moovit.protocol.payments.MVCompleteWebStepResponse;
import i60.C17559a;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.l */
public final class C17331l extends C17301b<C17328k, C17331l, MVCompleteWebStepResponse> {

    /* renamed from: m */
    public C17559a f44721m;

    public C17331l() {
        super(MVCompleteWebStepResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17559a aVar2;
        C17328k kVar = (C17328k) aVar;
        MVCompleteWebStepResponse mVCompleteWebStepResponse = (MVCompleteWebStepResponse) tBase;
        if (mVCompleteWebStepResponse.mo29744f()) {
            aVar2 = C17353s0.m43394h(AccountAuthType.EXTERNAL, mVCompleteWebStepResponse.accountInfo);
        } else {
            aVar2 = null;
        }
        this.f44721m = aVar2;
    }
}
