package h60;

import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.tranzmate.moovit.protocol.payments.MVDefaultPaymentMethodRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import v40.C25754i;

/* renamed from: h60.u1 */
public final class C17361u1 extends C13778r<C17361u1, C17364v1, MVDefaultPaymentMethodRequest> {
    public C17361u1(C13752e eVar, PaymentMethodId paymentMethodId) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_default_payment_method, C17364v1.class);
        MVPaymentMethodId s = C17353s0.m43405s(paymentMethodId);
        RO mVDefaultPaymentMethodRequest = new MVDefaultPaymentMethodRequest();
        mVDefaultPaymentMethodRequest.paymentMethodId = s;
        this.f33922v = mVDefaultPaymentMethodRequest;
    }
}
