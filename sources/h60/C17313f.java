package h60;

import c70.C13746a;
import c70.C13780t;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentAddDiscountResponse;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: h60.f */
public final class C17313f extends C13780t<C17310e, C17313f, MVPaymentAddDiscountResponse> {

    /* renamed from: m */
    public PaymentSummaryInfo f44696m;

    public C17313f() {
        super(MVPaymentAddDiscountResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C17310e eVar = (C17310e) aVar;
        this.f44696m = C17353s0.m43397k(((MVPaymentAddDiscountResponse) tBase).paymentSummary);
    }
}
