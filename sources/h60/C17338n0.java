package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.n0 */
public final class C17338n0 extends C13780t<C17335m0, C17338n0, MVGetAllowedPaymentMethodsResponse> {

    /* renamed from: m */
    public PaymentSummaryInfo f44724m;

    public C17338n0() {
        super(MVGetAllowedPaymentMethodsResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17335m0 m0Var = (C17335m0) aVar;
        this.f44724m = C17353s0.m43397k(((MVGetAllowedPaymentMethodsResponse) tBase).paymentSummary);
    }
}
