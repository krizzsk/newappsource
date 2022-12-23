package q80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseStoreValueRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationCvvInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationInfo;
import f90.C12641c;
import h60.C17353s0;
import java.util.concurrent.Callable;
import m80.C12873i;

/* renamed from: q80.o */
public final class C13026o extends C13778r<C13026o, C13027p, MVPurchaseStoreValueRequest> implements PaymentGatewayToken.C16326a<MVPurchaseStoreValueRequest, Void>, Callable<C13027p> {
    public C13026o(C13752e eVar, C12641c cVar) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_stored_value, C13027p.class);
        String str = cVar.f31241a;
        int i = cVar.f31242b.f15142b;
        String str2 = cVar.f31243c;
        MVCurrencyAmount p = C13749c.m34330p(cVar.f31244d.f23430b);
        RO mVPurchaseStoreValueRequest = new MVPurchaseStoreValueRequest();
        mVPurchaseStoreValueRequest.contextId = str;
        mVPurchaseStoreValueRequest.providerId = i;
        mVPurchaseStoreValueRequest.mo32750m();
        mVPurchaseStoreValueRequest.agencyKey = str2;
        mVPurchaseStoreValueRequest.amount = p;
        PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) cVar.f31245e.mo5765b(1);
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVPurchaseStoreValueRequest);
        }
        String str3 = (String) cVar.f31245e.mo5765b(3);
        if (str3 != null) {
            mVPurchaseStoreValueRequest.discountContextId = str3;
        }
        this.f33922v = mVPurchaseStoreValueRequest;
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVPurchaseStoreValueRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    public final Object call() throws Exception {
        return (C13027p) mo52626J();
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVPurchaseStoreValueRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        MVPurchaseStoreValueRequest mVPurchaseStoreValueRequest = (MVPurchaseStoreValueRequest) obj;
        mVPurchaseStoreValueRequest.paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        if (paymentMethodGatewayToken.f42707c == null) {
            return null;
        }
        mVPurchaseStoreValueRequest.verifacationInfo = MVPurchaseVerifacationInfo.m28356k(new MVPurchaseVerifacationCvvInfo(paymentMethodGatewayToken.f42707c));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVPurchaseStoreValueRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
