package h60;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.confirmation.summary.PaymentSummaryInfo;
import com.tranzmate.moovit.protocol.payments.MVPaymentRemoveDiscountRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentRequestProperties;
import java.util.List;
import java.util.concurrent.Callable;
import v40.C25754i;
import w50.C20277a;

/* renamed from: h60.s1 */
public final class C17355s1 extends C13778r<C17355s1, C17358t1, MVPaymentRemoveDiscountRequest> implements Callable<PaymentSummaryInfo> {
    public C17355s1(C20277a aVar, C13752e eVar, List list) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_discounts_remove_discount, C17358t1.class);
        MVPaymentRequestProperties u = C17353s0.m43407u(aVar);
        RO mVPaymentRemoveDiscountRequest = new MVPaymentRemoveDiscountRequest();
        mVPaymentRemoveDiscountRequest.requestProperties = u;
        mVPaymentRemoveDiscountRequest.discountIds = list;
        this.f33922v = mVPaymentRemoveDiscountRequest;
    }

    public final Object call() throws Exception {
        return ((C17358t1) mo52626J()).f44758m;
    }
}
