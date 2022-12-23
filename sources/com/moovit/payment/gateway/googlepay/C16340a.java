package com.moovit.payment.gateway.googlepay;

import com.google.android.gms.wallet.PaymentDataRequest;
import com.moovit.payment.gateway.googlepay.GooglePayGateway;
import java.util.concurrent.Callable;

/* renamed from: com.moovit.payment.gateway.googlepay.a */
public final /* synthetic */ class C16340a implements Callable {

    /* renamed from: b */
    public final /* synthetic */ GooglePayGateway.GooglePayTokenizer f42699b;

    public /* synthetic */ C16340a(GooglePayGateway.GooglePayTokenizer googlePayTokenizer) {
        this.f42699b = googlePayTokenizer;
    }

    public final Object call() {
        return PaymentDataRequest.fromJson(this.f42699b.f42697d);
    }
}
