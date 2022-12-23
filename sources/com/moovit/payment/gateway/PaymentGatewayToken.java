package com.moovit.payment.gateway;

import android.os.Parcelable;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;

public interface PaymentGatewayToken extends Parcelable {

    /* renamed from: com.moovit.payment.gateway.PaymentGatewayToken$a */
    public interface C16326a<V, R> {
        /* renamed from: c */
        R mo22679c(CashGatewayToken cashGatewayToken, V v);

        /* renamed from: d */
        R mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, V v);

        /* renamed from: f */
        R mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, V v);

        /* renamed from: j */
        R mo22683j(GooglePayGatewayToken googlePayGatewayToken, V v);
    }

    /* renamed from: S */
    <V, R> R mo48944S(C16326a<V, R> aVar, V v);
}
