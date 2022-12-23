package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.t1 */
public final class C17358t1 extends C13780t<C17355s1, C17358t1, MVPaymentRemoveDiscountResponse> {

    /* renamed from: m */
    public PaymentSummaryInfo f44758m;

    public C17358t1() {
        super(MVPaymentRemoveDiscountResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17355s1 s1Var = (C17355s1) aVar;
        this.f44758m = C17353s0.m43397k(((MVPaymentRemoveDiscountResponse) tBase).paymentSummary);
    }
}
