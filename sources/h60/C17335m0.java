package h60;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.payments.MVGetAllowedPaymentMethodsRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties;
import java.util.concurrent.Callable;
import v40.C25754i;
import w50.C20277a;

/* renamed from: h60.m0 */
public final class C17335m0 extends C13778r<C17335m0, C17338n0, MVGetAllowedPaymentMethodsRequest> implements Callable<PaymentSummaryInfo> {
    public C17335m0(C20277a aVar, C13752e eVar) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_allowed_payment_gateways, C17338n0.class);
        MVPaymentRequestProperties u = C17353s0.m43407u(aVar);
        RO mVGetAllowedPaymentMethodsRequest = new MVGetAllowedPaymentMethodsRequest();
        mVGetAllowedPaymentMethodsRequest.requestProperties = u;
        this.f33922v = mVGetAllowedPaymentMethodsRequest;
    }

    public final Object call() throws Exception {
        return ((C17338n0) mo52626J()).f44724m;
    }
}
