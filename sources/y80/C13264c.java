package y80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.util.CurrencyAmount;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseCartRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationCvvInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationInfo;
import h60.C17353s0;
import java.util.concurrent.Callable;
import m80.C12873i;
import p019b0.C1426c;
import p750ql.C19138d;

/* renamed from: y80.c */
public final class C13264c extends C13778r<C13264c, C13265d, MVPurchaseCartRequest> implements PaymentGatewayToken.C16326a<MVPurchaseCartRequest, Void>, Callable<C13265d> {
    public C13264c(C19138d dVar, C13752e eVar) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_cart, C13265d.class);
        MVCurrencyAmount p = C13749c.m34330p((CurrencyAmount) dVar.f48657b);
        RO mVPurchaseCartRequest = new MVPurchaseCartRequest();
        mVPurchaseCartRequest.contextId = (String) dVar.f48656a;
        mVPurchaseCartRequest.totalPrice = p;
        C1426c cVar = (C1426c) dVar.f48658c;
        PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) cVar.mo5765b(1);
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVPurchaseCartRequest);
        }
        String str = (String) cVar.mo5765b(3);
        if (str != null) {
            mVPurchaseCartRequest.discountContextId = str;
        }
        this.f33922v = mVPurchaseCartRequest;
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVPurchaseCartRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    public final Object call() throws Exception {
        return (C13265d) mo52626J();
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVPurchaseCartRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        MVPurchaseCartRequest mVPurchaseCartRequest = (MVPurchaseCartRequest) obj;
        mVPurchaseCartRequest.paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        if (paymentMethodGatewayToken.f42707c == null) {
            return null;
        }
        mVPurchaseCartRequest.verificationInfo = MVPurchaseVerifacationInfo.m28356k(new MVPurchaseVerifacationCvvInfo(paymentMethodGatewayToken.f42707c));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVPurchaseCartRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
