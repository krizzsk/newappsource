package q80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.moovit.commons.request.ServerException;
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
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseItineraryRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationCvvInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationInfo;
import d90.C12607a;
import h60.C17353s0;
import java.io.IOException;
import java.util.Map;
import java.util.concurrent.Callable;
import m80.C12873i;
import p019b0.C1426c;
import p80.C12991b;
import r80.C13048b;

/* renamed from: q80.k */
public final class C13022k extends C13778r<C13022k, C13023l, MVPurchaseItineraryRequest> implements PaymentGatewayToken.C16326a<MVPurchaseItineraryRequest, Void>, Callable<C13023l> {

    /* renamed from: w */
    public final C12991b f32224w;

    /* renamed from: x */
    public final C12607a f32225x;

    public C13022k(C13752e eVar, C12991b bVar, C12607a aVar) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_itinerary, C13023l.class);
        this.f32224w = bVar;
        C21100e.m49373x(aVar, "purchaseItineraryInfo");
        this.f32225x = aVar;
    }

    /* renamed from: H */
    public final void mo5818H() throws IOException, ServerException {
        Map<String, String> createProperties = C13048b.f32272c.createProperties(this.f51759b, this.f32224w, this.f32225x.f31156c);
        C12607a aVar = this.f32225x;
        String str = aVar.f31154a;
        String str2 = aVar.f31155b;
        MVCurrencyAmount p = C13749c.m34330p(aVar.f31157d);
        RO mVPurchaseItineraryRequest = new MVPurchaseItineraryRequest();
        mVPurchaseItineraryRequest.contextId = str;
        mVPurchaseItineraryRequest.itineraryId = str2;
        mVPurchaseItineraryRequest.totalPrice = p;
        C1426c cVar = aVar.f31158e;
        PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) cVar.mo5765b(1);
        if (paymentGatewayToken != null) {
            paymentGatewayToken.mo48944S(this, mVPurchaseItineraryRequest);
        }
        if (createProperties != null) {
            mVPurchaseItineraryRequest.properties = createProperties;
        }
        String str3 = (String) cVar.mo5765b(3);
        if (str3 != null) {
            mVPurchaseItineraryRequest.discountContextId = str3;
        }
        this.f33922v = mVPurchaseItineraryRequest;
        super.mo5818H();
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVPurchaseItineraryRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    public final Object call() throws Exception {
        return (C13023l) mo52626J();
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVPurchaseItineraryRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        MVPurchaseItineraryRequest mVPurchaseItineraryRequest = (MVPurchaseItineraryRequest) obj;
        mVPurchaseItineraryRequest.paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        if (paymentMethodGatewayToken.f42707c == null) {
            return null;
        }
        mVPurchaseItineraryRequest.verifacationInfo = MVPurchaseVerifacationInfo.m28356k(new MVPurchaseVerifacationCvvInfo(paymentMethodGatewayToken.f42707c));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVPurchaseItineraryRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
