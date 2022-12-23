package b50;

import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.payment.account.paymentmethod.PaymentMethodId;
import com.moovit.payment.clearance.PaymentMethodToken;
import com.tranzmate.moovit.protocol.payments.MVCompleteDepositRequest;
import com.tranzmate.moovit.protocol.payments.MVPaymentMethodId;
import h60.C17353s0;
import java.util.concurrent.Callable;
import v40.C25754i;

/* renamed from: b50.a */
public final class C25544a extends C13778r<C25544a, C25545b, MVCompleteDepositRequest> implements Callable<C25545b> {
    public C25544a(C13752e eVar, String str, PaymentMethodId paymentMethodId, PaymentMethodToken paymentMethodToken) {
        super(eVar, C25754i.server_path_app_server_secured_url, C25754i.api_path_payment_complete_deposit, C25545b.class);
        C21100e.m49373x(paymentMethodId, "paymentMethodId");
        MVPaymentMethodId s = C17353s0.m43405s(paymentMethodId);
        String str2 = paymentMethodToken.f42598b;
        RO mVCompleteDepositRequest = new MVCompleteDepositRequest();
        mVCompleteDepositRequest.paymentContext = str;
        mVCompleteDepositRequest.paymentMethodId = s;
        mVCompleteDepositRequest.token = str2;
        this.f33922v = mVCompleteDepositRequest;
    }

    public final Object call() throws Exception {
        return (C25545b) mo52626J();
    }
}
