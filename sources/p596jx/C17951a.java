package p596jx;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.network.model.ServerId;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.R;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.tod.passenger.MVTodBookOrderRequest;
import h60.C17353s0;

/* renamed from: jx.a */
public final class C17951a extends C13778r<C17951a, C17953b, MVTodBookOrderRequest> implements PaymentGatewayToken.C16326a<MVTodBookOrderRequest, Void> {

    /* renamed from: w */
    public final CurrencyAmount f46018w;

    /* renamed from: x */
    public final boolean f46019x;

    public C17951a(C13752e eVar, ServerId serverId, String str, CurrencyAmount currencyAmount, boolean z, PaymentGatewayToken paymentGatewayToken, String str2, String str3) {
        super(eVar, R.string.api_path_tod_book_order_request, C17953b.class);
        C21100e.m49373x(serverId, "orderId");
        C21100e.m49373x(str, "assignmentId");
        this.f46018w = currencyAmount;
        this.f46019x = z;
        RO mVTodBookOrderRequest = new MVTodBookOrderRequest();
        mVTodBookOrderRequest.rideId = str;
        if (currencyAmount != null) {
            mVTodBookOrderRequest.price = C13749c.m34330p(currencyAmount);
        }
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVTodBookOrderRequest);
        }
        if (str2 != null) {
            mVTodBookOrderRequest.discountContextId = str2;
        }
        if (str3 != null) {
            mVTodBookOrderRequest.itineraryGuid = str3;
        }
        this.f33922v = mVTodBookOrderRequest;
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVTodBookOrderRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVTodBookOrderRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        ((MVTodBookOrderRequest) obj).paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVTodBookOrderRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
