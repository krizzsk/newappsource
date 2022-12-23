package e50;

import c70.C13746a;
import com.moovit.commons.request.BadResponseException;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.account.paymentmethod.PaymentMethod;
import com.tranzmate.moovit.protocol.payments.MVAddPaymentMethodResponse;
import h60.C17301b;
import h60.C17353s0;
import java.io.IOException;
import org.apache.thrift.TBase;

/* renamed from: e50.b */
public final class C25720b extends C17301b<C25719a, C25720b, MVAddPaymentMethodResponse> {

    /* renamed from: m */
    public PaymentMethod f64150m;

    public C25720b() {
        super(MVAddPaymentMethodResponse.class);
    }

    /* renamed from: m */
    public final void mo5816m(C13746a aVar, TBase tBase) throws IOException, BadResponseException, ServerException {
        C25719a aVar2 = (C25719a) aVar;
        this.f64150m = C17353s0.m43396j(((MVAddPaymentMethodResponse) tBase).paymentMethodInfo);
    }
}
