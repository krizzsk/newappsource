package q80;

import c70.C13749c;
import c70.C13752e;
import c70.C13778r;
import ce0.C21100e;
import com.google.android.play.core.assetpacks.C14291m0;
import com.moovit.commons.request.ServerException;
import com.moovit.payment.gateway.PaymentGatewayToken;
import com.moovit.payment.gateway.cash.CashGatewayToken;
import com.moovit.payment.gateway.clearanceprovider.ClearanceProviderGatewayToken;
import com.moovit.payment.gateway.googlepay.GooglePayGatewayToken;
import com.moovit.payment.gateway.paymentmethod.PaymentMethodGatewayToken;
import com.moovit.ticketing.purchase.fare.TicketFare;
import com.tranzmate.moovit.protocol.common.MVCurrencyAmount;
import com.tranzmate.moovit.protocol.payments.MVCashPaymentData;
import com.tranzmate.moovit.protocol.payments.MVClearanceProviderPaymentData;
import com.tranzmate.moovit.protocol.payments.MVGooglePayPaymentData;
import com.tranzmate.moovit.protocol.payments.MVPaymentProvider;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseFareRequest;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationCvvInfo;
import com.tranzmate.moovit.protocol.ticketingV2.MVPurchaseVerifacationInfo;
import h60.C17353s0;
import java.io.IOException;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import m80.C12873i;
import p80.C12991b;
import p824tp.C19722a0;
import p824tp.C19731i;
import r80.C13048b;
import v80.C13184b;

/* renamed from: q80.g */
public final class C13018g extends C13778r<C13018g, C13019h, MVPurchaseFareRequest> implements PaymentGatewayToken.C16326a<MVPurchaseFareRequest, Void>, Callable<C13019h> {

    /* renamed from: w */
    public final C12991b f32214w;

    /* renamed from: x */
    public final C13184b f32215x;

    public C13018g(C13752e eVar, C12991b bVar, C13184b bVar2) {
        super(eVar, C12873i.server_path_app_server_secured_url, C12873i.api_path_purchase_ticket, C13019h.class);
        this.f32214w = bVar;
        C21100e.m49373x(bVar2, "purchaseInfo");
        this.f32215x = bVar2;
        this.f51770m = new C14291m0(eVar, "ticketing_purchase");
    }

    /* renamed from: E */
    public final List<C13019h> mo21059E() throws IOException, ServerException {
        C13752e eVar = this.f33829q;
        C13019h purchaseTicket = C13048b.f32272c.purchaseTicket(eVar, this.f32214w, this.f32215x);
        if (purchaseTicket == null) {
            C13184b bVar = this.f32215x;
            String str = bVar.f32729a;
            TicketFare ticketFare = bVar.f32730b;
            int i = ticketFare.f23327c.f15142b;
            String str2 = ticketFare.f23326b;
            int i2 = bVar.f32731c;
            C21100e.m49375y(1, Integer.MAX_VALUE, "quantity", i2);
            MVCurrencyAmount p = C13749c.m34330p(this.f32215x.f32732d);
            RO mVPurchaseFareRequest = new MVPurchaseFareRequest();
            mVPurchaseFareRequest.contextId = str;
            mVPurchaseFareRequest.providerId = i;
            mVPurchaseFareRequest.mo32552o();
            mVPurchaseFareRequest.fareId = str2;
            mVPurchaseFareRequest.quantity = i2;
            mVPurchaseFareRequest.mo32553p();
            mVPurchaseFareRequest.totalPrice = p;
            PaymentGatewayToken paymentGatewayToken = (PaymentGatewayToken) this.f32215x.f32734f.mo5765b(1);
            if (paymentGatewayToken != null) {
                paymentGatewayToken.mo48944S(this, mVPurchaseFareRequest);
            }
            String str3 = (String) this.f32215x.f32734f.mo5765b(3);
            if (str3 != null) {
                mVPurchaseFareRequest.discountContextId = str3;
            }
            this.f33922v = mVPurchaseFareRequest;
            return Collections.emptyList();
        }
        C19722a0 a0Var = eVar.f33853b;
        if (purchaseTicket.f32216m && a0Var != null) {
            C19731i.m47197a(this.f51759b).f50172b.mo42913b(new C13028q(this.f51759b, a0Var.f50160a.f32927c, this.f32215x, purchaseTicket.f32218o, purchaseTicket.f32219p), true);
        }
        this.f51765h = true;
        return Collections.singletonList(purchaseTicket);
    }

    /* renamed from: c */
    public final Object mo22679c(CashGatewayToken cashGatewayToken, Object obj) {
        ((MVPurchaseFareRequest) obj).paymentProvider = MVPaymentProvider.m24870k(new MVCashPaymentData());
        return null;
    }

    public final Object call() throws Exception {
        return (C13019h) mo52626J();
    }

    /* renamed from: d */
    public final Object mo22681d(ClearanceProviderGatewayToken clearanceProviderGatewayToken, Object obj) {
        ((MVPurchaseFareRequest) obj).paymentProvider = MVPaymentProvider.m24871l(new MVClearanceProviderPaymentData(C17353s0.m43403q(clearanceProviderGatewayToken.f42692b), clearanceProviderGatewayToken.f42693c));
        return null;
    }

    /* renamed from: f */
    public final Object mo22682f(PaymentMethodGatewayToken paymentMethodGatewayToken, Object obj) {
        MVPurchaseFareRequest mVPurchaseFareRequest = (MVPurchaseFareRequest) obj;
        mVPurchaseFareRequest.paymentProvider = MVPaymentProvider.m24873o(C17353s0.m43405s(paymentMethodGatewayToken.f42706b));
        if (paymentMethodGatewayToken.f42707c == null) {
            return null;
        }
        mVPurchaseFareRequest.verifacationInfo = MVPurchaseVerifacationInfo.m28356k(new MVPurchaseVerifacationCvvInfo(paymentMethodGatewayToken.f42707c));
        return null;
    }

    /* renamed from: j */
    public final Object mo22683j(GooglePayGatewayToken googlePayGatewayToken, Object obj) {
        ((MVPurchaseFareRequest) obj).paymentProvider = MVPaymentProvider.m24872n(new MVGooglePayPaymentData(googlePayGatewayToken.f42698b));
        return null;
    }
}
