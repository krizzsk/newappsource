package e50;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import com.tranzmate.moovit.protocol.payments.MVRemovePaymentMethodRequest;
import h60.C17353s0;
import v40.C25754i;

/* renamed from: e50.c */
public final class C25721c extends C13778r<C25721c, C25722d, MVRemovePaymentMethodRequest> {

    /* renamed from: w */
    public final PaymentMethodId f64151w;

    public C25721c(C13752e eVar, PaymentMethodId paymentMethodId) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_remove_payment_method, C25722d.class);
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        this.f64151w = paymentMethodId;
        MVPaymentMethodId s = C17353s0.m43405s(paymentMethodId);
        RO mVRemovePaymentMethodRequest = new MVRemovePaymentMethodRequest();
        mVRemovePaymentMethodRequest.paymentMethodId = s;
        this.f33922v = mVRemovePaymentMethodRequest;
    }
}
